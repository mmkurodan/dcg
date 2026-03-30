// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ComponentCallbacks {
    private final android.content.ComponentCallbacks real;

    public ComponentCallbacks(android.content.ComponentCallbacks real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentCallbacks wrap(android.content.ComponentCallbacks real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ComponentCallbacks(real);
    }

    public android.content.ComponentCallbacks unwrap() {
        return real;
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

}
