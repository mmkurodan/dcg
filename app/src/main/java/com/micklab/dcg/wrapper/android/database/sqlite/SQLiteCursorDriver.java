// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteCursorDriver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteCursorDriver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCursorDriver wrap(android.database.sqlite.SQLiteCursorDriver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCursorDriver(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteCursorDriver getReal() {
        return (android.database.sqlite.SQLiteCursorDriver) real;
    }

    public android.database.sqlite.SQLiteCursorDriver unwrap() {
        return getReal();
    }

    public void cursorClosed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursorDriver#cursorClosed()");
    }

    public void cursorDeactivated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursorDriver#cursorDeactivated()");
    }

    public void cursorRequeried(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursorDriver#cursorRequeried(android.database.Cursor)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg0, java.lang.String[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursorDriver#query(android.database.sqlite.SQLiteDatabase$CursorFactory,[Ljava.lang.String;)");
    }

    public void setBindArguments(java.lang.String[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursorDriver#setBindArguments([Ljava.lang.String;)");
    }

}
