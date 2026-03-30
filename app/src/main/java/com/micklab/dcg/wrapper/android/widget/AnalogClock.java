// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AnalogClock {
    private final android.widget.AnalogClock real;

    public AnalogClock(android.widget.AnalogClock real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AnalogClock wrap(android.widget.AnalogClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AnalogClock(real);
    }

    public android.widget.AnalogClock unwrap() {
        return real;
    }

    public AnalogClock(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.AnalogClock(arg0 == null ? null : arg0.unwrap()));
    }

    public AnalogClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.AnalogClock(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public AnalogClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.AnalogClock(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public AnalogClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.AnalogClock(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getDialTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getDialTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getDialTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getDialTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getHourHandTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getHourHandTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getHourHandTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getHourHandTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getMinuteHandTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getMinuteHandTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getMinuteHandTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getMinuteHandTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getSecondHandTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getSecondHandTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getSecondHandTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getSecondHandTintList());
    }

    public java.lang.String getTimeZone() {
        return real.getTimeZone();
    }

    public void onVisibilityAggregated(boolean arg0) {
        real.onVisibilityAggregated(arg0);
    }

    public void setDial(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        real.setDial(arg0 == null ? null : arg0.unwrap());
    }

    public void setDialTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setDialTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setDialTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setDialTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setHourHand(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        real.setHourHand(arg0 == null ? null : arg0.unwrap());
    }

    public void setHourHandTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setHourHandTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setHourHandTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setHourHandTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setMinuteHand(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        real.setMinuteHand(arg0 == null ? null : arg0.unwrap());
    }

    public void setMinuteHandTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setMinuteHandTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setMinuteHandTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setMinuteHandTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setSecondHand(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        real.setSecondHand(arg0 == null ? null : arg0.unwrap());
    }

    public void setSecondHandTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setSecondHandTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setSecondHandTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setSecondHandTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setTimeZone(java.lang.String arg0) {
        real.setTimeZone(arg0);
    }

}
