// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ActionProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActionProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ActionProvider wrap(android.view.ActionProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionProvider(real, (__DcgwBridgeToken) null);
    }

    public android.view.ActionProvider getReal() {
        return (android.view.ActionProvider) real;
    }

    public android.view.ActionProvider unwrap() {
        return getReal();
    }

    public boolean hasSubMenu() {
        return ((android.view.ActionProvider) real).hasSubMenu();
    }

    public boolean isVisible() {
        return ((android.view.ActionProvider) real).isVisible();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateActionView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ActionProvider) real).onCreateActionView());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateActionView(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ActionProvider) real).onCreateActionView(arg0 == null ? null : arg0.getReal()));
    }

    public boolean onPerformDefaultAction() {
        return ((android.view.ActionProvider) real).onPerformDefaultAction();
    }

    public void onPrepareSubMenu(com.micklab.dcg.wrapper.android.view.SubMenu arg0) {
        ((android.view.ActionProvider) real).onPrepareSubMenu(arg0 == null ? null : arg0.getReal());
    }

    public boolean overridesItemVisibility() {
        return ((android.view.ActionProvider) real).overridesItemVisibility();
    }

    public void refreshVisibility() {
        ((android.view.ActionProvider) real).refreshVisibility();
    }

    public void setVisibilityListener(com.micklab.dcg.wrapper.android.view.ActionProvider.VisibilityListener arg0) {
        ((android.view.ActionProvider) real).setVisibilityListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class VisibilityListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VisibilityListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ActionProvider.VisibilityListener wrap(android.view.ActionProvider.VisibilityListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionProvider.VisibilityListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ActionProvider.VisibilityListener getReal() {
            return (android.view.ActionProvider.VisibilityListener) real;
        }

        public android.view.ActionProvider.VisibilityListener unwrap() {
            return getReal();
        }

        public void onActionProviderVisibilityChanged(boolean arg0) {
            ((android.view.ActionProvider.VisibilityListener) real).onActionProviderVisibilityChanged(arg0);
        }

    }
}
