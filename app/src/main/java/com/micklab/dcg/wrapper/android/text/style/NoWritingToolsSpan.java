// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class NoWritingToolsSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NoWritingToolsSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.NoWritingToolsSpan wrap(android.text.style.NoWritingToolsSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.NoWritingToolsSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.NoWritingToolsSpan getReal() {
        return (android.text.style.NoWritingToolsSpan) real;
    }

    public android.text.style.NoWritingToolsSpan unwrap() {
        return getReal();
    }

    public NoWritingToolsSpan() {
        this(new android.text.style.NoWritingToolsSpan(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.NoWritingToolsSpan) real).describeContents();
    }

    public int getSpanTypeId() {
        return ((android.text.style.NoWritingToolsSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.NoWritingToolsSpan) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.NoWritingToolsSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
