// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ProgressDialog {
    private final android.app.ProgressDialog real;

    public ProgressDialog(android.app.ProgressDialog real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog wrap(android.app.ProgressDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ProgressDialog(real);
    }

    public android.app.ProgressDialog unwrap() {
        return real;
    }

    public ProgressDialog(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.ProgressDialog(arg0 == null ? null : arg0.unwrap()));
    }

    public ProgressDialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.app.ProgressDialog(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int getMax() {
        return real.getMax();
    }

    public int getProgress() {
        return real.getProgress();
    }

    public int getSecondaryProgress() {
        return real.getSecondaryProgress();
    }

    public void incrementProgressBy(int arg0) {
        real.incrementProgressBy(arg0);
    }

    public void incrementSecondaryProgressBy(int arg0) {
        real.incrementSecondaryProgressBy(arg0);
    }

    public boolean isIndeterminate() {
        return real.isIndeterminate();
    }

    public void onStart() {
        real.onStart();
    }

    public void setIndeterminate(boolean arg0) {
        real.setIndeterminate(arg0);
    }

    public void setIndeterminateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setIndeterminateDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setMax(int arg0) {
        real.setMax(arg0);
    }

    public void setMessage(java.lang.CharSequence arg0) {
        real.setMessage(arg0);
    }

    public void setProgress(int arg0) {
        real.setProgress(arg0);
    }

    public void setProgressDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setProgressDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setProgressNumberFormat(java.lang.String arg0) {
        real.setProgressNumberFormat(arg0);
    }

    public void setProgressPercentFormat(java.text.NumberFormat arg0) {
        real.setProgressPercentFormat(arg0);
    }

    public void setProgressStyle(int arg0) {
        real.setProgressStyle(arg0);
    }

    public void setSecondaryProgress(int arg0) {
        real.setSecondaryProgress(arg0);
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog show(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2) {
        return com.micklab.dcg.wrapper.android.app.ProgressDialog.wrap(android.app.ProgressDialog.show(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog show(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, boolean arg3) {
        return com.micklab.dcg.wrapper.android.app.ProgressDialog.wrap(android.app.ProgressDialog.show(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog show(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, boolean arg3, boolean arg4) {
        return com.micklab.dcg.wrapper.android.app.ProgressDialog.wrap(android.app.ProgressDialog.show(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.app.ProgressDialog show(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, boolean arg3, boolean arg4, com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener arg5) {
        return com.micklab.dcg.wrapper.android.app.ProgressDialog.wrap(android.app.ProgressDialog.show(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public static final int STYLE_HORIZONTAL = android.app.ProgressDialog.STYLE_HORIZONTAL;
    public static final int STYLE_SPINNER = android.app.ProgressDialog.STYLE_SPINNER;

}
