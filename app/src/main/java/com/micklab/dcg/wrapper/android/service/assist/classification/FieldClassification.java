// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.assist.classification;

public final class FieldClassification {
    private final android.service.assist.classification.FieldClassification real;

    public FieldClassification(android.service.assist.classification.FieldClassification real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.assist.classification.FieldClassification wrap(android.service.assist.classification.FieldClassification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.assist.classification.FieldClassification(real);
    }

    public android.service.assist.classification.FieldClassification unwrap() {
        return real;
    }

    public FieldClassification(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.Set arg1) {
        this(new android.service.assist.classification.FieldClassification(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(real.getAutofillId());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
