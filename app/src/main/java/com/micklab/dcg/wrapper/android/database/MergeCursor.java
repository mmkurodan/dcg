// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class MergeCursor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MergeCursor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.MergeCursor wrap(android.database.MergeCursor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.MergeCursor(real, (__DcgwBridgeToken) null);
    }

    public android.database.MergeCursor getReal() {
        return (android.database.MergeCursor) real;
    }

    public android.database.MergeCursor unwrap() {
        return getReal();
    }

    public MergeCursor(android.database.Cursor[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#android.database.MergeCursor([Landroid.database.Cursor;)");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#close()");
    }

    public void deactivate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#deactivate()");
    }

    public byte[] getBlob(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getBlob(int)");
    }

    public java.lang.String[] getColumnNames() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getColumnNames()");
    }

    public int getCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getCount()");
    }

    public double getDouble(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getDouble(int)");
    }

    public float getFloat(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getFloat(int)");
    }

    public int getInt(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getInt(int)");
    }

    public long getLong(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getLong(int)");
    }

    public short getShort(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getShort(int)");
    }

    public java.lang.String getString(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getString(int)");
    }

    public int getType(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#getType(int)");
    }

    public boolean isNull(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#isNull(int)");
    }

    public boolean onMove(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#onMove(int,int)");
    }

    public void registerContentObserver(com.micklab.dcg.wrapper.android.database.ContentObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#registerContentObserver(android.database.ContentObserver)");
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#registerDataSetObserver(android.database.DataSetObserver)");
    }

    public boolean requery() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#requery()");
    }

    public void unregisterContentObserver(com.micklab.dcg.wrapper.android.database.ContentObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#unregisterContentObserver(android.database.ContentObserver)");
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.MergeCursor#unregisterDataSetObserver(android.database.DataSetObserver)");
    }

}
