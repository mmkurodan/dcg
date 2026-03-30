// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class MediaRouteButton {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaRouteButton(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.MediaRouteButton wrap(android.app.MediaRouteButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.MediaRouteButton(real, (__DcgwBridgeToken) null);
    }

    public android.app.MediaRouteButton getReal() {
        return (android.app.MediaRouteButton) real;
    }

    public android.app.MediaRouteButton unwrap() {
        return getReal();
    }

    public MediaRouteButton(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.MediaRouteButton(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public MediaRouteButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.app.MediaRouteButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public MediaRouteButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.app.MediaRouteButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public MediaRouteButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.app.MediaRouteButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int getRouteTypes() {
        return ((android.app.MediaRouteButton) real).getRouteTypes();
    }

    public void jumpDrawablesToCurrentState() {
        ((android.app.MediaRouteButton) real).jumpDrawablesToCurrentState();
    }

    public void onAttachedToWindow() {
        ((android.app.MediaRouteButton) real).onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        ((android.app.MediaRouteButton) real).onDetachedFromWindow();
    }

    public boolean performClick() {
        return ((android.app.MediaRouteButton) real).performClick();
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        ((android.app.MediaRouteButton) real).setContentDescription(arg0);
    }

    public void setExtendedSettingsClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        ((android.app.MediaRouteButton) real).setExtendedSettingsClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setRouteTypes(int arg0) {
        ((android.app.MediaRouteButton) real).setRouteTypes(arg0);
    }

    public void setVisibility(int arg0) {
        ((android.app.MediaRouteButton) real).setVisibility(arg0);
    }

    public void showDialog() {
        ((android.app.MediaRouteButton) real).showDialog();
    }

}
