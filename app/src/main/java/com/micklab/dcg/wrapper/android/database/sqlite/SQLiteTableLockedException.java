// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteTableLockedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteTableLockedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTableLockedException wrap(android.database.sqlite.SQLiteTableLockedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteTableLockedException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteTableLockedException getReal() {
        return (android.database.sqlite.SQLiteTableLockedException) real;
    }

    public android.database.sqlite.SQLiteTableLockedException unwrap() {
        return getReal();
    }

    public SQLiteTableLockedException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteTableLockedException#android.database.sqlite.SQLiteTableLockedException()");
    }

    public SQLiteTableLockedException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteTableLockedException#android.database.sqlite.SQLiteTableLockedException(java.lang.String)");
    }

}
