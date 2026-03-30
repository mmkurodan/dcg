// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class ContentObservable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentObservable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.ContentObservable wrap(android.database.ContentObservable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.ContentObservable(real, (__DcgwBridgeToken) null);
    }

    public android.database.ContentObservable getReal() {
        return (android.database.ContentObservable) real;
    }

    public android.database.ContentObservable unwrap() {
        return getReal();
    }

    public ContentObservable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObservable#android.database.ContentObservable()");
    }

    public void dispatchChange(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObservable#dispatchChange(boolean)");
    }

    public void dispatchChange(boolean arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObservable#dispatchChange(boolean,android.net.Uri)");
    }

    public void notifyChange(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObservable#notifyChange(boolean)");
    }

    public void registerObserver(com.micklab.dcg.wrapper.android.database.ContentObserver arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObservable#registerObserver(android.database.ContentObserver)");
    }

}
