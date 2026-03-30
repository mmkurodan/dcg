// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CrossProcessCursorWrapper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CrossProcessCursorWrapper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CrossProcessCursorWrapper wrap(android.database.CrossProcessCursorWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CrossProcessCursorWrapper(real, (__DcgwBridgeToken) null);
    }

    public android.database.CrossProcessCursorWrapper getReal() {
        return (android.database.CrossProcessCursorWrapper) real;
    }

    public android.database.CrossProcessCursorWrapper unwrap() {
        return getReal();
    }

    public CrossProcessCursorWrapper(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CrossProcessCursorWrapper#android.database.CrossProcessCursorWrapper(android.database.Cursor)");
    }

    public void fillWindow(int arg0, com.micklab.dcg.wrapper.android.database.CursorWindow arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CrossProcessCursorWrapper#fillWindow(int,android.database.CursorWindow)");
    }

    public com.micklab.dcg.wrapper.android.database.CursorWindow getWindow() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CrossProcessCursorWrapper#getWindow()");
    }

    public boolean onMove(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CrossProcessCursorWrapper#onMove(int,int)");
    }

}
