package com.micklab.dcg.executor;

import android.content.Context;

import com.micklab.dcg.model.ExecutionResult;
import com.micklab.dcg.model.SourceSnippet;
import com.micklab.dcg.model.SupportedLanguage;

public interface LanguageExecutor {
    SupportedLanguage getLanguage();

    boolean isSupported();

    ExecutionResult execute(Context context, SourceSnippet snippet);
}
