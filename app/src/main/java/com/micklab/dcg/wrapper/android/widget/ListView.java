// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ListView {
    private final android.widget.ListView real;

    public ListView(android.widget.ListView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ListView wrap(android.widget.ListView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ListView(real);
    }

    public android.widget.ListView unwrap() {
        return real;
    }

    public ListView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ListView(arg0 == null ? null : arg0.unwrap()));
    }

    public ListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ListView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ListView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ListView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void addFooterView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.addFooterView(arg0 == null ? null : arg0.unwrap());
    }

    public void addFooterView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.Object arg1, boolean arg2) {
        real.addFooterView(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void addHeaderView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.addHeaderView(arg0 == null ? null : arg0.unwrap());
    }

    public void addHeaderView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.Object arg1, boolean arg2) {
        real.addHeaderView(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean areFooterDividersEnabled() {
        return real.areFooterDividersEnabled();
    }

    public boolean areHeaderDividersEnabled() {
        return real.areHeaderDividersEnabled();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(real.getAdapter());
    }

    public long[] getCheckItemIds() {
        return real.getCheckItemIds();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDivider() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getDivider());
    }

    public int getDividerHeight() {
        return real.getDividerHeight();
    }

    public int getFooterViewsCount() {
        return real.getFooterViewsCount();
    }

    public int getHeaderViewsCount() {
        return real.getHeaderViewsCount();
    }

    public boolean getItemsCanFocus() {
        return real.getItemsCanFocus();
    }

    public int getMaxScrollAmount() {
        return real.getMaxScrollAmount();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getOverscrollFooter() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getOverscrollFooter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getOverscrollHeader() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getOverscrollHeader());
    }

    public boolean isOpaque() {
        return real.isOpaque();
    }

    public void onInitializeAccessibilityNodeInfoForItem(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg2) {
        real.onInitializeAccessibilityNodeInfoForItem(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return real.onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean removeFooterView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.removeFooterView(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeHeaderView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.removeHeaderView(arg0 == null ? null : arg0.unwrap());
    }

    public boolean requestChildRectangleOnScreen(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) {
        return real.requestChildRectangleOnScreen(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setCacheColorHint(int arg0) {
        real.setCacheColorHint(arg0);
    }

    public void setDivider(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setDivider(arg0 == null ? null : arg0.unwrap());
    }

    public void setDividerHeight(int arg0) {
        real.setDividerHeight(arg0);
    }

    public void setFooterDividersEnabled(boolean arg0) {
        real.setFooterDividersEnabled(arg0);
    }

    public void setHeaderDividersEnabled(boolean arg0) {
        real.setHeaderDividersEnabled(arg0);
    }

    public void setItemsCanFocus(boolean arg0) {
        real.setItemsCanFocus(arg0);
    }

    public void setOverscrollFooter(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setOverscrollFooter(arg0 == null ? null : arg0.unwrap());
    }

    public void setOverscrollHeader(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setOverscrollHeader(arg0 == null ? null : arg0.unwrap());
    }

    public void setRemoteViewsAdapter(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.setRemoteViewsAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelection(int arg0) {
        real.setSelection(arg0);
    }

    public void setSelectionAfterHeaderView() {
        real.setSelectionAfterHeaderView();
    }

    public void smoothScrollByOffset(int arg0) {
        real.smoothScrollByOffset(arg0);
    }

    public void smoothScrollToPosition(int arg0) {
        real.smoothScrollToPosition(arg0);
    }

}
