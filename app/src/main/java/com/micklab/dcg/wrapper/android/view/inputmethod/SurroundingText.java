// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class SurroundingText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SurroundingText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText wrap(android.view.inputmethod.SurroundingText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.SurroundingText getReal() {
        return (android.view.inputmethod.SurroundingText) real;
    }

    public android.view.inputmethod.SurroundingText unwrap() {
        return getReal();
    }

    public SurroundingText(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        this(new android.view.inputmethod.SurroundingText(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.inputmethod.SurroundingText) real).describeContents();
    }

    public int getOffset() {
        return ((android.view.inputmethod.SurroundingText) real).getOffset();
    }

    public int getSelectionEnd() {
        return ((android.view.inputmethod.SurroundingText) real).getSelectionEnd();
    }

    public int getSelectionStart() {
        return ((android.view.inputmethod.SurroundingText) real).getSelectionStart();
    }

    public java.lang.CharSequence getText() {
        return ((android.view.inputmethod.SurroundingText) real).getText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.SurroundingText) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
