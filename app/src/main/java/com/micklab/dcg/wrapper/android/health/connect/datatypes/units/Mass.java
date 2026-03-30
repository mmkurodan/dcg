// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Mass {
    private final android.health.connect.datatypes.units.Mass real;

    public Mass(android.health.connect.datatypes.units.Mass real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass wrap(android.health.connect.datatypes.units.Mass real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass(real);
    }

    public android.health.connect.datatypes.units.Mass unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass fromGrams(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass.wrap(android.health.connect.datatypes.units.Mass.fromGrams(arg0));
    }

    public double getInGrams() {
        return real.getInGrams();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
