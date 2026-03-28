package com.micklab.dcg.storage;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.OpenableColumns;

import com.micklab.dcg.model.SourceSnippet;
import com.micklab.dcg.model.SupportedLanguage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class DownloadsImportExportManager {
    private static final String DOWNLOADS_SUBDIRECTORY = Environment.DIRECTORY_DOWNLOADS + "/dcg";
    private final Context context;

    public DownloadsImportExportManager(Context context) {
        this.context = context.getApplicationContext();
    }

    public boolean requiresLegacyWritePermission() {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.Q;
    }

    public Intent createImportIntent() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_MIME_TYPES, new String[]{
                "text/plain",
                "text/x-java-source",
                "text/x-kotlin",
                "application/javascript",
                "application/x-javascript"
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            intent.putExtra(DocumentsContract.EXTRA_INITIAL_URI, MediaStore.Downloads.EXTERNAL_CONTENT_URI);
        }
        return intent;
    }

    public Uri exportSnippet(SourceSnippet snippet) throws IOException {
        if (snippet == null) {
            throw new IOException("No snippet selected for export.");
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            return exportWithMediaStore(snippet);
        }
        return exportToLegacyDownloads(snippet);
    }

    public SourceSnippet importFromUri(Uri uri) throws IOException {
        ContentResolver resolver = context.getContentResolver();
        String fileName = queryDisplayName(uri);
        String content = readFully(resolver.openInputStream(uri));
        SupportedLanguage language = SupportedLanguage.fromFileName(fileName);
        SourceSnippet snippet = new SourceSnippet();
        snippet.setTitle(SupportedLanguage.stripExtension(fileName));
        snippet.setFileName(fileName);
        snippet.setLanguage(language);
        snippet.setContent(content);
        snippet.setUpdatedAt(System.currentTimeMillis());
        return snippet;
    }

    @TargetApi(Build.VERSION_CODES.Q)
    private Uri exportWithMediaStore(SourceSnippet snippet) throws IOException {
        ContentValues values = new ContentValues();
        values.put(MediaStore.Downloads.DISPLAY_NAME, snippet.getFileName());
        values.put(MediaStore.Downloads.MIME_TYPE, snippet.getLanguage().getMimeType());
        values.put(MediaStore.Downloads.RELATIVE_PATH, DOWNLOADS_SUBDIRECTORY);
        ContentResolver resolver = context.getContentResolver();
        Uri uri = resolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, values);
        if (uri == null) {
            throw new IOException("Failed to create a Downloads entry for export.");
        }
        try (OutputStream outputStream = resolver.openOutputStream(uri, "w")) {
            if (outputStream == null) {
                throw new IOException("Failed to open the Downloads output stream.");
            }
            outputStream.write(snippet.getContent().getBytes(StandardCharsets.UTF_8));
        }
        return uri;
    }

    private Uri exportToLegacyDownloads(SourceSnippet snippet) throws IOException {
        File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File exportDir = new File(downloadsDir, "dcg");
        if (!exportDir.exists() && !exportDir.mkdirs()) {
            throw new IOException("Failed to create the Downloads/dcg directory.");
        }
        File outputFile = new File(exportDir, snippet.getFileName());
        try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            outputStream.write(snippet.getContent().getBytes(StandardCharsets.UTF_8));
        }
        MediaScannerConnection.scanFile(context, new String[]{outputFile.getAbsolutePath()}, null, null);
        return Uri.fromFile(outputFile);
    }

    private String queryDisplayName(Uri uri) {
        String fallback = "ImportedSnippet.java";
        if (uri == null) {
            return fallback;
        }
        Cursor cursor = context.getContentResolver().query(uri, new String[]{OpenableColumns.DISPLAY_NAME}, null, null, null);
        if (cursor == null) {
            return fallback;
        }
        try {
            if (cursor.moveToFirst()) {
                int nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
                if (nameIndex >= 0) {
                    String displayName = cursor.getString(nameIndex);
                    if (displayName != null && !displayName.trim().isEmpty()) {
                        return displayName;
                    }
                }
            }
        } finally {
            cursor.close();
        }
        return fallback;
    }

    private String readFully(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IOException("Failed to open the selected source file.");
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append('\n');
            }
            return builder.toString();
        }
    }
}
