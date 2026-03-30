// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class Observable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Observable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.Observable wrap(android.database.Observable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.Observable(real, (__DcgwBridgeToken) null);
    }

    public android.database.Observable getReal() {
        return (android.database.Observable) real;
    }

    public android.database.Observable unwrap() {
        return getReal();
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
