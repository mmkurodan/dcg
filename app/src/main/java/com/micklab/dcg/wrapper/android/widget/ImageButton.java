// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ImageButton {
    private final android.widget.ImageButton real;

    public ImageButton(android.widget.ImageButton real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ImageButton wrap(android.widget.ImageButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ImageButton(real);
    }

    public android.widget.ImageButton unwrap() {
        return real;
    }

    public ImageButton(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ImageButton(arg0 == null ? null : arg0.unwrap()));
    }

    public ImageButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ImageButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ImageButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ImageButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ImageButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ImageButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(real.onResolvePointerIcon(arg0 == null ? null : arg0.unwrap(), arg1));
    }

}
