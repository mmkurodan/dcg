// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class GeolocationPermissions {
    private final android.webkit.GeolocationPermissions real;

    public GeolocationPermissions(android.webkit.GeolocationPermissions real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions wrap(android.webkit.GeolocationPermissions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions(real);
    }

    public android.webkit.GeolocationPermissions unwrap() {
        return real;
    }

    public void allow(java.lang.String arg0) {
        real.allow(arg0);
    }

    public void clear(java.lang.String arg0) {
        real.clear(arg0);
    }

    public void clearAll() {
        real.clearAll();
    }

    public static com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions.wrap(android.webkit.GeolocationPermissions.getInstance());
    }

    public static final class Callback {
        private final android.webkit.GeolocationPermissions.Callback real;

        public Callback(android.webkit.GeolocationPermissions.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions.Callback wrap(android.webkit.GeolocationPermissions.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.GeolocationPermissions.Callback(real);
        }

        public android.webkit.GeolocationPermissions.Callback unwrap() {
            return real;
        }

        public void invoke(java.lang.String arg0, boolean arg1, boolean arg2) {
            real.invoke(arg0, arg1, arg2);
        }

    }
}
