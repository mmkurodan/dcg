// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CursorIndexOutOfBoundsException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CursorIndexOutOfBoundsException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CursorIndexOutOfBoundsException wrap(android.database.CursorIndexOutOfBoundsException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CursorIndexOutOfBoundsException(real, (__DcgwBridgeToken) null);
    }

    public android.database.CursorIndexOutOfBoundsException getReal() {
        return (android.database.CursorIndexOutOfBoundsException) real;
    }

    public android.database.CursorIndexOutOfBoundsException unwrap() {
        return getReal();
    }

    public CursorIndexOutOfBoundsException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorIndexOutOfBoundsException#android.database.CursorIndexOutOfBoundsException(java.lang.String)");
    }

    public CursorIndexOutOfBoundsException(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CursorIndexOutOfBoundsException#android.database.CursorIndexOutOfBoundsException(int,int)");
    }

}
