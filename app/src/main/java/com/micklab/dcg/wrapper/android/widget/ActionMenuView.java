// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ActionMenuView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActionMenuView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ActionMenuView wrap(android.widget.ActionMenuView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ActionMenuView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ActionMenuView getReal() {
        return (android.widget.ActionMenuView) real;
    }

    public android.widget.ActionMenuView unwrap() {
        return getReal();
    }

    public ActionMenuView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ActionMenuView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ActionMenuView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ActionMenuView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void dismissPopupMenus() {
        ((android.widget.ActionMenuView) real).dismissPopupMenus();
    }

    public com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams.wrap(((android.widget.ActionMenuView) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.Menu getMenu() {
        return com.micklab.dcg.wrapper.android.view.Menu.wrap(((android.widget.ActionMenuView) real).getMenu());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getOverflowIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.ActionMenuView) real).getOverflowIcon());
    }

    public int getPopupTheme() {
        return ((android.widget.ActionMenuView) real).getPopupTheme();
    }

    public boolean hideOverflowMenu() {
        return ((android.widget.ActionMenuView) real).hideOverflowMenu();
    }

    public boolean isOverflowMenuShowing() {
        return ((android.widget.ActionMenuView) real).isOverflowMenuShowing();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.widget.ActionMenuView) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onDetachedFromWindow() {
        ((android.widget.ActionMenuView) real).onDetachedFromWindow();
    }

    public void setOnMenuItemClickListener(com.micklab.dcg.wrapper.android.widget.ActionMenuView.OnMenuItemClickListener arg0) {
        ((android.widget.ActionMenuView) real).setOnMenuItemClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOverflowIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ActionMenuView) real).setOverflowIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setPopupTheme(int arg0) {
        ((android.widget.ActionMenuView) real).setPopupTheme(arg0);
    }

    public boolean showOverflowMenu() {
        return ((android.widget.ActionMenuView) real).showOverflowMenu();
    }

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams wrap(android.widget.ActionMenuView.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ActionMenuView.LayoutParams getReal() {
            return (android.widget.ActionMenuView.LayoutParams) real;
        }

        public android.widget.ActionMenuView.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams arg0) {
            this(new android.widget.ActionMenuView.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.ActionMenuView.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.ActionMenuView.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.ActionMenuView.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

    }
    public static final class OnMenuItemClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnMenuItemClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ActionMenuView.OnMenuItemClickListener wrap(android.widget.ActionMenuView.OnMenuItemClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ActionMenuView.OnMenuItemClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ActionMenuView.OnMenuItemClickListener getReal() {
            return (android.widget.ActionMenuView.OnMenuItemClickListener) real;
        }

        public android.widget.ActionMenuView.OnMenuItemClickListener unwrap() {
            return getReal();
        }

        public boolean onMenuItemClick(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return ((android.widget.ActionMenuView.OnMenuItemClickListener) real).onMenuItemClick(arg0 == null ? null : arg0.getReal());
        }

    }
}
