// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDiskIOException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteDiskIOException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDiskIOException wrap(android.database.sqlite.SQLiteDiskIOException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDiskIOException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteDiskIOException getReal() {
        return (android.database.sqlite.SQLiteDiskIOException) real;
    }

    public android.database.sqlite.SQLiteDiskIOException unwrap() {
        return getReal();
    }

    public SQLiteDiskIOException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDiskIOException#android.database.sqlite.SQLiteDiskIOException()");
    }

    public SQLiteDiskIOException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDiskIOException#android.database.sqlite.SQLiteDiskIOException(java.lang.String)");
    }

}
