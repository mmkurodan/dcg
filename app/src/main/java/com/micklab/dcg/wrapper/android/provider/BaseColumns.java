// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class BaseColumns {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BaseColumns(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.BaseColumns wrap(android.provider.BaseColumns real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.BaseColumns(real, (__DcgwBridgeToken) null);
    }

    public android.provider.BaseColumns getReal() {
        return (android.provider.BaseColumns) real;
    }

    public android.provider.BaseColumns unwrap() {
        return getReal();
    }

    public static final java.lang.String _COUNT = android.provider.BaseColumns._COUNT;
    public static final java.lang.String _ID = android.provider.BaseColumns._ID;

}
