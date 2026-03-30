// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SeekBar {
    private final android.widget.SeekBar real;

    public SeekBar(android.widget.SeekBar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SeekBar wrap(android.widget.SeekBar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SeekBar(real);
    }

    public android.widget.SeekBar unwrap() {
        return real;
    }

    public SeekBar(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.SeekBar(arg0 == null ? null : arg0.unwrap()));
    }

    public SeekBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.SeekBar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public SeekBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.SeekBar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public SeekBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.SeekBar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public void setOnSeekBarChangeListener(com.micklab.dcg.wrapper.android.widget.SeekBar.OnSeekBarChangeListener arg0) {
        real.setOnSeekBarChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class OnSeekBarChangeListener {
        private final android.widget.SeekBar.OnSeekBarChangeListener real;

        public OnSeekBarChangeListener(android.widget.SeekBar.OnSeekBarChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SeekBar.OnSeekBarChangeListener wrap(android.widget.SeekBar.OnSeekBarChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SeekBar.OnSeekBarChangeListener(real);
        }

        public android.widget.SeekBar.OnSeekBarChangeListener unwrap() {
            return real;
        }

        public void onProgressChanged(com.micklab.dcg.wrapper.android.widget.SeekBar arg0, int arg1, boolean arg2) {
            real.onProgressChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public void onStartTrackingTouch(com.micklab.dcg.wrapper.android.widget.SeekBar arg0) {
            real.onStartTrackingTouch(arg0 == null ? null : arg0.unwrap());
        }

        public void onStopTrackingTouch(com.micklab.dcg.wrapper.android.widget.SeekBar arg0) {
            real.onStopTrackingTouch(arg0 == null ? null : arg0.unwrap());
        }

    }
}
