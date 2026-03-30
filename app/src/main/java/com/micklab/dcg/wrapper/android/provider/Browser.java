// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class Browser {
    private final android.provider.Browser real;

    public Browser(android.provider.Browser real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.Browser wrap(android.provider.Browser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Browser(real);
    }

    public android.provider.Browser unwrap() {
        return real;
    }

    public Browser() {
        this(new android.provider.Browser());
    }

    public static void sendString(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        android.provider.Browser.sendString(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String EXTRA_APPLICATION_ID = android.provider.Browser.EXTRA_APPLICATION_ID;
    public static final java.lang.String EXTRA_CREATE_NEW_TAB = android.provider.Browser.EXTRA_CREATE_NEW_TAB;
    public static final java.lang.String EXTRA_HEADERS = android.provider.Browser.EXTRA_HEADERS;
    public static final java.lang.String INITIAL_ZOOM_LEVEL = android.provider.Browser.INITIAL_ZOOM_LEVEL;

}
