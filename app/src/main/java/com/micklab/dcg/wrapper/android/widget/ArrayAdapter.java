// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ArrayAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ArrayAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ArrayAdapter wrap(android.widget.ArrayAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ArrayAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ArrayAdapter getReal() {
        return (android.widget.ArrayAdapter) real;
    }

    public android.widget.ArrayAdapter unwrap() {
        return getReal();
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.lang.Object[] arg2) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.util.List arg2) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2, java.lang.Object[] arg3) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2, java.util.List arg3) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void add(java.lang.Object arg0) {
        ((android.widget.ArrayAdapter) real).add(arg0);
    }

    public void addAll(java.lang.Object... arg0) {
        ((android.widget.ArrayAdapter) real).addAll(arg0);
    }

    public void clear() {
        ((android.widget.ArrayAdapter) real).clear();
    }

    public java.lang.CharSequence[] getAutofillOptions() {
        return ((android.widget.ArrayAdapter) real).getAutofillOptions();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.widget.ArrayAdapter) real).getContext());
    }

    public int getCount() {
        return ((android.widget.ArrayAdapter) real).getCount();
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ArrayAdapter) real).getDropDownView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources.Theme getDropDownViewTheme() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.Theme.wrap(((android.widget.ArrayAdapter) real).getDropDownViewTheme());
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(((android.widget.ArrayAdapter) real).getFilter());
    }

    public java.lang.Object getItem(int arg0) {
        return ((android.widget.ArrayAdapter) real).getItem(arg0);
    }

    public long getItemId(int arg0) {
        return ((android.widget.ArrayAdapter) real).getItemId(arg0);
    }

    public int getPosition(java.lang.Object arg0) {
        return ((android.widget.ArrayAdapter) real).getPosition(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ArrayAdapter) real).getView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public void insert(java.lang.Object arg0, int arg1) {
        ((android.widget.ArrayAdapter) real).insert(arg0, arg1);
    }

    public void notifyDataSetChanged() {
        ((android.widget.ArrayAdapter) real).notifyDataSetChanged();
    }

    public void remove(java.lang.Object arg0) {
        ((android.widget.ArrayAdapter) real).remove(arg0);
    }

    public void setDropDownViewResource(int arg0) {
        ((android.widget.ArrayAdapter) real).setDropDownViewResource(arg0);
    }

    public void setDropDownViewTheme(com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg0) {
        ((android.widget.ArrayAdapter) real).setDropDownViewTheme(arg0 == null ? null : arg0.getReal());
    }

    public void setNotifyOnChange(boolean arg0) {
        ((android.widget.ArrayAdapter) real).setNotifyOnChange(arg0);
    }

}
