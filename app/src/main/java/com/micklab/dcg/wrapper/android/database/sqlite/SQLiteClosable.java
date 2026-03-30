// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteClosable {
    private final android.database.sqlite.SQLiteClosable real;

    public SQLiteClosable(android.database.sqlite.SQLiteClosable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteClosable wrap(android.database.sqlite.SQLiteClosable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteClosable(real);
    }

    public android.database.sqlite.SQLiteClosable unwrap() {
        return real;
    }

    public void acquireReference() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteClosable#acquireReference()");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteClosable#close()");
    }

    public void releaseReference() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteClosable#releaseReference()");
    }

    public void releaseReferenceFromContainer() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteClosable#releaseReferenceFromContainer()");
    }

}
