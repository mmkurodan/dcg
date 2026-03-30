// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class FilterQueryProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FilterQueryProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.FilterQueryProvider wrap(android.widget.FilterQueryProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.FilterQueryProvider(real, (__DcgwBridgeToken) null);
    }

    public android.widget.FilterQueryProvider getReal() {
        return (android.widget.FilterQueryProvider) real;
    }

    public android.widget.FilterQueryProvider unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.database.Cursor runQuery(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.widget.FilterQueryProvider) real).runQuery(arg0));
    }

}
