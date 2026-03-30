// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.autofill;

public final class AutofillId {
    private final android.view.autofill.AutofillId real;

    public AutofillId(android.view.autofill.AutofillId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillId wrap(android.view.autofill.AutofillId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.AutofillId(real);
    }

    public android.view.autofill.AutofillId unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillId create(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(android.view.autofill.AutofillId.create(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
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


}
