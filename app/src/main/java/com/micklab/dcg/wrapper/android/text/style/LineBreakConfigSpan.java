// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LineBreakConfigSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LineBreakConfigSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan wrap(android.text.style.LineBreakConfigSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.LineBreakConfigSpan getReal() {
        return (android.text.style.LineBreakConfigSpan) real;
    }

    public android.text.style.LineBreakConfigSpan unwrap() {
        return getReal();
    }

    public LineBreakConfigSpan(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
        this(new android.text.style.LineBreakConfigSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan createNoBreakSpan() {
        return com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan.wrap(android.text.style.LineBreakConfigSpan.createNoBreakSpan());
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan createNoHyphenationSpan() {
        return com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan.wrap(android.text.style.LineBreakConfigSpan.createNoHyphenationSpan());
    }

    public int describeContents() {
        return ((android.text.style.LineBreakConfigSpan) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.text.style.LineBreakConfigSpan) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig getLineBreakConfig() {
        return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(((android.text.style.LineBreakConfigSpan) real).getLineBreakConfig());
    }

    public int getSpanTypeId() {
        return ((android.text.style.LineBreakConfigSpan) real).getSpanTypeId();
    }

    public int hashCode() {
        return ((android.text.style.LineBreakConfigSpan) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.text.style.LineBreakConfigSpan) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.LineBreakConfigSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
