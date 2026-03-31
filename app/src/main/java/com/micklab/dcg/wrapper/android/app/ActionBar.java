// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ActionBar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActionBar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ActionBar wrap(android.app.ActionBar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar(real, (__DcgwBridgeToken) null);
    }

    public android.app.ActionBar getReal() {
        return (android.app.ActionBar) real;
    }

    public android.app.ActionBar unwrap() {
        return getReal();
    }

    public void addOnMenuVisibilityListener(com.micklab.dcg.wrapper.android.app.ActionBar.OnMenuVisibilityListener arg0) {
        ((android.app.ActionBar) real).addOnMenuVisibilityListener(arg0 == null ? null : arg0.getReal());
    }

    public void addTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0) {
        ((android.app.ActionBar) real).addTab(arg0 == null ? null : arg0.getReal());
    }

    public void addTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, boolean arg1) {
        ((android.app.ActionBar) real).addTab(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void addTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, int arg1) {
        ((android.app.ActionBar) real).addTab(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void addTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, int arg1, boolean arg2) {
        ((android.app.ActionBar) real).addTab(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.view.View getCustomView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.ActionBar) real).getCustomView());
    }

    public int getDisplayOptions() {
        return ((android.app.ActionBar) real).getDisplayOptions();
    }

    public float getElevation() {
        return ((android.app.ActionBar) real).getElevation();
    }

    public int getHeight() {
        return ((android.app.ActionBar) real).getHeight();
    }

    public int getHideOffset() {
        return ((android.app.ActionBar) real).getHideOffset();
    }

    public int getNavigationItemCount() {
        return ((android.app.ActionBar) real).getNavigationItemCount();
    }

    public int getNavigationMode() {
        return ((android.app.ActionBar) real).getNavigationMode();
    }

    public int getSelectedNavigationIndex() {
        return ((android.app.ActionBar) real).getSelectedNavigationIndex();
    }

    public com.micklab.dcg.wrapper.android.app.ActionBar.Tab getSelectedTab() {
        return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar) real).getSelectedTab());
    }

    public java.lang.CharSequence getSubtitle() {
        return ((android.app.ActionBar) real).getSubtitle();
    }

    public com.micklab.dcg.wrapper.android.app.ActionBar.Tab getTabAt(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar) real).getTabAt(arg0));
    }

    public int getTabCount() {
        return ((android.app.ActionBar) real).getTabCount();
    }

    public com.micklab.dcg.wrapper.android.content.Context getThemedContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.app.ActionBar) real).getThemedContext());
    }

    public java.lang.CharSequence getTitle() {
        return ((android.app.ActionBar) real).getTitle();
    }

    public void hide() {
        ((android.app.ActionBar) real).hide();
    }

    public boolean isHideOnContentScrollEnabled() {
        return ((android.app.ActionBar) real).isHideOnContentScrollEnabled();
    }

    public boolean isShowing() {
        return ((android.app.ActionBar) real).isShowing();
    }

    public com.micklab.dcg.wrapper.android.app.ActionBar.Tab newTab() {
        return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar) real).newTab());
    }

    public void removeAllTabs() {
        ((android.app.ActionBar) real).removeAllTabs();
    }

    public void removeOnMenuVisibilityListener(com.micklab.dcg.wrapper.android.app.ActionBar.OnMenuVisibilityListener arg0) {
        ((android.app.ActionBar) real).removeOnMenuVisibilityListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0) {
        ((android.app.ActionBar) real).removeTab(arg0 == null ? null : arg0.getReal());
    }

    public void removeTabAt(int arg0) {
        ((android.app.ActionBar) real).removeTabAt(arg0);
    }

    public void selectTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0) {
        ((android.app.ActionBar) real).selectTab(arg0 == null ? null : arg0.getReal());
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.app.ActionBar) real).setBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setCustomView(int arg0) {
        ((android.app.ActionBar) real).setCustomView(arg0);
    }

    public void setCustomView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.ActionBar) real).setCustomView(arg0 == null ? null : arg0.getReal());
    }

    public void setCustomView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.app.ActionBar.LayoutParams arg1) {
        ((android.app.ActionBar) real).setCustomView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setDisplayHomeAsUpEnabled(boolean arg0) {
        ((android.app.ActionBar) real).setDisplayHomeAsUpEnabled(arg0);
    }

    public void setDisplayOptions(int arg0) {
        ((android.app.ActionBar) real).setDisplayOptions(arg0);
    }

    public void setDisplayOptions(int arg0, int arg1) {
        ((android.app.ActionBar) real).setDisplayOptions(arg0, arg1);
    }

    public void setDisplayShowCustomEnabled(boolean arg0) {
        ((android.app.ActionBar) real).setDisplayShowCustomEnabled(arg0);
    }

    public void setDisplayShowHomeEnabled(boolean arg0) {
        ((android.app.ActionBar) real).setDisplayShowHomeEnabled(arg0);
    }

    public void setDisplayShowTitleEnabled(boolean arg0) {
        ((android.app.ActionBar) real).setDisplayShowTitleEnabled(arg0);
    }

    public void setDisplayUseLogoEnabled(boolean arg0) {
        ((android.app.ActionBar) real).setDisplayUseLogoEnabled(arg0);
    }

    public void setElevation(float arg0) {
        ((android.app.ActionBar) real).setElevation(arg0);
    }

    public void setHideOffset(int arg0) {
        ((android.app.ActionBar) real).setHideOffset(arg0);
    }

    public void setHideOnContentScrollEnabled(boolean arg0) {
        ((android.app.ActionBar) real).setHideOnContentScrollEnabled(arg0);
    }

    public void setHomeActionContentDescription(int arg0) {
        ((android.app.ActionBar) real).setHomeActionContentDescription(arg0);
    }

    public void setHomeActionContentDescription(java.lang.CharSequence arg0) {
        ((android.app.ActionBar) real).setHomeActionContentDescription(arg0);
    }

    public void setHomeAsUpIndicator(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.app.ActionBar) real).setHomeAsUpIndicator(arg0 == null ? null : arg0.getReal());
    }

    public void setHomeAsUpIndicator(int arg0) {
        ((android.app.ActionBar) real).setHomeAsUpIndicator(arg0);
    }

    public void setHomeButtonEnabled(boolean arg0) {
        ((android.app.ActionBar) real).setHomeButtonEnabled(arg0);
    }

    public void setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.app.ActionBar) real).setIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setIcon(int arg0) {
        ((android.app.ActionBar) real).setIcon(arg0);
    }

    public void setListNavigationCallbacks(com.micklab.dcg.wrapper.android.widget.SpinnerAdapter arg0, com.micklab.dcg.wrapper.android.app.ActionBar.OnNavigationListener arg1) {
        ((android.app.ActionBar) real).setListNavigationCallbacks(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setLogo(int arg0) {
        ((android.app.ActionBar) real).setLogo(arg0);
    }

    public void setLogo(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.app.ActionBar) real).setLogo(arg0 == null ? null : arg0.getReal());
    }

    public void setNavigationMode(int arg0) {
        ((android.app.ActionBar) real).setNavigationMode(arg0);
    }

    public void setSelectedNavigationItem(int arg0) {
        ((android.app.ActionBar) real).setSelectedNavigationItem(arg0);
    }

    public void setSplitBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.app.ActionBar) real).setSplitBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setStackedBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.app.ActionBar) real).setStackedBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setSubtitle(int arg0) {
        ((android.app.ActionBar) real).setSubtitle(arg0);
    }

    public void setSubtitle(java.lang.CharSequence arg0) {
        ((android.app.ActionBar) real).setSubtitle(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        ((android.app.ActionBar) real).setTitle(arg0);
    }

    public void setTitle(int arg0) {
        ((android.app.ActionBar) real).setTitle(arg0);
    }

    public void show() {
        ((android.app.ActionBar) real).show();
    }

    public static final int DISPLAY_HOME_AS_UP = android.app.ActionBar.DISPLAY_HOME_AS_UP;
    public static final int DISPLAY_SHOW_CUSTOM = android.app.ActionBar.DISPLAY_SHOW_CUSTOM;
    public static final int DISPLAY_SHOW_HOME = android.app.ActionBar.DISPLAY_SHOW_HOME;
    public static final int DISPLAY_SHOW_TITLE = android.app.ActionBar.DISPLAY_SHOW_TITLE;
    public static final int DISPLAY_USE_LOGO = android.app.ActionBar.DISPLAY_USE_LOGO;
    public static final int NAVIGATION_MODE_LIST = android.app.ActionBar.NAVIGATION_MODE_LIST;
    public static final int NAVIGATION_MODE_STANDARD = android.app.ActionBar.NAVIGATION_MODE_STANDARD;
    public static final int NAVIGATION_MODE_TABS = android.app.ActionBar.NAVIGATION_MODE_TABS;

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.LayoutParams wrap(android.app.ActionBar.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActionBar.LayoutParams getReal() {
            return (android.app.ActionBar.LayoutParams) real;
        }

        public android.app.ActionBar.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams(int arg0) {
            this(new android.app.ActionBar.LayoutParams(arg0), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.app.ActionBar.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.app.ActionBar.LayoutParams arg0) {
            this(new android.app.ActionBar.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.app.ActionBar.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.app.ActionBar.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1, int arg2) {
            this(new android.app.ActionBar.LayoutParams(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }


    }
    public static final class OnMenuVisibilityListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnMenuVisibilityListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.OnMenuVisibilityListener wrap(android.app.ActionBar.OnMenuVisibilityListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.OnMenuVisibilityListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActionBar.OnMenuVisibilityListener getReal() {
            return (android.app.ActionBar.OnMenuVisibilityListener) real;
        }

        public android.app.ActionBar.OnMenuVisibilityListener unwrap() {
            return getReal();
        }

        public void onMenuVisibilityChanged(boolean arg0) {
            ((android.app.ActionBar.OnMenuVisibilityListener) real).onMenuVisibilityChanged(arg0);
        }

    }
    public static final class OnNavigationListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnNavigationListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.OnNavigationListener wrap(android.app.ActionBar.OnNavigationListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.OnNavigationListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActionBar.OnNavigationListener getReal() {
            return (android.app.ActionBar.OnNavigationListener) real;
        }

        public android.app.ActionBar.OnNavigationListener unwrap() {
            return getReal();
        }

        public boolean onNavigationItemSelected(int arg0, long arg1) {
            return ((android.app.ActionBar.OnNavigationListener) real).onNavigationItemSelected(arg0, arg1);
        }

    }
    public static final class Tab {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Tab(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.Tab wrap(android.app.ActionBar.Tab real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.Tab(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActionBar.Tab getReal() {
            return (android.app.ActionBar.Tab) real;
        }

        public android.app.ActionBar.Tab unwrap() {
            return getReal();
        }

        public java.lang.CharSequence getContentDescription() {
            return ((android.app.ActionBar.Tab) real).getContentDescription();
        }

        public com.micklab.dcg.wrapper.android.view.View getCustomView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.ActionBar.Tab) real).getCustomView());
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIcon() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.ActionBar.Tab) real).getIcon());
        }

        public int getPosition() {
            return ((android.app.ActionBar.Tab) real).getPosition();
        }

        public java.lang.Object getTag() {
            return ((android.app.ActionBar.Tab) real).getTag();
        }

        public java.lang.CharSequence getText() {
            return ((android.app.ActionBar.Tab) real).getText();
        }

        public void select() {
            ((android.app.ActionBar.Tab) real).select();
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setContentDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setContentDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setContentDescription(int arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setContentDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setCustomView(com.micklab.dcg.wrapper.android.view.View arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setCustomView(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setCustomView(int arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setCustomView(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setIcon(int arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setTabListener(com.micklab.dcg.wrapper.android.app.ActionBar.TabListener arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setTabListener(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setTag(java.lang.Object arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setText(int arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(((android.app.ActionBar.Tab) real).setText(arg0));
        }

        public static final int INVALID_POSITION = android.app.ActionBar.Tab.INVALID_POSITION;

    }
    public static final class TabListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TabListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.TabListener wrap(android.app.ActionBar.TabListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.TabListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActionBar.TabListener getReal() {
            return (android.app.ActionBar.TabListener) real;
        }

        public android.app.ActionBar.TabListener unwrap() {
            return getReal();
        }

        public void onTabReselected(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, com.micklab.dcg.wrapper.android.app.FragmentTransaction arg1) {
            ((android.app.ActionBar.TabListener) real).onTabReselected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onTabSelected(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, com.micklab.dcg.wrapper.android.app.FragmentTransaction arg1) {
            ((android.app.ActionBar.TabListener) real).onTabSelected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onTabUnselected(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, com.micklab.dcg.wrapper.android.app.FragmentTransaction arg1) {
            ((android.app.ActionBar.TabListener) real).onTabUnselected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
