// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Pressure {
    private final android.health.connect.datatypes.units.Pressure real;

    public Pressure(android.health.connect.datatypes.units.Pressure real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure wrap(android.health.connect.datatypes.units.Pressure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure(real);
    }

    public android.health.connect.datatypes.units.Pressure unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure fromMillimetersOfMercury(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure.wrap(android.health.connect.datatypes.units.Pressure.fromMillimetersOfMercury(arg0));
    }

    public double getInMillimetersOfMercury() {
        return real.getInMillimetersOfMercury();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
