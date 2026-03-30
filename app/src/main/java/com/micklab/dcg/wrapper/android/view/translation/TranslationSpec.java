// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationSpec {
    private final android.view.translation.TranslationSpec real;

    public TranslationSpec(android.view.translation.TranslationSpec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationSpec wrap(android.view.translation.TranslationSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationSpec(real);
    }

    public android.view.translation.TranslationSpec unwrap() {
        return real;
    }

    public TranslationSpec(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, int arg1) {
        this(new android.view.translation.TranslationSpec(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getDataFormat() {
        return real.getDataFormat();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.getLocale());
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

    public static final int DATA_FORMAT_TEXT = android.view.translation.TranslationSpec.DATA_FORMAT_TEXT;

}
