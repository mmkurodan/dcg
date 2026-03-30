// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteProgram {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteProgram(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteProgram wrap(android.database.sqlite.SQLiteProgram real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteProgram(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteProgram getReal() {
        return (android.database.sqlite.SQLiteProgram) real;
    }

    public android.database.sqlite.SQLiteProgram unwrap() {
        return getReal();
    }

    public void bindAllArgsAsStrings(java.lang.String[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteProgram#bindAllArgsAsStrings([Ljava.lang.String;)");
    }

    public void bindBlob(int arg0, byte[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteProgram#bindBlob(int,[B)");
    }

    public void bindDouble(int arg0, double arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteProgram#bindDouble(int,double)");
    }

    public void bindLong(int arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteProgram#bindLong(int,long)");
    }

    public void bindNull(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteProgram#bindNull(int)");
    }

    public void bindString(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteProgram#bindString(int,java.lang.String)");
    }

    public void clearBindings() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteProgram#clearBindings()");
    }

    public int getUniqueId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteProgram#getUniqueId()");
    }

}
