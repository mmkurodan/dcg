// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteCantOpenDatabaseException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteCantOpenDatabaseException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCantOpenDatabaseException wrap(android.database.sqlite.SQLiteCantOpenDatabaseException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCantOpenDatabaseException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteCantOpenDatabaseException getReal() {
        return (android.database.sqlite.SQLiteCantOpenDatabaseException) real;
    }

    public android.database.sqlite.SQLiteCantOpenDatabaseException unwrap() {
        return getReal();
    }

    public SQLiteCantOpenDatabaseException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCantOpenDatabaseException#android.database.sqlite.SQLiteCantOpenDatabaseException()");
    }

    public SQLiteCantOpenDatabaseException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCantOpenDatabaseException#android.database.sqlite.SQLiteCantOpenDatabaseException(java.lang.String)");
    }

}
