// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteTransactionListener {
    private final android.database.sqlite.SQLiteTransactionListener real;

    public SQLiteTransactionListener(android.database.sqlite.SQLiteTransactionListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTransactionListener wrap(android.database.sqlite.SQLiteTransactionListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTransactionListener(real);
    }

    public android.database.sqlite.SQLiteTransactionListener unwrap() {
        return real;
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
