// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TabWidget {
    private final android.widget.TabWidget real;

    public TabWidget(android.widget.TabWidget real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TabWidget wrap(android.widget.TabWidget real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TabWidget(real);
    }

    public android.widget.TabWidget unwrap() {
        return real;
    }

    public TabWidget(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TabWidget(arg0 == null ? null : arg0.unwrap()));
    }

    public TabWidget(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TabWidget(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TabWidget(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TabWidget(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public TabWidget(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TabWidget(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.addView(arg0 == null ? null : arg0.unwrap());
    }

    public void childDrawableStateChanged(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.childDrawableStateChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchDraw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.dispatchDraw(arg0 == null ? null : arg0.unwrap());
    }

    public void focusCurrentTab(int arg0) {
        real.focusCurrentTab(arg0);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getChildTabViewAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getChildTabViewAt(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getLeftStripDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getLeftStripDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getRightStripDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getRightStripDrawable());
    }

    public int getTabCount() {
        return real.getTabCount();
    }

    public boolean isStripEnabled() {
        return real.isStripEnabled();
    }

    public void onFocusChange(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        real.onFocusChange(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(real.onResolvePointerIcon(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void removeAllViews() {
        real.removeAllViews();
    }

    public void setCurrentTab(int arg0) {
        real.setCurrentTab(arg0);
    }

    public void setDividerDrawable(int arg0) {
        real.setDividerDrawable(arg0);
    }

    public void setDividerDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setDividerDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setLeftStripDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setLeftStripDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setLeftStripDrawable(int arg0) {
        real.setLeftStripDrawable(arg0);
    }

    public void setRightStripDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setRightStripDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setRightStripDrawable(int arg0) {
        real.setRightStripDrawable(arg0);
    }

    public void setStripEnabled(boolean arg0) {
        real.setStripEnabled(arg0);
    }

}
