// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CrossProcessCursorWrapper {
    private final android.database.CrossProcessCursorWrapper real;

    public CrossProcessCursorWrapper(android.database.CrossProcessCursorWrapper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CrossProcessCursorWrapper wrap(android.database.CrossProcessCursorWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CrossProcessCursorWrapper(real);
    }

    public android.database.CrossProcessCursorWrapper unwrap() {
        return real;
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
