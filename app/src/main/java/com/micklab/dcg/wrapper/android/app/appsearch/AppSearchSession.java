// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class AppSearchSession {
    private final android.app.appsearch.AppSearchSession real;

    public AppSearchSession(android.app.appsearch.AppSearchSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchSession wrap(android.app.appsearch.AppSearchSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchSession(real);
    }

    public android.app.appsearch.AppSearchSession unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.SearchResults search(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec arg1) {
        return com.micklab.dcg.wrapper.android.app.appsearch.SearchResults.wrap(real.search(arg0, arg1 == null ? null : arg1.unwrap()));
    }

}
