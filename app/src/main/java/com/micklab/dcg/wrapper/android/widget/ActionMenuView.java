// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ActionMenuView {
    private final android.widget.ActionMenuView real;

    public ActionMenuView(android.widget.ActionMenuView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ActionMenuView wrap(android.widget.ActionMenuView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ActionMenuView(real);
    }

    public android.widget.ActionMenuView unwrap() {
        return real;
    }

    public ActionMenuView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ActionMenuView(arg0 == null ? null : arg0.unwrap()));
    }

    public ActionMenuView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ActionMenuView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void dismissPopupMenus() {
        real.dismissPopupMenus();
    }

    public com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.Menu getMenu() {
        return com.micklab.dcg.wrapper.android.view.Menu.wrap(real.getMenu());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getOverflowIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getOverflowIcon());
    }

    public int getPopupTheme() {
        return real.getPopupTheme();
    }

    public boolean hideOverflowMenu() {
        return real.hideOverflowMenu();
    }

    public boolean isOverflowMenuShowing() {
        return real.isOverflowMenuShowing();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onDetachedFromWindow() {
        real.onDetachedFromWindow();
    }

    public void setOnMenuItemClickListener(com.micklab.dcg.wrapper.android.widget.ActionMenuView.OnMenuItemClickListener arg0) {
        real.setOnMenuItemClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOverflowIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setOverflowIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setPopupTheme(int arg0) {
        real.setPopupTheme(arg0);
    }

    public boolean showOverflowMenu() {
        return real.showOverflowMenu();
    }

    public static final class LayoutParams {
        private final android.widget.ActionMenuView.LayoutParams real;

        public LayoutParams(android.widget.ActionMenuView.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams wrap(android.widget.ActionMenuView.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams(real);
        }

        public android.widget.ActionMenuView.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.ActionMenuView.LayoutParams arg0) {
            this(new android.widget.ActionMenuView.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.ActionMenuView.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.ActionMenuView.LayoutParams(arg0, arg1));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.ActionMenuView.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

    }
    public static final class OnMenuItemClickListener {
        private final android.widget.ActionMenuView.OnMenuItemClickListener real;

        public OnMenuItemClickListener(android.widget.ActionMenuView.OnMenuItemClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ActionMenuView.OnMenuItemClickListener wrap(android.widget.ActionMenuView.OnMenuItemClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ActionMenuView.OnMenuItemClickListener(real);
        }

        public android.widget.ActionMenuView.OnMenuItemClickListener unwrap() {
            return real;
        }

        public boolean onMenuItemClick(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return real.onMenuItemClick(arg0 == null ? null : arg0.unwrap());
        }

    }
}
