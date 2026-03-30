// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationRequestValue {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranslationRequestValue(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue wrap(android.view.translation.TranslationRequestValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.TranslationRequestValue getReal() {
        return (android.view.translation.TranslationRequestValue) real;
    }

    public android.view.translation.TranslationRequestValue unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.translation.TranslationRequestValue) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.translation.TranslationRequestValue) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue forText(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue.wrap(android.view.translation.TranslationRequestValue.forText(arg0));
    }

    public java.lang.CharSequence getText() {
        return ((android.view.translation.TranslationRequestValue) real).getText();
    }

    public int hashCode() {
        return ((android.view.translation.TranslationRequestValue) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.translation.TranslationRequestValue) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.translation.TranslationRequestValue) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
