// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TabHost {
    private final android.widget.TabHost real;

    public TabHost(android.widget.TabHost real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TabHost wrap(android.widget.TabHost real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TabHost(real);
    }

    public android.widget.TabHost unwrap() {
        return real;
    }

    public TabHost(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TabHost(arg0 == null ? null : arg0.unwrap()));
    }

    public TabHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TabHost(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TabHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TabHost(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public TabHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TabHost(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void addTab(android.widget.TabHost.TabSpec arg0) {
        real.addTab(arg0);
    }

    public void clearAllTabs() {
        real.clearAllTabs();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchWindowFocusChanged(boolean arg0) {
        real.dispatchWindowFocusChanged(arg0);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getCurrentTab() {
        return real.getCurrentTab();
    }

    public java.lang.String getCurrentTabTag() {
        return real.getCurrentTabTag();
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentTabView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCurrentTabView());
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCurrentView());
    }

    public com.micklab.dcg.wrapper.android.widget.FrameLayout getTabContentView() {
        return com.micklab.dcg.wrapper.android.widget.FrameLayout.wrap(real.getTabContentView());
    }

    public com.micklab.dcg.wrapper.android.widget.TabWidget getTabWidget() {
        return com.micklab.dcg.wrapper.android.widget.TabWidget.wrap(real.getTabWidget());
    }

    public android.widget.TabHost.TabSpec newTabSpec(java.lang.String arg0) {
        return real.newTabSpec(arg0);
    }

    public void onTouchModeChanged(boolean arg0) {
        real.onTouchModeChanged(arg0);
    }

    public void setCurrentTab(int arg0) {
        real.setCurrentTab(arg0);
    }

    public void setCurrentTabByTag(java.lang.String arg0) {
        real.setCurrentTabByTag(arg0);
    }

    public void setOnTabChangedListener(com.micklab.dcg.wrapper.android.widget.TabHost.OnTabChangeListener arg0) {
        real.setOnTabChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setup() {
        real.setup();
    }

    public void setup(com.micklab.dcg.wrapper.android.app.LocalActivityManager arg0) {
        real.setup(arg0 == null ? null : arg0.unwrap());
    }

    public static final class OnTabChangeListener {
        private final android.widget.TabHost.OnTabChangeListener real;

        public OnTabChangeListener(android.widget.TabHost.OnTabChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TabHost.OnTabChangeListener wrap(android.widget.TabHost.OnTabChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TabHost.OnTabChangeListener(real);
        }

        public android.widget.TabHost.OnTabChangeListener unwrap() {
            return real;
        }

        public void onTabChanged(java.lang.String arg0) {
            real.onTabChanged(arg0);
        }

    }
    public static final class TabContentFactory {
        private final android.widget.TabHost.TabContentFactory real;

        public TabContentFactory(android.widget.TabHost.TabContentFactory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TabHost.TabContentFactory wrap(android.widget.TabHost.TabContentFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TabHost.TabContentFactory(real);
        }

        public android.widget.TabHost.TabContentFactory unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.view.View createTabContent(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.View.wrap(real.createTabContent(arg0));
        }

    }
}
