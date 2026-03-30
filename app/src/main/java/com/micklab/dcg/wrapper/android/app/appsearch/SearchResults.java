// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SearchResults {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchResults(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResults wrap(android.app.appsearch.SearchResults real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResults(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.SearchResults getReal() {
        return (android.app.appsearch.SearchResults) real;
    }

    public android.app.appsearch.SearchResults unwrap() {
        return getReal();
    }

    public void close() {
        ((android.app.appsearch.SearchResults) real).close();
    }

}
