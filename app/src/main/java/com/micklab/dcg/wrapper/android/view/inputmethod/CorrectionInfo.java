// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class CorrectionInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CorrectionInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.CorrectionInfo wrap(android.view.inputmethod.CorrectionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.CorrectionInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.CorrectionInfo getReal() {
        return (android.view.inputmethod.CorrectionInfo) real;
    }

    public android.view.inputmethod.CorrectionInfo unwrap() {
        return getReal();
    }

    public CorrectionInfo(int arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2) {
        this(new android.view.inputmethod.CorrectionInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.inputmethod.CorrectionInfo) real).describeContents();
    }

    public java.lang.CharSequence getNewText() {
        return ((android.view.inputmethod.CorrectionInfo) real).getNewText();
    }

    public int getOffset() {
        return ((android.view.inputmethod.CorrectionInfo) real).getOffset();
    }

    public java.lang.CharSequence getOldText() {
        return ((android.view.inputmethod.CorrectionInfo) real).getOldText();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.CorrectionInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.CorrectionInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
