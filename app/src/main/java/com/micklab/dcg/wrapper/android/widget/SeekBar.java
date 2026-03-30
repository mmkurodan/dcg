// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SeekBar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SeekBar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SeekBar wrap(android.widget.SeekBar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SeekBar(real, (__DcgwBridgeToken) null);
    }

    public android.widget.SeekBar getReal() {
        return (android.widget.SeekBar) real;
    }

    public android.widget.SeekBar unwrap() {
        return getReal();
    }

    public SeekBar(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.SeekBar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public SeekBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.SeekBar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public SeekBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.SeekBar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public SeekBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.SeekBar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.SeekBar) real).getAccessibilityClassName();
    }

    public void setOnSeekBarChangeListener(com.micklab.dcg.wrapper.android.widget.SeekBar.OnSeekBarChangeListener arg0) {
        ((android.widget.SeekBar) real).setOnSeekBarChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class OnSeekBarChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSeekBarChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SeekBar.OnSeekBarChangeListener wrap(android.widget.SeekBar.OnSeekBarChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SeekBar.OnSeekBarChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SeekBar.OnSeekBarChangeListener getReal() {
            return (android.widget.SeekBar.OnSeekBarChangeListener) real;
        }

        public android.widget.SeekBar.OnSeekBarChangeListener unwrap() {
            return getReal();
        }

        public void onProgressChanged(com.micklab.dcg.wrapper.android.widget.SeekBar arg0, int arg1, boolean arg2) {
            ((android.widget.SeekBar.OnSeekBarChangeListener) real).onProgressChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public void onStartTrackingTouch(com.micklab.dcg.wrapper.android.widget.SeekBar arg0) {
            ((android.widget.SeekBar.OnSeekBarChangeListener) real).onStartTrackingTouch(arg0 == null ? null : arg0.getReal());
        }

        public void onStopTrackingTouch(com.micklab.dcg.wrapper.android.widget.SeekBar arg0) {
            ((android.widget.SeekBar.OnSeekBarChangeListener) real).onStopTrackingTouch(arg0 == null ? null : arg0.getReal());
        }

    }
}
