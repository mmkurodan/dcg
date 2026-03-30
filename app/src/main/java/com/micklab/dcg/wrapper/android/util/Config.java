// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Config {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Config(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Config wrap(android.util.Config real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Config(real, (__DcgwBridgeToken) null);
    }

    public android.util.Config getReal() {
        return (android.util.Config) real;
    }

    public android.util.Config unwrap() {
        return getReal();
    }

    public static final boolean DEBUG = android.util.Config.DEBUG;
    public static final boolean LOGD = android.util.Config.LOGD;
    public static final boolean LOGV = android.util.Config.LOGV;
    public static final boolean RELEASE = android.util.Config.RELEASE;

}
