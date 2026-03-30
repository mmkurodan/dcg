// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Temperature {
    private final android.health.connect.datatypes.units.Temperature real;

    public Temperature(android.health.connect.datatypes.units.Temperature real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature wrap(android.health.connect.datatypes.units.Temperature real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature(real);
    }

    public android.health.connect.datatypes.units.Temperature unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature fromCelsius(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature.wrap(android.health.connect.datatypes.units.Temperature.fromCelsius(arg0));
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
