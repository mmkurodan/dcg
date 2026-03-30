// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class TemperatureDelta {
    private final android.health.connect.datatypes.units.TemperatureDelta real;

    public TemperatureDelta(android.health.connect.datatypes.units.TemperatureDelta real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta wrap(android.health.connect.datatypes.units.TemperatureDelta real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta(real);
    }

    public android.health.connect.datatypes.units.TemperatureDelta unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta fromCelsius(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta.wrap(android.health.connect.datatypes.units.TemperatureDelta.fromCelsius(arg0));
    }

    public double getInCelsius() {
        return real.getInCelsius();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
