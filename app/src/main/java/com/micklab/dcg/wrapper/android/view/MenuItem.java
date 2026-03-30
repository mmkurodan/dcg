// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class MenuItem {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MenuItem(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.MenuItem wrap(android.view.MenuItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.MenuItem(real, (__DcgwBridgeToken) null);
    }

    public android.view.MenuItem getReal() {
        return (android.view.MenuItem) real;
    }

    public android.view.MenuItem unwrap() {
        return getReal();
    }

    public boolean collapseActionView() {
        return ((android.view.MenuItem) real).collapseActionView();
    }

    public boolean expandActionView() {
        return ((android.view.MenuItem) real).expandActionView();
    }

    public com.micklab.dcg.wrapper.android.view.ActionProvider getActionProvider() {
        return com.micklab.dcg.wrapper.android.view.ActionProvider.wrap(((android.view.MenuItem) real).getActionProvider());
    }

    public com.micklab.dcg.wrapper.android.view.View getActionView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.MenuItem) real).getActionView());
    }

    public int getAlphabeticModifiers() {
        return ((android.view.MenuItem) real).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((android.view.MenuItem) real).getAlphabeticShortcut();
    }

    public java.lang.CharSequence getContentDescription() {
        return ((android.view.MenuItem) real).getContentDescription();
    }

    public int getGroupId() {
        return ((android.view.MenuItem) real).getGroupId();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.MenuItem) real).getIcon());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getIconTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.view.MenuItem) real).getIconTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getIconTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.view.MenuItem) real).getIconTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getIconTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(((android.view.MenuItem) real).getIconTintMode());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.view.MenuItem) real).getIntent());
    }

    public int getItemId() {
        return ((android.view.MenuItem) real).getItemId();
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo.wrap(((android.view.MenuItem) real).getMenuInfo());
    }

    public int getNumericModifiers() {
        return ((android.view.MenuItem) real).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((android.view.MenuItem) real).getNumericShortcut();
    }

    public int getOrder() {
        return ((android.view.MenuItem) real).getOrder();
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu getSubMenu() {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(((android.view.MenuItem) real).getSubMenu());
    }

    public java.lang.CharSequence getTitle() {
        return ((android.view.MenuItem) real).getTitle();
    }

    public java.lang.CharSequence getTitleCondensed() {
        return ((android.view.MenuItem) real).getTitleCondensed();
    }

    public java.lang.CharSequence getTooltipText() {
        return ((android.view.MenuItem) real).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((android.view.MenuItem) real).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((android.view.MenuItem) real).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((android.view.MenuItem) real).isCheckable();
    }

    public boolean isChecked() {
        return ((android.view.MenuItem) real).isChecked();
    }

    public boolean isEnabled() {
        return ((android.view.MenuItem) real).isEnabled();
    }

    public boolean isVisible() {
        return ((android.view.MenuItem) real).isVisible();
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setActionProvider(com.micklab.dcg.wrapper.android.view.ActionProvider arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setActionProvider(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setActionView(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setActionView(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setActionView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setActionView(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setAlphabeticShortcut(char arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setAlphabeticShortcut(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setAlphabeticShortcut(char arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setAlphabeticShortcut(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setCheckable(boolean arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setCheckable(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setChecked(boolean arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setChecked(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setContentDescription(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setContentDescription(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setEnabled(boolean arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setEnabled(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIcon(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setIcon(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setIcon(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIconTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setIconTintBlendMode(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIconTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setIconTintList(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIconTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setIconTintMode(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setIntent(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setNumericShortcut(char arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setNumericShortcut(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setNumericShortcut(char arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setNumericShortcut(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setOnActionExpandListener(com.micklab.dcg.wrapper.android.view.MenuItem.OnActionExpandListener arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setOnActionExpandListener(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setOnMenuItemClickListener(com.micklab.dcg.wrapper.android.view.MenuItem.OnMenuItemClickListener arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setOnMenuItemClickListener(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setShortcut(char arg0, char arg1) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setShortcut(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setShortcut(char arg0, char arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setShortcut(arg0, arg1, arg2, arg3));
    }

    public void setShowAsAction(int arg0) {
        ((android.view.MenuItem) real).setShowAsAction(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setShowAsActionFlags(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setShowAsActionFlags(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setTitle(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setTitle(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setTitleCondensed(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setTitleCondensed(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setTooltipText(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setTooltipText(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setVisible(boolean arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.MenuItem) real).setVisible(arg0));
    }

    public static final int SHOW_AS_ACTION_ALWAYS = android.view.MenuItem.SHOW_AS_ACTION_ALWAYS;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = android.view.MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW;
    public static final int SHOW_AS_ACTION_IF_ROOM = android.view.MenuItem.SHOW_AS_ACTION_IF_ROOM;
    public static final int SHOW_AS_ACTION_NEVER = android.view.MenuItem.SHOW_AS_ACTION_NEVER;
    public static final int SHOW_AS_ACTION_WITH_TEXT = android.view.MenuItem.SHOW_AS_ACTION_WITH_TEXT;

    public static final class OnActionExpandListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnActionExpandListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.MenuItem.OnActionExpandListener wrap(android.view.MenuItem.OnActionExpandListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.MenuItem.OnActionExpandListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.MenuItem.OnActionExpandListener getReal() {
            return (android.view.MenuItem.OnActionExpandListener) real;
        }

        public android.view.MenuItem.OnActionExpandListener unwrap() {
            return getReal();
        }

        public boolean onMenuItemActionCollapse(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return ((android.view.MenuItem.OnActionExpandListener) real).onMenuItemActionCollapse(arg0 == null ? null : arg0.getReal());
        }

        public boolean onMenuItemActionExpand(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return ((android.view.MenuItem.OnActionExpandListener) real).onMenuItemActionExpand(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnMenuItemClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnMenuItemClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.MenuItem.OnMenuItemClickListener wrap(android.view.MenuItem.OnMenuItemClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.MenuItem.OnMenuItemClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.MenuItem.OnMenuItemClickListener getReal() {
            return (android.view.MenuItem.OnMenuItemClickListener) real;
        }

        public android.view.MenuItem.OnMenuItemClickListener unwrap() {
            return getReal();
        }

        public boolean onMenuItemClick(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return ((android.view.MenuItem.OnMenuItemClickListener) real).onMenuItemClick(arg0 == null ? null : arg0.getReal());
        }

    }
}
