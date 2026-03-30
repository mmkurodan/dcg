// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteCursorDriver {
    private final android.database.sqlite.SQLiteCursorDriver real;

    public SQLiteCursorDriver(android.database.sqlite.SQLiteCursorDriver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCursorDriver wrap(android.database.sqlite.SQLiteCursorDriver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCursorDriver(real);
    }

    public android.database.sqlite.SQLiteCursorDriver unwrap() {
        return real;
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
