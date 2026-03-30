// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Pressure {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Pressure(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure wrap(android.health.connect.datatypes.units.Pressure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.Pressure getReal() {
        return (android.health.connect.datatypes.units.Pressure) real;
    }

    public android.health.connect.datatypes.units.Pressure unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure arg0) {
        return ((android.health.connect.datatypes.units.Pressure) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.Pressure) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure fromMillimetersOfMercury(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure.wrap(android.health.connect.datatypes.units.Pressure.fromMillimetersOfMercury(arg0));
    }

    public double getInMillimetersOfMercury() {
        return ((android.health.connect.datatypes.units.Pressure) real).getInMillimetersOfMercury();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.Pressure) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.Pressure) real).toString();
    }

}
