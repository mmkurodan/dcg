// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class Geocoder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Geocoder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.Geocoder wrap(android.location.Geocoder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.Geocoder(real, (__DcgwBridgeToken) null);
    }

    public android.location.Geocoder getReal() {
        return (android.location.Geocoder) real;
    }

    public android.location.Geocoder unwrap() {
        return getReal();
    }

    public Geocoder(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.location.Geocoder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Geocoder(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.Locale arg1) {
        this(new android.location.Geocoder(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public void getFromLocation(double arg0, double arg1, int arg2, com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener arg3) {
        ((android.location.Geocoder) real).getFromLocation(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void getFromLocationName(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener arg2) {
        ((android.location.Geocoder) real).getFromLocationName(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void getFromLocationName(java.lang.String arg0, int arg1, double arg2, double arg3, double arg4, double arg5, com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener arg6) {
        ((android.location.Geocoder) real).getFromLocationName(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public static boolean isPresent() {
        return android.location.Geocoder.isPresent();
    }

    public static final class GeocodeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private GeocodeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener wrap(android.location.Geocoder.GeocodeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener(real, (__DcgwBridgeToken) null);
        }

        public android.location.Geocoder.GeocodeListener getReal() {
            return (android.location.Geocoder.GeocodeListener) real;
        }

        public android.location.Geocoder.GeocodeListener unwrap() {
            return getReal();
        }

        public void onError(java.lang.String arg0) {
            ((android.location.Geocoder.GeocodeListener) real).onError(arg0);
        }

    }
}
