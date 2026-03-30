// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class TextBoundsInfoResult {
    private final android.view.inputmethod.TextBoundsInfoResult real;

    public TextBoundsInfoResult(android.view.inputmethod.TextBoundsInfoResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfoResult wrap(android.view.inputmethod.TextBoundsInfoResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfoResult(real);
    }

    public android.view.inputmethod.TextBoundsInfoResult unwrap() {
        return real;
    }

    public TextBoundsInfoResult(int arg0) {
        this(new android.view.inputmethod.TextBoundsInfoResult(arg0));
    }

    public TextBoundsInfoResult(int arg0, com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo arg1) {
        this(new android.view.inputmethod.TextBoundsInfoResult(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int getResultCode() {
        return real.getResultCode();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo getTextBoundsInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.wrap(real.getTextBoundsInfo());
    }

    public static final int CODE_CANCELLED = android.view.inputmethod.TextBoundsInfoResult.CODE_CANCELLED;
    public static final int CODE_FAILED = android.view.inputmethod.TextBoundsInfoResult.CODE_FAILED;
    public static final int CODE_SUCCESS = android.view.inputmethod.TextBoundsInfoResult.CODE_SUCCESS;
    public static final int CODE_UNSUPPORTED = android.view.inputmethod.TextBoundsInfoResult.CODE_UNSUPPORTED;

}
