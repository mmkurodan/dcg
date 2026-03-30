// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class SQLException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.SQLException wrap(android.database.SQLException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.SQLException(real, (__DcgwBridgeToken) null);
    }

    public android.database.SQLException getReal() {
        return (android.database.SQLException) real;
    }

    public android.database.SQLException unwrap() {
        return getReal();
    }

    public SQLException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.SQLException#android.database.SQLException()");
    }

    public SQLException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.SQLException#android.database.SQLException(java.lang.String)");
    }

    public SQLException(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.SQLException#android.database.SQLException(java.lang.String,java.lang.Throwable)");
    }

}
