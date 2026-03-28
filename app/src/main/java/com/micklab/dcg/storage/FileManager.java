package com.micklab.dcg.storage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import com.micklab.dcg.model.SourceSnippet;
import com.micklab.dcg.model.SupportedLanguage;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class FileManager {
    private static final String TAG = "FileManager";
    private final File snippetsDirectory;
    private final DownloadsImportExportManager importExportManager;

    public FileManager(Context context) {
        snippetsDirectory = new File(context.getFilesDir(), "snippets");
        importExportManager = new DownloadsImportExportManager(context);
        if (!snippetsDirectory.exists()) {
            //noinspection ResultOfMethodCallIgnored
            snippetsDirectory.mkdirs();
        }
    }

    public synchronized List<SourceSnippet> listSnippets() {
        List<SourceSnippet> snippets = new ArrayList<>();
        File[] files = snippetsDirectory.listFiles();
        if (files == null) {
            return snippets;
        }
        for (File file : files) {
            if (!file.isFile() || !file.getName().endsWith(".json")) {
                continue;
            }
            try {
                snippets.add(readSnippet(file));
            } catch (IOException | JSONException exception) {
                Log.w(TAG, "Skipping unreadable snippet: " + file.getAbsolutePath(), exception);
            }
        }
        Collections.sort(snippets, new Comparator<SourceSnippet>() {
            @Override
            public int compare(SourceSnippet left, SourceSnippet right) {
                int timeCompare = Long.compare(right.getUpdatedAt(), left.getUpdatedAt());
                if (timeCompare != 0) {
                    return timeCompare;
                }
                return left.getTitle().compareToIgnoreCase(right.getTitle());
            }
        });
        return snippets;
    }

    public synchronized SourceSnippet save(SourceSnippet snippet) throws IOException {
        SourceSnippet target = snippet == null ? new SourceSnippet() : snippet.copy();
        if (target.getId() == null || target.getId().trim().isEmpty()) {
            target.setId(generateId());
        }
        if (target.getLanguage() == null) {
            target.setLanguage(SupportedLanguage.JAVA);
        }
        if (target.getTitle() == null || target.getTitle().trim().isEmpty()) {
            target.setTitle(SupportedLanguage.sanitizeBaseName(target.getLanguage().getDisplayName()) + "Snippet");
        }
        if (target.getFileName() == null || target.getFileName().trim().isEmpty()) {
            target.setFileName(target.getLanguage().buildFileName(target.getTitle()));
        }
        target.setUpdatedAt(System.currentTimeMillis());

        File output = fileForId(target.getId());
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id", target.getId());
            jsonObject.put("title", target.getTitle());
            jsonObject.put("fileName", target.getFileName());
            jsonObject.put("languageId", target.getLanguage().getId());
            jsonObject.put("content", target.getContent());
            jsonObject.put("updatedAt", target.getUpdatedAt());
        } catch (JSONException exception) {
            throw new IOException("Failed to serialize snippet metadata.", exception);
        }

        String serialized;
        try {
            serialized = jsonObject.toString(2);
        } catch (JSONException exception) {
            throw new IOException("Failed to serialize snippet JSON.", exception);
        }

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output), StandardCharsets.UTF_8))) {
            writer.write(serialized);
        }
        return target;
    }

    public synchronized boolean delete(SourceSnippet snippet) {
        return snippet != null && deleteById(snippet.getId());
    }

    public synchronized boolean deleteById(String id) {
        if (id == null || id.trim().isEmpty()) {
            return false;
        }
        File file = fileForId(id);
        return file.isFile() && file.delete();
    }

    public Intent createImportIntent() {
        return importExportManager.createImportIntent();
    }

    public boolean requiresLegacyWritePermission() {
        return importExportManager.requiresLegacyWritePermission();
    }

    public Uri exportSnippet(SourceSnippet snippet) throws IOException {
        return importExportManager.exportSnippet(snippet);
    }

    public SourceSnippet importFromUri(Uri uri) throws IOException {
        return importExportManager.importFromUri(uri);
    }

    private SourceSnippet readSnippet(File file) throws IOException, JSONException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append('\n');
            }
        }
        JSONObject object = new JSONObject(builder.toString());
        return new SourceSnippet(
                object.optString("id", stripJsonExtension(file.getName())),
                object.optString("title", "Snippet"),
                object.optString("fileName", "Snippet.java"),
                SupportedLanguage.fromId(object.optString("languageId", SupportedLanguage.JAVA.getId())),
                object.optString("content", ""),
                object.optLong("updatedAt", file.lastModified()));
    }

    private File fileForId(String id) {
        return new File(snippetsDirectory, id + ".json");
    }

    private String generateId() {
        return "snippet-" + System.currentTimeMillis() + "-" + UUID.randomUUID().toString().replace("-", "");
    }

    private String stripJsonExtension(String fileName) {
        if (fileName == null || !fileName.endsWith(".json")) {
            return fileName;
        }
        return fileName.substring(0, fileName.length() - 5);
    }
}
