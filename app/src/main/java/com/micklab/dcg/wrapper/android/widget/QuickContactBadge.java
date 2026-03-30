// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class QuickContactBadge {
    private final android.widget.QuickContactBadge real;

    public QuickContactBadge(android.widget.QuickContactBadge real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.QuickContactBadge wrap(android.widget.QuickContactBadge real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.QuickContactBadge(real);
    }

    public android.widget.QuickContactBadge unwrap() {
        return real;
    }

    public QuickContactBadge(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.QuickContactBadge(arg0 == null ? null : arg0.unwrap()));
    }

    public QuickContactBadge(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.QuickContactBadge(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public QuickContactBadge(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.QuickContactBadge(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public QuickContactBadge(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.QuickContactBadge(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void assignContactFromEmail(java.lang.String arg0, boolean arg1) {
        real.assignContactFromEmail(arg0, arg1);
    }

    public void assignContactFromEmail(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.assignContactFromEmail(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void assignContactFromPhone(java.lang.String arg0, boolean arg1) {
        real.assignContactFromPhone(arg0, arg1);
    }

    public void assignContactFromPhone(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.assignContactFromPhone(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void assignContactUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.assignContactUri(arg0 == null ? null : arg0.unwrap());
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        real.drawableHotspotChanged(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onClick(arg0 == null ? null : arg0.unwrap());
    }

    public void setExcludeMimes(java.lang.String[] arg0) {
        real.setExcludeMimes(arg0);
    }

    public void setImageToDefault() {
        real.setImageToDefault();
    }

    public void setMode(int arg0) {
        real.setMode(arg0);
    }

    public void setOverlay(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setOverlay(arg0 == null ? null : arg0.unwrap());
    }

    public void setPrioritizedMimeType(java.lang.String arg0) {
        real.setPrioritizedMimeType(arg0);
    }


}
