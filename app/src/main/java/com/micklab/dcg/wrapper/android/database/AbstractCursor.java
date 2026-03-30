// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class AbstractCursor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbstractCursor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.AbstractCursor wrap(android.database.AbstractCursor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.AbstractCursor(real, (__DcgwBridgeToken) null);
    }

    public android.database.AbstractCursor getReal() {
        return (android.database.AbstractCursor) real;
    }

    public android.database.AbstractCursor unwrap() {
        return getReal();
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#close()");
    }

    public void copyStringToBuffer(int arg0, com.micklab.dcg.wrapper.android.database.CharArrayBuffer arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#copyStringToBuffer(int,android.database.CharArrayBuffer)");
    }

    public void deactivate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#deactivate()");
    }

    public void fillWindow(int arg0, com.micklab.dcg.wrapper.android.database.CursorWindow arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#fillWindow(int,android.database.CursorWindow)");
    }

    public byte[] getBlob(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getBlob(int)");
    }

    public int getColumnCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getColumnCount()");
    }

    public int getColumnIndex(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getColumnIndex(java.lang.String)");
    }

    public int getColumnIndexOrThrow(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getColumnIndexOrThrow(java.lang.String)");
    }

    public java.lang.String getColumnName(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getColumnName(int)");
    }

    public java.lang.String[] getColumnNames() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getColumnNames()");
    }

    public int getCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getCount()");
    }

    public double getDouble(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getDouble(int)");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getExtras()");
    }

    public float getFloat(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getFloat(int)");
    }

    public int getInt(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getInt(int)");
    }

    public long getLong(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getLong(int)");
    }

    public com.micklab.dcg.wrapper.android.net.Uri getNotificationUri() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getNotificationUri()");
    }

    public int getPosition() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getPosition()");
    }

    public short getShort(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getShort(int)");
    }

    public java.lang.String getString(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getString(int)");
    }

    public int getType(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getType(int)");
    }

    public boolean getWantsAllOnMoveCalls() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getWantsAllOnMoveCalls()");
    }

    public com.micklab.dcg.wrapper.android.database.CursorWindow getWindow() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#getWindow()");
    }

    public boolean isAfterLast() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#isAfterLast()");
    }

    public boolean isBeforeFirst() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#isBeforeFirst()");
    }

    public boolean isClosed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#isClosed()");
    }

    public boolean isFirst() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#isFirst()");
    }

    public boolean isLast() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#isLast()");
    }

    public boolean isNull(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#isNull(int)");
    }

    public boolean move(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#move(int)");
    }

    public boolean moveToFirst() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#moveToFirst()");
    }

    public boolean moveToLast() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#moveToLast()");
    }

    public boolean moveToNext() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#moveToNext()");
    }

    public boolean moveToPosition(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#moveToPosition(int)");
    }

    public boolean moveToPrevious() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#moveToPrevious()");
    }

    public boolean onMove(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#onMove(int,int)");
    }

    public void registerContentObserver(com.micklab.dcg.wrapper.android.database.ContentObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#registerContentObserver(android.database.ContentObserver)");
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#registerDataSetObserver(android.database.DataSetObserver)");
    }

    public boolean requery() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#requery()");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle respond(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#respond(android.os.Bundle)");
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#setExtras(android.os.Bundle)");
    }

    public void setNotificationUri(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#setNotificationUri(android.content.ContentResolver,android.net.Uri)");
    }

    public void unregisterContentObserver(com.micklab.dcg.wrapper.android.database.ContentObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#unregisterContentObserver(android.database.ContentObserver)");
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractCursor#unregisterDataSetObserver(android.database.DataSetObserver)");
    }


}
