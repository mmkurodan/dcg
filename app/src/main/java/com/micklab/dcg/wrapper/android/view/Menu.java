// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Menu {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Menu(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Menu wrap(android.view.Menu real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Menu(real, (__DcgwBridgeToken) null);
    }

    public android.view.Menu getReal() {
        return (android.view.Menu) real;
    }

    public android.view.Menu unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem add(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.Menu) real).add(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem add(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.Menu) real).add(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem add(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.Menu) real).add(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem add(int arg0, int arg1, int arg2, java.lang.CharSequence arg3) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.Menu) real).add(arg0, arg1, arg2, arg3));
    }

    public int addIntentOptions(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.content.ComponentName arg3, android.content.Intent[] arg4, com.micklab.dcg.wrapper.android.content.Intent arg5, int arg6, android.view.MenuItem[] arg7) {
        return ((android.view.Menu) real).addIntentOptions(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal(), arg6, arg7);
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu addSubMenu(int arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(((android.view.Menu) real).addSubMenu(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu addSubMenu(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(((android.view.Menu) real).addSubMenu(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu addSubMenu(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(((android.view.Menu) real).addSubMenu(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu addSubMenu(int arg0, int arg1, int arg2, java.lang.CharSequence arg3) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(((android.view.Menu) real).addSubMenu(arg0, arg1, arg2, arg3));
    }

    public void clear() {
        ((android.view.Menu) real).clear();
    }

    public void close() {
        ((android.view.Menu) real).close();
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem findItem(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.Menu) real).findItem(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem getItem(int arg0) {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(((android.view.Menu) real).getItem(arg0));
    }

    public boolean hasVisibleItems() {
        return ((android.view.Menu) real).hasVisibleItems();
    }

    public boolean isShortcutKey(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.view.Menu) real).isShortcutKey(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean performIdentifierAction(int arg0, int arg1) {
        return ((android.view.Menu) real).performIdentifierAction(arg0, arg1);
    }

    public boolean performShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1, int arg2) {
        return ((android.view.Menu) real).performShortcut(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void removeGroup(int arg0) {
        ((android.view.Menu) real).removeGroup(arg0);
    }

    public void removeItem(int arg0) {
        ((android.view.Menu) real).removeItem(arg0);
    }

    public void setGroupCheckable(int arg0, boolean arg1, boolean arg2) {
        ((android.view.Menu) real).setGroupCheckable(arg0, arg1, arg2);
    }

    public void setGroupDividerEnabled(boolean arg0) {
        ((android.view.Menu) real).setGroupDividerEnabled(arg0);
    }

    public void setGroupEnabled(int arg0, boolean arg1) {
        ((android.view.Menu) real).setGroupEnabled(arg0, arg1);
    }

    public void setGroupVisible(int arg0, boolean arg1) {
        ((android.view.Menu) real).setGroupVisible(arg0, arg1);
    }

    public void setQwertyMode(boolean arg0) {
        ((android.view.Menu) real).setQwertyMode(arg0);
    }

    public int size() {
        return ((android.view.Menu) real).size();
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
