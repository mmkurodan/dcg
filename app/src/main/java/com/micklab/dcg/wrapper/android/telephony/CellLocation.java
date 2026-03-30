// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellLocation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CellLocation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellLocation wrap(android.telephony.CellLocation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellLocation(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.CellLocation getReal() {
        return (android.telephony.CellLocation) real;
    }

    public android.telephony.CellLocation unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellLocation getEmpty() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellLocation#getEmpty()");
    }

    public static void requestLocationUpdate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellLocation#requestLocationUpdate()");
    }

}
