// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Volume {
    private final android.health.connect.datatypes.units.Volume real;

    public Volume(android.health.connect.datatypes.units.Volume real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume wrap(android.health.connect.datatypes.units.Volume real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume(real);
    }

    public android.health.connect.datatypes.units.Volume unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume fromLiters(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume.wrap(android.health.connect.datatypes.units.Volume.fromLiters(arg0));
    }

    public double getInLiters() {
        return real.getInLiters();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
