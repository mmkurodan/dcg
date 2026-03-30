// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Spinner {
    private final android.widget.Spinner real;

    public Spinner(android.widget.Spinner real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Spinner wrap(android.widget.Spinner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Spinner(real);
    }

    public android.widget.Spinner unwrap() {
        return real;
    }

    public Spinner(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Spinner(arg0 == null ? null : arg0.unwrap()));
    }

    public Spinner(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.widget.Spinner(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public Spinner(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.Spinner(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public Spinner(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.Spinner(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public Spinner(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.Spinner(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public Spinner(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3, int arg4) {
        this(new android.widget.Spinner(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public Spinner(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3, int arg4, android.content.res.Resources.Theme arg5) {
        this(new android.widget.Spinner(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getBaseline() {
        return real.getBaseline();
    }

    public int getDropDownHorizontalOffset() {
        return real.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        return real.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return real.getDropDownWidth();
    }

    public int getGravity() {
        return real.getGravity();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getPopupBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getPopupBackground());
    }

    public com.micklab.dcg.wrapper.android.content.Context getPopupContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getPopupContext());
    }

    public java.lang.CharSequence getPrompt() {
        return real.getPrompt();
    }

    public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1) {
        real.onClick(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(real.onResolvePointerIcon(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.onSaveInstanceState());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean performClick() {
        return real.performClick();
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.SpinnerAdapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setDropDownHorizontalOffset(int arg0) {
        real.setDropDownHorizontalOffset(arg0);
    }

    public void setDropDownVerticalOffset(int arg0) {
        real.setDropDownVerticalOffset(arg0);
    }

    public void setDropDownWidth(int arg0) {
        real.setDropDownWidth(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setGravity(int arg0) {
        real.setGravity(arg0);
    }

    public void setOnItemClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener arg0) {
        real.setOnItemClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPopupBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setPopupBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setPopupBackgroundResource(int arg0) {
        real.setPopupBackgroundResource(arg0);
    }

    public void setPrompt(java.lang.CharSequence arg0) {
        real.setPrompt(arg0);
    }

    public void setPromptId(int arg0) {
        real.setPromptId(arg0);
    }

    public static final int MODE_DIALOG = android.widget.Spinner.MODE_DIALOG;
    public static final int MODE_DROPDOWN = android.widget.Spinner.MODE_DROPDOWN;

}
