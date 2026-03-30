// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Velocity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Velocity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity wrap(android.health.connect.datatypes.units.Velocity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.Velocity getReal() {
        return (android.health.connect.datatypes.units.Velocity) real;
    }

    public android.health.connect.datatypes.units.Velocity unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity arg0) {
        return ((android.health.connect.datatypes.units.Velocity) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.Velocity) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity fromMetersPerSecond(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity.wrap(android.health.connect.datatypes.units.Velocity.fromMetersPerSecond(arg0));
    }

    public double getInMetersPerSecond() {
        return ((android.health.connect.datatypes.units.Velocity) real).getInMetersPerSecond();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.Velocity) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.Velocity) real).toString();
    }

}
