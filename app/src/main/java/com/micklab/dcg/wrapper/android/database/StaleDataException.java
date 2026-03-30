// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class StaleDataException {
    private final android.database.StaleDataException real;

    public StaleDataException(android.database.StaleDataException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.StaleDataException wrap(android.database.StaleDataException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.StaleDataException(real);
    }

    public android.database.StaleDataException unwrap() {
        return real;
    }

    public StaleDataException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.StaleDataException#android.database.StaleDataException()");
    }

    public StaleDataException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.StaleDataException#android.database.StaleDataException(java.lang.String)");
    }

}
