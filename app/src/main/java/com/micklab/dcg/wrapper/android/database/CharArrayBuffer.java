// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class CharArrayBuffer {
    private final android.database.CharArrayBuffer real;

    public CharArrayBuffer(android.database.CharArrayBuffer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.CharArrayBuffer wrap(android.database.CharArrayBuffer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.CharArrayBuffer(real);
    }

    public android.database.CharArrayBuffer unwrap() {
        return real;
    }

    public CharArrayBuffer(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CharArrayBuffer#android.database.CharArrayBuffer(int)");
    }

    public CharArrayBuffer(char[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.CharArrayBuffer#android.database.CharArrayBuffer([C)");
    }


}
