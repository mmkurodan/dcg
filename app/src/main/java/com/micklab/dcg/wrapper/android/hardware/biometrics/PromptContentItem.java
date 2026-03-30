// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptContentItem {
    private final android.hardware.biometrics.PromptContentItem real;

    public PromptContentItem(android.hardware.biometrics.PromptContentItem real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItem wrap(android.hardware.biometrics.PromptContentItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItem(real);
    }

    public android.hardware.biometrics.PromptContentItem unwrap() {
        return real;
    }

}
