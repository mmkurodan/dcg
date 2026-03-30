// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class RegexValidator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RegexValidator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.RegexValidator wrap(android.service.autofill.RegexValidator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.RegexValidator(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.RegexValidator getReal() {
        return (android.service.autofill.RegexValidator) real;
    }

    public android.service.autofill.RegexValidator unwrap() {
        return getReal();
    }

    public RegexValidator(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1) {
        this(new android.service.autofill.RegexValidator(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.autofill.RegexValidator) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.RegexValidator) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.RegexValidator) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
