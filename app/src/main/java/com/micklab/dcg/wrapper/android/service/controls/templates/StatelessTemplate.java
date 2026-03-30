// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class StatelessTemplate {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StatelessTemplate(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.StatelessTemplate wrap(android.service.controls.templates.StatelessTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.StatelessTemplate(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.templates.StatelessTemplate getReal() {
        return (android.service.controls.templates.StatelessTemplate) real;
    }

    public android.service.controls.templates.StatelessTemplate unwrap() {
        return getReal();
    }

    public StatelessTemplate(java.lang.String arg0) {
        this(new android.service.controls.templates.StatelessTemplate(arg0), (__DcgwBridgeToken) null);
    }

    public int getTemplateType() {
        return ((android.service.controls.templates.StatelessTemplate) real).getTemplateType();
    }

}
