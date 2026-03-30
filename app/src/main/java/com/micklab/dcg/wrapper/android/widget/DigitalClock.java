// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class DigitalClock {
    private final android.widget.DigitalClock real;

    public DigitalClock(android.widget.DigitalClock real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.DigitalClock wrap(android.widget.DigitalClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.DigitalClock(real);
    }

    public android.widget.DigitalClock unwrap() {
        return real;
    }

    public DigitalClock(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.DigitalClock(arg0 == null ? null : arg0.unwrap()));
    }

    public DigitalClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.DigitalClock(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

}
