// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ContextMenu {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContextMenu(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ContextMenu wrap(android.view.ContextMenu real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ContextMenu(real, (__DcgwBridgeToken) null);
    }

    public android.view.ContextMenu getReal() {
        return (android.view.ContextMenu) real;
    }

    public android.view.ContextMenu unwrap() {
        return getReal();
    }

    public void clearHeader() {
        ((android.view.ContextMenu) real).clearHeader();
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(((android.view.ContextMenu) real).setHeaderIcon(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderIcon(int arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(((android.view.ContextMenu) real).setHeaderIcon(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderTitle(int arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(((android.view.ContextMenu) real).setHeaderTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderTitle(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(((android.view.ContextMenu) real).setHeaderTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ContextMenu setHeaderView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.ContextMenu.wrap(((android.view.ContextMenu) real).setHeaderView(arg0 == null ? null : arg0.getReal()));
    }

    public static final class ContextMenuInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ContextMenuInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo wrap(android.view.ContextMenu.ContextMenuInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo(real, (__DcgwBridgeToken) null);
        }

        public android.view.ContextMenu.ContextMenuInfo getReal() {
            return (android.view.ContextMenu.ContextMenuInfo) real;
        }

        public android.view.ContextMenu.ContextMenuInfo unwrap() {
            return getReal();
        }

    }
}
