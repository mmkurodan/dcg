// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class AppSearchSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppSearchSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchSession wrap(android.app.appsearch.AppSearchSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchSession(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.AppSearchSession getReal() {
        return (android.app.appsearch.AppSearchSession) real;
    }

    public android.app.appsearch.AppSearchSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.app.appsearch.AppSearchSession) real).close();
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.SearchResults search(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec arg1) {
        return com.micklab.dcg.wrapper.android.app.appsearch.SearchResults.wrap(((android.app.appsearch.AppSearchSession) real).search(arg0, arg1 == null ? null : arg1.getReal()));
    }

}
