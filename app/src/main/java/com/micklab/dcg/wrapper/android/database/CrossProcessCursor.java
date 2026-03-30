// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CrossProcessCursor {
    private final android.database.CrossProcessCursor real;

    public CrossProcessCursor(android.database.CrossProcessCursor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CrossProcessCursor wrap(android.database.CrossProcessCursor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CrossProcessCursor(real);
    }

    public android.database.CrossProcessCursor unwrap() {
        return real;
    }

    public void fillWindow(int arg0, com.micklab.dcg.wrapper.android.database.CursorWindow arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CrossProcessCursor#fillWindow(int,android.database.CursorWindow)");
    }

    public com.micklab.dcg.wrapper.android.database.CursorWindow getWindow() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CrossProcessCursor#getWindow()");
    }

    public boolean onMove(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CrossProcessCursor#onMove(int,int)");
    }

}
