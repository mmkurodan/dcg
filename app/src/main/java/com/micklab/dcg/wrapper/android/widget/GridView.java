// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class GridView {
    private final android.widget.GridView real;

    public GridView(android.widget.GridView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.GridView wrap(android.widget.GridView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridView(real);
    }

    public android.widget.GridView unwrap() {
        return real;
    }

    public GridView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.GridView(arg0 == null ? null : arg0.unwrap()));
    }

    public GridView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.GridView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public GridView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.GridView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public GridView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.GridView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(real.getAdapter());
    }

    public int getColumnWidth() {
        return real.getColumnWidth();
    }

    public int getGravity() {
        return real.getGravity();
    }

    public int getHorizontalSpacing() {
        return real.getHorizontalSpacing();
    }

    public int getNumColumns() {
        return real.getNumColumns();
    }

    public int getRequestedColumnWidth() {
        return real.getRequestedColumnWidth();
    }

    public int getRequestedHorizontalSpacing() {
        return real.getRequestedHorizontalSpacing();
    }

    public int getStretchMode() {
        return real.getStretchMode();
    }

    public int getVerticalSpacing() {
        return real.getVerticalSpacing();
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

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setColumnWidth(int arg0) {
        real.setColumnWidth(arg0);
    }

    public void setGravity(int arg0) {
        real.setGravity(arg0);
    }

    public void setHorizontalSpacing(int arg0) {
        real.setHorizontalSpacing(arg0);
    }

    public void setNumColumns(int arg0) {
        real.setNumColumns(arg0);
    }

    public void setRemoteViewsAdapter(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.setRemoteViewsAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelection(int arg0) {
        real.setSelection(arg0);
    }

    public void setStretchMode(int arg0) {
        real.setStretchMode(arg0);
    }

    public void setVerticalSpacing(int arg0) {
        real.setVerticalSpacing(arg0);
    }

    public void smoothScrollByOffset(int arg0) {
        real.smoothScrollByOffset(arg0);
    }

    public void smoothScrollToPosition(int arg0) {
        real.smoothScrollToPosition(arg0);
    }

    public static final int AUTO_FIT = android.widget.GridView.AUTO_FIT;
    public static final int NO_STRETCH = android.widget.GridView.NO_STRETCH;
    public static final int STRETCH_COLUMN_WIDTH = android.widget.GridView.STRETCH_COLUMN_WIDTH;
    public static final int STRETCH_SPACING = android.widget.GridView.STRETCH_SPACING;
    public static final int STRETCH_SPACING_UNIFORM = android.widget.GridView.STRETCH_SPACING_UNIFORM;

}
