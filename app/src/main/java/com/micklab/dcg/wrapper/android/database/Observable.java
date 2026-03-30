// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class Observable {
    private final android.database.Observable real;

    public Observable(android.database.Observable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.Observable wrap(android.database.Observable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.Observable(real);
    }

    public android.database.Observable unwrap() {
        return real;
    }

    public void registerObserver(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Observable#registerObserver(java.lang.Object)");
    }

    public void unregisterAll() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Observable#unregisterAll()");
    }

    public void unregisterObserver(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.Observable#unregisterObserver(java.lang.Object)");
    }


}
