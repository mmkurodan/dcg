// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class AlternativeSpans {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AlternativeSpans(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.AlternativeSpans wrap(android.speech.AlternativeSpans real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.AlternativeSpans(real, (__DcgwBridgeToken) null);
    }

    public android.speech.AlternativeSpans getReal() {
        return (android.speech.AlternativeSpans) real;
    }

    public android.speech.AlternativeSpans unwrap() {
        return getReal();
    }

    public AlternativeSpans(java.util.List arg0) {
        this(new android.speech.AlternativeSpans(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.speech.AlternativeSpans) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.speech.AlternativeSpans) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.speech.AlternativeSpans) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.speech.AlternativeSpans) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.speech.AlternativeSpans) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
