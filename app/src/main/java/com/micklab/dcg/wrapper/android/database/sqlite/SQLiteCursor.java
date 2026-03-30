// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteCursor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteCursor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCursor wrap(android.database.sqlite.SQLiteCursor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCursor(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteCursor getReal() {
        return (android.database.sqlite.SQLiteCursor) real;
    }

    public android.database.sqlite.SQLiteCursor unwrap() {
        return getReal();
    }

    public SQLiteCursor(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCursorDriver arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteQuery arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#android.database.sqlite.SQLiteCursor(android.database.sqlite.SQLiteCursorDriver,java.lang.String,android.database.sqlite.SQLiteQuery)");
    }

    public SQLiteCursor(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCursorDriver arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteQuery arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#android.database.sqlite.SQLiteCursor(android.database.sqlite.SQLiteDatabase,android.database.sqlite.SQLiteCursorDriver,java.lang.String,android.database.sqlite.SQLiteQuery)");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#close()");
    }

    public void deactivate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#deactivate()");
    }

    public int getColumnIndex(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#getColumnIndex(java.lang.String)");
    }

    public java.lang.String[] getColumnNames() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#getColumnNames()");
    }

    public int getCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#getCount()");
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase getDatabase() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#getDatabase()");
    }

    public boolean onMove(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#onMove(int,int)");
    }

    public boolean requery() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#requery()");
    }

    public void setFillWindowForwardOnly(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#setFillWindowForwardOnly(boolean)");
    }

    public void setSelectionArguments(java.lang.String[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#setSelectionArguments([Ljava.lang.String;)");
    }

    public void setWindow(com.micklab.dcg.wrapper.android.database.CursorWindow arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCursor#setWindow(android.database.CursorWindow)");
    }

}
