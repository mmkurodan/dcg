// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteStatement {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteStatement(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteStatement wrap(android.database.sqlite.SQLiteStatement real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteStatement(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteStatement getReal() {
        return (android.database.sqlite.SQLiteStatement) real;
    }

    public android.database.sqlite.SQLiteStatement unwrap() {
        return getReal();
    }

    public void execute() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteStatement#execute()");
    }

    public long executeInsert() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteStatement#executeInsert()");
    }

    public int executeUpdateDelete() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteStatement#executeUpdateDelete()");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor simpleQueryForBlobFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteStatement#simpleQueryForBlobFileDescriptor()");
    }

    public long simpleQueryForLong() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteStatement#simpleQueryForLong()");
    }

    public java.lang.String simpleQueryForString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteStatement#simpleQueryForString()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteStatement#toString()");
    }

}
