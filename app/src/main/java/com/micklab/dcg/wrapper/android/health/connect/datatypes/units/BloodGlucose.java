// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class BloodGlucose {
    private final android.health.connect.datatypes.units.BloodGlucose real;

    public BloodGlucose(android.health.connect.datatypes.units.BloodGlucose real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose wrap(android.health.connect.datatypes.units.BloodGlucose real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose(real);
    }

    public android.health.connect.datatypes.units.BloodGlucose unwrap() {
        return real;
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose fromMillimolesPerLiter(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose.wrap(android.health.connect.datatypes.units.BloodGlucose.fromMillimolesPerLiter(arg0));
    }

    public double getInMillimolesPerLiter() {
        return real.getInMillimolesPerLiter();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
