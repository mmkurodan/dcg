// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class ToggleRangeTemplate {
    private final android.service.controls.templates.ToggleRangeTemplate real;

    public ToggleRangeTemplate(android.service.controls.templates.ToggleRangeTemplate real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ToggleRangeTemplate wrap(android.service.controls.templates.ToggleRangeTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.ToggleRangeTemplate(real);
    }

    public android.service.controls.templates.ToggleRangeTemplate unwrap() {
        return real;
    }

    public ToggleRangeTemplate(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.controls.templates.ControlButton arg1, com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate arg2) {
        this(new android.service.controls.templates.ToggleRangeTemplate(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public ToggleRangeTemplate(java.lang.String arg0, boolean arg1, java.lang.CharSequence arg2, com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate arg3) {
        this(new android.service.controls.templates.ToggleRangeTemplate(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public java.lang.CharSequence getActionDescription() {
        return real.getActionDescription();
    }

    public com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate getRange() {
        return com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate.wrap(real.getRange());
    }

    public int getTemplateType() {
        return real.getTemplateType();
    }

    public boolean isChecked() {
        return real.isChecked();
    }

}
