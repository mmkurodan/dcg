// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteOutOfMemoryException {
    private final android.database.sqlite.SQLiteOutOfMemoryException real;

    public SQLiteOutOfMemoryException(android.database.sqlite.SQLiteOutOfMemoryException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteOutOfMemoryException wrap(android.database.sqlite.SQLiteOutOfMemoryException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteOutOfMemoryException(real);
    }

    public android.database.sqlite.SQLiteOutOfMemoryException unwrap() {
        return real;
    }

    public SQLiteOutOfMemoryException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOutOfMemoryException#android.database.sqlite.SQLiteOutOfMemoryException()");
    }

    public SQLiteOutOfMemoryException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteOutOfMemoryException#android.database.sqlite.SQLiteOutOfMemoryException(java.lang.String)");
    }

}
