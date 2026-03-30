// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class Capability {
    private final android.hardware.camera2.params.Capability real;

    public Capability(android.hardware.camera2.params.Capability real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.Capability wrap(android.hardware.camera2.params.Capability real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.Capability(real);
    }

    public android.hardware.camera2.params.Capability unwrap() {
        return real;
    }

    public Capability(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1, com.micklab.dcg.wrapper.android.util.Range arg2) {
        this(new android.hardware.camera2.params.Capability(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.Size getMaxStreamingSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(real.getMaxStreamingSize());
    }

    public int getMode() {
        return real.getMode();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
