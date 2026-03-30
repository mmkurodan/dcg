// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class MenuItem {
    private final android.view.MenuItem real;

    public MenuItem(android.view.MenuItem real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.MenuItem wrap(android.view.MenuItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.MenuItem(real);
    }

    public android.view.MenuItem unwrap() {
        return real;
    }

    public boolean collapseActionView() {
        return real.collapseActionView();
    }

    public boolean expandActionView() {
        return real.expandActionView();
    }

    public com.micklab.dcg.wrapper.android.view.ActionProvider getActionProvider() {
        return com.micklab.dcg.wrapper.android.view.ActionProvider.wrap(real.getActionProvider());
    }

    public com.micklab.dcg.wrapper.android.view.View getActionView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getActionView());
    }

    public int getAlphabeticModifiers() {
        return real.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return real.getAlphabeticShortcut();
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public int getGroupId() {
        return real.getGroupId();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getIcon());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getIconTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getIconTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getIconTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getIconTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getIconTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getIconTintMode());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getIntent());
    }

    public int getItemId() {
        return real.getItemId();
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo.wrap(real.getMenuInfo());
    }

    public int getNumericModifiers() {
        return real.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return real.getNumericShortcut();
    }

    public int getOrder() {
        return real.getOrder();
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu getSubMenu() {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.getSubMenu());
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public java.lang.CharSequence getTitleCondensed() {
        return real.getTitleCondensed();
    }

    public java.lang.CharSequence getTooltipText() {
        return real.getTooltipText();
    }

    public boolean hasSubMenu() {
        return real.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return real.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return real.isCheckable();
    }

    public boolean isChecked() {
        return real.isChecked();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isVisible() {
        return real.isVisible();
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setActionProvider(com.micklab.dcg.wrapper.android.view.ActionProvider arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setActionProvider(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setActionView(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setActionView(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setActionView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setActionView(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setAlphabeticShortcut(char arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setAlphabeticShortcut(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setAlphabeticShortcut(char arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setAlphabeticShortcut(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setCheckable(boolean arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setCheckable(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setChecked(boolean arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setChecked(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setContentDescription(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setContentDescription(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setEnabled(boolean arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setEnabled(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIcon(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setIcon(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setIcon(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIconTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setIconTintBlendMode(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIconTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setIconTintList(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIconTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setIconTintMode(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setIntent(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setNumericShortcut(char arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setNumericShortcut(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setNumericShortcut(char arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setNumericShortcut(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setOnActionExpandListener(com.micklab.dcg.wrapper.android.view.MenuItem.OnActionExpandListener arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setOnActionExpandListener(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setOnMenuItemClickListener(com.micklab.dcg.wrapper.android.view.MenuItem.OnMenuItemClickListener arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setOnMenuItemClickListener(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setShortcut(char arg0, char arg1) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setShortcut(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setShortcut(char arg0, char arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setShortcut(arg0, arg1, arg2, arg3));
    }

    public void setShowAsAction(int arg0) {
        real.setShowAsAction(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setShowAsActionFlags(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setShowAsActionFlags(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setTitle(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setTitle(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setTitleCondensed(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setTitleCondensed(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setTooltipText(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setTooltipText(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem setVisible(boolean arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.setVisible(arg0));
    }

    public static final int SHOW_AS_ACTION_ALWAYS = android.view.MenuItem.SHOW_AS_ACTION_ALWAYS;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = android.view.MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW;
    public static final int SHOW_AS_ACTION_IF_ROOM = android.view.MenuItem.SHOW_AS_ACTION_IF_ROOM;
    public static final int SHOW_AS_ACTION_NEVER = android.view.MenuItem.SHOW_AS_ACTION_NEVER;
    public static final int SHOW_AS_ACTION_WITH_TEXT = android.view.MenuItem.SHOW_AS_ACTION_WITH_TEXT;

    public static final class OnActionExpandListener {
        private final android.view.MenuItem.OnActionExpandListener real;

        public OnActionExpandListener(android.view.MenuItem.OnActionExpandListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.MenuItem.OnActionExpandListener wrap(android.view.MenuItem.OnActionExpandListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.MenuItem.OnActionExpandListener(real);
        }

        public android.view.MenuItem.OnActionExpandListener unwrap() {
            return real;
        }

        public boolean onMenuItemActionCollapse(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return real.onMenuItemActionCollapse(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onMenuItemActionExpand(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return real.onMenuItemActionExpand(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnMenuItemClickListener {
        private final android.view.MenuItem.OnMenuItemClickListener real;

        public OnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.MenuItem.OnMenuItemClickListener wrap(android.view.MenuItem.OnMenuItemClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.MenuItem.OnMenuItemClickListener(real);
        }

        public android.view.MenuItem.OnMenuItemClickListener unwrap() {
            return real;
        }

        public boolean onMenuItemClick(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return real.onMenuItemClick(arg0 == null ? null : arg0.unwrap());
        }

    }
}
