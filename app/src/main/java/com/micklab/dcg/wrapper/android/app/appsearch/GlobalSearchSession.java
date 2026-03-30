// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class GlobalSearchSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GlobalSearchSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.GlobalSearchSession wrap(android.app.appsearch.GlobalSearchSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GlobalSearchSession(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.GlobalSearchSession getReal() {
        return (android.app.appsearch.GlobalSearchSession) real;
    }

    public android.app.appsearch.GlobalSearchSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.app.appsearch.GlobalSearchSession) real).close();
    }

    public void registerObserverCallback(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverCallback arg3) throws android.app.appsearch.exceptions.AppSearchException {
        ((android.app.appsearch.GlobalSearchSession) real).registerObserverCallback(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.SearchResults search(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec arg1) {
        return com.micklab.dcg.wrapper.android.app.appsearch.SearchResults.wrap(((android.app.appsearch.GlobalSearchSession) real).search(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public void unregisterObserverCallback(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverCallback arg1) throws android.app.appsearch.exceptions.AppSearchException {
        ((android.app.appsearch.GlobalSearchSession) real).unregisterObserverCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

}
