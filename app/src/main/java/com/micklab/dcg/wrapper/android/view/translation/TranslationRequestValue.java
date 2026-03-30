// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationRequestValue {
    private final android.view.translation.TranslationRequestValue real;

    public TranslationRequestValue(android.view.translation.TranslationRequestValue real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue wrap(android.view.translation.TranslationRequestValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue(real);
    }

    public android.view.translation.TranslationRequestValue unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue forText(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue.wrap(android.view.translation.TranslationRequestValue.forText(arg0));
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
