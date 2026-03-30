// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Menu {
    private final android.view.Menu real;

    public Menu(android.view.Menu real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Menu wrap(android.view.Menu real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Menu(real);
    }

    public android.view.Menu unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem add(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.add(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem add(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.add(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem add(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.add(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem add(int arg0, int arg1, int arg2, java.lang.CharSequence arg3) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.add(arg0, arg1, arg2, arg3));
    }

    public int addIntentOptions(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.content.ComponentName arg3, android.content.Intent[] arg4, com.micklab.dcg.wrapper.android.content.Intent arg5, int arg6, android.view.MenuItem[] arg7) {
        return real.addIntentOptions(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap(), arg6, arg7);
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu addSubMenu(int arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.addSubMenu(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu addSubMenu(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.addSubMenu(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu addSubMenu(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.addSubMenu(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu addSubMenu(int arg0, int arg1, int arg2, java.lang.CharSequence arg3) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.addSubMenu(arg0, arg1, arg2, arg3));
    }

    public void clear() {
        real.clear();
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem findItem(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.findItem(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem getItem(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.getItem(arg0));
    }

    public boolean hasVisibleItems() {
        return real.hasVisibleItems();
    }

    public boolean isShortcutKey(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.isShortcutKey(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean performIdentifierAction(int arg0, int arg1) {
        return real.performIdentifierAction(arg0, arg1);
    }

    public boolean performShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1, int arg2) {
        return real.performShortcut(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void removeGroup(int arg0) {
        real.removeGroup(arg0);
    }

    public void removeItem(int arg0) {
        real.removeItem(arg0);
    }

    public void setGroupCheckable(int arg0, boolean arg1, boolean arg2) {
        real.setGroupCheckable(arg0, arg1, arg2);
    }

    public void setGroupDividerEnabled(boolean arg0) {
        real.setGroupDividerEnabled(arg0);
    }

    public void setGroupEnabled(int arg0, boolean arg1) {
        real.setGroupEnabled(arg0, arg1);
    }

    public void setGroupVisible(int arg0, boolean arg1) {
        real.setGroupVisible(arg0, arg1);
    }

    public void setQwertyMode(boolean arg0) {
        real.setQwertyMode(arg0);
    }

    public int size() {
        return real.size();
    }

    public static final int CATEGORY_ALTERNATIVE = android.view.Menu.CATEGORY_ALTERNATIVE;
    public static final int CATEGORY_CONTAINER = android.view.Menu.CATEGORY_CONTAINER;
    public static final int CATEGORY_SECONDARY = android.view.Menu.CATEGORY_SECONDARY;
    public static final int CATEGORY_SYSTEM = android.view.Menu.CATEGORY_SYSTEM;
    public static final int FIRST = android.view.Menu.FIRST;
    public static final int FLAG_ALWAYS_PERFORM_CLOSE = android.view.Menu.FLAG_ALWAYS_PERFORM_CLOSE;
    public static final int FLAG_APPEND_TO_GROUP = android.view.Menu.FLAG_APPEND_TO_GROUP;
    public static final int FLAG_PERFORM_NO_CLOSE = android.view.Menu.FLAG_PERFORM_NO_CLOSE;
    public static final int NONE = android.view.Menu.NONE;
    public static final int SUPPORTED_MODIFIERS_MASK = android.view.Menu.SUPPORTED_MODIFIERS_MASK;

}
