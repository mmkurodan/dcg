// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ActionBar {
    private final android.app.ActionBar real;

    public ActionBar(android.app.ActionBar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ActionBar wrap(android.app.ActionBar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar(real);
    }

    public android.app.ActionBar unwrap() {
        return real;
    }

    public void addOnMenuVisibilityListener(com.micklab.dcg.wrapper.android.app.ActionBar.OnMenuVisibilityListener arg0) {
        real.addOnMenuVisibilityListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0) {
        real.addTab(arg0 == null ? null : arg0.unwrap());
    }

    public void addTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, boolean arg1) {
        real.addTab(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void addTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, int arg1) {
        real.addTab(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void addTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, int arg1, boolean arg2) {
        real.addTab(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.view.View getCustomView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCustomView());
    }

    public int getDisplayOptions() {
        return real.getDisplayOptions();
    }

    public float getElevation() {
        return real.getElevation();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getHideOffset() {
        return real.getHideOffset();
    }

    public int getNavigationItemCount() {
        return real.getNavigationItemCount();
    }

    public int getNavigationMode() {
        return real.getNavigationMode();
    }

    public int getSelectedNavigationIndex() {
        return real.getSelectedNavigationIndex();
    }

    public com.micklab.dcg.wrapper.android.app.ActionBar.Tab getSelectedTab() {
        return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.getSelectedTab());
    }

    public java.lang.CharSequence getSubtitle() {
        return real.getSubtitle();
    }

    public com.micklab.dcg.wrapper.android.app.ActionBar.Tab getTabAt(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.getTabAt(arg0));
    }

    public int getTabCount() {
        return real.getTabCount();
    }

    public com.micklab.dcg.wrapper.android.content.Context getThemedContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getThemedContext());
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public void hide() {
        real.hide();
    }

    public boolean isHideOnContentScrollEnabled() {
        return real.isHideOnContentScrollEnabled();
    }

    public boolean isShowing() {
        return real.isShowing();
    }

    public com.micklab.dcg.wrapper.android.app.ActionBar.Tab newTab() {
        return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.newTab());
    }

    public void removeAllTabs() {
        real.removeAllTabs();
    }

    public void removeOnMenuVisibilityListener(com.micklab.dcg.wrapper.android.app.ActionBar.OnMenuVisibilityListener arg0) {
        real.removeOnMenuVisibilityListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0) {
        real.removeTab(arg0 == null ? null : arg0.unwrap());
    }

    public void removeTabAt(int arg0) {
        real.removeTabAt(arg0);
    }

    public void selectTab(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0) {
        real.selectTab(arg0 == null ? null : arg0.unwrap());
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setCustomView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setCustomView(arg0 == null ? null : arg0.unwrap());
    }

    public void setCustomView(int arg0) {
        real.setCustomView(arg0);
    }

    public void setCustomView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.app.ActionBar.LayoutParams arg1) {
        real.setCustomView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setDisplayHomeAsUpEnabled(boolean arg0) {
        real.setDisplayHomeAsUpEnabled(arg0);
    }

    public void setDisplayOptions(int arg0) {
        real.setDisplayOptions(arg0);
    }

    public void setDisplayOptions(int arg0, int arg1) {
        real.setDisplayOptions(arg0, arg1);
    }

    public void setDisplayShowCustomEnabled(boolean arg0) {
        real.setDisplayShowCustomEnabled(arg0);
    }

    public void setDisplayShowHomeEnabled(boolean arg0) {
        real.setDisplayShowHomeEnabled(arg0);
    }

    public void setDisplayShowTitleEnabled(boolean arg0) {
        real.setDisplayShowTitleEnabled(arg0);
    }

    public void setDisplayUseLogoEnabled(boolean arg0) {
        real.setDisplayUseLogoEnabled(arg0);
    }

    public void setElevation(float arg0) {
        real.setElevation(arg0);
    }

    public void setHideOffset(int arg0) {
        real.setHideOffset(arg0);
    }

    public void setHideOnContentScrollEnabled(boolean arg0) {
        real.setHideOnContentScrollEnabled(arg0);
    }

    public void setHomeActionContentDescription(int arg0) {
        real.setHomeActionContentDescription(arg0);
    }

    public void setHomeActionContentDescription(java.lang.CharSequence arg0) {
        real.setHomeActionContentDescription(arg0);
    }

    public void setHomeAsUpIndicator(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setHomeAsUpIndicator(arg0 == null ? null : arg0.unwrap());
    }

    public void setHomeAsUpIndicator(int arg0) {
        real.setHomeAsUpIndicator(arg0);
    }

    public void setHomeButtonEnabled(boolean arg0) {
        real.setHomeButtonEnabled(arg0);
    }

    public void setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setIcon(int arg0) {
        real.setIcon(arg0);
    }

    public void setListNavigationCallbacks(com.micklab.dcg.wrapper.android.widget.SpinnerAdapter arg0, com.micklab.dcg.wrapper.android.app.ActionBar.OnNavigationListener arg1) {
        real.setListNavigationCallbacks(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setLogo(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setLogo(arg0 == null ? null : arg0.unwrap());
    }

    public void setLogo(int arg0) {
        real.setLogo(arg0);
    }

    public void setNavigationMode(int arg0) {
        real.setNavigationMode(arg0);
    }

    public void setSelectedNavigationItem(int arg0) {
        real.setSelectedNavigationItem(arg0);
    }

    public void setSplitBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setSplitBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setStackedBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setStackedBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setSubtitle(java.lang.CharSequence arg0) {
        real.setSubtitle(arg0);
    }

    public void setSubtitle(int arg0) {
        real.setSubtitle(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        real.setTitle(arg0);
    }

    public void setTitle(int arg0) {
        real.setTitle(arg0);
    }

    public void show() {
        real.show();
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
        private final android.app.ActionBar.LayoutParams real;

        public LayoutParams(android.app.ActionBar.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.LayoutParams wrap(android.app.ActionBar.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.LayoutParams(real);
        }

        public android.app.ActionBar.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.app.ActionBar.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.app.ActionBar.LayoutParams arg0) {
            this(new android.app.ActionBar.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(int arg0) {
            this(new android.app.ActionBar.LayoutParams(arg0));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.app.ActionBar.LayoutParams(arg0, arg1));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.app.ActionBar.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(int arg0, int arg1, int arg2) {
            this(new android.app.ActionBar.LayoutParams(arg0, arg1, arg2));
        }


    }
    public static final class OnMenuVisibilityListener {
        private final android.app.ActionBar.OnMenuVisibilityListener real;

        public OnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.OnMenuVisibilityListener wrap(android.app.ActionBar.OnMenuVisibilityListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.OnMenuVisibilityListener(real);
        }

        public android.app.ActionBar.OnMenuVisibilityListener unwrap() {
            return real;
        }

        public void onMenuVisibilityChanged(boolean arg0) {
            real.onMenuVisibilityChanged(arg0);
        }

    }
    public static final class OnNavigationListener {
        private final android.app.ActionBar.OnNavigationListener real;

        public OnNavigationListener(android.app.ActionBar.OnNavigationListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.OnNavigationListener wrap(android.app.ActionBar.OnNavigationListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.OnNavigationListener(real);
        }

        public android.app.ActionBar.OnNavigationListener unwrap() {
            return real;
        }

        public boolean onNavigationItemSelected(int arg0, long arg1) {
            return real.onNavigationItemSelected(arg0, arg1);
        }

    }
    public static final class Tab {
        private final android.app.ActionBar.Tab real;

        public Tab(android.app.ActionBar.Tab real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.Tab wrap(android.app.ActionBar.Tab real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.Tab(real);
        }

        public android.app.ActionBar.Tab unwrap() {
            return real;
        }

        public java.lang.CharSequence getContentDescription() {
            return real.getContentDescription();
        }

        public com.micklab.dcg.wrapper.android.view.View getCustomView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCustomView());
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIcon() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getIcon());
        }

        public int getPosition() {
            return real.getPosition();
        }

        public java.lang.Object getTag() {
            return real.getTag();
        }

        public java.lang.CharSequence getText() {
            return real.getText();
        }

        public void select() {
            real.select();
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setContentDescription(int arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setContentDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setContentDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setContentDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setCustomView(int arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setCustomView(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setCustomView(com.micklab.dcg.wrapper.android.view.View arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setCustomView(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setIcon(int arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setTabListener(com.micklab.dcg.wrapper.android.app.ActionBar.TabListener arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setTabListener(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setTag(java.lang.Object arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setText(int arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.ActionBar.Tab setText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.ActionBar.Tab.wrap(real.setText(arg0));
        }

        public static final int INVALID_POSITION = android.app.ActionBar.Tab.INVALID_POSITION;

    }
    public static final class TabListener {
        private final android.app.ActionBar.TabListener real;

        public TabListener(android.app.ActionBar.TabListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActionBar.TabListener wrap(android.app.ActionBar.TabListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActionBar.TabListener(real);
        }

        public android.app.ActionBar.TabListener unwrap() {
            return real;
        }

        public void onTabReselected(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, com.micklab.dcg.wrapper.android.app.FragmentTransaction arg1) {
            real.onTabReselected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onTabSelected(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, com.micklab.dcg.wrapper.android.app.FragmentTransaction arg1) {
            real.onTabSelected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onTabUnselected(com.micklab.dcg.wrapper.android.app.ActionBar.Tab arg0, com.micklab.dcg.wrapper.android.app.FragmentTransaction arg1) {
            real.onTabUnselected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
