// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class AlternativeSpan {
    private final android.speech.AlternativeSpan real;

    public AlternativeSpan(android.speech.AlternativeSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.AlternativeSpan wrap(android.speech.AlternativeSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.AlternativeSpan(real);
    }

    public android.speech.AlternativeSpan unwrap() {
        return real;
    }

    public AlternativeSpan(int arg0, int arg1, java.util.List arg2) {
        this(new android.speech.AlternativeSpan(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getEndPosition() {
        return real.getEndPosition();
    }

    public int getStartPosition() {
        return real.getStartPosition();
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
