// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class TimeFormatException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeFormatException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.TimeFormatException wrap(android.util.TimeFormatException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.TimeFormatException(real, (__DcgwBridgeToken) null);
    }

    public android.util.TimeFormatException getReal() {
        return (android.util.TimeFormatException) real;
    }

    public android.util.TimeFormatException unwrap() {
        return getReal();
    }

}
