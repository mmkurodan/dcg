// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class QuickContactBadge {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private QuickContactBadge(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.QuickContactBadge wrap(android.widget.QuickContactBadge real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.QuickContactBadge(real, (__DcgwBridgeToken) null);
    }

    public android.widget.QuickContactBadge getReal() {
        return (android.widget.QuickContactBadge) real;
    }

    public android.widget.QuickContactBadge unwrap() {
        return getReal();
    }

    public QuickContactBadge(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.QuickContactBadge(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public QuickContactBadge(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.QuickContactBadge(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public QuickContactBadge(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.QuickContactBadge(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public QuickContactBadge(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.QuickContactBadge(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void assignContactFromEmail(java.lang.String arg0, boolean arg1) {
        ((android.widget.QuickContactBadge) real).assignContactFromEmail(arg0, arg1);
    }

    public void assignContactFromEmail(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.widget.QuickContactBadge) real).assignContactFromEmail(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void assignContactFromPhone(java.lang.String arg0, boolean arg1) {
        ((android.widget.QuickContactBadge) real).assignContactFromPhone(arg0, arg1);
    }

    public void assignContactFromPhone(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.widget.QuickContactBadge) real).assignContactFromPhone(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void assignContactUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.widget.QuickContactBadge) real).assignContactUri(arg0 == null ? null : arg0.getReal());
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        ((android.widget.QuickContactBadge) real).drawableHotspotChanged(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.QuickContactBadge) real).getAccessibilityClassName();
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.QuickContactBadge) real).onClick(arg0 == null ? null : arg0.getReal());
    }

    public void setExcludeMimes(java.lang.String[] arg0) {
        ((android.widget.QuickContactBadge) real).setExcludeMimes(arg0);
    }

    public void setImageToDefault() {
        ((android.widget.QuickContactBadge) real).setImageToDefault();
    }

    public void setMode(int arg0) {
        ((android.widget.QuickContactBadge) real).setMode(arg0);
    }

    public void setOverlay(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.QuickContactBadge) real).setOverlay(arg0 == null ? null : arg0.getReal());
    }

    public void setPrioritizedMimeType(java.lang.String arg0) {
        ((android.widget.QuickContactBadge) real).setPrioritizedMimeType(arg0);
    }


}
