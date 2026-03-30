// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class AlternativeSpans {
    private final android.speech.AlternativeSpans real;

    public AlternativeSpans(android.speech.AlternativeSpans real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.AlternativeSpans wrap(android.speech.AlternativeSpans real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.AlternativeSpans(real);
    }

    public android.speech.AlternativeSpans unwrap() {
        return real;
    }

    public AlternativeSpans(java.util.List arg0) {
        this(new android.speech.AlternativeSpans(arg0));
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
