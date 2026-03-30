// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Energy {
    private final android.health.connect.datatypes.units.Energy real;

    public Energy(android.health.connect.datatypes.units.Energy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy wrap(android.health.connect.datatypes.units.Energy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy(real);
    }

    public android.health.connect.datatypes.units.Energy unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy fromCalories(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy.wrap(android.health.connect.datatypes.units.Energy.fromCalories(arg0));
    }

    public double getInCalories() {
        return real.getInCalories();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
