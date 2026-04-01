// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TabWidget {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TabWidget(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TabWidget wrap(android.widget.TabWidget real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TabWidget(real, (__DcgwBridgeToken) null);
    }

    public android.widget.TabWidget getReal() {
        return (android.widget.TabWidget) real;
    }

    public android.widget.TabWidget unwrap() {
        return getReal();
    }

    public TabWidget(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TabWidget(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TabWidget(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TabWidget(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TabWidget(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TabWidget(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public TabWidget(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TabWidget(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.TabWidget) real).addView(arg0 == null ? null : arg0.getReal());
    }

    public void childDrawableStateChanged(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.TabWidget) real).childDrawableStateChanged(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchDraw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.widget.TabWidget) real).dispatchDraw(arg0 == null ? null : arg0.getReal());
    }

    public void focusCurrentTab(int arg0) {
        ((android.widget.TabWidget) real).focusCurrentTab(arg0);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.TabWidget) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getChildTabViewAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.TabWidget) real).getChildTabViewAt(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getLeftStripDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.TabWidget) real).getLeftStripDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getRightStripDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.TabWidget) real).getRightStripDrawable());
    }

    public int getTabCount() {
        return ((android.widget.TabWidget) real).getTabCount();
    }

    public boolean isStripEnabled() {
        return ((android.widget.TabWidget) real).isStripEnabled();
    }

    public void onFocusChange(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        ((android.widget.TabWidget) real).onFocusChange(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(((android.widget.TabWidget) real).onResolvePointerIcon(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void removeAllViews() {
        ((android.widget.TabWidget) real).removeAllViews();
    }

    public void setCurrentTab(int arg0) {
        ((android.widget.TabWidget) real).setCurrentTab(arg0);
    }

    public void setDividerDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.TabWidget) real).setDividerDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setDividerDrawable(int arg0) {
        ((android.widget.TabWidget) real).setDividerDrawable(arg0);
    }

    public void setEnabled(boolean arg0) {
        ((android.widget.TabWidget) real).setEnabled(arg0);
    }

    public void setLeftStripDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.TabWidget) real).setLeftStripDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setLeftStripDrawable(int arg0) {
        ((android.widget.TabWidget) real).setLeftStripDrawable(arg0);
    }

    public void setRightStripDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.TabWidget) real).setRightStripDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setRightStripDrawable(int arg0) {
        ((android.widget.TabWidget) real).setRightStripDrawable(arg0);
    }

    public void setStripEnabled(boolean arg0) {
        ((android.widget.TabWidget) real).setStripEnabled(arg0);
    }

}
