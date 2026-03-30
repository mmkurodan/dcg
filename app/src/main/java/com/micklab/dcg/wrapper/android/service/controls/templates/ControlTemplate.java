// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class ControlTemplate {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ControlTemplate(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate wrap(android.service.controls.templates.ControlTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.templates.ControlTemplate getReal() {
        return (android.service.controls.templates.ControlTemplate) real;
    }

    public android.service.controls.templates.ControlTemplate unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate getErrorTemplate() {
        return com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate.wrap(android.service.controls.templates.ControlTemplate.getErrorTemplate());
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate getNoTemplateObject() {
        return com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate.wrap(android.service.controls.templates.ControlTemplate.getNoTemplateObject());
    }

    public java.lang.String getTemplateId() {
        return ((android.service.controls.templates.ControlTemplate) real).getTemplateId();
    }

    public int getTemplateType() {
        return ((android.service.controls.templates.ControlTemplate) real).getTemplateType();
    }

    public static final int TYPE_ERROR = android.service.controls.templates.ControlTemplate.TYPE_ERROR;
    public static final int TYPE_NO_TEMPLATE = android.service.controls.templates.ControlTemplate.TYPE_NO_TEMPLATE;
    public static final int TYPE_RANGE = android.service.controls.templates.ControlTemplate.TYPE_RANGE;
    public static final int TYPE_STATELESS = android.service.controls.templates.ControlTemplate.TYPE_STATELESS;
    public static final int TYPE_TEMPERATURE = android.service.controls.templates.ControlTemplate.TYPE_TEMPERATURE;
    public static final int TYPE_THUMBNAIL = android.service.controls.templates.ControlTemplate.TYPE_THUMBNAIL;
    public static final int TYPE_TOGGLE = android.service.controls.templates.ControlTemplate.TYPE_TOGGLE;
    public static final int TYPE_TOGGLE_RANGE = android.service.controls.templates.ControlTemplate.TYPE_TOGGLE_RANGE;

}
