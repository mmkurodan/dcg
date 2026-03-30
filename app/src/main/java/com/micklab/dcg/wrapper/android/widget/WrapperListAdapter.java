// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class WrapperListAdapter {
    private final android.widget.WrapperListAdapter real;

    public WrapperListAdapter(android.widget.WrapperListAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.WrapperListAdapter wrap(android.widget.WrapperListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.WrapperListAdapter(real);
    }

    public android.widget.WrapperListAdapter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getWrappedAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(real.getWrappedAdapter());
    }

}
