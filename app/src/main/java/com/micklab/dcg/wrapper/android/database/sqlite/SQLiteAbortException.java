// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteAbortException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteAbortException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteAbortException wrap(android.database.sqlite.SQLiteAbortException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteAbortException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteAbortException getReal() {
        return (android.database.sqlite.SQLiteAbortException) real;
    }

    public android.database.sqlite.SQLiteAbortException unwrap() {
        return getReal();
    }

    public SQLiteAbortException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteAbortException#android.database.sqlite.SQLiteAbortException()");
    }

    public SQLiteAbortException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteAbortException#android.database.sqlite.SQLiteAbortException(java.lang.String)");
    }

}
