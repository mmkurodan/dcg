// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDatatypeMismatchException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteDatatypeMismatchException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatatypeMismatchException wrap(android.database.sqlite.SQLiteDatatypeMismatchException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatatypeMismatchException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteDatatypeMismatchException getReal() {
        return (android.database.sqlite.SQLiteDatatypeMismatchException) real;
    }

    public android.database.sqlite.SQLiteDatatypeMismatchException unwrap() {
        return getReal();
    }

    public SQLiteDatatypeMismatchException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatatypeMismatchException#android.database.sqlite.SQLiteDatatypeMismatchException()");
    }

    public SQLiteDatatypeMismatchException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatatypeMismatchException#android.database.sqlite.SQLiteDatatypeMismatchException(java.lang.String)");
    }

}
