// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptContentItem {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PromptContentItem(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItem wrap(android.hardware.biometrics.PromptContentItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItem(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.biometrics.PromptContentItem getReal() {
        return (android.hardware.biometrics.PromptContentItem) real;
    }

    public android.hardware.biometrics.PromptContentItem unwrap() {
        return getReal();
    }

}
