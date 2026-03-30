// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteCantOpenDatabaseException {
    private final android.database.sqlite.SQLiteCantOpenDatabaseException real;

    public SQLiteCantOpenDatabaseException(android.database.sqlite.SQLiteCantOpenDatabaseException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCantOpenDatabaseException wrap(android.database.sqlite.SQLiteCantOpenDatabaseException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteCantOpenDatabaseException(real);
    }

    public android.database.sqlite.SQLiteCantOpenDatabaseException unwrap() {
        return real;
    }

    public SQLiteCantOpenDatabaseException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCantOpenDatabaseException#android.database.sqlite.SQLiteCantOpenDatabaseException()");
    }

    public SQLiteCantOpenDatabaseException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteCantOpenDatabaseException#android.database.sqlite.SQLiteCantOpenDatabaseException(java.lang.String)");
    }

}
