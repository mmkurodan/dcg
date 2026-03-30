// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDatabaseLockedException {
    private final android.database.sqlite.SQLiteDatabaseLockedException real;

    public SQLiteDatabaseLockedException(android.database.sqlite.SQLiteDatabaseLockedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabaseLockedException wrap(android.database.sqlite.SQLiteDatabaseLockedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabaseLockedException(real);
    }

    public android.database.sqlite.SQLiteDatabaseLockedException unwrap() {
        return real;
    }

    public SQLiteDatabaseLockedException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabaseLockedException#android.database.sqlite.SQLiteDatabaseLockedException()");
    }

    public SQLiteDatabaseLockedException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabaseLockedException#android.database.sqlite.SQLiteDatabaseLockedException(java.lang.String)");
    }

}
