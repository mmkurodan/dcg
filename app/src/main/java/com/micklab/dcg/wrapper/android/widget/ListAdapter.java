// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ListAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ListAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ListAdapter wrap(android.widget.ListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ListAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ListAdapter getReal() {
        return (android.widget.ListAdapter) real;
    }

    public android.widget.ListAdapter unwrap() {
        return getReal();
    }

    public boolean areAllItemsEnabled() {
        return ((android.widget.ListAdapter) real).areAllItemsEnabled();
    }

    public boolean isEnabled(int arg0) {
        return ((android.widget.ListAdapter) real).isEnabled(arg0);
    }

}
