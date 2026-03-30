// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class ToggleTemplate {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ToggleTemplate(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ToggleTemplate wrap(android.service.controls.templates.ToggleTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.ToggleTemplate(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.templates.ToggleTemplate getReal() {
        return (android.service.controls.templates.ToggleTemplate) real;
    }

    public android.service.controls.templates.ToggleTemplate unwrap() {
        return getReal();
    }

    public ToggleTemplate(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.controls.templates.ControlButton arg1) {
        this(new android.service.controls.templates.ToggleTemplate(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getContentDescription() {
        return ((android.service.controls.templates.ToggleTemplate) real).getContentDescription();
    }

    public int getTemplateType() {
        return ((android.service.controls.templates.ToggleTemplate) real).getTemplateType();
    }

    public boolean isChecked() {
        return ((android.service.controls.templates.ToggleTemplate) real).isChecked();
    }

}
