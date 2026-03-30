// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class DataSetObservable {
    private final android.database.DataSetObservable real;

    public DataSetObservable(android.database.DataSetObservable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.DataSetObservable wrap(android.database.DataSetObservable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.DataSetObservable(real);
    }

    public android.database.DataSetObservable unwrap() {
        return real;
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
