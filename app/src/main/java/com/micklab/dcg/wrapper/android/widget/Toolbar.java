// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Toolbar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Toolbar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Toolbar wrap(android.widget.Toolbar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Toolbar(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Toolbar getReal() {
        return (android.widget.Toolbar) real;
    }

    public android.widget.Toolbar unwrap() {
        return getReal();
    }

    public Toolbar(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Toolbar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Toolbar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.Toolbar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public Toolbar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.Toolbar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public Toolbar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.Toolbar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void collapseActionView() {
        ((android.widget.Toolbar) real).collapseActionView();
    }

    public void dismissPopupMenus() {
        ((android.widget.Toolbar) real).dismissPopupMenus();
    }

    public com.micklab.dcg.wrapper.android.widget.Toolbar.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.Toolbar.LayoutParams.wrap(((android.widget.Toolbar) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence getCollapseContentDescription() {
        return ((android.widget.Toolbar) real).getCollapseContentDescription();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getCollapseIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.Toolbar) real).getCollapseIcon());
    }

    public int getContentInsetEnd() {
        return ((android.widget.Toolbar) real).getContentInsetEnd();
    }

    public int getContentInsetEndWithActions() {
        return ((android.widget.Toolbar) real).getContentInsetEndWithActions();
    }

    public int getContentInsetLeft() {
        return ((android.widget.Toolbar) real).getContentInsetLeft();
    }

    public int getContentInsetRight() {
        return ((android.widget.Toolbar) real).getContentInsetRight();
    }

    public int getContentInsetStart() {
        return ((android.widget.Toolbar) real).getContentInsetStart();
    }

    public int getContentInsetStartWithNavigation() {
        return ((android.widget.Toolbar) real).getContentInsetStartWithNavigation();
    }

    public int getCurrentContentInsetEnd() {
        return ((android.widget.Toolbar) real).getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return ((android.widget.Toolbar) real).getCurrentContentInsetLeft();
    }

    public int getCurrentContentInsetRight() {
        return ((android.widget.Toolbar) real).getCurrentContentInsetRight();
    }

    public int getCurrentContentInsetStart() {
        return ((android.widget.Toolbar) real).getCurrentContentInsetStart();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getLogo() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.Toolbar) real).getLogo());
    }

    public java.lang.CharSequence getLogoDescription() {
        return ((android.widget.Toolbar) real).getLogoDescription();
    }

    public com.micklab.dcg.wrapper.android.view.Menu getMenu() {
        return com.micklab.dcg.wrapper.android.view.Menu.wrap(((android.widget.Toolbar) real).getMenu());
    }

    public java.lang.CharSequence getNavigationContentDescription() {
        return ((android.widget.Toolbar) real).getNavigationContentDescription();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getNavigationIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.Toolbar) real).getNavigationIcon());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getOverflowIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.Toolbar) real).getOverflowIcon());
    }

    public int getPopupTheme() {
        return ((android.widget.Toolbar) real).getPopupTheme();
    }

    public java.lang.CharSequence getSubtitle() {
        return ((android.widget.Toolbar) real).getSubtitle();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.widget.Toolbar) real).getTitle();
    }

    public int getTitleMarginBottom() {
        return ((android.widget.Toolbar) real).getTitleMarginBottom();
    }

    public int getTitleMarginEnd() {
        return ((android.widget.Toolbar) real).getTitleMarginEnd();
    }

    public int getTitleMarginStart() {
        return ((android.widget.Toolbar) real).getTitleMarginStart();
    }

    public int getTitleMarginTop() {
        return ((android.widget.Toolbar) real).getTitleMarginTop();
    }

    public boolean hasExpandedActionView() {
        return ((android.widget.Toolbar) real).hasExpandedActionView();
    }

    public boolean hideOverflowMenu() {
        return ((android.widget.Toolbar) real).hideOverflowMenu();
    }

    public void inflateMenu(int arg0) {
        ((android.widget.Toolbar) real).inflateMenu(arg0);
    }

    public boolean isOverflowMenuShowing() {
        return ((android.widget.Toolbar) real).isOverflowMenuShowing();
    }

    public void onRtlPropertiesChanged(int arg0) {
        ((android.widget.Toolbar) real).onRtlPropertiesChanged(arg0);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.Toolbar) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void setCollapseContentDescription(int arg0) {
        ((android.widget.Toolbar) real).setCollapseContentDescription(arg0);
    }

    public void setCollapseContentDescription(java.lang.CharSequence arg0) {
        ((android.widget.Toolbar) real).setCollapseContentDescription(arg0);
    }

    public void setCollapseIcon(int arg0) {
        ((android.widget.Toolbar) real).setCollapseIcon(arg0);
    }

    public void setCollapseIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.Toolbar) real).setCollapseIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setContentInsetEndWithActions(int arg0) {
        ((android.widget.Toolbar) real).setContentInsetEndWithActions(arg0);
    }

    public void setContentInsetStartWithNavigation(int arg0) {
        ((android.widget.Toolbar) real).setContentInsetStartWithNavigation(arg0);
    }

    public void setContentInsetsAbsolute(int arg0, int arg1) {
        ((android.widget.Toolbar) real).setContentInsetsAbsolute(arg0, arg1);
    }

    public void setContentInsetsRelative(int arg0, int arg1) {
        ((android.widget.Toolbar) real).setContentInsetsRelative(arg0, arg1);
    }

    public void setLogo(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.Toolbar) real).setLogo(arg0 == null ? null : arg0.getReal());
    }

    public void setLogo(int arg0) {
        ((android.widget.Toolbar) real).setLogo(arg0);
    }

    public void setLogoDescription(java.lang.CharSequence arg0) {
        ((android.widget.Toolbar) real).setLogoDescription(arg0);
    }

    public void setLogoDescription(int arg0) {
        ((android.widget.Toolbar) real).setLogoDescription(arg0);
    }

    public void setNavigationContentDescription(java.lang.CharSequence arg0) {
        ((android.widget.Toolbar) real).setNavigationContentDescription(arg0);
    }

    public void setNavigationContentDescription(int arg0) {
        ((android.widget.Toolbar) real).setNavigationContentDescription(arg0);
    }

    public void setNavigationIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.Toolbar) real).setNavigationIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setNavigationIcon(int arg0) {
        ((android.widget.Toolbar) real).setNavigationIcon(arg0);
    }

    public void setNavigationOnClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        ((android.widget.Toolbar) real).setNavigationOnClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnMenuItemClickListener(com.micklab.dcg.wrapper.android.widget.Toolbar.OnMenuItemClickListener arg0) {
        ((android.widget.Toolbar) real).setOnMenuItemClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOverflowIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.Toolbar) real).setOverflowIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setPopupTheme(int arg0) {
        ((android.widget.Toolbar) real).setPopupTheme(arg0);
    }

    public void setSubtitle(int arg0) {
        ((android.widget.Toolbar) real).setSubtitle(arg0);
    }

    public void setSubtitle(java.lang.CharSequence arg0) {
        ((android.widget.Toolbar) real).setSubtitle(arg0);
    }

    public void setSubtitleTextAppearance(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.widget.Toolbar) real).setSubtitleTextAppearance(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setSubtitleTextColor(int arg0) {
        ((android.widget.Toolbar) real).setSubtitleTextColor(arg0);
    }

    public void setTitle(int arg0) {
        ((android.widget.Toolbar) real).setTitle(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        ((android.widget.Toolbar) real).setTitle(arg0);
    }

    public void setTitleMargin(int arg0, int arg1, int arg2, int arg3) {
        ((android.widget.Toolbar) real).setTitleMargin(arg0, arg1, arg2, arg3);
    }

    public void setTitleMarginBottom(int arg0) {
        ((android.widget.Toolbar) real).setTitleMarginBottom(arg0);
    }

    public void setTitleMarginEnd(int arg0) {
        ((android.widget.Toolbar) real).setTitleMarginEnd(arg0);
    }

    public void setTitleMarginStart(int arg0) {
        ((android.widget.Toolbar) real).setTitleMarginStart(arg0);
    }

    public void setTitleMarginTop(int arg0) {
        ((android.widget.Toolbar) real).setTitleMarginTop(arg0);
    }

    public void setTitleTextAppearance(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.widget.Toolbar) real).setTitleTextAppearance(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setTitleTextColor(int arg0) {
        ((android.widget.Toolbar) real).setTitleTextColor(arg0);
    }

    public boolean showOverflowMenu() {
        return ((android.widget.Toolbar) real).showOverflowMenu();
    }

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Toolbar.LayoutParams wrap(android.widget.Toolbar.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Toolbar.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.Toolbar.LayoutParams getReal() {
            return (android.widget.Toolbar.LayoutParams) real;
        }

        public android.widget.Toolbar.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.Toolbar.LayoutParams arg0) {
            this(new android.widget.Toolbar.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0) {
            this(new android.widget.Toolbar.LayoutParams(arg0), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.app.ActionBar.LayoutParams arg0) {
            this(new android.widget.Toolbar.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.Toolbar.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.Toolbar.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.Toolbar.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.Toolbar.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1, int arg2) {
            this(new android.widget.Toolbar.LayoutParams(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

    }
    public static final class OnMenuItemClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnMenuItemClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Toolbar.OnMenuItemClickListener wrap(android.widget.Toolbar.OnMenuItemClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Toolbar.OnMenuItemClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.Toolbar.OnMenuItemClickListener getReal() {
            return (android.widget.Toolbar.OnMenuItemClickListener) real;
        }

        public android.widget.Toolbar.OnMenuItemClickListener unwrap() {
            return getReal();
        }

        public boolean onMenuItemClick(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return ((android.widget.Toolbar.OnMenuItemClickListener) real).onMenuItemClick(arg0 == null ? null : arg0.getReal());
        }

    }
}
