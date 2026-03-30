// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Chronometer {
    private final android.widget.Chronometer real;

    public Chronometer(android.widget.Chronometer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Chronometer wrap(android.widget.Chronometer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Chronometer(real);
    }

    public android.widget.Chronometer unwrap() {
        return real;
    }

    public Chronometer(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Chronometer(arg0 == null ? null : arg0.unwrap()));
    }

    public Chronometer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.Chronometer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public Chronometer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.Chronometer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public Chronometer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.Chronometer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public long getBase() {
        return real.getBase();
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public java.lang.String getFormat() {
        return real.getFormat();
    }

    public com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener getOnChronometerTickListener() {
        return com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener.wrap(real.getOnChronometerTickListener());
    }

    public boolean isCountDown() {
        return real.isCountDown();
    }

    public boolean isTheFinalCountDown() {
        return real.isTheFinalCountDown();
    }

    public void setBase(long arg0) {
        real.setBase(arg0);
    }

    public void setCountDown(boolean arg0) {
        real.setCountDown(arg0);
    }

    public void setFormat(java.lang.String arg0) {
        real.setFormat(arg0);
    }

    public void setOnChronometerTickListener(com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener arg0) {
        real.setOnChronometerTickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void start() {
        real.start();
    }

    public void stop() {
        real.stop();
    }

    public static final class OnChronometerTickListener {
        private final android.widget.Chronometer.OnChronometerTickListener real;

        public OnChronometerTickListener(android.widget.Chronometer.OnChronometerTickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener wrap(android.widget.Chronometer.OnChronometerTickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Chronometer.OnChronometerTickListener(real);
        }

        public android.widget.Chronometer.OnChronometerTickListener unwrap() {
            return real;
        }

        public void onChronometerTick(com.micklab.dcg.wrapper.android.widget.Chronometer arg0) {
            real.onChronometerTick(arg0 == null ? null : arg0.unwrap());
        }

    }
}
