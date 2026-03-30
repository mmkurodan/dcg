// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class DateValueSanitizer {
    private final android.service.autofill.DateValueSanitizer real;

    public DateValueSanitizer(android.service.autofill.DateValueSanitizer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.DateValueSanitizer wrap(android.service.autofill.DateValueSanitizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.DateValueSanitizer(real);
    }

    public android.service.autofill.DateValueSanitizer unwrap() {
        return real;
    }

    public DateValueSanitizer(com.micklab.dcg.wrapper.android.icu.text.DateFormat arg0) {
        this(new android.service.autofill.DateValueSanitizer(arg0 == null ? null : arg0.unwrap()));
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
