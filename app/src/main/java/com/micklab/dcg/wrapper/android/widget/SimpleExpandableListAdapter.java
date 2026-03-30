// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SimpleExpandableListAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SimpleExpandableListAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SimpleExpandableListAdapter wrap(android.widget.SimpleExpandableListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleExpandableListAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.SimpleExpandableListAdapter getReal() {
        return (android.widget.SimpleExpandableListAdapter) real;
    }

    public android.widget.SimpleExpandableListAdapter unwrap() {
        return getReal();
    }

    public SimpleExpandableListAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.List arg1, int arg2, java.lang.String[] arg3, int[] arg4, java.util.List arg5, int arg6, java.lang.String[] arg7, int[] arg8) {
        this(new android.widget.SimpleExpandableListAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8), (__DcgwBridgeToken) null);
    }

    public SimpleExpandableListAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.List arg1, int arg2, int arg3, java.lang.String[] arg4, int[] arg5, java.util.List arg6, int arg7, java.lang.String[] arg8, int[] arg9) {
        this(new android.widget.SimpleExpandableListAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9), (__DcgwBridgeToken) null);
    }

    public SimpleExpandableListAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.List arg1, int arg2, int arg3, java.lang.String[] arg4, int[] arg5, java.util.List arg6, int arg7, int arg8, java.lang.String[] arg9, int[] arg10) {
        this(new android.widget.SimpleExpandableListAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10), (__DcgwBridgeToken) null);
    }

    public java.lang.Object getChild(int arg0, int arg1) {
        return ((android.widget.SimpleExpandableListAdapter) real).getChild(arg0, arg1);
    }

    public long getChildId(int arg0, int arg1) {
        return ((android.widget.SimpleExpandableListAdapter) real).getChildId(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.View getChildView(int arg0, int arg1, boolean arg2, com.micklab.dcg.wrapper.android.view.View arg3, com.micklab.dcg.wrapper.android.view.ViewGroup arg4) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.SimpleExpandableListAdapter) real).getChildView(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal()));
    }

    public int getChildrenCount(int arg0) {
        return ((android.widget.SimpleExpandableListAdapter) real).getChildrenCount(arg0);
    }

    public java.lang.Object getGroup(int arg0) {
        return ((android.widget.SimpleExpandableListAdapter) real).getGroup(arg0);
    }

    public int getGroupCount() {
        return ((android.widget.SimpleExpandableListAdapter) real).getGroupCount();
    }

    public long getGroupId(int arg0) {
        return ((android.widget.SimpleExpandableListAdapter) real).getGroupId(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getGroupView(int arg0, boolean arg1, com.micklab.dcg.wrapper.android.view.View arg2, com.micklab.dcg.wrapper.android.view.ViewGroup arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.SimpleExpandableListAdapter) real).getGroupView(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public boolean hasStableIds() {
        return ((android.widget.SimpleExpandableListAdapter) real).hasStableIds();
    }

    public boolean isChildSelectable(int arg0, int arg1) {
        return ((android.widget.SimpleExpandableListAdapter) real).isChildSelectable(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.View newChildView(boolean arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.SimpleExpandableListAdapter) real).newChildView(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View newGroupView(boolean arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.SimpleExpandableListAdapter) real).newGroupView(arg0, arg1 == null ? null : arg1.getReal()));
    }

}
