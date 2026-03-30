// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.observer;

public final class ObserverCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ObserverCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverCallback wrap(android.app.appsearch.observer.ObserverCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverCallback(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.observer.ObserverCallback getReal() {
        return (android.app.appsearch.observer.ObserverCallback) real;
    }

    public android.app.appsearch.observer.ObserverCallback unwrap() {
        return getReal();
    }

    public void onDocumentChanged(com.micklab.dcg.wrapper.android.app.appsearch.observer.DocumentChangeInfo arg0) {
        ((android.app.appsearch.observer.ObserverCallback) real).onDocumentChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onSchemaChanged(com.micklab.dcg.wrapper.android.app.appsearch.observer.SchemaChangeInfo arg0) {
        ((android.app.appsearch.observer.ObserverCallback) real).onSchemaChanged(arg0 == null ? null : arg0.getReal());
    }

}
