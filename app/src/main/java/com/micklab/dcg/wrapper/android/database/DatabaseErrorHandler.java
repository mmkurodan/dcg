// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class DatabaseErrorHandler {
    private final android.database.DatabaseErrorHandler real;

    public DatabaseErrorHandler(android.database.DatabaseErrorHandler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler wrap(android.database.DatabaseErrorHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler(real);
    }

    public android.database.DatabaseErrorHandler unwrap() {
        return real;
    }

    public void onCorruption(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DatabaseErrorHandler#onCorruption(android.database.sqlite.SQLiteDatabase)");
    }

}
