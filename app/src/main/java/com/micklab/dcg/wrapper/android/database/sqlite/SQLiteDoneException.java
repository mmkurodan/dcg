// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDoneException {
    private final android.database.sqlite.SQLiteDoneException real;

    public SQLiteDoneException(android.database.sqlite.SQLiteDoneException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDoneException wrap(android.database.sqlite.SQLiteDoneException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDoneException(real);
    }

    public android.database.sqlite.SQLiteDoneException unwrap() {
        return real;
    }

    public SQLiteDoneException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDoneException#android.database.sqlite.SQLiteDoneException()");
    }

    public SQLiteDoneException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDoneException#android.database.sqlite.SQLiteDoneException(java.lang.String)");
    }

}
