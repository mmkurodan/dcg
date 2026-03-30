// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDatabaseCorruptException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteDatabaseCorruptException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabaseCorruptException wrap(android.database.sqlite.SQLiteDatabaseCorruptException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabaseCorruptException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteDatabaseCorruptException getReal() {
        return (android.database.sqlite.SQLiteDatabaseCorruptException) real;
    }

    public android.database.sqlite.SQLiteDatabaseCorruptException unwrap() {
        return getReal();
    }

    public SQLiteDatabaseCorruptException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabaseCorruptException#android.database.sqlite.SQLiteDatabaseCorruptException()");
    }

    public SQLiteDatabaseCorruptException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatabaseCorruptException#android.database.sqlite.SQLiteDatabaseCorruptException(java.lang.String)");
    }

}
