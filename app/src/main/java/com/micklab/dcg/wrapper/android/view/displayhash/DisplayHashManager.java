// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.displayhash;

public final class DisplayHashManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayHashManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.displayhash.DisplayHashManager wrap(android.view.displayhash.DisplayHashManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.displayhash.DisplayHashManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.displayhash.DisplayHashManager getReal() {
        return (android.view.displayhash.DisplayHashManager) real;
    }

    public android.view.displayhash.DisplayHashManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(com.micklab.dcg.wrapper.android.view.displayhash.DisplayHash arg0) {
        return com.micklab.dcg.wrapper.android.view.displayhash.VerifiedDisplayHash.wrap(((android.view.displayhash.DisplayHashManager) real).verifyDisplayHash(arg0 == null ? null : arg0.getReal()));
    }

}
