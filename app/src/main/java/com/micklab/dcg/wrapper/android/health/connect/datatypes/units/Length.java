// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Length {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Length(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length wrap(android.health.connect.datatypes.units.Length real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.Length getReal() {
        return (android.health.connect.datatypes.units.Length) real;
    }

    public android.health.connect.datatypes.units.Length unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
        return ((android.health.connect.datatypes.units.Length) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.Length) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length fromMeters(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(android.health.connect.datatypes.units.Length.fromMeters(arg0));
    }

    public double getInMeters() {
        return ((android.health.connect.datatypes.units.Length) real).getInMeters();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.Length) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.Length) real).toString();
    }

}
