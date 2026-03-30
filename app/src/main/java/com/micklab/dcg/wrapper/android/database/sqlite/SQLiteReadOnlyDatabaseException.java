// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteReadOnlyDatabaseException {
    private final android.database.sqlite.SQLiteReadOnlyDatabaseException real;

    public SQLiteReadOnlyDatabaseException(android.database.sqlite.SQLiteReadOnlyDatabaseException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteReadOnlyDatabaseException wrap(android.database.sqlite.SQLiteReadOnlyDatabaseException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteReadOnlyDatabaseException(real);
    }

    public android.database.sqlite.SQLiteReadOnlyDatabaseException unwrap() {
        return real;
    }

    public SQLiteReadOnlyDatabaseException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteReadOnlyDatabaseException#android.database.sqlite.SQLiteReadOnlyDatabaseException()");
    }

    public SQLiteReadOnlyDatabaseException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteReadOnlyDatabaseException#android.database.sqlite.SQLiteReadOnlyDatabaseException(java.lang.String)");
    }

}
