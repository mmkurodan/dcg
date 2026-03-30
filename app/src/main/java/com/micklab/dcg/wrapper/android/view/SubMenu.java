// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SubMenu {
    private final android.view.SubMenu real;

    public SubMenu(android.view.SubMenu real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SubMenu wrap(android.view.SubMenu real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SubMenu(real);
    }

    public android.view.SubMenu unwrap() {
        return real;
    }

    public void clearHeader() {
        real.clearHeader();
    }

    public com.micklab.dcg.wrapper.android.view.MenuItem getItem() {
        return com.micklab.dcg.wrapper.android.view.MenuItem.wrap(real.getItem());
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu setHeaderIcon(int arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.setHeaderIcon(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu setHeaderIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.setHeaderIcon(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu setHeaderTitle(int arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.setHeaderTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu setHeaderTitle(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.setHeaderTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu setHeaderView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.setHeaderView(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.setIcon(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.SubMenu setIcon(int arg0) {
        return com.micklab.dcg.wrapper.android.view.SubMenu.wrap(real.setIcon(arg0));
    }

}
