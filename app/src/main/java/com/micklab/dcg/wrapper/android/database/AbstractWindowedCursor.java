// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class AbstractWindowedCursor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbstractWindowedCursor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.AbstractWindowedCursor wrap(android.database.AbstractWindowedCursor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.AbstractWindowedCursor(real, (__DcgwBridgeToken) null);
    }

    public android.database.AbstractWindowedCursor getReal() {
        return (android.database.AbstractWindowedCursor) real;
    }

    public android.database.AbstractWindowedCursor unwrap() {
        return getReal();
    }

    public void copyStringToBuffer(int arg0, com.micklab.dcg.wrapper.android.database.CharArrayBuffer arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#copyStringToBuffer(int,android.database.CharArrayBuffer)");
    }

    public byte[] getBlob(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#getBlob(int)");
    }

    public double getDouble(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#getDouble(int)");
    }

    public float getFloat(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#getFloat(int)");
    }

    public int getInt(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#getInt(int)");
    }

    public long getLong(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#getLong(int)");
    }

    public short getShort(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#getShort(int)");
    }

    public java.lang.String getString(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#getString(int)");
    }

    public int getType(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#getType(int)");
    }

    public com.micklab.dcg.wrapper.android.database.CursorWindow getWindow() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#getWindow()");
    }

    public boolean hasWindow() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#hasWindow()");
    }

    public boolean isBlob(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#isBlob(int)");
    }

    public boolean isFloat(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#isFloat(int)");
    }

    public boolean isLong(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#isLong(int)");
    }

    public boolean isNull(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#isNull(int)");
    }

    public boolean isString(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#isString(int)");
    }

    public void setWindow(com.micklab.dcg.wrapper.android.database.CursorWindow arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.AbstractWindowedCursor#setWindow(android.database.CursorWindow)");
    }


}
