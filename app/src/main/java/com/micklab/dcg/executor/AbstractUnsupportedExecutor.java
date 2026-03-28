package com.micklab.dcg.executor;

import android.content.Context;

import com.micklab.dcg.model.ExecutionResult;
import com.micklab.dcg.model.SourceSnippet;
import com.micklab.dcg.model.SupportedLanguage;

public abstract class AbstractUnsupportedExecutor implements LanguageExecutor {
    private final SupportedLanguage language;

    protected AbstractUnsupportedExecutor(SupportedLanguage language) {
        this.language = language;
    }

    @Override
    public SupportedLanguage getLanguage() {
        return language;
    }

    @Override
    public boolean isSupported() {
        return false;
    }

    @Override
    public ExecutionResult execute(Context context, SourceSnippet snippet) {
        return ExecutionResult.unsupported(
                language.getDisplayName() + " executor placeholder",
                "The editor, storage, and import/export flow are ready for this language.",
                "Add a concrete " + getClass().getSimpleName() + " implementation to enable runtime execution.");
    }
}
