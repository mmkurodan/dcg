package com.micklab.dcg;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.micklab.dcg.executor.LanguageExecutor;
import com.micklab.dcg.executor.LanguageExecutorRegistry;
import com.micklab.dcg.executor.java.JavaExecutor;
import com.micklab.dcg.executor.java.JavaSourceParser;
import com.micklab.dcg.model.ExecutionResult;
import com.micklab.dcg.model.SourceSnippet;
import com.micklab.dcg.model.SupportedLanguage;
import com.micklab.dcg.storage.FileManager;
import com.micklab.dcg.ui.ResultView;
import com.micklab.dcg.ui.SnippetListAdapter;
import com.micklab.dcg.util.DiagnosticFormatter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    private Spinner languageSpinner;
    private EditText titleInput;
    private EditText codeInput;
    private ListView snippetListView;
    private Button newButton;
    private Button saveButton;
    private Button deleteButton;
    private Button runButton;
    private Button importButton;
    private Button exportButton;
    private ResultView resultView;

    private FileManager fileManager;
    private LanguageExecutorRegistry executorRegistry;
    private SnippetListAdapter snippetAdapter;
    private final List<SourceSnippet> snippets = new ArrayList<>();
    private final ExecutorService backgroundExecutor = Executors.newSingleThreadExecutor();

    private SourceSnippet currentSnippet;
    private SourceSnippet pendingExportSnippet;

    private ActivityResultLauncher<Intent> importLauncher;
    private ActivityResultLauncher<String[]> legacyStoragePermissionLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        fileManager = new FileManager(this);
        executorRegistry = new LanguageExecutorRegistry();
        snippetAdapter = new SnippetListAdapter(this);
        backgroundExecutor.execute(() -> JavaExecutor.stageBootJarsOnStartup(getApplicationContext()));

        setupLanguageSpinner();
        setupSnippetList();
        registerLaunchers();
        setupButtons();
        ensureSeedSnippet();
        refreshSnippets(null);
        resultView.render(ExecutionResult.info(
                "Project scaffold ready",
                "Java now compiles on-device through an Android-compatible ECJ 4.6 bundle, D8, and InMemoryDexClassLoader.",
                "Use the language selector to prepare future Kotlin and JavaScript snippets today."));
    }

    @Override
    protected void onDestroy() {
        backgroundExecutor.shutdownNow();
        super.onDestroy();
    }

    private void bindViews() {
        languageSpinner = findViewById(R.id.languageSpinner);
        titleInput = findViewById(R.id.titleInput);
        codeInput = findViewById(R.id.codeInput);
        snippetListView = findViewById(R.id.snippetListView);
        newButton = findViewById(R.id.newButton);
        saveButton = findViewById(R.id.saveButton);
        deleteButton = findViewById(R.id.deleteButton);
        runButton = findViewById(R.id.runButton);
        importButton = findViewById(R.id.importButton);
        exportButton = findViewById(R.id.exportButton);
        resultView = findViewById(R.id.resultView);
    }

    private void setupLanguageSpinner() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, SupportedLanguage.displayNames());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        languageSpinner.setAdapter(adapter);
    }

    private void setupSnippetList() {
        snippetListView.setAdapter(snippetAdapter);
        snippetListView.setOnItemClickListener((parent, view, position, id) -> renderSnippet(snippetAdapter.getItem(position)));
    }

    private void registerLaunchers() {
        importLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            Intent data = result.getData();
            Uri uri = data == null ? null : data.getData();
            if (uri != null) {
                importSnippet(uri);
            }
        });

        legacyStoragePermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), permissions -> {
            boolean granted = true;
            for (Boolean permissionGranted : permissions.values()) {
                if (permissionGranted == null || !permissionGranted) {
                    granted = false;
                    break;
                }
            }
            if (granted && pendingExportSnippet != null) {
                exportSnippetNow(pendingExportSnippet);
            } else {
                resultView.render(ExecutionResult.ioError(
                        "Export cancelled",
                        "Legacy external storage permission was denied.",
                        "On Android 10+ the app exports directly to Downloads without this permission."));
            }
            pendingExportSnippet = null;
        });
    }

    private void setupButtons() {
        newButton.setOnClickListener(view -> createNewSnippet(selectedLanguage()));
        saveButton.setOnClickListener(view -> {
            SourceSnippet saved = persistEditor(true);
            if (saved != null) {
                refreshSnippets(saved.getId());
            }
        });
        deleteButton.setOnClickListener(view -> deleteCurrentSnippet());
        runButton.setOnClickListener(view -> runCurrentSnippet());
        importButton.setOnClickListener(view -> importLauncher.launch(fileManager.createImportIntent()));
        exportButton.setOnClickListener(view -> exportCurrentSnippet());
    }

    private void ensureSeedSnippet() {
        if (!fileManager.listSnippets().isEmpty()) {
            return;
        }
        try {
            fileManager.save(SourceSnippet.createTemplate(SupportedLanguage.JAVA));
        } catch (IOException exception) {
            resultView.render(ExecutionResult.ioError(
                    "Seed snippet failed",
                    "The app could not create its initial Java example.",
                    DiagnosticFormatter.formatThrowable(exception)));
        }
    }

    private void refreshSnippets(String selectedId) {
        snippets.clear();
        snippets.addAll(fileManager.listSnippets());
        snippetAdapter.setItems(snippets);

        SourceSnippet target = findSnippetById(selectedId);
        if (target == null && currentSnippet != null) {
            target = findSnippetById(currentSnippet.getId());
        }
        if (target == null && !snippets.isEmpty()) {
            target = snippets.get(0);
        }
        if (target != null) {
            renderSnippet(target);
        } else {
            createNewSnippet(selectedLanguage());
        }
    }

    private SourceSnippet findSnippetById(String id) {
        if (id == null) {
            return null;
        }
        for (SourceSnippet snippet : snippets) {
            if (id.equals(snippet.getId())) {
                return snippet;
            }
        }
        return null;
    }

    private void renderSnippet(SourceSnippet snippet) {
        if (snippet == null) {
            return;
        }
        currentSnippet = snippet.copy();
        titleInput.setText(currentSnippet.getTitle());
        codeInput.setText(currentSnippet.getContent());
        languageSpinner.setSelection(SupportedLanguage.spinnerPositionOf(currentSnippet.getLanguage()));
        snippetAdapter.setSelectedId(currentSnippet.getId());
    }

    private void createNewSnippet(SupportedLanguage language) {
        SourceSnippet template = SourceSnippet.createTemplate(language);
        currentSnippet = null;
        titleInput.setText(template.getTitle());
        codeInput.setText(template.getContent());
        languageSpinner.setSelection(SupportedLanguage.spinnerPositionOf(language));
        snippetAdapter.setSelectedId(null);
        resultView.render(ExecutionResult.info(
                "New " + language.getDisplayName() + " snippet",
                "Edit the template, then save or run it.",
                language == SupportedLanguage.JAVA
                        ? "Java expects public static String run() or public static void main(String[] args)."
                        : "This language already has a storage/UI slot, but its runtime executor is still a placeholder."));
    }

    private SourceSnippet persistEditor(boolean showSuccessMessage) {
        SourceSnippet draft = buildSnippetFromEditor();
        try {
            SourceSnippet saved = fileManager.save(draft);
            currentSnippet = saved.copy();
            if (showSuccessMessage) {
                resultView.render(ExecutionResult.info(
                        "Snippet saved",
                        saved.getFileName() + " is now stored in internal app storage.",
                        "Use export to copy it into Downloads or run to execute it through the selected language pipeline."));
            }
            return saved;
        } catch (IOException exception) {
            resultView.render(ExecutionResult.ioError(
                    "Save failed",
                    "The app could not write the snippet into internal storage.",
                    DiagnosticFormatter.formatThrowable(exception)));
            return null;
        }
    }

    private SourceSnippet buildSnippetFromEditor() {
        SupportedLanguage language = selectedLanguage();
        String title = titleInput.getText() == null ? "" : titleInput.getText().toString().trim();
        String content = codeInput.getText() == null ? "" : codeInput.getText().toString();
        if (title.isEmpty()) {
            title = language == SupportedLanguage.JAVA ? "HelloJava" : SupportedLanguage.sanitizeBaseName(language.getDisplayName()) + "Snippet";
        }

        SourceSnippet draft = currentSnippet == null ? new SourceSnippet() : currentSnippet.copy();
        draft.setTitle(title);
        draft.setLanguage(language);
        draft.setContent(content);
        draft.setFileName(deriveFileName(language, title, content, currentSnippet == null ? null : currentSnippet.getFileName()));
        return draft;
    }

    private String deriveFileName(SupportedLanguage language, String title, String content, String existingFileName) {
        if (language == SupportedLanguage.JAVA) {
            String typeName = JavaSourceParser.tryDetectPrimaryTypeName(content);
            if (!TextUtils.isEmpty(typeName)) {
                return typeName + language.getExtension();
            }
        }
        if (!TextUtils.isEmpty(existingFileName)) {
            String previousBaseName = SupportedLanguage.stripExtension(existingFileName);
            return language.buildFileName(previousBaseName);
        }
        return language.buildFileName(title);
    }

    private void deleteCurrentSnippet() {
        if (currentSnippet == null || TextUtils.isEmpty(currentSnippet.getId())) {
            createNewSnippet(selectedLanguage());
            return;
        }
        boolean deleted = fileManager.delete(currentSnippet);
        if (deleted) {
            resultView.render(ExecutionResult.info(
                    "Snippet deleted",
                    currentSnippet.getFileName() + " was removed from internal storage.",
                    "Any copy already exported to Downloads is left untouched."));
            currentSnippet = null;
            refreshSnippets(null);
            return;
        }
        resultView.render(ExecutionResult.ioError(
                "Delete failed",
                "The selected snippet could not be deleted.",
                "Try saving again or restarting the app before retrying."));
    }

    private void runCurrentSnippet() {
        SourceSnippet saved = persistEditor(false);
        if (saved == null) {
            return;
        }
        LanguageExecutor executor = executorRegistry.getExecutor(saved.getLanguage());
        setBusy(true, "Running " + saved.getLanguage().getDisplayName() + "...", executor.isSupported()
                ? "Compiling and executing the current snippet."
                : "This runtime is still a placeholder executor.");
        backgroundExecutor.execute(() -> {
            ExecutionResult result = executor.execute(getApplicationContext(), saved);
            runOnUiThread(() -> {
                setBusy(false, null, null);
                resultView.render(result);
                refreshSnippets(saved.getId());
            });
        });
    }

    private void exportCurrentSnippet() {
        SourceSnippet saved = persistEditor(false);
        if (saved == null) {
            return;
        }
        if (fileManager.requiresLegacyWritePermission() && !hasLegacyStoragePermission()) {
            pendingExportSnippet = saved;
            legacyStoragePermissionLauncher.launch(new String[]{
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
            });
            return;
        }
        exportSnippetNow(saved);
    }

    private void exportSnippetNow(SourceSnippet snippet) {
        setBusy(true, "Exporting...", "Writing the source file into the Downloads/dcg folder.");
        backgroundExecutor.execute(() -> {
            try {
                Uri uri = fileManager.exportSnippet(snippet);
                runOnUiThread(() -> {
                    setBusy(false, null, null);
                    resultView.render(ExecutionResult.info(
                            "Export complete",
                            snippet.getFileName() + " was copied to Downloads.",
                            uri.toString()));
                });
            } catch (IOException exception) {
                runOnUiThread(() -> {
                    setBusy(false, null, null);
                    resultView.render(ExecutionResult.ioError(
                            "Export failed",
                            "The snippet could not be written into Downloads.",
                            DiagnosticFormatter.formatThrowable(exception)));
                });
            }
        });
    }

    private void importSnippet(Uri uri) {
        setBusy(true, "Importing...", "Reading the selected file and saving it into internal storage.");
        backgroundExecutor.execute(() -> {
            try {
                SourceSnippet imported = fileManager.importFromUri(uri);
                SourceSnippet saved = fileManager.save(imported);
                runOnUiThread(() -> {
                    setBusy(false, null, null);
                    refreshSnippets(saved.getId());
                    resultView.render(ExecutionResult.info(
                            "Import complete",
                            saved.getFileName() + " was copied into internal storage.",
                            "Language was inferred as " + saved.getLanguage().getDisplayName() + "."));
                });
            } catch (IOException exception) {
                runOnUiThread(() -> {
                    setBusy(false, null, null);
                    resultView.render(ExecutionResult.ioError(
                            "Import failed",
                            "The selected file could not be read.",
                            DiagnosticFormatter.formatThrowable(exception)));
                });
            }
        });
    }

    private boolean hasLegacyStoragePermission() {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
                && ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
    }

    private void setBusy(boolean busy, String headline, String details) {
        newButton.setEnabled(!busy);
        saveButton.setEnabled(!busy);
        deleteButton.setEnabled(!busy);
        runButton.setEnabled(!busy);
        importButton.setEnabled(!busy);
        exportButton.setEnabled(!busy);
        if (busy) {
            resultView.render(ExecutionResult.info(headline, details, ""));
        }
    }

    private SupportedLanguage selectedLanguage() {
        return SupportedLanguage.fromSpinnerPosition(languageSpinner.getSelectedItemPosition());
    }
}
