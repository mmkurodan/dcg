package com.micklab.dcg.wrapper.pseudo;

public final class PseudoResult {
    private final Object spec;
    private final String outputModelJson;

    public PseudoResult(Object spec, String outputModelJson) {
        this.spec = spec;
        this.outputModelJson = outputModelJson == null ? "" : outputModelJson;
    }

    public Object getSpec() {
        return spec;
    }

    public String getOutputModelJson() {
        return outputModelJson;
    }
}
