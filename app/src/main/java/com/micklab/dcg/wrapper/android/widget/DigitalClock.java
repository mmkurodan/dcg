// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class DigitalClock {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DigitalClock(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.DigitalClock wrap(android.widget.DigitalClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.DigitalClock(real, (__DcgwBridgeToken) null);
    }

    public android.widget.DigitalClock getReal() {
        return (android.widget.DigitalClock) real;
    }

    public android.widget.DigitalClock unwrap() {
        return getReal();
    }

    public DigitalClock(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.DigitalClock(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public DigitalClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.DigitalClock(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.DigitalClock) real).getAccessibilityClassName();
    }

}
