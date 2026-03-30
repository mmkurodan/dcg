// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class GeolocationPermissions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GeolocationPermissions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions wrap(android.webkit.GeolocationPermissions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.GeolocationPermissions getReal() {
        return (android.webkit.GeolocationPermissions) real;
    }

    public android.webkit.GeolocationPermissions unwrap() {
        return getReal();
    }

    public void allow(java.lang.String arg0) {
        ((android.webkit.GeolocationPermissions) real).allow(arg0);
    }

    public void clear(java.lang.String arg0) {
        ((android.webkit.GeolocationPermissions) real).clear(arg0);
    }

    public void clearAll() {
        ((android.webkit.GeolocationPermissions) real).clearAll();
    }

    public static com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions.wrap(android.webkit.GeolocationPermissions.getInstance());
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions.Callback wrap(android.webkit.GeolocationPermissions.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.GeolocationPermissions.Callback getReal() {
            return (android.webkit.GeolocationPermissions.Callback) real;
        }

        public android.webkit.GeolocationPermissions.Callback unwrap() {
            return getReal();
        }

        public void invoke(java.lang.String arg0, boolean arg1, boolean arg2) {
            ((android.webkit.GeolocationPermissions.Callback) real).invoke(arg0, arg1, arg2);
        }

    }
}
