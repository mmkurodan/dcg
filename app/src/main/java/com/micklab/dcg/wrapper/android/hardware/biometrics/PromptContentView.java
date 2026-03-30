// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptContentView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PromptContentView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentView wrap(android.hardware.biometrics.PromptContentView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentView(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.biometrics.PromptContentView getReal() {
        return (android.hardware.biometrics.PromptContentView) real;
    }

    public android.hardware.biometrics.PromptContentView unwrap() {
        return getReal();
    }

}
