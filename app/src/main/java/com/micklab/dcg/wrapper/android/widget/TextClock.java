// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TextClock {
    private final android.widget.TextClock real;

    public TextClock(android.widget.TextClock real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TextClock wrap(android.widget.TextClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextClock(real);
    }

    public android.widget.TextClock unwrap() {
        return real;
    }

    public TextClock(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TextClock(arg0 == null ? null : arg0.unwrap()));
    }

    public TextClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TextClock(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TextClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TextClock(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public TextClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TextClock(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getFormat12Hour() {
        return real.getFormat12Hour();
    }

    public java.lang.CharSequence getFormat24Hour() {
        return real.getFormat24Hour();
    }

    public java.lang.String getTimeZone() {
        return real.getTimeZone();
    }

    public boolean is24HourModeEnabled() {
        return real.is24HourModeEnabled();
    }

    public void onVisibilityAggregated(boolean arg0) {
        real.onVisibilityAggregated(arg0);
    }

    public void refreshTime() {
        real.refreshTime();
    }

    public void setFormat12Hour(java.lang.CharSequence arg0) {
        real.setFormat12Hour(arg0);
    }

    public void setFormat24Hour(java.lang.CharSequence arg0) {
        real.setFormat24Hour(arg0);
    }

    public void setTimeZone(java.lang.String arg0) {
        real.setTimeZone(arg0);
    }

    public static final java.lang.CharSequence DEFAULT_FORMAT_12_HOUR = android.widget.TextClock.DEFAULT_FORMAT_12_HOUR;
    public static final java.lang.CharSequence DEFAULT_FORMAT_24_HOUR = android.widget.TextClock.DEFAULT_FORMAT_24_HOUR;

}
