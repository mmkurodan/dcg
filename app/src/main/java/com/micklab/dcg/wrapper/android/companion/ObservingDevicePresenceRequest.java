// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class ObservingDevicePresenceRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ObservingDevicePresenceRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest wrap(android.companion.ObservingDevicePresenceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest(real, (__DcgwBridgeToken) null);
    }

    public android.companion.ObservingDevicePresenceRequest getReal() {
        return (android.companion.ObservingDevicePresenceRequest) real;
    }

    public android.companion.ObservingDevicePresenceRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.companion.ObservingDevicePresenceRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.companion.ObservingDevicePresenceRequest) real).equals(arg0);
    }

    public int getAssociationId() {
        return ((android.companion.ObservingDevicePresenceRequest) real).getAssociationId();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getUuid() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(((android.companion.ObservingDevicePresenceRequest) real).getUuid());
    }

    public int hashCode() {
        return ((android.companion.ObservingDevicePresenceRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.companion.ObservingDevicePresenceRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.ObservingDevicePresenceRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest.Builder wrap(android.companion.ObservingDevicePresenceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.companion.ObservingDevicePresenceRequest.Builder getReal() {
            return (android.companion.ObservingDevicePresenceRequest.Builder) real;
        }

        public android.companion.ObservingDevicePresenceRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.companion.ObservingDevicePresenceRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest build() {
            return com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest.wrap(((android.companion.ObservingDevicePresenceRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest.Builder setAssociationId(int arg0) {
            return com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest.Builder.wrap(((android.companion.ObservingDevicePresenceRequest.Builder) real).setAssociationId(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest.Builder setUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
            return com.micklab.dcg.wrapper.android.companion.ObservingDevicePresenceRequest.Builder.wrap(((android.companion.ObservingDevicePresenceRequest.Builder) real).setUuid(arg0 == null ? null : arg0.getReal()));
        }

    }
}
