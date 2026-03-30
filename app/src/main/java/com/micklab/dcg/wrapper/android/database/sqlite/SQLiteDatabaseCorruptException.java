// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDatabaseCorruptException {
    private final android.database.sqlite.SQLiteDatabaseCorruptException real;

    public SQLiteDatabaseCorruptException(android.database.sqlite.SQLiteDatabaseCorruptException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabaseCorruptException wrap(android.database.sqlite.SQLiteDatabaseCorruptException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabaseCorruptException(real);
    }

    public android.database.sqlite.SQLiteDatabaseCorruptException unwrap() {
        return real;
    }

    public SQLiteDatabaseCorruptException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabaseCorruptException#android.database.sqlite.SQLiteDatabaseCorruptException()");
    }

    public SQLiteDatabaseCorruptException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabaseCorruptException#android.database.sqlite.SQLiteDatabaseCorruptException(java.lang.String)");
    }

}
