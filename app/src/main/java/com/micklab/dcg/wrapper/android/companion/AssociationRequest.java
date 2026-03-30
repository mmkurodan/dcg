// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class AssociationRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AssociationRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.AssociationRequest wrap(android.companion.AssociationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.AssociationRequest(real, (__DcgwBridgeToken) null);
    }

    public android.companion.AssociationRequest getReal() {
        return (android.companion.AssociationRequest) real;
    }

    public android.companion.AssociationRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.companion.AssociationRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.companion.AssociationRequest) real).equals(arg0);
    }

    public java.lang.String getDeviceProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.companion.AssociationRequest#getDeviceProfile()");
    }

    public java.lang.CharSequence getDisplayName() {
        return ((android.companion.AssociationRequest) real).getDisplayName();
    }

    public int hashCode() {
        return ((android.companion.AssociationRequest) real).hashCode();
    }

    public boolean isForceConfirmation() {
        return ((android.companion.AssociationRequest) real).isForceConfirmation();
    }

    public boolean isSelfManaged() {
        return ((android.companion.AssociationRequest) real).isSelfManaged();
    }

    public boolean isSingleDevice() {
        return ((android.companion.AssociationRequest) real).isSingleDevice();
    }

    public java.lang.String toString() {
        return ((android.companion.AssociationRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.AssociationRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder wrap(android.companion.AssociationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.companion.AssociationRequest.Builder getReal() {
            return (android.companion.AssociationRequest.Builder) real;
        }

        public android.companion.AssociationRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.companion.AssociationRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest build() {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.wrap(((android.companion.AssociationRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setDeviceProfile(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.companion.AssociationRequest$Builder#setDeviceProfile(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setDisplayName(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder.wrap(((android.companion.AssociationRequest.Builder) real).setDisplayName(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setForceConfirmation(boolean arg0) {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder.wrap(((android.companion.AssociationRequest.Builder) real).setForceConfirmation(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setSelfManaged(boolean arg0) {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder.wrap(((android.companion.AssociationRequest.Builder) real).setSelfManaged(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setSingleDevice(boolean arg0) {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder.wrap(((android.companion.AssociationRequest.Builder) real).setSingleDevice(arg0));
        }

    }
}
