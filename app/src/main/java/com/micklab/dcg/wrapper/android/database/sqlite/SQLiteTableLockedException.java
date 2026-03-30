// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteTableLockedException {
    private final android.database.sqlite.SQLiteTableLockedException real;

    public SQLiteTableLockedException(android.database.sqlite.SQLiteTableLockedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTableLockedException wrap(android.database.sqlite.SQLiteTableLockedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTableLockedException(real);
    }

    public android.database.sqlite.SQLiteTableLockedException unwrap() {
        return real;
    }

    public SQLiteTableLockedException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteTableLockedException#android.database.sqlite.SQLiteTableLockedException()");
    }

    public SQLiteTableLockedException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteTableLockedException#android.database.sqlite.SQLiteTableLockedException(java.lang.String)");
    }

}
