// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class ToggleRangeTemplate {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ToggleRangeTemplate(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ToggleRangeTemplate wrap(android.service.controls.templates.ToggleRangeTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.ToggleRangeTemplate(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.templates.ToggleRangeTemplate getReal() {
        return (android.service.controls.templates.ToggleRangeTemplate) real;
    }

    public android.service.controls.templates.ToggleRangeTemplate unwrap() {
        return getReal();
    }

    public ToggleRangeTemplate(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.controls.templates.ControlButton arg1, com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate arg2) {
        this(new android.service.controls.templates.ToggleRangeTemplate(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public ToggleRangeTemplate(java.lang.String arg0, boolean arg1, java.lang.CharSequence arg2, com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate arg3) {
        this(new android.service.controls.templates.ToggleRangeTemplate(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getActionDescription() {
        return ((android.service.controls.templates.ToggleRangeTemplate) real).getActionDescription();
    }

    public com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate getRange() {
        return com.micklab.dcg.wrapper.android.service.controls.templates.RangeTemplate.wrap(((android.service.controls.templates.ToggleRangeTemplate) real).getRange());
    }

    public int getTemplateType() {
        return ((android.service.controls.templates.ToggleRangeTemplate) real).getTemplateType();
    }

    public boolean isChecked() {
        return ((android.service.controls.templates.ToggleRangeTemplate) real).isChecked();
    }

}
