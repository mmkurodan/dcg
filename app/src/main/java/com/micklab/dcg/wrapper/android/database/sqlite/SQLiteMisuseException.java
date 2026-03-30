// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteMisuseException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SQLiteMisuseException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteMisuseException wrap(android.database.sqlite.SQLiteMisuseException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteMisuseException(real, (__DcgwBridgeToken) null);
    }

    public android.database.sqlite.SQLiteMisuseException getReal() {
        return (android.database.sqlite.SQLiteMisuseException) real;
    }

    public android.database.sqlite.SQLiteMisuseException unwrap() {
        return getReal();
    }

    public SQLiteMisuseException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteMisuseException#android.database.sqlite.SQLiteMisuseException()");
    }

    public SQLiteMisuseException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteMisuseException#android.database.sqlite.SQLiteMisuseException(java.lang.String)");
    }

}
