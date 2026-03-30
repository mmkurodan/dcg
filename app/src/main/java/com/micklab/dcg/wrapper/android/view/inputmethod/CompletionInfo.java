// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class CompletionInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CompletionInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo wrap(android.view.inputmethod.CompletionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.CompletionInfo getReal() {
        return (android.view.inputmethod.CompletionInfo) real;
    }

    public android.view.inputmethod.CompletionInfo unwrap() {
        return getReal();
    }

    public CompletionInfo(long arg0, int arg1, java.lang.CharSequence arg2) {
        this(new android.view.inputmethod.CompletionInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public CompletionInfo(long arg0, int arg1, java.lang.CharSequence arg2, java.lang.CharSequence arg3) {
        this(new android.view.inputmethod.CompletionInfo(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.inputmethod.CompletionInfo) real).describeContents();
    }

    public long getId() {
        return ((android.view.inputmethod.CompletionInfo) real).getId();
    }

    public java.lang.CharSequence getLabel() {
        return ((android.view.inputmethod.CompletionInfo) real).getLabel();
    }

    public int getPosition() {
        return ((android.view.inputmethod.CompletionInfo) real).getPosition();
    }

    public java.lang.CharSequence getText() {
        return ((android.view.inputmethod.CompletionInfo) real).getText();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.CompletionInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.CompletionInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
