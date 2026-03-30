// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class DataSetObserver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DataSetObserver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.DataSetObserver wrap(android.database.DataSetObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.DataSetObserver(real, (__DcgwBridgeToken) null);
    }

    public android.database.DataSetObserver getReal() {
        return (android.database.DataSetObserver) real;
    }

    public android.database.DataSetObserver unwrap() {
        return getReal();
    }

    public void onChanged() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DataSetObserver#onChanged()");
    }

    public void onInvalidated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.DataSetObserver#onInvalidated()");
    }

}
