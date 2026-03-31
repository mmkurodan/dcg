// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Toast {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Toast(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Toast wrap(android.widget.Toast real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Toast(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Toast getReal() {
        return (android.widget.Toast) real;
    }

    public android.widget.Toast unwrap() {
        return getReal();
    }

    public Toast(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Toast(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void addCallback(com.micklab.dcg.wrapper.android.widget.Toast.Callback arg0) {
        ((android.widget.Toast) real).addCallback(arg0 == null ? null : arg0.getReal());
    }

    public void cancel() {
        ((android.widget.Toast) real).cancel();
    }

    public int getDuration() {
        return ((android.widget.Toast) real).getDuration();
    }

    public int getGravity() {
        return ((android.widget.Toast) real).getGravity();
    }

    public float getHorizontalMargin() {
        return ((android.widget.Toast) real).getHorizontalMargin();
    }

    public float getVerticalMargin() {
        return ((android.widget.Toast) real).getVerticalMargin();
    }

    public com.micklab.dcg.wrapper.android.view.View getView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.Toast) real).getView());
    }

    public int getXOffset() {
        return ((android.widget.Toast) real).getXOffset();
    }

    public int getYOffset() {
        return ((android.widget.Toast) real).getYOffset();
    }

    public static com.micklab.dcg.wrapper.android.widget.Toast makeText(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.widget.Toast.wrap(android.widget.Toast.makeText(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.widget.Toast makeText(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.widget.Toast.wrap(android.widget.Toast.makeText(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public void removeCallback(com.micklab.dcg.wrapper.android.widget.Toast.Callback arg0) {
        ((android.widget.Toast) real).removeCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setDuration(int arg0) {
        ((android.widget.Toast) real).setDuration(arg0);
    }

    public void setGravity(int arg0, int arg1, int arg2) {
        ((android.widget.Toast) real).setGravity(arg0, arg1, arg2);
    }

    public void setMargin(float arg0, float arg1) {
        ((android.widget.Toast) real).setMargin(arg0, arg1);
    }

    public void setText(int arg0) {
        ((android.widget.Toast) real).setText(arg0);
    }

    public void setText(java.lang.CharSequence arg0) {
        ((android.widget.Toast) real).setText(arg0);
    }

    public void setView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.Toast) real).setView(arg0 == null ? null : arg0.getReal());
    }

    public void show() {
        ((android.widget.Toast) real).show();
    }

    public static final int LENGTH_LONG = android.widget.Toast.LENGTH_LONG;
    public static final int LENGTH_SHORT = android.widget.Toast.LENGTH_SHORT;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Toast.Callback wrap(android.widget.Toast.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Toast.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.widget.Toast.Callback getReal() {
            return (android.widget.Toast.Callback) real;
        }

        public android.widget.Toast.Callback unwrap() {
            return getReal();
        }

        public void onToastHidden() {
            ((android.widget.Toast.Callback) real).onToastHidden();
        }

        public void onToastShown() {
            ((android.widget.Toast.Callback) real).onToastShown();
        }

    }
}
