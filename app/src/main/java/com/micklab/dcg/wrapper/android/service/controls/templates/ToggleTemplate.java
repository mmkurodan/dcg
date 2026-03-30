// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class ToggleTemplate {
    private final android.service.controls.templates.ToggleTemplate real;

    public ToggleTemplate(android.service.controls.templates.ToggleTemplate real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ToggleTemplate wrap(android.service.controls.templates.ToggleTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.ToggleTemplate(real);
    }

    public android.service.controls.templates.ToggleTemplate unwrap() {
        return real;
    }

    public ToggleTemplate(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.controls.templates.ControlButton arg1) {
        this(new android.service.controls.templates.ToggleTemplate(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public int getTemplateType() {
        return real.getTemplateType();
    }

    public boolean isChecked() {
        return real.isChecked();
    }

}
