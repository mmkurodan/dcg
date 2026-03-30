// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TextClock {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextClock(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TextClock wrap(android.widget.TextClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextClock(real, (__DcgwBridgeToken) null);
    }

    public android.widget.TextClock getReal() {
        return (android.widget.TextClock) real;
    }

    public android.widget.TextClock unwrap() {
        return getReal();
    }

    public TextClock(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TextClock(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TextClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TextClock(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TextClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TextClock(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public TextClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TextClock(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getFormat12Hour() {
        return ((android.widget.TextClock) real).getFormat12Hour();
    }

    public java.lang.CharSequence getFormat24Hour() {
        return ((android.widget.TextClock) real).getFormat24Hour();
    }

    public java.lang.String getTimeZone() {
        return ((android.widget.TextClock) real).getTimeZone();
    }

    public boolean is24HourModeEnabled() {
        return ((android.widget.TextClock) real).is24HourModeEnabled();
    }

    public void onVisibilityAggregated(boolean arg0) {
        ((android.widget.TextClock) real).onVisibilityAggregated(arg0);
    }

    public void refreshTime() {
        ((android.widget.TextClock) real).refreshTime();
    }

    public void setFormat12Hour(java.lang.CharSequence arg0) {
        ((android.widget.TextClock) real).setFormat12Hour(arg0);
    }

    public void setFormat24Hour(java.lang.CharSequence arg0) {
        ((android.widget.TextClock) real).setFormat24Hour(arg0);
    }

    public void setTimeZone(java.lang.String arg0) {
        ((android.widget.TextClock) real).setTimeZone(arg0);
    }

    public static final java.lang.CharSequence DEFAULT_FORMAT_12_HOUR = android.widget.TextClock.DEFAULT_FORMAT_12_HOUR;
    public static final java.lang.CharSequence DEFAULT_FORMAT_24_HOUR = android.widget.TextClock.DEFAULT_FORMAT_24_HOUR;

}
