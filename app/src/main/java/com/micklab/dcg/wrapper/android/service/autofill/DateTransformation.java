// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class DateTransformation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateTransformation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.DateTransformation wrap(android.service.autofill.DateTransformation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.DateTransformation(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.DateTransformation getReal() {
        return (android.service.autofill.DateTransformation) real;
    }

    public android.service.autofill.DateTransformation unwrap() {
        return getReal();
    }

    public DateTransformation(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.icu.text.DateFormat arg1) {
        this(new android.service.autofill.DateTransformation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.autofill.DateTransformation) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.DateTransformation) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.DateTransformation) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
