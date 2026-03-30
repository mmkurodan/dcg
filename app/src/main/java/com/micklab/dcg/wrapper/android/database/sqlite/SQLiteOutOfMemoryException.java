// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteOutOfMemoryException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteOutOfMemoryException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteOutOfMemoryException wrap(android.database.sqlite.SQLiteOutOfMemoryException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteOutOfMemoryException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteOutOfMemoryException getReal() {
        return (android.database.sqlite.SQLiteOutOfMemoryException) real;
    }

    public android.database.sqlite.SQLiteOutOfMemoryException unwrap() {
        return getReal();
    }

    public SQLiteOutOfMemoryException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOutOfMemoryException#android.database.sqlite.SQLiteOutOfMemoryException()");
    }

    public SQLiteOutOfMemoryException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOutOfMemoryException#android.database.sqlite.SQLiteOutOfMemoryException(java.lang.String)");
    }

}
