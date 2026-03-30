// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class MediaRouteButton {
    private final android.app.MediaRouteButton real;

    public MediaRouteButton(android.app.MediaRouteButton real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.MediaRouteButton wrap(android.app.MediaRouteButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.MediaRouteButton(real);
    }

    public android.app.MediaRouteButton unwrap() {
        return real;
    }

    public MediaRouteButton(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.MediaRouteButton(arg0 == null ? null : arg0.unwrap()));
    }

    public MediaRouteButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.app.MediaRouteButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public MediaRouteButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.app.MediaRouteButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public MediaRouteButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.app.MediaRouteButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public int getRouteTypes() {
        return real.getRouteTypes();
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public void onAttachedToWindow() {
        real.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        real.onDetachedFromWindow();
    }

    public boolean performClick() {
        return real.performClick();
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        real.setContentDescription(arg0);
    }

    public void setExtendedSettingsClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        real.setExtendedSettingsClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setRouteTypes(int arg0) {
        real.setRouteTypes(arg0);
    }

    public void setVisibility(int arg0) {
        real.setVisibility(arg0);
    }

    public void showDialog() {
        real.showDialog();
    }

}
