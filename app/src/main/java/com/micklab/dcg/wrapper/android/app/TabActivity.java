// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class TabActivity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TabActivity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.TabActivity wrap(android.app.TabActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.TabActivity(real, (__DcgwBridgeToken) null);
    }

    public android.app.TabActivity getReal() {
        return (android.app.TabActivity) real;
    }

    public android.app.TabActivity unwrap() {
        return getReal();
    }

    public TabActivity() {
        this(new android.app.TabActivity(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.TabHost getTabHost() {
        return com.micklab.dcg.wrapper.android.widget.TabHost.wrap(((android.app.TabActivity) real).getTabHost());
    }

    public com.micklab.dcg.wrapper.android.widget.TabWidget getTabWidget() {
        return com.micklab.dcg.wrapper.android.widget.TabWidget.wrap(((android.app.TabActivity) real).getTabWidget());
    }

    public void onContentChanged() {
        ((android.app.TabActivity) real).onContentChanged();
    }

    public void setDefaultTab(int arg0) {
        ((android.app.TabActivity) real).setDefaultTab(arg0);
    }

    public void setDefaultTab(java.lang.String arg0) {
        ((android.app.TabActivity) real).setDefaultTab(arg0);
    }

}
