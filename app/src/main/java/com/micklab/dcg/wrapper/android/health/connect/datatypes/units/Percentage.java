// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Percentage {
    private final android.health.connect.datatypes.units.Percentage real;

    public Percentage(android.health.connect.datatypes.units.Percentage real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage wrap(android.health.connect.datatypes.units.Percentage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage(real);
    }

    public android.health.connect.datatypes.units.Percentage unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage fromValue(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage.wrap(android.health.connect.datatypes.units.Percentage.fromValue(arg0));
    }

    public double getValue() {
        return real.getValue();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
