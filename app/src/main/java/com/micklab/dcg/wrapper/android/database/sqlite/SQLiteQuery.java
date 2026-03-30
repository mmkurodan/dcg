// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteQuery {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteQuery(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteQuery wrap(android.database.sqlite.SQLiteQuery real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteQuery(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteQuery getReal() {
        return (android.database.sqlite.SQLiteQuery) real;
    }

    public android.database.sqlite.SQLiteQuery unwrap() {
        return getReal();
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteQuery#toString()");
    }

}
