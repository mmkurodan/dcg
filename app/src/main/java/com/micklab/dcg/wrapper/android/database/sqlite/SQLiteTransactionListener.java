// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteTransactionListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteTransactionListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTransactionListener wrap(android.database.sqlite.SQLiteTransactionListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTransactionListener(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteTransactionListener getReal() {
        return (android.database.sqlite.SQLiteTransactionListener) real;
    }

    public android.database.sqlite.SQLiteTransactionListener unwrap() {
        return getReal();
    }

    public void onBegin() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteTransactionListener#onBegin()");
    }

    public void onCommit() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteTransactionListener#onCommit()");
    }

    public void onRollback() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteTransactionListener#onRollback()");
    }

}
