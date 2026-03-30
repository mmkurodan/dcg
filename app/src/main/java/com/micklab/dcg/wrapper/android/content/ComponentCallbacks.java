// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ComponentCallbacks {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ComponentCallbacks(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentCallbacks wrap(android.content.ComponentCallbacks real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ComponentCallbacks(real, (__DcgwBridgeToken) null);
    }

    public android.content.ComponentCallbacks getReal() {
        return (android.content.ComponentCallbacks) real;
    }

    public android.content.ComponentCallbacks unwrap() {
        return getReal();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.content.ComponentCallbacks) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onLowMemory() {
        ((android.content.ComponentCallbacks) real).onLowMemory();
    }

}
