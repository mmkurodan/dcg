// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class TemperatureControlTemplate {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TemperatureControlTemplate(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.TemperatureControlTemplate wrap(android.service.controls.templates.TemperatureControlTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.TemperatureControlTemplate(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.templates.TemperatureControlTemplate getReal() {
        return (android.service.controls.templates.TemperatureControlTemplate) real;
    }

    public android.service.controls.templates.TemperatureControlTemplate unwrap() {
        return getReal();
    }

    public TemperatureControlTemplate(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate arg1, int arg2, int arg3, int arg4) {
        this(new android.service.controls.templates.TemperatureControlTemplate(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int getCurrentActiveMode() {
        return ((android.service.controls.templates.TemperatureControlTemplate) real).getCurrentActiveMode();
    }

    public int getCurrentMode() {
        return ((android.service.controls.templates.TemperatureControlTemplate) real).getCurrentMode();
    }

    public int getModes() {
        return ((android.service.controls.templates.TemperatureControlTemplate) real).getModes();
    }

    public com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate getTemplate() {
        return com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate.wrap(((android.service.controls.templates.TemperatureControlTemplate) real).getTemplate());
    }

    public int getTemplateType() {
        return ((android.service.controls.templates.TemperatureControlTemplate) real).getTemplateType();
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
