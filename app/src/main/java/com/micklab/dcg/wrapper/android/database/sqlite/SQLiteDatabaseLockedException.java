// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDatabaseLockedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteDatabaseLockedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabaseLockedException wrap(android.database.sqlite.SQLiteDatabaseLockedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabaseLockedException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteDatabaseLockedException getReal() {
        return (android.database.sqlite.SQLiteDatabaseLockedException) real;
    }

    public android.database.sqlite.SQLiteDatabaseLockedException unwrap() {
        return getReal();
    }

    public SQLiteDatabaseLockedException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabaseLockedException#android.database.sqlite.SQLiteDatabaseLockedException()");
    }

    public SQLiteDatabaseLockedException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabaseLockedException#android.database.sqlite.SQLiteDatabaseLockedException(java.lang.String)");
    }

}
