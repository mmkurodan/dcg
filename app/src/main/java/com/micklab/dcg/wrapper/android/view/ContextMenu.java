// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ContextMenu {
    private final android.view.ContextMenu real;

    public ContextMenu(android.view.ContextMenu real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ContextMenu wrap(android.view.ContextMenu real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ContextMenu(real);
    }

    public android.view.ContextMenu unwrap() {
        return real;
    }

    public void clearHeader() {
        real.clearHeader();
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(real.setHeaderIcon(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderIcon(int arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(real.setHeaderIcon(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderTitle(int arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(real.setHeaderTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderTitle(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(real.setHeaderTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(real.setHeaderView(arg0 == null ? null : arg0.unwrap()));
    }

    public static final class ContextMenuInfo {
        private final android.view.ContextMenu.ContextMenuInfo real;

        public ContextMenuInfo(android.view.ContextMenu.ContextMenuInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo wrap(android.view.ContextMenu.ContextMenuInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo(real);
        }

        public android.view.ContextMenu.ContextMenuInfo unwrap() {
            return real;
        }

    }
}
