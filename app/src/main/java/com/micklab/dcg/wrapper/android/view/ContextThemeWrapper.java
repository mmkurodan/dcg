// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ContextThemeWrapper {
    private final android.view.ContextThemeWrapper real;

    public ContextThemeWrapper(android.view.ContextThemeWrapper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ContextThemeWrapper wrap(android.view.ContextThemeWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ContextThemeWrapper(real);
    }

    public android.view.ContextThemeWrapper unwrap() {
        return real;
    }

    public ContextThemeWrapper() {
        this(new android.view.ContextThemeWrapper());
    }

    public ContextThemeWrapper(com.micklab.dcg.wrapper.android.content.Context arg0, android.content.res.Resources.Theme arg1) {
        this(new android.view.ContextThemeWrapper(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ContextThemeWrapper(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.view.ContextThemeWrapper(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void applyOverrideConfiguration(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.applyOverrideConfiguration(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetManager getAssets() {
        return com.micklab.dcg.wrapper.android.content.res.AssetManager.wrap(real.getAssets());
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(real.getResources());
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return real.getSystemService(arg0);
    }

    public android.content.res.Resources.Theme getTheme() {
        return real.getTheme();
    }

    public void setTheme(int arg0) {
        real.setTheme(arg0);
    }

    public void setTheme(android.content.res.Resources.Theme arg0) {
        real.setTheme(arg0);
    }

}
