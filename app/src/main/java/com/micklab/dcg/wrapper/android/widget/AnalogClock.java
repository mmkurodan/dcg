// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AnalogClock {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnalogClock(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AnalogClock wrap(android.widget.AnalogClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AnalogClock(real, (__DcgwBridgeToken) null);
    }

    public android.widget.AnalogClock getReal() {
        return (android.widget.AnalogClock) real;
    }

    public android.widget.AnalogClock unwrap() {
        return getReal();
    }

    public AnalogClock(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.AnalogClock(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AnalogClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.AnalogClock(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public AnalogClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.AnalogClock(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public AnalogClock(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.AnalogClock(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getDialTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.widget.AnalogClock) real).getDialTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getDialTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.AnalogClock) real).getDialTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getHourHandTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.widget.AnalogClock) real).getHourHandTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getHourHandTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.AnalogClock) real).getHourHandTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getMinuteHandTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.widget.AnalogClock) real).getMinuteHandTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getMinuteHandTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.AnalogClock) real).getMinuteHandTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getSecondHandTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.widget.AnalogClock) real).getSecondHandTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getSecondHandTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.AnalogClock) real).getSecondHandTintList());
    }

    public java.lang.String getTimeZone() {
        return ((android.widget.AnalogClock) real).getTimeZone();
    }

    public void onVisibilityAggregated(boolean arg0) {
        ((android.widget.AnalogClock) real).onVisibilityAggregated(arg0);
    }

    public void setDial(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        ((android.widget.AnalogClock) real).setDial(arg0 == null ? null : arg0.getReal());
    }

    public void setDialTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.widget.AnalogClock) real).setDialTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setDialTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.AnalogClock) real).setDialTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setHourHand(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        ((android.widget.AnalogClock) real).setHourHand(arg0 == null ? null : arg0.getReal());
    }

    public void setHourHandTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.widget.AnalogClock) real).setHourHandTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setHourHandTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.AnalogClock) real).setHourHandTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setMinuteHand(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        ((android.widget.AnalogClock) real).setMinuteHand(arg0 == null ? null : arg0.getReal());
    }

    public void setMinuteHandTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.widget.AnalogClock) real).setMinuteHandTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setMinuteHandTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.AnalogClock) real).setMinuteHandTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setSecondHand(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        ((android.widget.AnalogClock) real).setSecondHand(arg0 == null ? null : arg0.getReal());
    }

    public void setSecondHandTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.widget.AnalogClock) real).setSecondHandTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setSecondHandTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.AnalogClock) real).setSecondHandTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setTimeZone(java.lang.String arg0) {
        ((android.widget.AnalogClock) real).setTimeZone(arg0);
    }

}
