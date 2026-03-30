// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ActivityNotFoundException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActivityNotFoundException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ActivityNotFoundException wrap(android.content.ActivityNotFoundException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ActivityNotFoundException(real, (__DcgwBridgeToken) null);
    }

    public android.content.ActivityNotFoundException getReal() {
        return (android.content.ActivityNotFoundException) real;
    }

    public android.content.ActivityNotFoundException unwrap() {
        return getReal();
    }

    public ActivityNotFoundException() {
        this(new android.content.ActivityNotFoundException(), (__DcgwBridgeToken) null);
    }

    public ActivityNotFoundException(java.lang.String arg0) {
        this(new android.content.ActivityNotFoundException(arg0), (__DcgwBridgeToken) null);
    }

}
