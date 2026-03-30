// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.assist.classification;

public final class FieldClassification {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FieldClassification(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.assist.classification.FieldClassification wrap(android.service.assist.classification.FieldClassification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.assist.classification.FieldClassification(real, (__DcgwBridgeToken) null);
    }

    public android.service.assist.classification.FieldClassification getReal() {
        return (android.service.assist.classification.FieldClassification) real;
    }

    public android.service.assist.classification.FieldClassification unwrap() {
        return getReal();
    }

    public FieldClassification(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.Set arg1) {
        this(new android.service.assist.classification.FieldClassification(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.assist.classification.FieldClassification) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.service.assist.classification.FieldClassification) real).getAutofillId());
    }

    public java.lang.String toString() {
        return ((android.service.assist.classification.FieldClassification) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.assist.classification.FieldClassification) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
