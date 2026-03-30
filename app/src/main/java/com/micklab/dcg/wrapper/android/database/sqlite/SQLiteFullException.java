// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteFullException {
    private final android.database.sqlite.SQLiteFullException real;

    public SQLiteFullException(android.database.sqlite.SQLiteFullException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteFullException wrap(android.database.sqlite.SQLiteFullException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteFullException(real);
    }

    public android.database.sqlite.SQLiteFullException unwrap() {
        return real;
    }

    public SQLiteFullException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteFullException#android.database.sqlite.SQLiteFullException()");
    }

    public SQLiteFullException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteFullException#android.database.sqlite.SQLiteFullException(java.lang.String)");
    }

}
