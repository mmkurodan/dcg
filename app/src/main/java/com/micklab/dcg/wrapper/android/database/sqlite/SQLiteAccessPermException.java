// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteAccessPermException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteAccessPermException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteAccessPermException wrap(android.database.sqlite.SQLiteAccessPermException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteAccessPermException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteAccessPermException getReal() {
        return (android.database.sqlite.SQLiteAccessPermException) real;
    }

    public android.database.sqlite.SQLiteAccessPermException unwrap() {
        return getReal();
    }

    public SQLiteAccessPermException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteAccessPermException#android.database.sqlite.SQLiteAccessPermException()");
    }

    public SQLiteAccessPermException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteAccessPermException#android.database.sqlite.SQLiteAccessPermException(java.lang.String)");
    }

}
