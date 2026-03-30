// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class NumberPicker {
    private final android.widget.NumberPicker real;

    public NumberPicker(android.widget.NumberPicker real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.NumberPicker wrap(android.widget.NumberPicker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.NumberPicker(real);
    }

    public android.widget.NumberPicker unwrap() {
        return real;
    }

    public NumberPicker(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.NumberPicker(arg0 == null ? null : arg0.unwrap()));
    }

    public NumberPicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.NumberPicker(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public NumberPicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.NumberPicker(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public NumberPicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.NumberPicker(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void computeScroll() {
        real.computeScroll();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider.wrap(real.getAccessibilityNodeProvider());
    }

    public java.lang.String[] getDisplayedValues() {
        return real.getDisplayedValues();
    }

    public int getMaxValue() {
        return real.getMaxValue();
    }

    public int getMinValue() {
        return real.getMinValue();
    }

    public int getSelectionDividerHeight() {
        return real.getSelectionDividerHeight();
    }

    public int getSolidColor() {
        return real.getSolidColor();
    }

    public int getTextColor() {
        return real.getTextColor();
    }

    public float getTextSize() {
        return real.getTextSize();
    }

    public int getValue() {
        return real.getValue();
    }

    public boolean getWrapSelectorWheel() {
        return real.getWrapSelectorWheel();
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onInterceptTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean performClick() {
        return real.performClick();
    }

    public boolean performLongClick() {
        return real.performLongClick();
    }

    public void scrollBy(int arg0, int arg1) {
        real.scrollBy(arg0, arg1);
    }

    public void setDisplayedValues(java.lang.String[] arg0) {
        real.setDisplayedValues(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setFormatter(com.micklab.dcg.wrapper.android.widget.NumberPicker.Formatter arg0) {
        real.setFormatter(arg0 == null ? null : arg0.unwrap());
    }

    public void setMaxValue(int arg0) {
        real.setMaxValue(arg0);
    }

    public void setMinValue(int arg0) {
        real.setMinValue(arg0);
    }

    public void setOnLongPressUpdateInterval(long arg0) {
        real.setOnLongPressUpdateInterval(arg0);
    }

    public void setOnScrollListener(com.micklab.dcg.wrapper.android.widget.NumberPicker.OnScrollListener arg0) {
        real.setOnScrollListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnValueChangedListener(com.micklab.dcg.wrapper.android.widget.NumberPicker.OnValueChangeListener arg0) {
        real.setOnValueChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelectionDividerHeight(int arg0) {
        real.setSelectionDividerHeight(arg0);
    }

    public void setTextColor(int arg0) {
        real.setTextColor(arg0);
    }

    public void setTextSize(float arg0) {
        real.setTextSize(arg0);
    }

    public void setValue(int arg0) {
        real.setValue(arg0);
    }

    public void setWrapSelectorWheel(boolean arg0) {
        real.setWrapSelectorWheel(arg0);
    }

    public static final class Formatter {
        private final android.widget.NumberPicker.Formatter real;

        public Formatter(android.widget.NumberPicker.Formatter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.NumberPicker.Formatter wrap(android.widget.NumberPicker.Formatter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.NumberPicker.Formatter(real);
        }

        public android.widget.NumberPicker.Formatter unwrap() {
            return real;
        }

        public java.lang.String format(int arg0) {
            return real.format(arg0);
        }

    }
    public static final class OnScrollListener {
        private final android.widget.NumberPicker.OnScrollListener real;

        public OnScrollListener(android.widget.NumberPicker.OnScrollListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.NumberPicker.OnScrollListener wrap(android.widget.NumberPicker.OnScrollListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.NumberPicker.OnScrollListener(real);
        }

        public android.widget.NumberPicker.OnScrollListener unwrap() {
            return real;
        }

        public void onScrollStateChange(com.micklab.dcg.wrapper.android.widget.NumberPicker arg0, int arg1) {
            real.onScrollStateChange(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int SCROLL_STATE_FLING = android.widget.NumberPicker.OnScrollListener.SCROLL_STATE_FLING;
        public static final int SCROLL_STATE_IDLE = android.widget.NumberPicker.OnScrollListener.SCROLL_STATE_IDLE;
        public static final int SCROLL_STATE_TOUCH_SCROLL = android.widget.NumberPicker.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL;

    }
    public static final class OnValueChangeListener {
        private final android.widget.NumberPicker.OnValueChangeListener real;

        public OnValueChangeListener(android.widget.NumberPicker.OnValueChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.NumberPicker.OnValueChangeListener wrap(android.widget.NumberPicker.OnValueChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.NumberPicker.OnValueChangeListener(real);
        }

        public android.widget.NumberPicker.OnValueChangeListener unwrap() {
            return real;
        }

        public void onValueChange(com.micklab.dcg.wrapper.android.widget.NumberPicker arg0, int arg1, int arg2) {
            real.onValueChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
