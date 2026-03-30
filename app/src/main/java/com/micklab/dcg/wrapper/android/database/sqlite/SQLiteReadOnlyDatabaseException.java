// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteReadOnlyDatabaseException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteReadOnlyDatabaseException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteReadOnlyDatabaseException wrap(android.database.sqlite.SQLiteReadOnlyDatabaseException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteReadOnlyDatabaseException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteReadOnlyDatabaseException getReal() {
        return (android.database.sqlite.SQLiteReadOnlyDatabaseException) real;
    }

    public android.database.sqlite.SQLiteReadOnlyDatabaseException unwrap() {
        return getReal();
    }

    public SQLiteReadOnlyDatabaseException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteReadOnlyDatabaseException#android.database.sqlite.SQLiteReadOnlyDatabaseException()");
    }

    public SQLiteReadOnlyDatabaseException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteReadOnlyDatabaseException#android.database.sqlite.SQLiteReadOnlyDatabaseException(java.lang.String)");
    }

}
