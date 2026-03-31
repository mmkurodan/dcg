// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class EditorInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EditorInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo wrap(android.view.inputmethod.EditorInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.EditorInfo getReal() {
        return (android.view.inputmethod.EditorInfo) real;
    }

    public android.view.inputmethod.EditorInfo unwrap() {
        return getReal();
    }

    public EditorInfo() {
        this(new android.view.inputmethod.EditorInfo(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.inputmethod.EditorInfo) real).describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        ((android.view.inputmethod.EditorInfo) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.view.inputmethod.EditorInfo) real).getAutofillId());
    }

    public java.lang.CharSequence getInitialSelectedText(int arg0) {
        return ((android.view.inputmethod.EditorInfo) real).getInitialSelectedText(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText getInitialSurroundingText(int arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText.wrap(((android.view.inputmethod.EditorInfo) real).getInitialSurroundingText(arg0, arg1, arg2));
    }

    public java.lang.CharSequence getInitialTextAfterCursor(int arg0, int arg1) {
        return ((android.view.inputmethod.EditorInfo) real).getInitialTextAfterCursor(arg0, arg1);
    }

    public java.lang.CharSequence getInitialTextBeforeCursor(int arg0, int arg1) {
        return ((android.view.inputmethod.EditorInfo) real).getInitialTextBeforeCursor(arg0, arg1);
    }

    public int getInitialToolType() {
        return ((android.view.inputmethod.EditorInfo) real).getInitialToolType();
    }

    public boolean isStylusHandwritingEnabled() {
        return ((android.view.inputmethod.EditorInfo) real).isStylusHandwritingEnabled();
    }

    public boolean isWritingToolsEnabled() {
        return ((android.view.inputmethod.EditorInfo) real).isWritingToolsEnabled();
    }

    public void makeCompatible(int arg0) {
        ((android.view.inputmethod.EditorInfo) real).makeCompatible(arg0);
    }

    public void setAutofillId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
        ((android.view.inputmethod.EditorInfo) real).setAutofillId(arg0 == null ? null : arg0.getReal());
    }

    public void setInitialSurroundingSubText(java.lang.CharSequence arg0, int arg1) {
        ((android.view.inputmethod.EditorInfo) real).setInitialSurroundingSubText(arg0, arg1);
    }

    public void setInitialSurroundingText(java.lang.CharSequence arg0) {
        ((android.view.inputmethod.EditorInfo) real).setInitialSurroundingText(arg0);
    }

    public void setInitialToolType(int arg0) {
        ((android.view.inputmethod.EditorInfo) real).setInitialToolType(arg0);
    }

    public void setStylusHandwritingEnabled(boolean arg0) {
        ((android.view.inputmethod.EditorInfo) real).setStylusHandwritingEnabled(arg0);
    }

    public void setWritingToolsEnabled(boolean arg0) {
        ((android.view.inputmethod.EditorInfo) real).setWritingToolsEnabled(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.EditorInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int IME_ACTION_DONE = android.view.inputmethod.EditorInfo.IME_ACTION_DONE;
    public static final int IME_ACTION_GO = android.view.inputmethod.EditorInfo.IME_ACTION_GO;
    public static final int IME_ACTION_NEXT = android.view.inputmethod.EditorInfo.IME_ACTION_NEXT;
    public static final int IME_ACTION_NONE = android.view.inputmethod.EditorInfo.IME_ACTION_NONE;
    public static final int IME_ACTION_PREVIOUS = android.view.inputmethod.EditorInfo.IME_ACTION_PREVIOUS;
    public static final int IME_ACTION_SEARCH = android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH;
    public static final int IME_ACTION_SEND = android.view.inputmethod.EditorInfo.IME_ACTION_SEND;
    public static final int IME_ACTION_UNSPECIFIED = android.view.inputmethod.EditorInfo.IME_ACTION_UNSPECIFIED;
    public static final int IME_FLAG_FORCE_ASCII = android.view.inputmethod.EditorInfo.IME_FLAG_FORCE_ASCII;
    public static final int IME_FLAG_NAVIGATE_NEXT = android.view.inputmethod.EditorInfo.IME_FLAG_NAVIGATE_NEXT;
    public static final int IME_FLAG_NAVIGATE_PREVIOUS = android.view.inputmethod.EditorInfo.IME_FLAG_NAVIGATE_PREVIOUS;
    public static final int IME_FLAG_NO_ACCESSORY_ACTION = android.view.inputmethod.EditorInfo.IME_FLAG_NO_ACCESSORY_ACTION;
    public static final int IME_FLAG_NO_ENTER_ACTION = android.view.inputmethod.EditorInfo.IME_FLAG_NO_ENTER_ACTION;
    public static final int IME_FLAG_NO_EXTRACT_UI = android.view.inputmethod.EditorInfo.IME_FLAG_NO_EXTRACT_UI;
    public static final int IME_FLAG_NO_FULLSCREEN = android.view.inputmethod.EditorInfo.IME_FLAG_NO_FULLSCREEN;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = android.view.inputmethod.EditorInfo.IME_FLAG_NO_PERSONALIZED_LEARNING;
    public static final int IME_MASK_ACTION = android.view.inputmethod.EditorInfo.IME_MASK_ACTION;
    public static final int IME_NULL = android.view.inputmethod.EditorInfo.IME_NULL;

}
