// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssNavigationMessage {
    private final android.location.GnssNavigationMessage real;

    public GnssNavigationMessage(android.location.GnssNavigationMessage real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssNavigationMessage wrap(android.location.GnssNavigationMessage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssNavigationMessage(real);
    }

    public android.location.GnssNavigationMessage unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public byte[] getData() {
        return real.getData();
    }

    public int getMessageId() {
        return real.getMessageId();
    }

    public int getStatus() {
        return real.getStatus();
    }

    public int getSubmessageId() {
        return real.getSubmessageId();
    }

    public int getSvid() {
        return real.getSvid();
    }

    public int getType() {
        return real.getType();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STATUS_PARITY_PASSED = android.location.GnssNavigationMessage.STATUS_PARITY_PASSED;
    public static final int STATUS_PARITY_REBUILT = android.location.GnssNavigationMessage.STATUS_PARITY_REBUILT;
    public static final int STATUS_UNKNOWN = android.location.GnssNavigationMessage.STATUS_UNKNOWN;
    public static final int TYPE_BDS_CNAV1 = android.location.GnssNavigationMessage.TYPE_BDS_CNAV1;
    public static final int TYPE_BDS_CNAV2 = android.location.GnssNavigationMessage.TYPE_BDS_CNAV2;
    public static final int TYPE_BDS_D1 = android.location.GnssNavigationMessage.TYPE_BDS_D1;
    public static final int TYPE_BDS_D2 = android.location.GnssNavigationMessage.TYPE_BDS_D2;
    public static final int TYPE_GAL_F = android.location.GnssNavigationMessage.TYPE_GAL_F;
    public static final int TYPE_GAL_I = android.location.GnssNavigationMessage.TYPE_GAL_I;
    public static final int TYPE_GLO_L1CA = android.location.GnssNavigationMessage.TYPE_GLO_L1CA;
    public static final int TYPE_GPS_CNAV2 = android.location.GnssNavigationMessage.TYPE_GPS_CNAV2;
    public static final int TYPE_GPS_L1CA = android.location.GnssNavigationMessage.TYPE_GPS_L1CA;
    public static final int TYPE_GPS_L2CNAV = android.location.GnssNavigationMessage.TYPE_GPS_L2CNAV;
    public static final int TYPE_GPS_L5CNAV = android.location.GnssNavigationMessage.TYPE_GPS_L5CNAV;
    public static final int TYPE_IRN_L1 = android.location.GnssNavigationMessage.TYPE_IRN_L1;
    public static final int TYPE_IRN_L5 = android.location.GnssNavigationMessage.TYPE_IRN_L5;
    public static final int TYPE_IRN_L5CA = android.location.GnssNavigationMessage.TYPE_IRN_L5CA;
    public static final int TYPE_QZS_L1CA = android.location.GnssNavigationMessage.TYPE_QZS_L1CA;
    public static final int TYPE_SBS = android.location.GnssNavigationMessage.TYPE_SBS;
    public static final int TYPE_UNKNOWN = android.location.GnssNavigationMessage.TYPE_UNKNOWN;

    public static final class Callback {
        private final android.location.GnssNavigationMessage.Callback real;

        public Callback(android.location.GnssNavigationMessage.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback wrap(android.location.GnssNavigationMessage.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback(real);
        }

        public android.location.GnssNavigationMessage.Callback unwrap() {
            return real;
        }

        public void onGnssNavigationMessageReceived(com.micklab.dcg.wrapper.android.location.GnssNavigationMessage arg0) {
            real.onGnssNavigationMessageReceived(arg0 == null ? null : arg0.unwrap());
        }

        public void onStatusChanged(int arg0) {
            real.onStatusChanged(arg0);
        }

        public static final int STATUS_LOCATION_DISABLED = android.location.GnssNavigationMessage.Callback.STATUS_LOCATION_DISABLED;
        public static final int STATUS_NOT_SUPPORTED = android.location.GnssNavigationMessage.Callback.STATUS_NOT_SUPPORTED;
        public static final int STATUS_READY = android.location.GnssNavigationMessage.Callback.STATUS_READY;

    }
}
