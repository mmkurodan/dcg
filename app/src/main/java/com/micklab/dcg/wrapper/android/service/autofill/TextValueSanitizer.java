// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class TextValueSanitizer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextValueSanitizer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.TextValueSanitizer wrap(android.service.autofill.TextValueSanitizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.TextValueSanitizer(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.TextValueSanitizer getReal() {
        return (android.service.autofill.TextValueSanitizer) real;
    }

    public android.service.autofill.TextValueSanitizer unwrap() {
        return getReal();
    }

    public TextValueSanitizer(java.util.regex.Pattern arg0, java.lang.String arg1) {
        this(new android.service.autofill.TextValueSanitizer(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.autofill.TextValueSanitizer) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.TextValueSanitizer) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.TextValueSanitizer) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
