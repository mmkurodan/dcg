// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CursorWindowAllocationException {
    private final android.database.CursorWindowAllocationException real;

    public CursorWindowAllocationException(android.database.CursorWindowAllocationException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CursorWindowAllocationException wrap(android.database.CursorWindowAllocationException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CursorWindowAllocationException(real);
    }

    public android.database.CursorWindowAllocationException unwrap() {
        return real;
    }

    public CursorWindowAllocationException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorWindowAllocationException#android.database.CursorWindowAllocationException(java.lang.String)");
    }

}
