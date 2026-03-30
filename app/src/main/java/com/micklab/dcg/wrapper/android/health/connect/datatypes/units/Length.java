// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Length {
    private final android.health.connect.datatypes.units.Length real;

    public Length(android.health.connect.datatypes.units.Length real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length wrap(android.health.connect.datatypes.units.Length real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length(real);
    }

    public android.health.connect.datatypes.units.Length unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length fromMeters(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(android.health.connect.datatypes.units.Length.fromMeters(arg0));
    }

    public double getInMeters() {
        return real.getInMeters();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
