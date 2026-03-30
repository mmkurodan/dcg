// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class KeyboardView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyboardView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView wrap(android.inputmethodservice.KeyboardView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView(real, (__DcgwBridgeToken) null);
    }

    public android.inputmethodservice.KeyboardView getReal() {
        return (android.inputmethodservice.KeyboardView) real;
    }

    public android.inputmethodservice.KeyboardView unwrap() {
        return getReal();
    }

    public KeyboardView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.inputmethodservice.KeyboardView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public KeyboardView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.inputmethodservice.KeyboardView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public KeyboardView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.inputmethodservice.KeyboardView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void closing() {
        ((android.inputmethodservice.KeyboardView) real).closing();
    }

    public com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard getKeyboard() {
        return com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.wrap(((android.inputmethodservice.KeyboardView) real).getKeyboard());
    }

    public boolean handleBack() {
        return ((android.inputmethodservice.KeyboardView) real).handleBack();
    }

    public void invalidateAllKeys() {
        ((android.inputmethodservice.KeyboardView) real).invalidateAllKeys();
    }

    public void invalidateKey(int arg0) {
        ((android.inputmethodservice.KeyboardView) real).invalidateKey(arg0);
    }

    public boolean isPreviewEnabled() {
        return ((android.inputmethodservice.KeyboardView) real).isPreviewEnabled();
    }

    public boolean isProximityCorrectionEnabled() {
        return ((android.inputmethodservice.KeyboardView) real).isProximityCorrectionEnabled();
    }

    public boolean isShifted() {
        return ((android.inputmethodservice.KeyboardView) real).isShifted();
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.inputmethodservice.KeyboardView) real).onClick(arg0 == null ? null : arg0.getReal());
    }

    public void onDetachedFromWindow() {
        ((android.inputmethodservice.KeyboardView) real).onDetachedFromWindow();
    }

    public void onDraw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.inputmethodservice.KeyboardView) real).onDraw(arg0 == null ? null : arg0.getReal());
    }

    public boolean onHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.inputmethodservice.KeyboardView) real).onHoverEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onMeasure(int arg0, int arg1) {
        ((android.inputmethodservice.KeyboardView) real).onMeasure(arg0, arg1);
    }

    public void onSizeChanged(int arg0, int arg1, int arg2, int arg3) {
        ((android.inputmethodservice.KeyboardView) real).onSizeChanged(arg0, arg1, arg2, arg3);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.inputmethodservice.KeyboardView) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void setKeyboard(com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard arg0) {
        ((android.inputmethodservice.KeyboardView) real).setKeyboard(arg0 == null ? null : arg0.getReal());
    }

    public void setOnKeyboardActionListener(com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView.OnKeyboardActionListener arg0) {
        ((android.inputmethodservice.KeyboardView) real).setOnKeyboardActionListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPopupOffset(int arg0, int arg1) {
        ((android.inputmethodservice.KeyboardView) real).setPopupOffset(arg0, arg1);
    }

    public void setPopupParent(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.inputmethodservice.KeyboardView) real).setPopupParent(arg0 == null ? null : arg0.getReal());
    }

    public void setPreviewEnabled(boolean arg0) {
        ((android.inputmethodservice.KeyboardView) real).setPreviewEnabled(arg0);
    }

    public void setProximityCorrectionEnabled(boolean arg0) {
        ((android.inputmethodservice.KeyboardView) real).setProximityCorrectionEnabled(arg0);
    }

    public boolean setShifted(boolean arg0) {
        return ((android.inputmethodservice.KeyboardView) real).setShifted(arg0);
    }

    public void setVerticalCorrection(int arg0) {
        ((android.inputmethodservice.KeyboardView) real).setVerticalCorrection(arg0);
    }

    public static final class OnKeyboardActionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnKeyboardActionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView.OnKeyboardActionListener wrap(android.inputmethodservice.KeyboardView.OnKeyboardActionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.KeyboardView.OnKeyboardActionListener(real, (__DcgwBridgeToken) null);
        }

        public android.inputmethodservice.KeyboardView.OnKeyboardActionListener getReal() {
            return (android.inputmethodservice.KeyboardView.OnKeyboardActionListener) real;
        }

        public android.inputmethodservice.KeyboardView.OnKeyboardActionListener unwrap() {
            return getReal();
        }

        public void onKey(int arg0, int[] arg1) {
            ((android.inputmethodservice.KeyboardView.OnKeyboardActionListener) real).onKey(arg0, arg1);
        }

        public void onPress(int arg0) {
            ((android.inputmethodservice.KeyboardView.OnKeyboardActionListener) real).onPress(arg0);
        }

        public void onRelease(int arg0) {
            ((android.inputmethodservice.KeyboardView.OnKeyboardActionListener) real).onRelease(arg0);
        }

        public void onText(java.lang.CharSequence arg0) {
            ((android.inputmethodservice.KeyboardView.OnKeyboardActionListener) real).onText(arg0);
        }

        public void swipeDown() {
            ((android.inputmethodservice.KeyboardView.OnKeyboardActionListener) real).swipeDown();
        }

        public void swipeLeft() {
            ((android.inputmethodservice.KeyboardView.OnKeyboardActionListener) real).swipeLeft();
        }

        public void swipeRight() {
            ((android.inputmethodservice.KeyboardView.OnKeyboardActionListener) real).swipeRight();
        }

        public void swipeUp() {
            ((android.inputmethodservice.KeyboardView.OnKeyboardActionListener) real).swipeUp();
        }

    }
}
