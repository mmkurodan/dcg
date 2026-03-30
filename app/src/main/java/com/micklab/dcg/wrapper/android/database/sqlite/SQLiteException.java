// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteException {
    private final android.database.sqlite.SQLiteException real;

    public SQLiteException(android.database.sqlite.SQLiteException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteException wrap(android.database.sqlite.SQLiteException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteException(real);
    }

    public android.database.sqlite.SQLiteException unwrap() {
        return real;
    }

    public SQLiteException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteException#android.database.sqlite.SQLiteException()");
    }

    public SQLiteException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteException#android.database.sqlite.SQLiteException(java.lang.String)");
    }

    public SQLiteException(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteException#android.database.sqlite.SQLiteException(java.lang.String,java.lang.Throwable)");
    }

}
