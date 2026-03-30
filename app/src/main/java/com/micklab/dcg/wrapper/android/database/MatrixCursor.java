// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class MatrixCursor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MatrixCursor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.MatrixCursor wrap(android.database.MatrixCursor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.MatrixCursor(real, (__DcgwBridgeToken) null);
    }

    public android.database.MatrixCursor getReal() {
        return (android.database.MatrixCursor) real;
    }

    public android.database.MatrixCursor unwrap() {
        return getReal();
    }

    public MatrixCursor(java.lang.String[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#android.database.MatrixCursor([Ljava.lang.String;)");
    }

    public MatrixCursor(java.lang.String[] arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#android.database.MatrixCursor([Ljava.lang.String;,int)");
    }

    public void addRow(java.lang.Object[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#addRow([Ljava.lang.Object;)");
    }

    public byte[] getBlob(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getBlob(int)");
    }

    public java.lang.String[] getColumnNames() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getColumnNames()");
    }

    public int getCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getCount()");
    }

    public double getDouble(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getDouble(int)");
    }

    public float getFloat(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getFloat(int)");
    }

    public int getInt(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getInt(int)");
    }

    public long getLong(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getLong(int)");
    }

    public short getShort(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getShort(int)");
    }

    public java.lang.String getString(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getString(int)");
    }

    public int getType(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#getType(int)");
    }

    public boolean isNull(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#isNull(int)");
    }

    public android.database.MatrixCursor.RowBuilder newRow() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MatrixCursor#newRow()");
    }

}
