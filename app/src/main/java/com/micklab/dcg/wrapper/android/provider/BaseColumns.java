// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class BaseColumns {
    private final android.provider.BaseColumns real;

    public BaseColumns(android.provider.BaseColumns real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.BaseColumns wrap(android.provider.BaseColumns real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.BaseColumns(real);
    }

    public android.provider.BaseColumns unwrap() {
        return real;
    }

    public static final java.lang.String _COUNT = android.provider.BaseColumns._COUNT;
    public static final java.lang.String _ID = android.provider.BaseColumns._ID;

}
