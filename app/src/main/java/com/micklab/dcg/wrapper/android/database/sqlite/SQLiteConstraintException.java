// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteConstraintException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteConstraintException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteConstraintException wrap(android.database.sqlite.SQLiteConstraintException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteConstraintException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteConstraintException getReal() {
        return (android.database.sqlite.SQLiteConstraintException) real;
    }

    public android.database.sqlite.SQLiteConstraintException unwrap() {
        return getReal();
    }

    public SQLiteConstraintException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteConstraintException#android.database.sqlite.SQLiteConstraintException()");
    }

    public SQLiteConstraintException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteConstraintException#android.database.sqlite.SQLiteConstraintException(java.lang.String)");
    }

}
