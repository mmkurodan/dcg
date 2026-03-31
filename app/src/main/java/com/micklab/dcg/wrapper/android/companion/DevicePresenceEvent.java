// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class DevicePresenceEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DevicePresenceEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.DevicePresenceEvent wrap(android.companion.DevicePresenceEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.DevicePresenceEvent(real, (__DcgwBridgeToken) null);
    }

    public android.companion.DevicePresenceEvent getReal() {
        return (android.companion.DevicePresenceEvent) real;
    }

    public android.companion.DevicePresenceEvent unwrap() {
        return getReal();
    }

    public DevicePresenceEvent(int arg0, int arg1, com.micklab.dcg.wrapper.android.os.ParcelUuid arg2) {
        this(new android.companion.DevicePresenceEvent(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.companion.DevicePresenceEvent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.companion.DevicePresenceEvent) real).equals(arg0);
    }

    public int getAssociationId() {
        return ((android.companion.DevicePresenceEvent) real).getAssociationId();
    }

    public int getEvent() {
        return ((android.companion.DevicePresenceEvent) real).getEvent();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getUuid() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(((android.companion.DevicePresenceEvent) real).getUuid());
    }

    public int hashCode() {
        return ((android.companion.DevicePresenceEvent) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.companion.DevicePresenceEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.DevicePresenceEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int EVENT_BLE_APPEARED = android.companion.DevicePresenceEvent.EVENT_BLE_APPEARED;
    public static final int EVENT_BLE_DISAPPEARED = android.companion.DevicePresenceEvent.EVENT_BLE_DISAPPEARED;
    public static final int EVENT_BT_CONNECTED = android.companion.DevicePresenceEvent.EVENT_BT_CONNECTED;
    public static final int EVENT_BT_DISCONNECTED = android.companion.DevicePresenceEvent.EVENT_BT_DISCONNECTED;
    public static final int EVENT_SELF_MANAGED_APPEARED = android.companion.DevicePresenceEvent.EVENT_SELF_MANAGED_APPEARED;
    public static final int EVENT_SELF_MANAGED_DISAPPEARED = android.companion.DevicePresenceEvent.EVENT_SELF_MANAGED_DISAPPEARED;
    public static final int NO_ASSOCIATION = android.companion.DevicePresenceEvent.NO_ASSOCIATION;

}
