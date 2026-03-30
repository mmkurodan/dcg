// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class ThumbnailTemplate {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ThumbnailTemplate(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ThumbnailTemplate wrap(android.service.controls.templates.ThumbnailTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.ThumbnailTemplate(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.templates.ThumbnailTemplate getReal() {
        return (android.service.controls.templates.ThumbnailTemplate) real;
    }

    public android.service.controls.templates.ThumbnailTemplate unwrap() {
        return getReal();
    }

    public ThumbnailTemplate(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg2, java.lang.CharSequence arg3) {
        this(new android.service.controls.templates.ThumbnailTemplate(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getContentDescription() {
        return ((android.service.controls.templates.ThumbnailTemplate) real).getContentDescription();
    }

    public int getTemplateType() {
        return ((android.service.controls.templates.ThumbnailTemplate) real).getTemplateType();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getThumbnail() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.service.controls.templates.ThumbnailTemplate) real).getThumbnail());
    }

    public boolean isActive() {
        return ((android.service.controls.templates.ThumbnailTemplate) real).isActive();
    }

}
