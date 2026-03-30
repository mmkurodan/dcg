// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class TextValueSanitizer {
    private final android.service.autofill.TextValueSanitizer real;

    public TextValueSanitizer(android.service.autofill.TextValueSanitizer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.TextValueSanitizer wrap(android.service.autofill.TextValueSanitizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.TextValueSanitizer(real);
    }

    public android.service.autofill.TextValueSanitizer unwrap() {
        return real;
    }

    public TextValueSanitizer(java.util.regex.Pattern arg0, java.lang.String arg1) {
        this(new android.service.autofill.TextValueSanitizer(arg0, arg1));
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
