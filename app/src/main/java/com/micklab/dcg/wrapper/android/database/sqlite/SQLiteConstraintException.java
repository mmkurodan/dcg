// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteConstraintException {
    private final android.database.sqlite.SQLiteConstraintException real;

    public SQLiteConstraintException(android.database.sqlite.SQLiteConstraintException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteConstraintException wrap(android.database.sqlite.SQLiteConstraintException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteConstraintException(real);
    }

    public android.database.sqlite.SQLiteConstraintException unwrap() {
        return real;
    }

    public SQLiteConstraintException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteConstraintException#android.database.sqlite.SQLiteConstraintException()");
    }

    public SQLiteConstraintException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteConstraintException#android.database.sqlite.SQLiteConstraintException(java.lang.String)");
    }

}
