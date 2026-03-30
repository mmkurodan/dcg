// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Annotation {
    private final android.text.Annotation real;

    public Annotation(android.text.Annotation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Annotation wrap(android.text.Annotation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Annotation(real);
    }

    public android.text.Annotation unwrap() {
        return real;
    }

    public Annotation(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.Annotation(arg0 == null ? null : arg0.unwrap()));
    }

    public Annotation(java.lang.String arg0, java.lang.String arg1) {
        this(new android.text.Annotation(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getKey() {
        return real.getKey();
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public java.lang.String getValue() {
        return real.getValue();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
