// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ZygotePreload {
    private final android.app.ZygotePreload real;

    public ZygotePreload(android.app.ZygotePreload real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ZygotePreload wrap(android.app.ZygotePreload real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ZygotePreload(real);
    }

    public android.app.ZygotePreload unwrap() {
        return real;
    }

    public void doPreload(com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg0) {
        real.doPreload(arg0 == null ? null : arg0.unwrap());
    }

}
