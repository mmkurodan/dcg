// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.ble.cs;

public final class BleCsRangingParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BleCsRangingParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams wrap(android.ranging.ble.cs.BleCsRangingParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.ble.cs.BleCsRangingParams getReal() {
        return (android.ranging.ble.cs.BleCsRangingParams) real;
    }

    public android.ranging.ble.cs.BleCsRangingParams unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.ble.cs.BleCsRangingParams) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.ble.cs.BleCsRangingParams) real).equals(arg0);
    }

    public int getLocationType() {
        return ((android.ranging.ble.cs.BleCsRangingParams) real).getLocationType();
    }

    public java.lang.String getPeerBluetoothAddress() {
        return ((android.ranging.ble.cs.BleCsRangingParams) real).getPeerBluetoothAddress();
    }

    public int getRangingUpdateRate() {
        return ((android.ranging.ble.cs.BleCsRangingParams) real).getRangingUpdateRate();
    }

    public int getSecurityLevel() {
        return ((android.ranging.ble.cs.BleCsRangingParams) real).getSecurityLevel();
    }

    public int getSightType() {
        return ((android.ranging.ble.cs.BleCsRangingParams) real).getSightType();
    }

    public int hashCode() {
        return ((android.ranging.ble.cs.BleCsRangingParams) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.ble.cs.BleCsRangingParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int LOCATION_TYPE_INDOOR = android.ranging.ble.cs.BleCsRangingParams.LOCATION_TYPE_INDOOR;
    public static final int LOCATION_TYPE_OUTDOOR = android.ranging.ble.cs.BleCsRangingParams.LOCATION_TYPE_OUTDOOR;
    public static final int LOCATION_TYPE_UNKNOWN = android.ranging.ble.cs.BleCsRangingParams.LOCATION_TYPE_UNKNOWN;
    public static final int SIGHT_TYPE_LINE_OF_SIGHT = android.ranging.ble.cs.BleCsRangingParams.SIGHT_TYPE_LINE_OF_SIGHT;
    public static final int SIGHT_TYPE_NON_LINE_OF_SIGHT = android.ranging.ble.cs.BleCsRangingParams.SIGHT_TYPE_NON_LINE_OF_SIGHT;
    public static final int SIGHT_TYPE_UNKNOWN = android.ranging.ble.cs.BleCsRangingParams.SIGHT_TYPE_UNKNOWN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder wrap(android.ranging.ble.cs.BleCsRangingParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.ble.cs.BleCsRangingParams.Builder getReal() {
            return (android.ranging.ble.cs.BleCsRangingParams.Builder) real;
        }

        public android.ranging.ble.cs.BleCsRangingParams.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.ranging.ble.cs.BleCsRangingParams.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams build() {
            return com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.wrap(((android.ranging.ble.cs.BleCsRangingParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder setLocationType(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder.wrap(((android.ranging.ble.cs.BleCsRangingParams.Builder) real).setLocationType(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder setRangingUpdateRate(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder.wrap(((android.ranging.ble.cs.BleCsRangingParams.Builder) real).setRangingUpdateRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder setSecurityLevel(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder.wrap(((android.ranging.ble.cs.BleCsRangingParams.Builder) real).setSecurityLevel(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder setSightType(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.Builder.wrap(((android.ranging.ble.cs.BleCsRangingParams.Builder) real).setSightType(arg0));
        }

    }
}
