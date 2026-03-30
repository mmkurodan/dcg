// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class Geocoder {
    private final android.location.Geocoder real;

    public Geocoder(android.location.Geocoder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.Geocoder wrap(android.location.Geocoder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.Geocoder(real);
    }

    public android.location.Geocoder unwrap() {
        return real;
    }

    public Geocoder(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.location.Geocoder(arg0 == null ? null : arg0.unwrap()));
    }

    public Geocoder(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.Locale arg1) {
        this(new android.location.Geocoder(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void getFromLocation(double arg0, double arg1, int arg2, com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener arg3) {
        real.getFromLocation(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void getFromLocationName(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener arg2) {
        real.getFromLocationName(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void getFromLocationName(java.lang.String arg0, int arg1, double arg2, double arg3, double arg4, double arg5, com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener arg6) {
        real.getFromLocationName(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public static boolean isPresent() {
        return android.location.Geocoder.isPresent();
    }

    public static final class GeocodeListener {
        private final android.location.Geocoder.GeocodeListener real;

        public GeocodeListener(android.location.Geocoder.GeocodeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener wrap(android.location.Geocoder.GeocodeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.Geocoder.GeocodeListener(real);
        }

        public android.location.Geocoder.GeocodeListener unwrap() {
            return real;
        }

        public void onError(java.lang.String arg0) {
            real.onError(arg0);
        }

    }
}
