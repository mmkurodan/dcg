// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class Browser {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Browser(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.Browser wrap(android.provider.Browser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Browser(real, (__DcgwBridgeToken) null);
    }

    public android.provider.Browser getReal() {
        return (android.provider.Browser) real;
    }

    public android.provider.Browser unwrap() {
        return getReal();
    }

    public Browser() {
        this(new android.provider.Browser(), (__DcgwBridgeToken) null);
    }

    public static void sendString(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        android.provider.Browser.sendString(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String EXTRA_APPLICATION_ID = android.provider.Browser.EXTRA_APPLICATION_ID;
    public static final java.lang.String EXTRA_CREATE_NEW_TAB = android.provider.Browser.EXTRA_CREATE_NEW_TAB;
    public static final java.lang.String EXTRA_HEADERS = android.provider.Browser.EXTRA_HEADERS;
    public static final java.lang.String INITIAL_ZOOM_LEVEL = android.provider.Browser.INITIAL_ZOOM_LEVEL;

}
