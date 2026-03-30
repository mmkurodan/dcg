// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RoutingSessionInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RoutingSessionInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RoutingSessionInfo wrap(android.media.RoutingSessionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RoutingSessionInfo(real, (__DcgwBridgeToken) null);
    }

    public android.media.RoutingSessionInfo getReal() {
        return (android.media.RoutingSessionInfo) real;
    }

    public android.media.RoutingSessionInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.RoutingSessionInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.RoutingSessionInfo) real).equals(arg0);
    }

    public java.lang.String getClientPackageName() {
        return ((android.media.RoutingSessionInfo) real).getClientPackageName();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getControlHints() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.RoutingSessionInfo) real).getControlHints());
    }

    public java.lang.String getId() {
        return ((android.media.RoutingSessionInfo) real).getId();
    }

    public java.lang.CharSequence getName() {
        return ((android.media.RoutingSessionInfo) real).getName();
    }

    public int getTransferReason() {
        return ((android.media.RoutingSessionInfo) real).getTransferReason();
    }

    public int getVolume() {
        return ((android.media.RoutingSessionInfo) real).getVolume();
    }

    public int getVolumeHandling() {
        return ((android.media.RoutingSessionInfo) real).getVolumeHandling();
    }

    public int getVolumeMax() {
        return ((android.media.RoutingSessionInfo) real).getVolumeMax();
    }

    public int hashCode() {
        return ((android.media.RoutingSessionInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.RoutingSessionInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.RoutingSessionInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TRANSFER_REASON_APP = android.media.RoutingSessionInfo.TRANSFER_REASON_APP;
    public static final int TRANSFER_REASON_FALLBACK = android.media.RoutingSessionInfo.TRANSFER_REASON_FALLBACK;
    public static final int TRANSFER_REASON_SYSTEM_REQUEST = android.media.RoutingSessionInfo.TRANSFER_REASON_SYSTEM_REQUEST;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder wrap(android.media.RoutingSessionInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.RoutingSessionInfo.Builder getReal() {
            return (android.media.RoutingSessionInfo.Builder) real;
        }

        public android.media.RoutingSessionInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.media.RoutingSessionInfo arg0) {
            this(new android.media.RoutingSessionInfo.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.media.RoutingSessionInfo.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder addDeselectableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).addDeselectableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder addSelectableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).addSelectableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder addSelectedRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).addSelectedRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder addTransferableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).addTransferableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo build() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.wrap(((android.media.RoutingSessionInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder clearDeselectableRoutes() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).clearDeselectableRoutes());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder clearSelectableRoutes() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).clearSelectableRoutes());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder clearSelectedRoutes() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).clearSelectedRoutes());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder clearTransferableRoutes() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).clearTransferableRoutes());
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder removeDeselectableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).removeDeselectableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder removeSelectableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).removeSelectableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder removeSelectedRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).removeSelectedRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder removeTransferableRoute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).removeTransferableRoute(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setControlHints(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).setControlHints(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setName(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setTransferInitiator(com.micklab.dcg.wrapper.android.os.UserHandle arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).setTransferInitiator(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setTransferReason(int arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).setTransferReason(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setVolume(int arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).setVolume(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setVolumeHandling(int arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).setVolumeHandling(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder setVolumeMax(int arg0) {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.Builder.wrap(((android.media.RoutingSessionInfo.Builder) real).setVolumeMax(arg0));
        }

    }
}
