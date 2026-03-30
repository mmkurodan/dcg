// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteClosable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteClosable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteClosable wrap(android.database.sqlite.SQLiteClosable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteClosable(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteClosable getReal() {
        return (android.database.sqlite.SQLiteClosable) real;
    }

    public android.database.sqlite.SQLiteClosable unwrap() {
        return getReal();
    }

    public void acquireReference() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteClosable#acquireReference()");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteClosable#close()");
    }

    public void releaseReference() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteClosable#releaseReference()");
    }

    public void releaseReferenceFromContainer() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteClosable#releaseReferenceFromContainer()");
    }

}
