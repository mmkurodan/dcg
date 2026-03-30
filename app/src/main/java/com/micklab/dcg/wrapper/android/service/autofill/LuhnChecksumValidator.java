// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class LuhnChecksumValidator {
    private final android.service.autofill.LuhnChecksumValidator real;

    public LuhnChecksumValidator(android.service.autofill.LuhnChecksumValidator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.LuhnChecksumValidator wrap(android.service.autofill.LuhnChecksumValidator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.LuhnChecksumValidator(real);
    }

    public android.service.autofill.LuhnChecksumValidator unwrap() {
        return real;
    }

    public LuhnChecksumValidator(android.view.autofill.AutofillId... arg0) {
        this(new android.service.autofill.LuhnChecksumValidator(arg0));
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
