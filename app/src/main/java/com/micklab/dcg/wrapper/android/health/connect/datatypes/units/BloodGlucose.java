// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class BloodGlucose {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BloodGlucose(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose wrap(android.health.connect.datatypes.units.BloodGlucose real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.BloodGlucose getReal() {
        return (android.health.connect.datatypes.units.BloodGlucose) real;
    }

    public android.health.connect.datatypes.units.BloodGlucose unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose arg0) {
        return ((android.health.connect.datatypes.units.BloodGlucose) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.BloodGlucose) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose fromMillimolesPerLiter(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose.wrap(android.health.connect.datatypes.units.BloodGlucose.fromMillimolesPerLiter(arg0));
    }

    public double getInMillimolesPerLiter() {
        return ((android.health.connect.datatypes.units.BloodGlucose) real).getInMillimolesPerLiter();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.BloodGlucose) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.BloodGlucose) real).toString();
    }

}
