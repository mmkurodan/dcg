// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class KeyboardView {
    private final android.inputmethodservice.KeyboardView real;

    public KeyboardView(android.inputmethodservice.KeyboardView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView wrap(android.inputmethodservice.KeyboardView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView(real);
    }

    public android.inputmethodservice.KeyboardView unwrap() {
        return real;
    }

    public KeyboardView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.inputmethodservice.KeyboardView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public KeyboardView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.inputmethodservice.KeyboardView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public KeyboardView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.inputmethodservice.KeyboardView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void closing() {
        real.closing();
    }

    public com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard getKeyboard() {
        return com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.wrap(real.getKeyboard());
    }

    public boolean handleBack() {
        return real.handleBack();
    }

    public void invalidateAllKeys() {
        real.invalidateAllKeys();
    }

    public void invalidateKey(int arg0) {
        real.invalidateKey(arg0);
    }

    public boolean isPreviewEnabled() {
        return real.isPreviewEnabled();
    }

    public boolean isProximityCorrectionEnabled() {
        return real.isProximityCorrectionEnabled();
    }

    public boolean isShifted() {
        return real.isShifted();
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onClick(arg0 == null ? null : arg0.unwrap());
    }

    public void onDetachedFromWindow() {
        real.onDetachedFromWindow();
    }

    public void onDraw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.onDraw(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onHoverEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onMeasure(int arg0, int arg1) {
        real.onMeasure(arg0, arg1);
    }

    public void onSizeChanged(int arg0, int arg1, int arg2, int arg3) {
        real.onSizeChanged(arg0, arg1, arg2, arg3);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setKeyboard(com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard arg0) {
        real.setKeyboard(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnKeyboardActionListener(com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView.OnKeyboardActionListener arg0) {
        real.setOnKeyboardActionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPopupOffset(int arg0, int arg1) {
        real.setPopupOffset(arg0, arg1);
    }

    public void setPopupParent(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setPopupParent(arg0 == null ? null : arg0.unwrap());
    }

    public void setPreviewEnabled(boolean arg0) {
        real.setPreviewEnabled(arg0);
    }

    public void setProximityCorrectionEnabled(boolean arg0) {
        real.setProximityCorrectionEnabled(arg0);
    }

    public boolean setShifted(boolean arg0) {
        return real.setShifted(arg0);
    }

    public void setVerticalCorrection(int arg0) {
        real.setVerticalCorrection(arg0);
    }

    public static final class OnKeyboardActionListener {
        private final android.inputmethodservice.KeyboardView.OnKeyboardActionListener real;

        public OnKeyboardActionListener(android.inputmethodservice.KeyboardView.OnKeyboardActionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView.OnKeyboardActionListener wrap(android.inputmethodservice.KeyboardView.OnKeyboardActionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView.OnKeyboardActionListener(real);
        }

        public android.inputmethodservice.KeyboardView.OnKeyboardActionListener unwrap() {
            return real;
        }

        public void onKey(int arg0, int[] arg1) {
            real.onKey(arg0, arg1);
        }

        public void onPress(int arg0) {
            real.onPress(arg0);
        }

        public void onRelease(int arg0) {
            real.onRelease(arg0);
        }

        public void onText(java.lang.CharSequence arg0) {
            real.onText(arg0);
        }

        public void swipeDown() {
            real.swipeDown();
        }

        public void swipeLeft() {
            real.swipeLeft();
        }

        public void swipeRight() {
            real.swipeRight();
        }

        public void swipeUp() {
            real.swipeUp();
        }

    }
}
