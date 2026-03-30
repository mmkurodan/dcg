// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellSignalStrength {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CellSignalStrength(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellSignalStrength wrap(android.telephony.CellSignalStrength real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellSignalStrength(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.CellSignalStrength getReal() {
        return (android.telephony.CellSignalStrength) real;
    }

    public android.telephony.CellSignalStrength unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellSignalStrength#equals(java.lang.Object)");
    }

    public int getAsuLevel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellSignalStrength#getAsuLevel()");
    }

    public int getDbm() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellSignalStrength#getDbm()");
    }

    public int getLevel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellSignalStrength#getLevel()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellSignalStrength#hashCode()");
    }


}
