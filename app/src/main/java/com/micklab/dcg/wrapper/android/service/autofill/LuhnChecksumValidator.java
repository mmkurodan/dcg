// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class LuhnChecksumValidator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LuhnChecksumValidator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.LuhnChecksumValidator wrap(android.service.autofill.LuhnChecksumValidator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.LuhnChecksumValidator(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.LuhnChecksumValidator getReal() {
        return (android.service.autofill.LuhnChecksumValidator) real;
    }

    public android.service.autofill.LuhnChecksumValidator unwrap() {
        return getReal();
    }

    public LuhnChecksumValidator(android.view.autofill.AutofillId... arg0) {
        this(new android.service.autofill.LuhnChecksumValidator(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.autofill.LuhnChecksumValidator) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.LuhnChecksumValidator) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.LuhnChecksumValidator) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
