// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDatatypeMismatchException {
    private final android.database.sqlite.SQLiteDatatypeMismatchException real;

    public SQLiteDatatypeMismatchException(android.database.sqlite.SQLiteDatatypeMismatchException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatatypeMismatchException wrap(android.database.sqlite.SQLiteDatatypeMismatchException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatatypeMismatchException(real);
    }

    public android.database.sqlite.SQLiteDatatypeMismatchException unwrap() {
        return real;
    }

    public SQLiteDatatypeMismatchException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatatypeMismatchException#android.database.sqlite.SQLiteDatatypeMismatchException()");
    }

    public SQLiteDatatypeMismatchException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDatatypeMismatchException#android.database.sqlite.SQLiteDatatypeMismatchException(java.lang.String)");
    }

}
