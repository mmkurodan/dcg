// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class DateValueSanitizer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateValueSanitizer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.DateValueSanitizer wrap(android.service.autofill.DateValueSanitizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.DateValueSanitizer(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.DateValueSanitizer getReal() {
        return (android.service.autofill.DateValueSanitizer) real;
    }

    public android.service.autofill.DateValueSanitizer unwrap() {
        return getReal();
    }

    public DateValueSanitizer(com.micklab.dcg.wrapper.android.icu.text.DateFormat arg0) {
        this(new android.service.autofill.DateValueSanitizer(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.autofill.DateValueSanitizer) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.DateValueSanitizer) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.DateValueSanitizer) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
