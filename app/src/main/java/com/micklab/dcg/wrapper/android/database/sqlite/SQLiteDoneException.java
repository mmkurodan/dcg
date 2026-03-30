// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDoneException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteDoneException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDoneException wrap(android.database.sqlite.SQLiteDoneException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDoneException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteDoneException getReal() {
        return (android.database.sqlite.SQLiteDoneException) real;
    }

    public android.database.sqlite.SQLiteDoneException unwrap() {
        return getReal();
    }

    public SQLiteDoneException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDoneException#android.database.sqlite.SQLiteDoneException()");
    }

    public SQLiteDoneException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDoneException#android.database.sqlite.SQLiteDoneException(java.lang.String)");
    }

}
