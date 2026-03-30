// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class DatabaseErrorHandler {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DatabaseErrorHandler(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler wrap(android.database.DatabaseErrorHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler(real, (__DcgwBridgeToken) null);
    }

    public android.database.DatabaseErrorHandler getReal() {
        return (android.database.DatabaseErrorHandler) real;
    }

    public android.database.DatabaseErrorHandler unwrap() {
        return getReal();
    }

    public void onCorruption(com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DatabaseErrorHandler#onCorruption(android.database.sqlite.SQLiteDatabase)");
    }

}
