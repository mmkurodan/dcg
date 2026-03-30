// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteOpenHelper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteOpenHelper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteOpenHelper wrap(android.database.sqlite.SQLiteOpenHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteOpenHelper(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteOpenHelper getReal() {
        return (android.database.sqlite.SQLiteOpenHelper) real;
    }

    public android.database.sqlite.SQLiteOpenHelper unwrap() {
        return getReal();
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#close()");
    }

    public java.lang.String getDatabaseName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#getDatabaseName()");
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#getReadableDatabase()");
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#getWritableDatabase()");
    }

    public void onConfigure(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#onConfigure(android.database.sqlite.SQLiteDatabase)");
    }

    public void onCreate(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase)");
    }

    public void onDowngrade(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#onDowngrade(android.database.sqlite.SQLiteDatabase,int,int)");
    }

    public void onOpen(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#onOpen(android.database.sqlite.SQLiteDatabase)");
    }

    public void onUpgrade(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite.SQLiteDatabase,int,int)");
    }

    public void setIdleConnectionTimeout(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#setIdleConnectionTimeout(long)");
    }

    public void setLookasideConfig(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#setLookasideConfig(int,int)");
    }

    public void setOpenParams(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.OpenParams arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#setOpenParams(android.database.sqlite.SQLiteDatabase$OpenParams)");
    }

    public void setWriteAheadLoggingEnabled(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOpenHelper#setWriteAheadLoggingEnabled(boolean)");
    }

}
