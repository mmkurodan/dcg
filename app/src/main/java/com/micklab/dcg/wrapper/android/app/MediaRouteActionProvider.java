// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class MediaRouteActionProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaRouteActionProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.MediaRouteActionProvider wrap(android.app.MediaRouteActionProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.MediaRouteActionProvider(real, (__DcgwBridgeToken) null);
    }

    public android.app.MediaRouteActionProvider getReal() {
        return (android.app.MediaRouteActionProvider) real;
    }

    public android.app.MediaRouteActionProvider unwrap() {
        return getReal();
    }

    public MediaRouteActionProvider(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.MediaRouteActionProvider(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean isVisible() {
        return ((android.app.MediaRouteActionProvider) real).isVisible();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateActionView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.MediaRouteActionProvider) real).onCreateActionView());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateActionView(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.MediaRouteActionProvider) real).onCreateActionView(arg0 == null ? null : arg0.getReal()));
    }

    public boolean onPerformDefaultAction() {
        return ((android.app.MediaRouteActionProvider) real).onPerformDefaultAction();
    }

    public boolean overridesItemVisibility() {
        return ((android.app.MediaRouteActionProvider) real).overridesItemVisibility();
    }

    public void setExtendedSettingsClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        ((android.app.MediaRouteActionProvider) real).setExtendedSettingsClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setRouteTypes(int arg0) {
        ((android.app.MediaRouteActionProvider) real).setRouteTypes(arg0);
    }

}
