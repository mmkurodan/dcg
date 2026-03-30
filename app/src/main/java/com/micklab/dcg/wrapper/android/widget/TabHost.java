// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TabHost {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TabHost(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TabHost wrap(android.widget.TabHost real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TabHost(real, (__DcgwBridgeToken) null);
    }

    public android.widget.TabHost getReal() {
        return (android.widget.TabHost) real;
    }

    public android.widget.TabHost unwrap() {
        return getReal();
    }

    public TabHost(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TabHost(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TabHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TabHost(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TabHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TabHost(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public TabHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TabHost(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void addTab(android.widget.TabHost.TabSpec arg0) {
        ((android.widget.TabHost) real).addTab(arg0);
    }

    public void clearAllTabs() {
        ((android.widget.TabHost) real).clearAllTabs();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.widget.TabHost) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchWindowFocusChanged(boolean arg0) {
        ((android.widget.TabHost) real).dispatchWindowFocusChanged(arg0);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.TabHost) real).getAccessibilityClassName();
    }

    public int getCurrentTab() {
        return ((android.widget.TabHost) real).getCurrentTab();
    }

    public java.lang.String getCurrentTabTag() {
        return ((android.widget.TabHost) real).getCurrentTabTag();
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentTabView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.TabHost) real).getCurrentTabView());
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.TabHost) real).getCurrentView());
    }

    public com.micklab.dcg.wrapper.android.widget.FrameLayout getTabContentView() {
        return com.micklab.dcg.wrapper.android.widget.FrameLayout.wrap(((android.widget.TabHost) real).getTabContentView());
    }

    public com.micklab.dcg.wrapper.android.widget.TabWidget getTabWidget() {
        return com.micklab.dcg.wrapper.android.widget.TabWidget.wrap(((android.widget.TabHost) real).getTabWidget());
    }

    public android.widget.TabHost.TabSpec newTabSpec(java.lang.String arg0) {
        return ((android.widget.TabHost) real).newTabSpec(arg0);
    }

    public void onTouchModeChanged(boolean arg0) {
        ((android.widget.TabHost) real).onTouchModeChanged(arg0);
    }

    public void setCurrentTab(int arg0) {
        ((android.widget.TabHost) real).setCurrentTab(arg0);
    }

    public void setCurrentTabByTag(java.lang.String arg0) {
        ((android.widget.TabHost) real).setCurrentTabByTag(arg0);
    }

    public void setOnTabChangedListener(com.micklab.dcg.wrapper.android.widget.TabHost.OnTabChangeListener arg0) {
        ((android.widget.TabHost) real).setOnTabChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setup() {
        ((android.widget.TabHost) real).setup();
    }

    public void setup(com.micklab.dcg.wrapper.android.app.LocalActivityManager arg0) {
        ((android.widget.TabHost) real).setup(arg0 == null ? null : arg0.getReal());
    }

    public static final class OnTabChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnTabChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TabHost.OnTabChangeListener wrap(android.widget.TabHost.OnTabChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TabHost.OnTabChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.TabHost.OnTabChangeListener getReal() {
            return (android.widget.TabHost.OnTabChangeListener) real;
        }

        public android.widget.TabHost.OnTabChangeListener unwrap() {
            return getReal();
        }

        public void onTabChanged(java.lang.String arg0) {
            ((android.widget.TabHost.OnTabChangeListener) real).onTabChanged(arg0);
        }

    }
    public static final class TabContentFactory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TabContentFactory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TabHost.TabContentFactory wrap(android.widget.TabHost.TabContentFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TabHost.TabContentFactory(real, (__DcgwBridgeToken) null);
        }

        public android.widget.TabHost.TabContentFactory getReal() {
            return (android.widget.TabHost.TabContentFactory) real;
        }

        public android.widget.TabHost.TabContentFactory unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.view.View createTabContent(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.TabHost.TabContentFactory) real).createTabContent(arg0));
        }

    }
}
