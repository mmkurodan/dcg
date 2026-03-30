// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class NumberPicker {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NumberPicker(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.NumberPicker wrap(android.widget.NumberPicker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.NumberPicker(real, (__DcgwBridgeToken) null);
    }

    public android.widget.NumberPicker getReal() {
        return (android.widget.NumberPicker) real;
    }

    public android.widget.NumberPicker unwrap() {
        return getReal();
    }

    public NumberPicker(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.NumberPicker(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public NumberPicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.NumberPicker(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public NumberPicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.NumberPicker(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public NumberPicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.NumberPicker(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void computeScroll() {
        ((android.widget.NumberPicker) real).computeScroll();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.widget.NumberPicker) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.NumberPicker) real).dispatchTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.NumberPicker) real).dispatchTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider.wrap(((android.widget.NumberPicker) real).getAccessibilityNodeProvider());
    }

    public java.lang.String[] getDisplayedValues() {
        return ((android.widget.NumberPicker) real).getDisplayedValues();
    }

    public int getMaxValue() {
        return ((android.widget.NumberPicker) real).getMaxValue();
    }

    public int getMinValue() {
        return ((android.widget.NumberPicker) real).getMinValue();
    }

    public int getSelectionDividerHeight() {
        return ((android.widget.NumberPicker) real).getSelectionDividerHeight();
    }

    public int getSolidColor() {
        return ((android.widget.NumberPicker) real).getSolidColor();
    }

    public int getTextColor() {
        return ((android.widget.NumberPicker) real).getTextColor();
    }

    public float getTextSize() {
        return ((android.widget.NumberPicker) real).getTextSize();
    }

    public int getValue() {
        return ((android.widget.NumberPicker) real).getValue();
    }

    public boolean getWrapSelectorWheel() {
        return ((android.widget.NumberPicker) real).getWrapSelectorWheel();
    }

    public void jumpDrawablesToCurrentState() {
        ((android.widget.NumberPicker) real).jumpDrawablesToCurrentState();
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.NumberPicker) real).onInterceptTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.NumberPicker) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean performClick() {
        return ((android.widget.NumberPicker) real).performClick();
    }

    public boolean performLongClick() {
        return ((android.widget.NumberPicker) real).performLongClick();
    }

    public void scrollBy(int arg0, int arg1) {
        ((android.widget.NumberPicker) real).scrollBy(arg0, arg1);
    }

    public void setDisplayedValues(java.lang.String[] arg0) {
        ((android.widget.NumberPicker) real).setDisplayedValues(arg0);
    }

    public void setEnabled(boolean arg0) {
        ((android.widget.NumberPicker) real).setEnabled(arg0);
    }

    public void setFormatter(com.micklab.dcg.wrapper.android.widget.NumberPicker.Formatter arg0) {
        ((android.widget.NumberPicker) real).setFormatter(arg0 == null ? null : arg0.getReal());
    }

    public void setMaxValue(int arg0) {
        ((android.widget.NumberPicker) real).setMaxValue(arg0);
    }

    public void setMinValue(int arg0) {
        ((android.widget.NumberPicker) real).setMinValue(arg0);
    }

    public void setOnLongPressUpdateInterval(long arg0) {
        ((android.widget.NumberPicker) real).setOnLongPressUpdateInterval(arg0);
    }

    public void setOnScrollListener(com.micklab.dcg.wrapper.android.widget.NumberPicker.OnScrollListener arg0) {
        ((android.widget.NumberPicker) real).setOnScrollListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnValueChangedListener(com.micklab.dcg.wrapper.android.widget.NumberPicker.OnValueChangeListener arg0) {
        ((android.widget.NumberPicker) real).setOnValueChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setSelectionDividerHeight(int arg0) {
        ((android.widget.NumberPicker) real).setSelectionDividerHeight(arg0);
    }

    public void setTextColor(int arg0) {
        ((android.widget.NumberPicker) real).setTextColor(arg0);
    }

    public void setTextSize(float arg0) {
        ((android.widget.NumberPicker) real).setTextSize(arg0);
    }

    public void setValue(int arg0) {
        ((android.widget.NumberPicker) real).setValue(arg0);
    }

    public void setWrapSelectorWheel(boolean arg0) {
        ((android.widget.NumberPicker) real).setWrapSelectorWheel(arg0);
    }

    public static final class Formatter {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Formatter(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.NumberPicker.Formatter wrap(android.widget.NumberPicker.Formatter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.NumberPicker.Formatter(real, (__DcgwBridgeToken) null);
        }

        public android.widget.NumberPicker.Formatter getReal() {
            return (android.widget.NumberPicker.Formatter) real;
        }

        public android.widget.NumberPicker.Formatter unwrap() {
            return getReal();
        }

        public java.lang.String format(int arg0) {
            return ((android.widget.NumberPicker.Formatter) real).format(arg0);
        }

    }
    public static final class OnScrollListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnScrollListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.NumberPicker.OnScrollListener wrap(android.widget.NumberPicker.OnScrollListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.NumberPicker.OnScrollListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.NumberPicker.OnScrollListener getReal() {
            return (android.widget.NumberPicker.OnScrollListener) real;
        }

        public android.widget.NumberPicker.OnScrollListener unwrap() {
            return getReal();
        }

        public void onScrollStateChange(com.micklab.dcg.wrapper.android.widget.NumberPicker arg0, int arg1) {
            ((android.widget.NumberPicker.OnScrollListener) real).onScrollStateChange(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int SCROLL_STATE_FLING = android.widget.NumberPicker.OnScrollListener.SCROLL_STATE_FLING;
        public static final int SCROLL_STATE_IDLE = android.widget.NumberPicker.OnScrollListener.SCROLL_STATE_IDLE;
        public static final int SCROLL_STATE_TOUCH_SCROLL = android.widget.NumberPicker.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL;

    }
    public static final class OnValueChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnValueChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.NumberPicker.OnValueChangeListener wrap(android.widget.NumberPicker.OnValueChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.NumberPicker.OnValueChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.NumberPicker.OnValueChangeListener getReal() {
            return (android.widget.NumberPicker.OnValueChangeListener) real;
        }

        public android.widget.NumberPicker.OnValueChangeListener unwrap() {
            return getReal();
        }

        public void onValueChange(com.micklab.dcg.wrapper.android.widget.NumberPicker arg0, int arg1, int arg2) {
            ((android.widget.NumberPicker.OnValueChangeListener) real).onValueChange(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
