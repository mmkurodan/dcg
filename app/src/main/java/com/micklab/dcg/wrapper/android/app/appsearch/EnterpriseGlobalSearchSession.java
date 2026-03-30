// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class EnterpriseGlobalSearchSession {
    private final android.app.appsearch.EnterpriseGlobalSearchSession real;

    public EnterpriseGlobalSearchSession(android.app.appsearch.EnterpriseGlobalSearchSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.EnterpriseGlobalSearchSession wrap(android.app.appsearch.EnterpriseGlobalSearchSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.EnterpriseGlobalSearchSession(real);
    }

    public android.app.appsearch.EnterpriseGlobalSearchSession unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.SearchResults search(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec arg1) {
        return com.micklab.dcg.wrapper.android.app.appsearch.SearchResults.wrap(real.search(arg0, arg1 == null ? null : arg1.unwrap()));
    }

}
