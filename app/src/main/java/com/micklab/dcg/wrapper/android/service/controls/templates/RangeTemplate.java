// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class RangeTemplate {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangeTemplate(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate wrap(android.service.controls.templates.RangeTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.templates.RangeTemplate getReal() {
        return (android.service.controls.templates.RangeTemplate) real;
    }

    public android.service.controls.templates.RangeTemplate unwrap() {
        return getReal();
    }

    public RangeTemplate(java.lang.String arg0, float arg1, float arg2, float arg3, float arg4, java.lang.CharSequence arg5) {
        this(new android.service.controls.templates.RangeTemplate(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public float getCurrentValue() {
        return ((android.service.controls.templates.RangeTemplate) real).getCurrentValue();
    }

    public java.lang.CharSequence getFormatString() {
        return ((android.service.controls.templates.RangeTemplate) real).getFormatString();
    }

    public float getMaxValue() {
        return ((android.service.controls.templates.RangeTemplate) real).getMaxValue();
    }

    public float getMinValue() {
        return ((android.service.controls.templates.RangeTemplate) real).getMinValue();
    }

    public float getStepValue() {
        return ((android.service.controls.templates.RangeTemplate) real).getStepValue();
    }

    public int getTemplateType() {
        return ((android.service.controls.templates.RangeTemplate) real).getTemplateType();
    }

}
