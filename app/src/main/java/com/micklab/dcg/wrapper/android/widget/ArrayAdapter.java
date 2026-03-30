// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ArrayAdapter {
    private final android.widget.ArrayAdapter real;

    public ArrayAdapter(android.widget.ArrayAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ArrayAdapter wrap(android.widget.ArrayAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ArrayAdapter(real);
    }

    public android.widget.ArrayAdapter unwrap() {
        return real;
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.util.List arg2) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.lang.Object[] arg2) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2, java.util.List arg3) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public ArrayAdapter(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2, java.lang.Object[] arg3) {
        this(new android.widget.ArrayAdapter(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public void add(java.lang.Object arg0) {
        real.add(arg0);
    }

    public void addAll(java.lang.Object... arg0) {
        real.addAll(arg0);
    }

    public void clear() {
        real.clear();
    }

    public java.lang.CharSequence[] getAutofillOptions() {
        return real.getAutofillOptions();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public int getCount() {
        return real.getCount();
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getDropDownView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public android.content.res.Resources.Theme getDropDownViewTheme() {
        return real.getDropDownViewTheme();
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(real.getFilter());
    }

    public java.lang.Object getItem(int arg0) {
        return real.getItem(arg0);
    }

    public long getItemId(int arg0) {
        return real.getItemId(arg0);
    }

    public int getPosition(java.lang.Object arg0) {
        return real.getPosition(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public void insert(java.lang.Object arg0, int arg1) {
        real.insert(arg0, arg1);
    }

    public void notifyDataSetChanged() {
        real.notifyDataSetChanged();
    }

    public void remove(java.lang.Object arg0) {
        real.remove(arg0);
    }

    public void setDropDownViewResource(int arg0) {
        real.setDropDownViewResource(arg0);
    }

    public void setDropDownViewTheme(android.content.res.Resources.Theme arg0) {
        real.setDropDownViewTheme(arg0);
    }

    public void setNotifyOnChange(boolean arg0) {
        real.setNotifyOnChange(arg0);
    }

}
