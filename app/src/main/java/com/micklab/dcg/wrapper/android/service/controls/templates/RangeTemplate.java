// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class RangeTemplate {
    private final android.service.controls.templates.RangeTemplate real;

    public RangeTemplate(android.service.controls.templates.RangeTemplate real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate wrap(android.service.controls.templates.RangeTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate(real);
    }

    public android.service.controls.templates.RangeTemplate unwrap() {
        return real;
    }

    public RangeTemplate(java.lang.String arg0, float arg1, float arg2, float arg3, float arg4, java.lang.CharSequence arg5) {
        this(new android.service.controls.templates.RangeTemplate(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public float getCurrentValue() {
        return real.getCurrentValue();
    }

    public java.lang.CharSequence getFormatString() {
        return real.getFormatString();
    }

    public float getMaxValue() {
        return real.getMaxValue();
    }

    public float getMinValue() {
        return real.getMinValue();
    }

    public float getStepValue() {
        return real.getStepValue();
    }

    public int getTemplateType() {
        return real.getTemplateType();
    }

}
