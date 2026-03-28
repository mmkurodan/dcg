package com.micklab.dcg.executor.wasm;

import com.micklab.dcg.executor.AbstractUnsupportedExecutor;
import com.micklab.dcg.model.SupportedLanguage;

public class WasmExecutor extends AbstractUnsupportedExecutor {
    public WasmExecutor() {
        super(SupportedLanguage.CPP_WASM);
    }
}
