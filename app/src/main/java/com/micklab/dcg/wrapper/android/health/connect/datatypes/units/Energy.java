// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Energy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Energy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy wrap(android.health.connect.datatypes.units.Energy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.Energy getReal() {
        return (android.health.connect.datatypes.units.Energy) real;
    }

    public android.health.connect.datatypes.units.Energy unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy arg0) {
        return ((android.health.connect.datatypes.units.Energy) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.Energy) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy fromCalories(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy.wrap(android.health.connect.datatypes.units.Energy.fromCalories(arg0));
    }

    public double getInCalories() {
        return ((android.health.connect.datatypes.units.Energy) real).getInCalories();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.Energy) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.Energy) real).toString();
    }

}
