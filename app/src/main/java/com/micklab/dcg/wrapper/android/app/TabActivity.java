// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class TabActivity {
    private final android.app.TabActivity real;

    public TabActivity(android.app.TabActivity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.TabActivity wrap(android.app.TabActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.TabActivity(real);
    }

    public android.app.TabActivity unwrap() {
        return real;
    }

    public TabActivity() {
        this(new android.app.TabActivity());
    }

    public com.micklab.dcg.wrapper.android.widget.TabHost getTabHost() {
        return com.micklab.dcg.wrapper.android.widget.TabHost.wrap(real.getTabHost());
    }

    public com.micklab.dcg.wrapper.android.widget.TabWidget getTabWidget() {
        return com.micklab.dcg.wrapper.android.widget.TabWidget.wrap(real.getTabWidget());
    }

    public void onContentChanged() {
        real.onContentChanged();
    }

    public void setDefaultTab(int arg0) {
        real.setDefaultTab(arg0);
    }

    public void setDefaultTab(java.lang.String arg0) {
        real.setDefaultTab(arg0);
    }

}
