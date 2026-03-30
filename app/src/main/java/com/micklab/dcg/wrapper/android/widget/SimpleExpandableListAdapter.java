// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SimpleExpandableListAdapter {
    private final android.widget.SimpleExpandableListAdapter real;

    public SimpleExpandableListAdapter(android.widget.SimpleExpandableListAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SimpleExpandableListAdapter wrap(android.widget.SimpleExpandableListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SimpleExpandableListAdapter(real);
    }

    public android.widget.SimpleExpandableListAdapter unwrap() {
        return real;
    }

    public SimpleExpandableListAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.List arg1, int arg2, java.lang.String[] arg3, int[] arg4, java.util.List arg5, int arg6, java.lang.String[] arg7, int[] arg8) {
        this(new android.widget.SimpleExpandableListAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8));
    }

    public SimpleExpandableListAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.List arg1, int arg2, int arg3, java.lang.String[] arg4, int[] arg5, java.util.List arg6, int arg7, java.lang.String[] arg8, int[] arg9) {
        this(new android.widget.SimpleExpandableListAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9));
    }

    public SimpleExpandableListAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.List arg1, int arg2, int arg3, java.lang.String[] arg4, int[] arg5, java.util.List arg6, int arg7, int arg8, java.lang.String[] arg9, int[] arg10) {
        this(new android.widget.SimpleExpandableListAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10));
    }

    public java.lang.Object getChild(int arg0, int arg1) {
        return real.getChild(arg0, arg1);
    }

    public long getChildId(int arg0, int arg1) {
        return real.getChildId(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.View getChildView(int arg0, int arg1, boolean arg2, com.micklab.dcg.wrapper.android.view.View arg3, com.micklab.dcg.wrapper.android.view.ViewGroup arg4) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getChildView(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap()));
    }

    public int getChildrenCount(int arg0) {
        return real.getChildrenCount(arg0);
    }

    public java.lang.Object getGroup(int arg0) {
        return real.getGroup(arg0);
    }

    public int getGroupCount() {
        return real.getGroupCount();
    }

    public long getGroupId(int arg0) {
        return real.getGroupId(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getGroupView(int arg0, boolean arg1, com.micklab.dcg.wrapper.android.view.View arg2, com.micklab.dcg.wrapper.android.view.ViewGroup arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getGroupView(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public boolean hasStableIds() {
        return real.hasStableIds();
    }

    public boolean isChildSelectable(int arg0, int arg1) {
        return real.isChildSelectable(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.View newChildView(boolean arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.newChildView(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View newGroupView(boolean arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.newGroupView(arg0, arg1 == null ? null : arg1.unwrap()));
    }

}
