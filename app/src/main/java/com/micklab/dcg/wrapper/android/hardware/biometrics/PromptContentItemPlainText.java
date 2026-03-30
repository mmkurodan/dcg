// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptContentItemPlainText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PromptContentItemPlainText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItemPlainText wrap(android.hardware.biometrics.PromptContentItemPlainText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItemPlainText(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.biometrics.PromptContentItemPlainText getReal() {
        return (android.hardware.biometrics.PromptContentItemPlainText) real;
    }

    public android.hardware.biometrics.PromptContentItemPlainText unwrap() {
        return getReal();
    }

    public PromptContentItemPlainText(java.lang.String arg0) {
        this(new android.hardware.biometrics.PromptContentItemPlainText(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.hardware.biometrics.PromptContentItemPlainText) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.biometrics.PromptContentItemPlainText) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
