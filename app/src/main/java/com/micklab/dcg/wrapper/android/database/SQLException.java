// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class SQLException {
    private final android.database.SQLException real;

    public SQLException(android.database.SQLException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.SQLException wrap(android.database.SQLException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.SQLException(real);
    }

    public android.database.SQLException unwrap() {
        return real;
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
