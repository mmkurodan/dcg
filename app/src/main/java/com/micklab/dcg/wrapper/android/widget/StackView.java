// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class StackView {
    private final android.widget.StackView real;

    public StackView(android.widget.StackView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.StackView wrap(android.widget.StackView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.StackView(real);
    }

    public android.widget.StackView unwrap() {
        return real;
    }

    public StackView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.StackView(arg0 == null ? null : arg0.unwrap()));
    }

    public StackView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.StackView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public StackView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.StackView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public StackView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.StackView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void advance() {
        real.advance();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onInterceptTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void showNext() {
        real.showNext();
    }

    public void showPrevious() {
        real.showPrevious();
    }

}
