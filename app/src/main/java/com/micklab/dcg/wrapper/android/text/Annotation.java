// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Annotation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Annotation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Annotation wrap(android.text.Annotation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Annotation(real, (__DcgwBridgeToken) null);
    }

    public android.text.Annotation getReal() {
        return (android.text.Annotation) real;
    }

    public android.text.Annotation unwrap() {
        return getReal();
    }

    public Annotation(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.Annotation(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Annotation(java.lang.String arg0, java.lang.String arg1) {
        this(new android.text.Annotation(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.Annotation) real).describeContents();
    }

    public java.lang.String getKey() {
        return ((android.text.Annotation) real).getKey();
    }

    public int getSpanTypeId() {
        return ((android.text.Annotation) real).getSpanTypeId();
    }

    public java.lang.String getValue() {
        return ((android.text.Annotation) real).getValue();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.Annotation) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
