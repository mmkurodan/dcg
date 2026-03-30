// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Adapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Adapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Adapter wrap(android.widget.Adapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Adapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Adapter getReal() {
        return (android.widget.Adapter) real;
    }

    public android.widget.Adapter unwrap() {
        return getReal();
    }

    public java.lang.CharSequence[] getAutofillOptions() {
        return ((android.widget.Adapter) real).getAutofillOptions();
    }

    public int getCount() {
        return ((android.widget.Adapter) real).getCount();
    }

    public java.lang.Object getItem(int arg0) {
        return ((android.widget.Adapter) real).getItem(arg0);
    }

    public long getItemId(int arg0) {
        return ((android.widget.Adapter) real).getItemId(arg0);
    }

    public int getItemViewType(int arg0) {
        return ((android.widget.Adapter) real).getItemViewType(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.Adapter) real).getView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public int getViewTypeCount() {
        return ((android.widget.Adapter) real).getViewTypeCount();
    }

    public boolean hasStableIds() {
        return ((android.widget.Adapter) real).hasStableIds();
    }

    public boolean isEmpty() {
        return ((android.widget.Adapter) real).isEmpty();
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.Adapter) real).registerDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.Adapter) real).unregisterDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

    public static final int IGNORE_ITEM_VIEW_TYPE = android.widget.Adapter.IGNORE_ITEM_VIEW_TYPE;
    public static final int NO_SELECTION = android.widget.Adapter.NO_SELECTION;

}
