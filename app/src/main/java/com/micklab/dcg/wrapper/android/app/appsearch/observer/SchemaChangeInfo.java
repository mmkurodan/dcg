// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.observer;

public final class SchemaChangeInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SchemaChangeInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.observer.SchemaChangeInfo wrap(android.app.appsearch.observer.SchemaChangeInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.SchemaChangeInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.observer.SchemaChangeInfo getReal() {
        return (android.app.appsearch.observer.SchemaChangeInfo) real;
    }

    public android.app.appsearch.observer.SchemaChangeInfo unwrap() {
        return getReal();
    }

    public SchemaChangeInfo(java.lang.String arg0, java.lang.String arg1, java.util.Set arg2) {
        this(new android.app.appsearch.observer.SchemaChangeInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.observer.SchemaChangeInfo) real).equals(arg0);
    }

    public java.lang.String getDatabaseName() {
        return ((android.app.appsearch.observer.SchemaChangeInfo) real).getDatabaseName();
    }

    public java.lang.String getPackageName() {
        return ((android.app.appsearch.observer.SchemaChangeInfo) real).getPackageName();
    }

    public int hashCode() {
        return ((android.app.appsearch.observer.SchemaChangeInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.appsearch.observer.SchemaChangeInfo) real).toString();
    }

}
