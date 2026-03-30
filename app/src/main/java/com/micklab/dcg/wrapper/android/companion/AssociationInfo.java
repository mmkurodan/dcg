// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class AssociationInfo {
    private final android.companion.AssociationInfo real;

    public AssociationInfo(android.companion.AssociationInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.AssociationInfo wrap(android.companion.AssociationInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.AssociationInfo(real);
    }

    public android.companion.AssociationInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.companion.AssociatedDevice getAssociatedDevice() {
        return com.micklab.dcg.wrapper.android.companion.AssociatedDevice.wrap(real.getAssociatedDevice());
    }

    public com.micklab.dcg.wrapper.android.net.MacAddress getDeviceMacAddress() {
        return com.micklab.dcg.wrapper.android.net.MacAddress.wrap(real.getDeviceMacAddress());
    }

    public java.lang.String getDeviceProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.companion.AssociationInfo#getDeviceProfile()");
    }

    public java.lang.CharSequence getDisplayName() {
        return real.getDisplayName();
    }

    public int getId() {
        return real.getId();
    }

    public int getSystemDataSyncFlags() {
        return real.getSystemDataSyncFlags();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isSelfManaged() {
        return real.isSelfManaged();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
