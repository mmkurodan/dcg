// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.observer;

public final class DocumentChangeInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DocumentChangeInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.observer.DocumentChangeInfo wrap(android.app.appsearch.observer.DocumentChangeInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.DocumentChangeInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.observer.DocumentChangeInfo getReal() {
        return (android.app.appsearch.observer.DocumentChangeInfo) real;
    }

    public android.app.appsearch.observer.DocumentChangeInfo unwrap() {
        return getReal();
    }

    public DocumentChangeInfo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.util.Set arg4) {
        this(new android.app.appsearch.observer.DocumentChangeInfo(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.observer.DocumentChangeInfo) real).equals(arg0);
    }

    public java.lang.String getDatabaseName() {
        return ((android.app.appsearch.observer.DocumentChangeInfo) real).getDatabaseName();
    }

    public java.lang.String getNamespace() {
        return ((android.app.appsearch.observer.DocumentChangeInfo) real).getNamespace();
    }

    public java.lang.String getPackageName() {
        return ((android.app.appsearch.observer.DocumentChangeInfo) real).getPackageName();
    }

    public java.lang.String getSchemaName() {
        return ((android.app.appsearch.observer.DocumentChangeInfo) real).getSchemaName();
    }

    public int hashCode() {
        return ((android.app.appsearch.observer.DocumentChangeInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.appsearch.observer.DocumentChangeInfo) real).toString();
    }

}
