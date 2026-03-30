// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CursorWindowAllocationException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CursorWindowAllocationException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CursorWindowAllocationException wrap(android.database.CursorWindowAllocationException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CursorWindowAllocationException(real, (__DcgwBridgeToken) null);
    }

    public android.database.CursorWindowAllocationException getReal() {
        return (android.database.CursorWindowAllocationException) real;
    }

    public android.database.CursorWindowAllocationException unwrap() {
        return getReal();
    }

    public CursorWindowAllocationException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorWindowAllocationException#android.database.CursorWindowAllocationException(java.lang.String)");
    }

}
