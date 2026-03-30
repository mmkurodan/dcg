// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MtpEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpEvent wrap(android.mtp.MtpEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpEvent(real, (__DcgwBridgeToken) null);
    }

    public android.mtp.MtpEvent getReal() {
        return (android.mtp.MtpEvent) real;
    }

    public android.mtp.MtpEvent unwrap() {
        return getReal();
    }

    public int getDevicePropCode() {
        return ((android.mtp.MtpEvent) real).getDevicePropCode();
    }

    public int getEventCode() {
        return ((android.mtp.MtpEvent) real).getEventCode();
    }

    public int getObjectFormatCode() {
        return ((android.mtp.MtpEvent) real).getObjectFormatCode();
    }

    public int getObjectHandle() {
        return ((android.mtp.MtpEvent) real).getObjectHandle();
    }

    public int getObjectPropCode() {
        return ((android.mtp.MtpEvent) real).getObjectPropCode();
    }

    public int getParameter1() {
        return ((android.mtp.MtpEvent) real).getParameter1();
    }

    public int getParameter2() {
        return ((android.mtp.MtpEvent) real).getParameter2();
    }

    public int getParameter3() {
        return ((android.mtp.MtpEvent) real).getParameter3();
    }

    public int getStorageId() {
        return ((android.mtp.MtpEvent) real).getStorageId();
    }

    public int getTransactionId() {
        return ((android.mtp.MtpEvent) real).getTransactionId();
    }

    public static final int EVENT_CANCEL_TRANSACTION = android.mtp.MtpEvent.EVENT_CANCEL_TRANSACTION;
    public static final int EVENT_CAPTURE_COMPLETE = android.mtp.MtpEvent.EVENT_CAPTURE_COMPLETE;
    public static final int EVENT_DEVICE_INFO_CHANGED = android.mtp.MtpEvent.EVENT_DEVICE_INFO_CHANGED;
    public static final int EVENT_DEVICE_PROP_CHANGED = android.mtp.MtpEvent.EVENT_DEVICE_PROP_CHANGED;
    public static final int EVENT_DEVICE_RESET = android.mtp.MtpEvent.EVENT_DEVICE_RESET;
    public static final int EVENT_OBJECT_ADDED = android.mtp.MtpEvent.EVENT_OBJECT_ADDED;
    public static final int EVENT_OBJECT_INFO_CHANGED = android.mtp.MtpEvent.EVENT_OBJECT_INFO_CHANGED;
    public static final int EVENT_OBJECT_PROP_CHANGED = android.mtp.MtpEvent.EVENT_OBJECT_PROP_CHANGED;
    public static final int EVENT_OBJECT_PROP_DESC_CHANGED = android.mtp.MtpEvent.EVENT_OBJECT_PROP_DESC_CHANGED;
    public static final int EVENT_OBJECT_REFERENCES_CHANGED = android.mtp.MtpEvent.EVENT_OBJECT_REFERENCES_CHANGED;
    public static final int EVENT_OBJECT_REMOVED = android.mtp.MtpEvent.EVENT_OBJECT_REMOVED;
    public static final int EVENT_REQUEST_OBJECT_TRANSFER = android.mtp.MtpEvent.EVENT_REQUEST_OBJECT_TRANSFER;
    public static final int EVENT_STORAGE_INFO_CHANGED = android.mtp.MtpEvent.EVENT_STORAGE_INFO_CHANGED;
    public static final int EVENT_STORE_ADDED = android.mtp.MtpEvent.EVENT_STORE_ADDED;
    public static final int EVENT_STORE_FULL = android.mtp.MtpEvent.EVENT_STORE_FULL;
    public static final int EVENT_STORE_REMOVED = android.mtp.MtpEvent.EVENT_STORE_REMOVED;
    public static final int EVENT_UNDEFINED = android.mtp.MtpEvent.EVENT_UNDEFINED;
    public static final int EVENT_UNREPORTED_STATUS = android.mtp.MtpEvent.EVENT_UNREPORTED_STATUS;

}
