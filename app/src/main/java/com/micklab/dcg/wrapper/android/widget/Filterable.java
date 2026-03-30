// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Filterable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Filterable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Filterable wrap(android.widget.Filterable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Filterable(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Filterable getReal() {
        return (android.widget.Filterable) real;
    }

    public android.widget.Filterable unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(((android.widget.Filterable) real).getFilter());
    }

}
