// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Percentage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Percentage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage wrap(android.health.connect.datatypes.units.Percentage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.Percentage getReal() {
        return (android.health.connect.datatypes.units.Percentage) real;
    }

    public android.health.connect.datatypes.units.Percentage unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage arg0) {
        return ((android.health.connect.datatypes.units.Percentage) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.Percentage) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage fromValue(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage.wrap(android.health.connect.datatypes.units.Percentage.fromValue(arg0));
    }

    public double getValue() {
        return ((android.health.connect.datatypes.units.Percentage) real).getValue();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.Percentage) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.Percentage) real).toString();
    }

}
