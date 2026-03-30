// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class WrapperListAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WrapperListAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.WrapperListAdapter wrap(android.widget.WrapperListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.WrapperListAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.WrapperListAdapter getReal() {
        return (android.widget.WrapperListAdapter) real;
    }

    public android.widget.WrapperListAdapter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getWrappedAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(((android.widget.WrapperListAdapter) real).getWrappedAdapter());
    }

}
