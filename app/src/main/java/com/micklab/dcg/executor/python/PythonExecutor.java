package com.micklab.dcg.executor.python;

import com.micklab.dcg.executor.AbstractUnsupportedExecutor;
import com.micklab.dcg.model.SupportedLanguage;

public class PythonExecutor extends AbstractUnsupportedExecutor {
    public PythonExecutor() {
        super(SupportedLanguage.PYTHON);
    }
}
