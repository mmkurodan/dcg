// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.observer;

public final class DocumentChangeInfo {
    private final android.app.appsearch.observer.DocumentChangeInfo real;

    public DocumentChangeInfo(android.app.appsearch.observer.DocumentChangeInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.observer.DocumentChangeInfo wrap(android.app.appsearch.observer.DocumentChangeInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.DocumentChangeInfo(real);
    }

    public android.app.appsearch.observer.DocumentChangeInfo unwrap() {
        return real;
    }

    public DocumentChangeInfo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.util.Set arg4) {
        this(new android.app.appsearch.observer.DocumentChangeInfo(arg0, arg1, arg2, arg3, arg4));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getDatabaseName() {
        return real.getDatabaseName();
    }

    public java.lang.String getNamespace() {
        return real.getNamespace();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public java.lang.String getSchemaName() {
        return real.getSchemaName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
