// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class DefaultDatabaseErrorHandler {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DefaultDatabaseErrorHandler(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.DefaultDatabaseErrorHandler wrap(android.database.DefaultDatabaseErrorHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.DefaultDatabaseErrorHandler(real, (__DcgwBridgeToken) null);
    }

    public android.database.DefaultDatabaseErrorHandler getReal() {
        return (android.database.DefaultDatabaseErrorHandler) real;
    }

    public android.database.DefaultDatabaseErrorHandler unwrap() {
        return getReal();
    }

    public DefaultDatabaseErrorHandler() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DefaultDatabaseErrorHandler#android.database.DefaultDatabaseErrorHandler()");
    }

    public void onCorruption(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DefaultDatabaseErrorHandler#onCorruption(android.database.sqlite.SQLiteDatabase)");
    }

}
