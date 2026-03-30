// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class PopupMenu {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PopupMenu(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.PopupMenu wrap(android.widget.PopupMenu real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupMenu(real, (__DcgwBridgeToken) null);
    }

    public android.widget.PopupMenu getReal() {
        return (android.widget.PopupMenu) real;
    }

    public android.widget.PopupMenu unwrap() {
        return getReal();
    }

    public PopupMenu(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        this(new android.widget.PopupMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public PopupMenu(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        this(new android.widget.PopupMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public PopupMenu(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, int arg3, int arg4) {
        this(new android.widget.PopupMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public void dismiss() {
        ((android.widget.PopupMenu) real).dismiss();
    }

    public com.micklab.dcg.wrapper.android.view.View.OnTouchListener getDragToOpenListener() {
        return com.micklab.dcg.wrapper.android.view.View.OnTouchListener.wrap(((android.widget.PopupMenu) real).getDragToOpenListener());
    }

    public int getGravity() {
        return ((android.widget.PopupMenu) real).getGravity();
    }

    public com.micklab.dcg.wrapper.android.view.Menu getMenu() {
        return com.micklab.dcg.wrapper.android.view.Menu.wrap(((android.widget.PopupMenu) real).getMenu());
    }

    public com.micklab.dcg.wrapper.android.view.MenuInflater getMenuInflater() {
        return com.micklab.dcg.wrapper.android.view.MenuInflater.wrap(((android.widget.PopupMenu) real).getMenuInflater());
    }

    public void inflate(int arg0) {
        ((android.widget.PopupMenu) real).inflate(arg0);
    }

    public void setForceShowIcon(boolean arg0) {
        ((android.widget.PopupMenu) real).setForceShowIcon(arg0);
    }

    public void setGravity(int arg0) {
        ((android.widget.PopupMenu) real).setGravity(arg0);
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.widget.PopupMenu.OnDismissListener arg0) {
        ((android.widget.PopupMenu) real).setOnDismissListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnMenuItemClickListener(com.micklab.dcg.wrapper.android.widget.PopupMenu.OnMenuItemClickListener arg0) {
        ((android.widget.PopupMenu) real).setOnMenuItemClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void show() {
        ((android.widget.PopupMenu) real).show();
    }

    public static final class OnDismissListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDismissListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.PopupMenu.OnDismissListener wrap(android.widget.PopupMenu.OnDismissListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupMenu.OnDismissListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.PopupMenu.OnDismissListener getReal() {
            return (android.widget.PopupMenu.OnDismissListener) real;
        }

        public android.widget.PopupMenu.OnDismissListener unwrap() {
            return getReal();
        }

        public void onDismiss(com.micklab.dcg.wrapper.android.widget.PopupMenu arg0) {
            ((android.widget.PopupMenu.OnDismissListener) real).onDismiss(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnMenuItemClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnMenuItemClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.PopupMenu.OnMenuItemClickListener wrap(android.widget.PopupMenu.OnMenuItemClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupMenu.OnMenuItemClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.PopupMenu.OnMenuItemClickListener getReal() {
            return (android.widget.PopupMenu.OnMenuItemClickListener) real;
        }

        public android.widget.PopupMenu.OnMenuItemClickListener unwrap() {
            return getReal();
        }

        public boolean onMenuItemClick(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return ((android.widget.PopupMenu.OnMenuItemClickListener) real).onMenuItemClick(arg0 == null ? null : arg0.getReal());
        }

    }
}
