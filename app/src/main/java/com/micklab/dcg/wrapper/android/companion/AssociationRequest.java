// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class AssociationRequest {
    private final android.companion.AssociationRequest real;

    public AssociationRequest(android.companion.AssociationRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.AssociationRequest wrap(android.companion.AssociationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.AssociationRequest(real);
    }

    public android.companion.AssociationRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getDeviceProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.companion.AssociationRequest#getDeviceProfile()");
    }

    public java.lang.CharSequence getDisplayName() {
        return real.getDisplayName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isForceConfirmation() {
        return real.isForceConfirmation();
    }

    public boolean isSelfManaged() {
        return real.isSelfManaged();
    }

    public boolean isSingleDevice() {
        return real.isSingleDevice();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.companion.AssociationRequest.Builder real;

        public Builder(android.companion.AssociationRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder wrap(android.companion.AssociationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder(real);
        }

        public android.companion.AssociationRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.companion.AssociationRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest build() {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setDeviceProfile(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.companion.AssociationRequest$Builder#setDeviceProfile(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setDisplayName(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder.wrap(real.setDisplayName(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setForceConfirmation(boolean arg0) {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder.wrap(real.setForceConfirmation(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setSelfManaged(boolean arg0) {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder.wrap(real.setSelfManaged(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder setSingleDevice(boolean arg0) {
            return com.micklab.dcg.wrapper.android.companion.AssociationRequest.Builder.wrap(real.setSingleDevice(arg0));
        }

    }
}
