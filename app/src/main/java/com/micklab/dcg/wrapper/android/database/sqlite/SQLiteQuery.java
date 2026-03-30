// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteQuery {
    private final android.database.sqlite.SQLiteQuery real;

    public SQLiteQuery(android.database.sqlite.SQLiteQuery real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteQuery wrap(android.database.sqlite.SQLiteQuery real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteQuery(real);
    }

    public android.database.sqlite.SQLiteQuery unwrap() {
        return real;
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteQuery#toString()");
    }

}
