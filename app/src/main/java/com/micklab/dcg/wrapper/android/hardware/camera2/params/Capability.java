// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class Capability {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Capability(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.Capability wrap(android.hardware.camera2.params.Capability real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.Capability(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.Capability getReal() {
        return (android.hardware.camera2.params.Capability) real;
    }

    public android.hardware.camera2.params.Capability unwrap() {
        return getReal();
    }

    public Capability(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1, com.micklab.dcg.wrapper.android.util.Range arg2) {
        this(new android.hardware.camera2.params.Capability(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.Capability) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.Size getMaxStreamingSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(((android.hardware.camera2.params.Capability) real).getMaxStreamingSize());
    }

    public int getMode() {
        return ((android.hardware.camera2.params.Capability) real).getMode();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.Capability) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.Capability) real).toString();
    }

}
