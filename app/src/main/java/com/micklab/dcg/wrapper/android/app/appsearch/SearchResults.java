// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SearchResults {
    private final android.app.appsearch.SearchResults real;

    public SearchResults(android.app.appsearch.SearchResults real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResults wrap(android.app.appsearch.SearchResults real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResults(real);
    }

    public android.app.appsearch.SearchResults unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

}
