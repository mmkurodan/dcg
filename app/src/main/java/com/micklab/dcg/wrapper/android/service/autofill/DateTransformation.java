// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class DateTransformation {
    private final android.service.autofill.DateTransformation real;

    public DateTransformation(android.service.autofill.DateTransformation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.DateTransformation wrap(android.service.autofill.DateTransformation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.DateTransformation(real);
    }

    public android.service.autofill.DateTransformation unwrap() {
        return real;
    }

    public DateTransformation(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, com.micklab.dcg.wrapper.android.icu.text.DateFormat arg1) {
        this(new android.service.autofill.DateTransformation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
