// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ProgressDialog {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProgressDialog(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog wrap(android.app.ProgressDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ProgressDialog(real, (__DcgwBridgeToken) null);
    }

    public android.app.ProgressDialog getReal() {
        return (android.app.ProgressDialog) real;
    }

    public android.app.ProgressDialog unwrap() {
        return getReal();
    }

    public ProgressDialog(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.ProgressDialog(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ProgressDialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.app.ProgressDialog(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int getMax() {
        return ((android.app.ProgressDialog) real).getMax();
    }

    public int getProgress() {
        return ((android.app.ProgressDialog) real).getProgress();
    }

    public int getSecondaryProgress() {
        return ((android.app.ProgressDialog) real).getSecondaryProgress();
    }

    public void incrementProgressBy(int arg0) {
        ((android.app.ProgressDialog) real).incrementProgressBy(arg0);
    }

    public void incrementSecondaryProgressBy(int arg0) {
        ((android.app.ProgressDialog) real).incrementSecondaryProgressBy(arg0);
    }

    public boolean isIndeterminate() {
        return ((android.app.ProgressDialog) real).isIndeterminate();
    }

    public void onStart() {
        ((android.app.ProgressDialog) real).onStart();
    }

    public void setIndeterminate(boolean arg0) {
        ((android.app.ProgressDialog) real).setIndeterminate(arg0);
    }

    public void setIndeterminateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.app.ProgressDialog) real).setIndeterminateDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setMax(int arg0) {
        ((android.app.ProgressDialog) real).setMax(arg0);
    }

    public void setMessage(java.lang.CharSequence arg0) {
        ((android.app.ProgressDialog) real).setMessage(arg0);
    }

    public void setProgress(int arg0) {
        ((android.app.ProgressDialog) real).setProgress(arg0);
    }

    public void setProgressDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.app.ProgressDialog) real).setProgressDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setProgressNumberFormat(java.lang.String arg0) {
        ((android.app.ProgressDialog) real).setProgressNumberFormat(arg0);
    }

    public void setProgressPercentFormat(java.text.NumberFormat arg0) {
        ((android.app.ProgressDialog) real).setProgressPercentFormat(arg0);
    }

    public void setProgressStyle(int arg0) {
        ((android.app.ProgressDialog) real).setProgressStyle(arg0);
    }

    public void setSecondaryProgress(int arg0) {
        ((android.app.ProgressDialog) real).setSecondaryProgress(arg0);
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog show(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2) {
        return com.micklab.dcg.wrapper.android.app.ProgressDialog.wrap(android.app.ProgressDialog.show(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog show(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, boolean arg3) {
        return com.micklab.dcg.wrapper.android.app.ProgressDialog.wrap(android.app.ProgressDialog.show(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog show(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, boolean arg3, boolean arg4) {
        return com.micklab.dcg.wrapper.android.app.ProgressDialog.wrap(android.app.ProgressDialog.show(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog show(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, boolean arg3, boolean arg4, com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener arg5) {
        return com.micklab.dcg.wrapper.android.app.ProgressDialog.wrap(android.app.ProgressDialog.show(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()));
    }

    public static final int STYLE_HORIZONTAL = android.app.ProgressDialog.STYLE_HORIZONTAL;
    public static final int STYLE_SPINNER = android.app.ProgressDialog.STYLE_SPINNER;

}
