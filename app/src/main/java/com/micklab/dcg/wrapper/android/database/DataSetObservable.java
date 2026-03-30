// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class DataSetObservable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DataSetObservable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.DataSetObservable wrap(android.database.DataSetObservable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.DataSetObservable(real, (__DcgwBridgeToken) null);
    }

    public android.database.DataSetObservable getReal() {
        return (android.database.DataSetObservable) real;
    }

    public android.database.DataSetObservable unwrap() {
        return getReal();
    }

    public DataSetObservable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DataSetObservable#android.database.DataSetObservable()");
    }

    public void notifyChanged() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DataSetObservable#notifyChanged()");
    }

    public void notifyInvalidated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DataSetObservable#notifyInvalidated()");
    }

}
