// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.observer;

public final class SchemaChangeInfo {
    private final android.app.appsearch.observer.SchemaChangeInfo real;

    public SchemaChangeInfo(android.app.appsearch.observer.SchemaChangeInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.observer.SchemaChangeInfo wrap(android.app.appsearch.observer.SchemaChangeInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.SchemaChangeInfo(real);
    }

    public android.app.appsearch.observer.SchemaChangeInfo unwrap() {
        return real;
    }

    public SchemaChangeInfo(java.lang.String arg0, java.lang.String arg1, java.util.Set arg2) {
        this(new android.app.appsearch.observer.SchemaChangeInfo(arg0, arg1, arg2));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getDatabaseName() {
        return real.getDatabaseName();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
