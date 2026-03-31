// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class AssociationInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AssociationInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.AssociationInfo wrap(android.companion.AssociationInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.AssociationInfo(real, (__DcgwBridgeToken) null);
    }

    public android.companion.AssociationInfo getReal() {
        return (android.companion.AssociationInfo) real;
    }

    public android.companion.AssociationInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.companion.AssociationInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.companion.AssociationInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.companion.AssociatedDevice getAssociatedDevice() {
        return com.micklab.dcg.wrapper.android.companion.AssociatedDevice.wrap(((android.companion.AssociationInfo) real).getAssociatedDevice());
    }

    public com.micklab.dcg.wrapper.android.companion.DeviceId getDeviceId() {
        return com.micklab.dcg.wrapper.android.companion.DeviceId.wrap(((android.companion.AssociationInfo) real).getDeviceId());
    }

    public com.micklab.dcg.wrapper.android.net.MacAddress getDeviceMacAddress() {
        return com.micklab.dcg.wrapper.android.net.MacAddress.wrap(((android.companion.AssociationInfo) real).getDeviceMacAddress());
    }

    public java.lang.String getDeviceProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.companion.AssociationInfo#getDeviceProfile()");
    }

    public java.lang.CharSequence getDisplayName() {
        return ((android.companion.AssociationInfo) real).getDisplayName();
    }

    public int getId() {
        return ((android.companion.AssociationInfo) real).getId();
    }

    public int getSystemDataSyncFlags() {
        return ((android.companion.AssociationInfo) real).getSystemDataSyncFlags();
    }

    public int hashCode() {
        return ((android.companion.AssociationInfo) real).hashCode();
    }

    public boolean isSelfManaged() {
        return ((android.companion.AssociationInfo) real).isSelfManaged();
    }

    public java.lang.String toString() {
        return ((android.companion.AssociationInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.AssociationInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
