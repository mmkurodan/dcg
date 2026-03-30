// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpEvent {
    private final android.mtp.MtpEvent real;

    public MtpEvent(android.mtp.MtpEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpEvent wrap(android.mtp.MtpEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpEvent(real);
    }

    public android.mtp.MtpEvent unwrap() {
        return real;
    }

    public int getDevicePropCode() {
        return real.getDevicePropCode();
    }

    public int getEventCode() {
        return real.getEventCode();
    }

    public int getObjectFormatCode() {
        return real.getObjectFormatCode();
    }

    public int getObjectHandle() {
        return real.getObjectHandle();
    }

    public int getObjectPropCode() {
        return real.getObjectPropCode();
    }

    public int getParameter1() {
        return real.getParameter1();
    }

    public int getParameter2() {
        return real.getParameter2();
    }

    public int getParameter3() {
        return real.getParameter3();
    }

    public int getStorageId() {
        return real.getStorageId();
    }

    public int getTransactionId() {
        return real.getTransactionId();
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
