package com.micklab.dcg.executor.node;

import com.micklab.dcg.executor.AbstractUnsupportedExecutor;
import com.micklab.dcg.model.SupportedLanguage;

public class NodeExecutor extends AbstractUnsupportedExecutor {
    public NodeExecutor() {
        super(SupportedLanguage.NODE);
    }
}
