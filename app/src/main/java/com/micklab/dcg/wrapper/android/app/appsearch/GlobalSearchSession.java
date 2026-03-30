// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class GlobalSearchSession {
    private final android.app.appsearch.GlobalSearchSession real;

    public GlobalSearchSession(android.app.appsearch.GlobalSearchSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.GlobalSearchSession wrap(android.app.appsearch.GlobalSearchSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GlobalSearchSession(real);
    }

    public android.app.appsearch.GlobalSearchSession unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public void registerObserverCallback(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverCallback arg3) throws android.app.appsearch.exceptions.AppSearchException {
        real.registerObserverCallback(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.SearchResults search(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec arg1) {
        return com.micklab.dcg.wrapper.android.app.appsearch.SearchResults.wrap(real.search(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public void unregisterObserverCallback(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverCallback arg1) throws android.app.appsearch.exceptions.AppSearchException {
        real.unregisterObserverCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

}
