// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteBlobTooBigException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteBlobTooBigException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteBlobTooBigException wrap(android.database.sqlite.SQLiteBlobTooBigException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteBlobTooBigException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteBlobTooBigException getReal() {
        return (android.database.sqlite.SQLiteBlobTooBigException) real;
    }

    public android.database.sqlite.SQLiteBlobTooBigException unwrap() {
        return getReal();
    }

    public SQLiteBlobTooBigException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteBlobTooBigException#android.database.sqlite.SQLiteBlobTooBigException()");
    }

    public SQLiteBlobTooBigException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteBlobTooBigException#android.database.sqlite.SQLiteBlobTooBigException(java.lang.String)");
    }

}
