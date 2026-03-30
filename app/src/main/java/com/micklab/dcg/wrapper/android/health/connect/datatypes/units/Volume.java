// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes.units;

public final class Volume {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Volume(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume wrap(android.health.connect.datatypes.units.Volume real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.units.Volume getReal() {
        return (android.health.connect.datatypes.units.Volume) real;
    }

    public android.health.connect.datatypes.units.Volume unwrap() {
        return getReal();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume arg0) {
        return ((android.health.connect.datatypes.units.Volume) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.units.Volume) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume fromLiters(double arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume.wrap(android.health.connect.datatypes.units.Volume.fromLiters(arg0));
    }

    public double getInLiters() {
        return ((android.health.connect.datatypes.units.Volume) real).getInLiters();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.units.Volume) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.units.Volume) real).toString();
    }

}
