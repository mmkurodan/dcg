// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RoutingSessionInfo {
    private final android.media.RoutingSessionInfo real;

    public RoutingSessionInfo(android.media.RoutingSessionInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RoutingSessionInfo wrap(android.media.RoutingSessionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RoutingSessionInfo(real);
    }

    public android.media.RoutingSessionInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getClientPackageName() {
        return real.getClientPackageName();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getControlHints() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getControlHints());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public java.lang.CharSequence getName() {
        return real.getName();
    }

    public int getTransferReason() {
        return real.getTransferReason();
    }

    public int getVolume() {
        return real.getVolume();
    }

    public int getVolumeHandling() {
        return real.getVolumeHandling();
    }

    public int getVolumeMax() {
        return real.getVolumeMax();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TRANSFER_REASON_APP = android.media.RoutingSessionInfo.TRANSFER_REASON_APP;
    public static final int TRANSFER_REASON_FALLBACK = android.media.RoutingSessionInfo.TRANSFER_REASON_FALLBACK;
    public static final int TRANSFER_REASON_SYSTEM_REQUEST = android.media.RoutingSessionInfo.TRANSFER_REASON_SYSTEM_REQUEST;

    public static final class Builder {
        private final android.media.RoutingSessionInfo.Builder real;

        public Builder(android.media.RoutingSessionInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder wrap(android.media.RoutingSessionInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder(real);
        }

        public android.media.RoutingSessionInfo.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.media.RoutingSessionInfo arg0) {
            this(new android.media.RoutingSessionInfo.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.media.RoutingSessionInfo.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder addDeselectableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.addDeselectableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder addSelectableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.addSelectableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder addSelectedRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.addSelectedRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder addTransferableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.addTransferableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo build() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder clearDeselectableRoutes() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.clearDeselectableRoutes());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder clearSelectableRoutes() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.clearSelectableRoutes());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder clearSelectedRoutes() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.clearSelectedRoutes());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder clearTransferableRoutes() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.clearTransferableRoutes());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder removeDeselectableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.removeDeselectableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder removeSelectableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.removeSelectableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder removeSelectedRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.removeSelectedRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder removeTransferableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.removeTransferableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setControlHints(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.setControlHints(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setName(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setTransferInitiator(com.micklab.dcg.wrapper.android.os.UserHandle arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.setTransferInitiator(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setTransferReason(int arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.setTransferReason(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setVolume(int arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.setVolume(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setVolumeHandling(int arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.setVolumeHandling(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setVolumeMax(int arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(real.setVolumeMax(arg0));
        }

    }
}
