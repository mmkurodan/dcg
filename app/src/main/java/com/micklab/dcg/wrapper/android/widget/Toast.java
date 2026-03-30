// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Toast {
    private final android.widget.Toast real;

    public Toast(android.widget.Toast real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Toast wrap(android.widget.Toast real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Toast(real);
    }

    public android.widget.Toast unwrap() {
        return real;
    }

    public Toast(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Toast(arg0 == null ? null : arg0.unwrap()));
    }

    public void addCallback(com.micklab.dcg.wrapper.android.widget.Toast.Callback arg0) {
        real.addCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void cancel() {
        real.cancel();
    }

    public int getDuration() {
        return real.getDuration();
    }

    public int getGravity() {
        return real.getGravity();
    }

    public float getHorizontalMargin() {
        return real.getHorizontalMargin();
    }

    public float getVerticalMargin() {
        return real.getVerticalMargin();
    }

    public com.micklab.dcg.wrapper.android.view.View getView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView());
    }

    public int getXOffset() {
        return real.getXOffset();
    }

    public int getYOffset() {
        return real.getYOffset();
    }

    public static com.micklab.dcg.wrapper.android.widget.Toast makeText(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.widget.Toast.wrap(android.widget.Toast.makeText(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.widget.Toast makeText(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.CharSequence arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.widget.Toast.wrap(android.widget.Toast.makeText(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public void removeCallback(com.micklab.dcg.wrapper.android.widget.Toast.Callback arg0) {
        real.removeCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setDuration(int arg0) {
        real.setDuration(arg0);
    }

    public void setGravity(int arg0, int arg1, int arg2) {
        real.setGravity(arg0, arg1, arg2);
    }

    public void setMargin(float arg0, float arg1) {
        real.setMargin(arg0, arg1);
    }

    public void setText(java.lang.CharSequence arg0) {
        real.setText(arg0);
    }

    public void setText(int arg0) {
        real.setText(arg0);
    }

    public void setView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setView(arg0 == null ? null : arg0.unwrap());
    }

    public void show() {
        real.show();
    }

    public static final int LENGTH_LONG = android.widget.Toast.LENGTH_LONG;
    public static final int LENGTH_SHORT = android.widget.Toast.LENGTH_SHORT;

    public static final class Callback {
        private final android.widget.Toast.Callback real;

        public Callback(android.widget.Toast.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Toast.Callback wrap(android.widget.Toast.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Toast.Callback(real);
        }

        public android.widget.Toast.Callback unwrap() {
            return real;
        }

        public void onToastHidden() {
            real.onToastHidden();
        }

        public void onToastShown() {
            real.onToastShown();
        }

    }
}
