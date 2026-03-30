// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class PromptContentItemPlainText {
    private final android.hardware.biometrics.PromptContentItemPlainText real;

    public PromptContentItemPlainText(android.hardware.biometrics.PromptContentItemPlainText real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItemPlainText wrap(android.hardware.biometrics.PromptContentItemPlainText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentItemPlainText(real);
    }

    public android.hardware.biometrics.PromptContentItemPlainText unwrap() {
        return real;
    }

    public PromptContentItemPlainText(java.lang.String arg0) {
        this(new android.hardware.biometrics.PromptContentItemPlainText(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
