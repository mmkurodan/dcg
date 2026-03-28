package com.micklab.dcg.executor;

import com.micklab.dcg.executor.java.JavaExecutor;
import com.micklab.dcg.executor.node.NodeExecutor;
import com.micklab.dcg.executor.python.PythonExecutor;
import com.micklab.dcg.executor.wasm.WasmExecutor;
import com.micklab.dcg.model.SupportedLanguage;

import java.util.EnumMap;
import java.util.Map;

public class LanguageExecutorRegistry {
    private final Map<SupportedLanguage, LanguageExecutor> executors = new EnumMap<>(SupportedLanguage.class);

    public LanguageExecutorRegistry() {
        register(new JavaExecutor());
        register(new PythonExecutor());
        register(new NodeExecutor());
        register(new WasmExecutor());
    }

    public LanguageExecutor getExecutor(SupportedLanguage language) {
        LanguageExecutor executor = executors.get(language == null ? SupportedLanguage.JAVA : language);
        if (executor == null) {
            return executors.get(SupportedLanguage.JAVA);
        }
        return executor;
    }

    private void register(LanguageExecutor executor) {
        executors.put(executor.getLanguage(), executor);
    }
}
