// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class AlternativeSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AlternativeSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.AlternativeSpan wrap(android.speech.AlternativeSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.AlternativeSpan(real, (__DcgwBridgeToken) null);
    }

    public android.speech.AlternativeSpan getReal() {
        return (android.speech.AlternativeSpan) real;
    }

    public android.speech.AlternativeSpan unwrap() {
        return getReal();
    }

    public AlternativeSpan(int arg0, int arg1, java.util.List arg2) {
        this(new android.speech.AlternativeSpan(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.speech.AlternativeSpan) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.speech.AlternativeSpan) real).equals(arg0);
    }

    public int getEndPosition() {
        return ((android.speech.AlternativeSpan) real).getEndPosition();
    }

    public int getStartPosition() {
        return ((android.speech.AlternativeSpan) real).getStartPosition();
    }

    public int hashCode() {
        return ((android.speech.AlternativeSpan) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.speech.AlternativeSpan) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.speech.AlternativeSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
