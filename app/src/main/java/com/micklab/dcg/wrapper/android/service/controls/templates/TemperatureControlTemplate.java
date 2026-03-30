// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class TemperatureControlTemplate {
    private final android.service.controls.templates.TemperatureControlTemplate real;

    public TemperatureControlTemplate(android.service.controls.templates.TemperatureControlTemplate real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.TemperatureControlTemplate wrap(android.service.controls.templates.TemperatureControlTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.TemperatureControlTemplate(real);
    }

    public android.service.controls.templates.TemperatureControlTemplate unwrap() {
        return real;
    }

    public TemperatureControlTemplate(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate arg1, int arg2, int arg3, int arg4) {
        this(new android.service.controls.templates.TemperatureControlTemplate(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public int getCurrentActiveMode() {
        return real.getCurrentActiveMode();
    }

    public int getCurrentMode() {
        return real.getCurrentMode();
    }

    public int getModes() {
        return real.getModes();
    }

    public com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate getTemplate() {
        return com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate.wrap(real.getTemplate());
    }

    public int getTemplateType() {
        return real.getTemplateType();
    }

    public static final int FLAG_MODE_COOL = android.service.controls.templates.TemperatureControlTemplate.FLAG_MODE_COOL;
    public static final int FLAG_MODE_ECO = android.service.controls.templates.TemperatureControlTemplate.FLAG_MODE_ECO;
    public static final int FLAG_MODE_HEAT = android.service.controls.templates.TemperatureControlTemplate.FLAG_MODE_HEAT;
    public static final int FLAG_MODE_HEAT_COOL = android.service.controls.templates.TemperatureControlTemplate.FLAG_MODE_HEAT_COOL;
    public static final int FLAG_MODE_OFF = android.service.controls.templates.TemperatureControlTemplate.FLAG_MODE_OFF;
    public static final int MODE_COOL = android.service.controls.templates.TemperatureControlTemplate.MODE_COOL;
    public static final int MODE_ECO = android.service.controls.templates.TemperatureControlTemplate.MODE_ECO;
    public static final int MODE_HEAT = android.service.controls.templates.TemperatureControlTemplate.MODE_HEAT;
    public static final int MODE_HEAT_COOL = android.service.controls.templates.TemperatureControlTemplate.MODE_HEAT_COOL;
    public static final int MODE_OFF = android.service.controls.templates.TemperatureControlTemplate.MODE_OFF;
    public static final int MODE_UNKNOWN = android.service.controls.templates.TemperatureControlTemplate.MODE_UNKNOWN;

}
