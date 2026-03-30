// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Config {
    private final android.util.Config real;

    public Config(android.util.Config real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Config wrap(android.util.Config real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Config(real);
    }

    public android.util.Config unwrap() {
        return real;
    }

    public static final boolean DEBUG = android.util.Config.DEBUG;
    public static final boolean LOGD = android.util.Config.LOGD;
    public static final boolean LOGV = android.util.Config.LOGV;
    public static final boolean RELEASE = android.util.Config.RELEASE;

}
