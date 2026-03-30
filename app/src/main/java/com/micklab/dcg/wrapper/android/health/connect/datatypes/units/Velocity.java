// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Velocity {
    private final android.health.connect.datatypes.units.Velocity real;

    public Velocity(android.health.connect.datatypes.units.Velocity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity wrap(android.health.connect.datatypes.units.Velocity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity(real);
    }

    public android.health.connect.datatypes.units.Velocity unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity fromMetersPerSecond(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity.wrap(android.health.connect.datatypes.units.Velocity.fromMetersPerSecond(arg0));
    }

    public double getInMetersPerSecond() {
        return real.getInMetersPerSecond();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
