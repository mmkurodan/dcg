// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Power {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Power(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power wrap(android.health.connect.datatypes.units.Power real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.Power getReal() {
        return (android.health.connect.datatypes.units.Power) real;
    }

    public android.health.connect.datatypes.units.Power unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power arg0) {
        return ((android.health.connect.datatypes.units.Power) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.Power) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power fromWatts(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power.wrap(android.health.connect.datatypes.units.Power.fromWatts(arg0));
    }

    public double getInWatts() {
        return ((android.health.connect.datatypes.units.Power) real).getInWatts();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.Power) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.Power) real).toString();
    }

}
