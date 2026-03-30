// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class RegexValidator {
    private final android.service.autofill.RegexValidator real;

    public RegexValidator(android.service.autofill.RegexValidator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.RegexValidator wrap(android.service.autofill.RegexValidator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.RegexValidator(real);
    }

    public android.service.autofill.RegexValidator unwrap() {
        return real;
    }

    public RegexValidator(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1) {
        this(new android.service.autofill.RegexValidator(arg0 == null ? null : arg0.unwrap(), arg1));
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
