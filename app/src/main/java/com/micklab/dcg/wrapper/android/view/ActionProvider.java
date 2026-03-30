// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ActionProvider {
    private final android.view.ActionProvider real;

    public ActionProvider(android.view.ActionProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ActionProvider wrap(android.view.ActionProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionProvider(real);
    }

    public android.view.ActionProvider unwrap() {
        return real;
    }

    public boolean hasSubMenu() {
        return real.hasSubMenu();
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

    public void onPrepareSubMenu(com.micklab.dcg.wrapper.android.view.SubMenu arg0) {
        real.onPrepareSubMenu(arg0 == null ? null : arg0.unwrap());
    }

    public boolean overridesItemVisibility() {
        return real.overridesItemVisibility();
    }

    public void refreshVisibility() {
        real.refreshVisibility();
    }

    public void setVisibilityListener(com.micklab.dcg.wrapper.android.view.ActionProvider.VisibilityListener arg0) {
        real.setVisibilityListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class VisibilityListener {
        private final android.view.ActionProvider.VisibilityListener real;

        public VisibilityListener(android.view.ActionProvider.VisibilityListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ActionProvider.VisibilityListener wrap(android.view.ActionProvider.VisibilityListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionProvider.VisibilityListener(real);
        }

        public android.view.ActionProvider.VisibilityListener unwrap() {
            return real;
        }

        public void onActionProviderVisibilityChanged(boolean arg0) {
            real.onActionProviderVisibilityChanged(arg0);
        }

    }
}
