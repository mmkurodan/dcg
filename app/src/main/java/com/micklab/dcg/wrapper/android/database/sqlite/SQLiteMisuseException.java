// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteMisuseException {
    private final android.database.sqlite.SQLiteMisuseException real;

    public SQLiteMisuseException(android.database.sqlite.SQLiteMisuseException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteMisuseException wrap(android.database.sqlite.SQLiteMisuseException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteMisuseException(real);
    }

    public android.database.sqlite.SQLiteMisuseException unwrap() {
        return real;
    }

    public SQLiteMisuseException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteMisuseException#android.database.sqlite.SQLiteMisuseException()");
    }

    public SQLiteMisuseException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteMisuseException#android.database.sqlite.SQLiteMisuseException(java.lang.String)");
    }

}
