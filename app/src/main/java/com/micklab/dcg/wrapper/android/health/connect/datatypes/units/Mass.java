// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Mass {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Mass(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass wrap(android.health.connect.datatypes.units.Mass real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.Mass getReal() {
        return (android.health.connect.datatypes.units.Mass) real;
    }

    public android.health.connect.datatypes.units.Mass unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass arg0) {
        return ((android.health.connect.datatypes.units.Mass) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.Mass) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass fromGrams(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass.wrap(android.health.connect.datatypes.units.Mass.fromGrams(arg0));
    }

    public double getInGrams() {
        return ((android.health.connect.datatypes.units.Mass) real).getInGrams();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.Mass) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.Mass) real).toString();
    }

}
