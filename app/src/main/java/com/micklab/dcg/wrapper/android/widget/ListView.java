// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ListView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ListView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ListView wrap(android.widget.ListView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ListView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ListView getReal() {
        return (android.widget.ListView) real;
    }

    public android.widget.ListView unwrap() {
        return getReal();
    }

    public ListView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ListView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ListView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ListView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ListView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ListView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void addFooterView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.ListView) real).addFooterView(arg0 == null ? null : arg0.getReal());
    }

    public void addFooterView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.Object arg1, boolean arg2) {
        ((android.widget.ListView) real).addFooterView(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void addHeaderView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.ListView) real).addHeaderView(arg0 == null ? null : arg0.getReal());
    }

    public void addHeaderView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.Object arg1, boolean arg2) {
        ((android.widget.ListView) real).addHeaderView(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean areFooterDividersEnabled() {
        return ((android.widget.ListView) real).areFooterDividersEnabled();
    }

    public boolean areHeaderDividersEnabled() {
        return ((android.widget.ListView) real).areHeaderDividersEnabled();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.widget.ListView) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ListView) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(((android.widget.ListView) real).getAdapter());
    }

    public long[] getCheckItemIds() {
        return ((android.widget.ListView) real).getCheckItemIds();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDivider() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.ListView) real).getDivider());
    }

    public int getDividerHeight() {
        return ((android.widget.ListView) real).getDividerHeight();
    }

    public int getFooterViewsCount() {
        return ((android.widget.ListView) real).getFooterViewsCount();
    }

    public int getHeaderViewsCount() {
        return ((android.widget.ListView) real).getHeaderViewsCount();
    }

    public boolean getItemsCanFocus() {
        return ((android.widget.ListView) real).getItemsCanFocus();
    }

    public int getMaxScrollAmount() {
        return ((android.widget.ListView) real).getMaxScrollAmount();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getOverscrollFooter() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.ListView) real).getOverscrollFooter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getOverscrollHeader() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.ListView) real).getOverscrollHeader());
    }

    public boolean isOpaque() {
        return ((android.widget.ListView) real).isOpaque();
    }

    public void onInitializeAccessibilityNodeInfoForItem(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg2) {
        ((android.widget.ListView) real).onInitializeAccessibilityNodeInfoForItem(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.ListView) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.widget.ListView) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.ListView) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean removeFooterView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.widget.ListView) real).removeFooterView(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeHeaderView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.widget.ListView) real).removeHeaderView(arg0 == null ? null : arg0.getReal());
    }

    public boolean requestChildRectangleOnScreen(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) {
        return ((android.widget.ListView) real).requestChildRectangleOnScreen(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        ((android.widget.ListView) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setCacheColorHint(int arg0) {
        ((android.widget.ListView) real).setCacheColorHint(arg0);
    }

    public void setDivider(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ListView) real).setDivider(arg0 == null ? null : arg0.getReal());
    }

    public void setDividerHeight(int arg0) {
        ((android.widget.ListView) real).setDividerHeight(arg0);
    }

    public void setFooterDividersEnabled(boolean arg0) {
        ((android.widget.ListView) real).setFooterDividersEnabled(arg0);
    }

    public void setHeaderDividersEnabled(boolean arg0) {
        ((android.widget.ListView) real).setHeaderDividersEnabled(arg0);
    }

    public void setItemsCanFocus(boolean arg0) {
        ((android.widget.ListView) real).setItemsCanFocus(arg0);
    }

    public void setOverscrollFooter(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ListView) real).setOverscrollFooter(arg0 == null ? null : arg0.getReal());
    }

    public void setOverscrollHeader(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ListView) real).setOverscrollHeader(arg0 == null ? null : arg0.getReal());
    }

    public void setRemoteViewsAdapter(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.widget.ListView) real).setRemoteViewsAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setSelection(int arg0) {
        ((android.widget.ListView) real).setSelection(arg0);
    }

    public void setSelectionAfterHeaderView() {
        ((android.widget.ListView) real).setSelectionAfterHeaderView();
    }

    public void smoothScrollByOffset(int arg0) {
        ((android.widget.ListView) real).smoothScrollByOffset(arg0);
    }

    public void smoothScrollToPosition(int arg0) {
        ((android.widget.ListView) real).smoothScrollToPosition(arg0);
    }

    public static final class FixedViewInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FixedViewInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ListView.FixedViewInfo wrap(android.widget.ListView.FixedViewInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ListView.FixedViewInfo(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ListView.FixedViewInfo getReal() {
            return (android.widget.ListView.FixedViewInfo) real;
        }

        public android.widget.ListView.FixedViewInfo unwrap() {
            return getReal();
        }


    }
}
