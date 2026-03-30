// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationSpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranslationSpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationSpec wrap(android.view.translation.TranslationSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationSpec(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.TranslationSpec getReal() {
        return (android.view.translation.TranslationSpec) real;
    }

    public android.view.translation.TranslationSpec unwrap() {
        return getReal();
    }

    public TranslationSpec(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, int arg1) {
        this(new android.view.translation.TranslationSpec(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.translation.TranslationSpec) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.translation.TranslationSpec) real).equals(arg0);
    }

    public int getDataFormat() {
        return ((android.view.translation.TranslationSpec) real).getDataFormat();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(((android.view.translation.TranslationSpec) real).getLocale());
    }

    public int hashCode() {
        return ((android.view.translation.TranslationSpec) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.translation.TranslationSpec) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.translation.TranslationSpec) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int DATA_FORMAT_TEXT = android.view.translation.TranslationSpec.DATA_FORMAT_TEXT;

}
