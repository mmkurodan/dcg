// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class TemperatureDelta {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TemperatureDelta(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta wrap(android.health.connect.datatypes.units.TemperatureDelta real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.TemperatureDelta getReal() {
        return (android.health.connect.datatypes.units.TemperatureDelta) real;
    }

    public android.health.connect.datatypes.units.TemperatureDelta unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta arg0) {
        return ((android.health.connect.datatypes.units.TemperatureDelta) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.TemperatureDelta) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta fromCelsius(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta.wrap(android.health.connect.datatypes.units.TemperatureDelta.fromCelsius(arg0));
    }

    public double getInCelsius() {
        return ((android.health.connect.datatypes.units.TemperatureDelta) real).getInCelsius();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.TemperatureDelta) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.TemperatureDelta) real).toString();
    }

}
