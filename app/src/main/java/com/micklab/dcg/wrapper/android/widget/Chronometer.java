// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Chronometer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Chronometer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Chronometer wrap(android.widget.Chronometer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Chronometer(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Chronometer getReal() {
        return (android.widget.Chronometer) real;
    }

    public android.widget.Chronometer unwrap() {
        return getReal();
    }

    public Chronometer(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Chronometer(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Chronometer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.Chronometer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public Chronometer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.Chronometer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public Chronometer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.Chronometer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.Chronometer) real).getAccessibilityClassName();
    }

    public long getBase() {
        return ((android.widget.Chronometer) real).getBase();
    }

    public java.lang.CharSequence getContentDescription() {
        return ((android.widget.Chronometer) real).getContentDescription();
    }

    public java.lang.String getFormat() {
        return ((android.widget.Chronometer) real).getFormat();
    }

    public com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener getOnChronometerTickListener() {
        return com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener.wrap(((android.widget.Chronometer) real).getOnChronometerTickListener());
    }

    public boolean isCountDown() {
        return ((android.widget.Chronometer) real).isCountDown();
    }

    public boolean isTheFinalCountDown() {
        return ((android.widget.Chronometer) real).isTheFinalCountDown();
    }

    public void setBase(long arg0) {
        ((android.widget.Chronometer) real).setBase(arg0);
    }

    public void setCountDown(boolean arg0) {
        ((android.widget.Chronometer) real).setCountDown(arg0);
    }

    public void setFormat(java.lang.String arg0) {
        ((android.widget.Chronometer) real).setFormat(arg0);
    }

    public void setOnChronometerTickListener(com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener arg0) {
        ((android.widget.Chronometer) real).setOnChronometerTickListener(arg0 == null ? null : arg0.getReal());
    }

    public void start() {
        ((android.widget.Chronometer) real).start();
    }

    public void stop() {
        ((android.widget.Chronometer) real).stop();
    }

    public static final class OnChronometerTickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnChronometerTickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener wrap(android.widget.Chronometer.OnChronometerTickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.Chronometer.OnChronometerTickListener getReal() {
            return (android.widget.Chronometer.OnChronometerTickListener) real;
        }

        public android.widget.Chronometer.OnChronometerTickListener unwrap() {
            return getReal();
        }

        public void onChronometerTick(com.micklab.dcg.wrapper.android.widget.Chronometer arg0) {
            ((android.widget.Chronometer.OnChronometerTickListener) real).onChronometerTick(arg0 == null ? null : arg0.getReal());
        }

    }
}
