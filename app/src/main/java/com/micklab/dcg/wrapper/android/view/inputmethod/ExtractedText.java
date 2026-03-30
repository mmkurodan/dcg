// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class ExtractedText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExtractedText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText wrap(android.view.inputmethod.ExtractedText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.ExtractedText getReal() {
        return (android.view.inputmethod.ExtractedText) real;
    }

    public android.view.inputmethod.ExtractedText unwrap() {
        return getReal();
    }

    public ExtractedText() {
        this(new android.view.inputmethod.ExtractedText(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.inputmethod.ExtractedText) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.ExtractedText) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_SELECTING = android.view.inputmethod.ExtractedText.FLAG_SELECTING;
    public static final int FLAG_SINGLE_LINE = android.view.inputmethod.ExtractedText.FLAG_SINGLE_LINE;

}
