// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class ThumbnailTemplate {
    private final android.service.controls.templates.ThumbnailTemplate real;

    public ThumbnailTemplate(android.service.controls.templates.ThumbnailTemplate real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ThumbnailTemplate wrap(android.service.controls.templates.ThumbnailTemplate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.ThumbnailTemplate(real);
    }

    public android.service.controls.templates.ThumbnailTemplate unwrap() {
        return real;
    }

    public ThumbnailTemplate(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg2, java.lang.CharSequence arg3) {
        this(new android.service.controls.templates.ThumbnailTemplate(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public int getTemplateType() {
        return real.getTemplateType();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getThumbnail() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getThumbnail());
    }

    public boolean isActive() {
        return real.isActive();
    }

}
