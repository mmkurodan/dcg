// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.quality;

public final class ParameterCapability {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ParameterCapability(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.quality.ParameterCapability wrap(android.media.quality.ParameterCapability real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.ParameterCapability(real, (__DcgwBridgeToken) null);
    }

    public android.media.quality.ParameterCapability getReal() {
        return (android.media.quality.ParameterCapability) real;
    }

    public android.media.quality.ParameterCapability unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.quality.ParameterCapability) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCapabilities() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.quality.ParameterCapability) real).getCapabilities());
    }

    public java.lang.String getParameterName() {
        return ((android.media.quality.ParameterCapability) real).getParameterName();
    }

    public int getParameterType() {
        return ((android.media.quality.ParameterCapability) real).getParameterType();
    }

    public boolean isSupported() {
        return ((android.media.quality.ParameterCapability) real).isSupported();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.quality.ParameterCapability) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String CAPABILITY_DEFAULT = android.media.quality.ParameterCapability.CAPABILITY_DEFAULT;
    public static final java.lang.String CAPABILITY_ENUM = android.media.quality.ParameterCapability.CAPABILITY_ENUM;
    public static final java.lang.String CAPABILITY_MAX = android.media.quality.ParameterCapability.CAPABILITY_MAX;
    public static final java.lang.String CAPABILITY_MIN = android.media.quality.ParameterCapability.CAPABILITY_MIN;
    public static final int TYPE_DOUBLE = android.media.quality.ParameterCapability.TYPE_DOUBLE;
    public static final int TYPE_INT = android.media.quality.ParameterCapability.TYPE_INT;
    public static final int TYPE_LONG = android.media.quality.ParameterCapability.TYPE_LONG;
    public static final int TYPE_NONE = android.media.quality.ParameterCapability.TYPE_NONE;
    public static final int TYPE_STRING = android.media.quality.ParameterCapability.TYPE_STRING;

}
