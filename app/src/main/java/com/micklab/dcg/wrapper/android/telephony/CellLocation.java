// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellLocation {
    private final android.telephony.CellLocation real;

    public CellLocation(android.telephony.CellLocation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellLocation wrap(android.telephony.CellLocation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellLocation(real);
    }

    public android.telephony.CellLocation unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellLocation getEmpty() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellLocation#getEmpty()");
    }

    public static void requestLocationUpdate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellLocation#requestLocationUpdate()");
    }

}
