// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CharArrayBuffer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CharArrayBuffer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CharArrayBuffer wrap(android.database.CharArrayBuffer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CharArrayBuffer(real, (__DcgwBridgeToken) null);
    }

    public android.database.CharArrayBuffer getReal() {
        return (android.database.CharArrayBuffer) real;
    }

    public android.database.CharArrayBuffer unwrap() {
        return getReal();
    }

    public CharArrayBuffer(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CharArrayBuffer#android.database.CharArrayBuffer(int)");
    }

    public CharArrayBuffer(char[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CharArrayBuffer#android.database.CharArrayBuffer([C)");
    }


}
