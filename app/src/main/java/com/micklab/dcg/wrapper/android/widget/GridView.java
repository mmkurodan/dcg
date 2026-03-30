// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class GridView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GridView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.GridView wrap(android.widget.GridView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.GridView getReal() {
        return (android.widget.GridView) real;
    }

    public android.widget.GridView unwrap() {
        return getReal();
    }

    public GridView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.GridView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public GridView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.GridView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public GridView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.GridView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public GridView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.GridView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.GridView) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(((android.widget.GridView) real).getAdapter());
    }

    public int getColumnWidth() {
        return ((android.widget.GridView) real).getColumnWidth();
    }

    public int getGravity() {
        return ((android.widget.GridView) real).getGravity();
    }

    public int getHorizontalSpacing() {
        return ((android.widget.GridView) real).getHorizontalSpacing();
    }

    public int getNumColumns() {
        return ((android.widget.GridView) real).getNumColumns();
    }

    public int getRequestedColumnWidth() {
        return ((android.widget.GridView) real).getRequestedColumnWidth();
    }

    public int getRequestedHorizontalSpacing() {
        return ((android.widget.GridView) real).getRequestedHorizontalSpacing();
    }

    public int getStretchMode() {
        return ((android.widget.GridView) real).getStretchMode();
    }

    public int getVerticalSpacing() {
        return ((android.widget.GridView) real).getVerticalSpacing();
    }

    public void onInitializeAccessibilityNodeInfoForItem(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg2) {
        ((android.widget.GridView) real).onInitializeAccessibilityNodeInfoForItem(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.GridView) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.widget.GridView) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.GridView) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        ((android.widget.GridView) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setColumnWidth(int arg0) {
        ((android.widget.GridView) real).setColumnWidth(arg0);
    }

    public void setGravity(int arg0) {
        ((android.widget.GridView) real).setGravity(arg0);
    }

    public void setHorizontalSpacing(int arg0) {
        ((android.widget.GridView) real).setHorizontalSpacing(arg0);
    }

    public void setNumColumns(int arg0) {
        ((android.widget.GridView) real).setNumColumns(arg0);
    }

    public void setRemoteViewsAdapter(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.widget.GridView) real).setRemoteViewsAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setSelection(int arg0) {
        ((android.widget.GridView) real).setSelection(arg0);
    }

    public void setStretchMode(int arg0) {
        ((android.widget.GridView) real).setStretchMode(arg0);
    }

    public void setVerticalSpacing(int arg0) {
        ((android.widget.GridView) real).setVerticalSpacing(arg0);
    }

    public void smoothScrollByOffset(int arg0) {
        ((android.widget.GridView) real).smoothScrollByOffset(arg0);
    }

    public void smoothScrollToPosition(int arg0) {
        ((android.widget.GridView) real).smoothScrollToPosition(arg0);
    }

    public static final int AUTO_FIT = android.widget.GridView.AUTO_FIT;
    public static final int NO_STRETCH = android.widget.GridView.NO_STRETCH;
    public static final int STRETCH_COLUMN_WIDTH = android.widget.GridView.STRETCH_COLUMN_WIDTH;
    public static final int STRETCH_SPACING = android.widget.GridView.STRETCH_SPACING;
    public static final int STRETCH_SPACING_UNIFORM = android.widget.GridView.STRETCH_SPACING_UNIFORM;

}
