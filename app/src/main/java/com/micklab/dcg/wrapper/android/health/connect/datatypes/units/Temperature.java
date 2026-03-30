// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Temperature {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Temperature(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature wrap(android.health.connect.datatypes.units.Temperature real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.Temperature getReal() {
        return (android.health.connect.datatypes.units.Temperature) real;
    }

    public android.health.connect.datatypes.units.Temperature unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature arg0) {
        return ((android.health.connect.datatypes.units.Temperature) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.Temperature) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature fromCelsius(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature.wrap(android.health.connect.datatypes.units.Temperature.fromCelsius(arg0));
    }

    public double getInCelsius() {
        return ((android.health.connect.datatypes.units.Temperature) real).getInCelsius();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.Temperature) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.Temperature) real).toString();
    }

}
