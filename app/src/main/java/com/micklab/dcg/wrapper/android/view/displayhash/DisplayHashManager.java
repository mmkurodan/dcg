// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.displayhash;

public final class DisplayHashManager {
    private final android.view.displayhash.DisplayHashManager real;

    public DisplayHashManager(android.view.displayhash.DisplayHashManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.displayhash.DisplayHashManager wrap(android.view.displayhash.DisplayHashManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.displayhash.DisplayHashManager(real);
    }

    public android.view.displayhash.DisplayHashManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(com.micklab.dcg.wrapper.android.view.displayhash.DisplayHash arg0) {
        return com.micklab.dcg.wrapper.android.view.displayhash.VerifiedDisplayHash.wrap(real.verifyDisplayHash(arg0 == null ? null : arg0.unwrap()));
    }

}
