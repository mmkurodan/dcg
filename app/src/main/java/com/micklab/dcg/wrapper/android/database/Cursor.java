// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class Cursor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Cursor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.Cursor wrap(android.database.Cursor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.Cursor(real, (__DcgwBridgeToken) null);
    }

    public android.database.Cursor getReal() {
        return (android.database.Cursor) real;
    }

    public android.database.Cursor unwrap() {
        return getReal();
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#close()");
    }

    public void copyStringToBuffer(int arg0, com.micklab.dcg.wrapper.android.database.CharArrayBuffer arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#copyStringToBuffer(int,android.database.CharArrayBuffer)");
    }

    public void deactivate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#deactivate()");
    }

    public byte[] getBlob(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getBlob(int)");
    }

    public int getColumnCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getColumnCount()");
    }

    public int getColumnIndex(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getColumnIndex(java.lang.String)");
    }

    public int getColumnIndexOrThrow(java.lang.String arg0) throws java.lang.IllegalArgumentException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getColumnIndexOrThrow(java.lang.String)");
    }

    public java.lang.String getColumnName(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getColumnName(int)");
    }

    public java.lang.String[] getColumnNames() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getColumnNames()");
    }

    public int getCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getCount()");
    }

    public double getDouble(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getDouble(int)");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getExtras()");
    }

    public float getFloat(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getFloat(int)");
    }

    public int getInt(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getInt(int)");
    }

    public long getLong(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getLong(int)");
    }

    public com.micklab.dcg.wrapper.android.net.Uri getNotificationUri() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getNotificationUri()");
    }

    public int getPosition() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getPosition()");
    }

    public short getShort(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getShort(int)");
    }

    public java.lang.String getString(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getString(int)");
    }

    public int getType(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getType(int)");
    }

    public boolean getWantsAllOnMoveCalls() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#getWantsAllOnMoveCalls()");
    }

    public boolean isAfterLast() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#isAfterLast()");
    }

    public boolean isBeforeFirst() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#isBeforeFirst()");
    }

    public boolean isClosed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#isClosed()");
    }

    public boolean isFirst() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#isFirst()");
    }

    public boolean isLast() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#isLast()");
    }

    public boolean isNull(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#isNull(int)");
    }

    public boolean move(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#move(int)");
    }

    public boolean moveToFirst() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#moveToFirst()");
    }

    public boolean moveToLast() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#moveToLast()");
    }

    public boolean moveToNext() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#moveToNext()");
    }

    public boolean moveToPosition(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#moveToPosition(int)");
    }

    public boolean moveToPrevious() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#moveToPrevious()");
    }

    public void registerContentObserver(com.micklab.dcg.wrapper.android.database.ContentObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#registerContentObserver(android.database.ContentObserver)");
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#registerDataSetObserver(android.database.DataSetObserver)");
    }

    public boolean requery() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#requery()");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle respond(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#respond(android.os.Bundle)");
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#setExtras(android.os.Bundle)");
    }

    public void setNotificationUri(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#setNotificationUri(android.content.ContentResolver,android.net.Uri)");
    }

    public void unregisterContentObserver(com.micklab.dcg.wrapper.android.database.ContentObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#unregisterContentObserver(android.database.ContentObserver)");
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Cursor#unregisterDataSetObserver(android.database.DataSetObserver)");
    }


}
