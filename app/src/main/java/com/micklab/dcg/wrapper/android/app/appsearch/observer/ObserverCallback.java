// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.observer;

public final class ObserverCallback {
    private final android.app.appsearch.observer.ObserverCallback real;

    public ObserverCallback(android.app.appsearch.observer.ObserverCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverCallback wrap(android.app.appsearch.observer.ObserverCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverCallback(real);
    }

    public android.app.appsearch.observer.ObserverCallback unwrap() {
        return real;
    }

    public void onDocumentChanged(com.micklab.dcg.wrapper.android.app.appsearch.observer.DocumentChangeInfo arg0) {
        real.onDocumentChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onSchemaChanged(com.micklab.dcg.wrapper.android.app.appsearch.observer.SchemaChangeInfo arg0) {
        real.onSchemaChanged(arg0 == null ? null : arg0.unwrap());
    }

}
