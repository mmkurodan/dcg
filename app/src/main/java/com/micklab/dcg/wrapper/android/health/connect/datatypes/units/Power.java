// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Power {
    private final android.health.connect.datatypes.units.Power real;

    public Power(android.health.connect.datatypes.units.Power real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power wrap(android.health.connect.datatypes.units.Power real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power(real);
    }

    public android.health.connect.datatypes.units.Power unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power fromWatts(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power.wrap(android.health.connect.datatypes.units.Power.fromWatts(arg0));
    }

    public double getInWatts() {
        return real.getInWatts();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
