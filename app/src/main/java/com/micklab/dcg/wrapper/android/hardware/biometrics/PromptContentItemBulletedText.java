// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptContentItemBulletedText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PromptContentItemBulletedText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItemBulletedText wrap(android.hardware.biometrics.PromptContentItemBulletedText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItemBulletedText(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.biometrics.PromptContentItemBulletedText getReal() {
        return (android.hardware.biometrics.PromptContentItemBulletedText) real;
    }

    public android.hardware.biometrics.PromptContentItemBulletedText unwrap() {
        return getReal();
    }

    public PromptContentItemBulletedText(java.lang.String arg0) {
        this(new android.hardware.biometrics.PromptContentItemBulletedText(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.hardware.biometrics.PromptContentItemBulletedText) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.biometrics.PromptContentItemBulletedText) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
