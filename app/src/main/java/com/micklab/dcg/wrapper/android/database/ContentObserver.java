// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database;

public final class ContentObserver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentObserver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.ContentObserver wrap(android.database.ContentObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.ContentObserver(real, (__DcgwBridgeToken) null);
    }

    public android.database.ContentObserver getReal() {
        return (android.database.ContentObserver) real;
    }

    public android.database.ContentObserver unwrap() {
        return getReal();
    }

    public boolean deliverSelfNotifications() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObserver#deliverSelfNotifications()");
    }

    public void dispatchChange(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObserver#dispatchChange(boolean)");
    }

    public void dispatchChange(boolean arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObserver#dispatchChange(boolean,android.net.Uri)");
    }

    public void dispatchChange(boolean arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObserver#dispatchChange(boolean,android.net.Uri,int)");
    }

    public void onChange(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObserver#onChange(boolean)");
    }

    public void onChange(boolean arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObserver#onChange(boolean,android.net.Uri)");
    }

    public void onChange(boolean arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.ContentObserver#onChange(boolean,android.net.Uri,int)");
    }

}
