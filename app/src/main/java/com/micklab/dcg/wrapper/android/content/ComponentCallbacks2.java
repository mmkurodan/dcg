// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ComponentCallbacks2 {
    private final android.content.ComponentCallbacks2 real;

    public ComponentCallbacks2(android.content.ComponentCallbacks2 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentCallbacks2 wrap(android.content.ComponentCallbacks2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ComponentCallbacks2(real);
    }

    public android.content.ComponentCallbacks2 unwrap() {
        return real;
    }

    public void onTrimMemory(int arg0) {
        real.onTrimMemory(arg0);
    }

    public static final int TRIM_MEMORY_BACKGROUND = android.content.ComponentCallbacks2.TRIM_MEMORY_BACKGROUND;
    public static final int TRIM_MEMORY_COMPLETE = android.content.ComponentCallbacks2.TRIM_MEMORY_COMPLETE;
    public static final int TRIM_MEMORY_MODERATE = android.content.ComponentCallbacks2.TRIM_MEMORY_MODERATE;
    public static final int TRIM_MEMORY_RUNNING_CRITICAL = android.content.ComponentCallbacks2.TRIM_MEMORY_RUNNING_CRITICAL;
    public static final int TRIM_MEMORY_RUNNING_LOW = android.content.ComponentCallbacks2.TRIM_MEMORY_RUNNING_LOW;
    public static final int TRIM_MEMORY_RUNNING_MODERATE = android.content.ComponentCallbacks2.TRIM_MEMORY_RUNNING_MODERATE;
    public static final int TRIM_MEMORY_UI_HIDDEN = android.content.ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN;

}
