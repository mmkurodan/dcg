// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class StatelessTemplate {
    private final android.service.controls.templates.StatelessTemplate real;

    public StatelessTemplate(android.service.controls.templates.StatelessTemplate real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.StatelessTemplate wrap(android.service.controls.templates.StatelessTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.StatelessTemplate(real);
    }

    public android.service.controls.templates.StatelessTemplate unwrap() {
        return real;
    }

    public StatelessTemplate(java.lang.String arg0) {
        this(new android.service.controls.templates.StatelessTemplate(arg0));
    }

    public int getTemplateType() {
        return real.getTemplateType();
    }

}
