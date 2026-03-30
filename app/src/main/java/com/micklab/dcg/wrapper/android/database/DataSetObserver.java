// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class DataSetObserver {
    private final android.database.DataSetObserver real;

    public DataSetObserver(android.database.DataSetObserver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.DataSetObserver wrap(android.database.DataSetObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.DataSetObserver(real);
    }

    public android.database.DataSetObserver unwrap() {
        return real;
    }

    public void onChanged() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DataSetObserver#onChanged()");
    }

    public void onInvalidated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DataSetObserver#onInvalidated()");
    }

}
