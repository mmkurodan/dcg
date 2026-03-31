// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ContextThemeWrapper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContextThemeWrapper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ContextThemeWrapper wrap(android.view.ContextThemeWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ContextThemeWrapper(real, (__DcgwBridgeToken) null);
    }

    public android.view.ContextThemeWrapper getReal() {
        return (android.view.ContextThemeWrapper) real;
    }

    public android.view.ContextThemeWrapper unwrap() {
        return getReal();
    }

    public ContextThemeWrapper() {
        this(new android.view.ContextThemeWrapper(), (__DcgwBridgeToken) null);
    }

    public ContextThemeWrapper(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.view.ContextThemeWrapper(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public ContextThemeWrapper(com.micklab.dcg.wrapper.android.content.Context arg0, android.content.res.Resources.Theme arg1) {
        this(new android.view.ContextThemeWrapper(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public void applyOverrideConfiguration(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.view.ContextThemeWrapper) real).applyOverrideConfiguration(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetManager getAssets() {
        return com.micklab.dcg.wrapper.android.content.res.AssetManager.wrap(((android.view.ContextThemeWrapper) real).getAssets());
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(((android.view.ContextThemeWrapper) real).getResources());
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return ((android.view.ContextThemeWrapper) real).getSystemService(arg0);
    }

    public android.content.res.Resources.Theme getTheme() {
        return ((android.view.ContextThemeWrapper) real).getTheme();
    }

    public void setTheme(int arg0) {
        ((android.view.ContextThemeWrapper) real).setTheme(arg0);
    }

    public void setTheme(android.content.res.Resources.Theme arg0) {
        ((android.view.ContextThemeWrapper) real).setTheme(arg0);
    }

}
