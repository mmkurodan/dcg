// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class DataNotificationConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DataNotificationConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig wrap(android.ranging.DataNotificationConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.DataNotificationConfig getReal() {
        return (android.ranging.DataNotificationConfig) real;
    }

    public android.ranging.DataNotificationConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.DataNotificationConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.DataNotificationConfig) real).equals(arg0);
    }

    public int getNotificationConfigType() {
        return ((android.ranging.DataNotificationConfig) real).getNotificationConfigType();
    }

    public int getProximityFarCm() {
        return ((android.ranging.DataNotificationConfig) real).getProximityFarCm();
    }

    public int getProximityNearCm() {
        return ((android.ranging.DataNotificationConfig) real).getProximityNearCm();
    }

    public int hashCode() {
        return ((android.ranging.DataNotificationConfig) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.ranging.DataNotificationConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.DataNotificationConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int NOTIFICATION_CONFIG_DISABLE = android.ranging.DataNotificationConfig.NOTIFICATION_CONFIG_DISABLE;
    public static final int NOTIFICATION_CONFIG_ENABLE = android.ranging.DataNotificationConfig.NOTIFICATION_CONFIG_ENABLE;
    public static final int NOTIFICATION_CONFIG_PROXIMITY_EDGE = android.ranging.DataNotificationConfig.NOTIFICATION_CONFIG_PROXIMITY_EDGE;
    public static final int NOTIFICATION_CONFIG_PROXIMITY_LEVEL = android.ranging.DataNotificationConfig.NOTIFICATION_CONFIG_PROXIMITY_LEVEL;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.Builder wrap(android.ranging.DataNotificationConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.DataNotificationConfig.Builder getReal() {
            return (android.ranging.DataNotificationConfig.Builder) real;
        }

        public android.ranging.DataNotificationConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.ranging.DataNotificationConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig build() {
            return com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.wrap(((android.ranging.DataNotificationConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.Builder setNotificationConfigType(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.Builder.wrap(((android.ranging.DataNotificationConfig.Builder) real).setNotificationConfigType(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.Builder setProximityFarCm(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.Builder.wrap(((android.ranging.DataNotificationConfig.Builder) real).setProximityFarCm(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.Builder setProximityNearCm(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.Builder.wrap(((android.ranging.DataNotificationConfig.Builder) real).setProximityNearCm(arg0));
        }

    }
}
