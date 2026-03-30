// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class MediaRouteActionProvider {
    private final android.app.MediaRouteActionProvider real;

    public MediaRouteActionProvider(android.app.MediaRouteActionProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.MediaRouteActionProvider wrap(android.app.MediaRouteActionProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.MediaRouteActionProvider(real);
    }

    public android.app.MediaRouteActionProvider unwrap() {
        return real;
    }

    public MediaRouteActionProvider(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.MediaRouteActionProvider(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean isVisible() {
        return real.isVisible();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateActionView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateActionView());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateActionView(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateActionView(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean onPerformDefaultAction() {
        return real.onPerformDefaultAction();
    }

    public boolean overridesItemVisibility() {
        return real.overridesItemVisibility();
    }

    public void setExtendedSettingsClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        real.setExtendedSettingsClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setRouteTypes(int arg0) {
        real.setRouteTypes(arg0);
    }

}
