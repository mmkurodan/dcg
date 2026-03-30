// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmSupportInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmSupportInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmSupportInfo wrap(android.drm.DrmSupportInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmSupportInfo(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmSupportInfo getReal() {
        return (android.drm.DrmSupportInfo) real;
    }

    public android.drm.DrmSupportInfo unwrap() {
        return getReal();
    }

    public DrmSupportInfo() {
        this(new android.drm.DrmSupportInfo(), (__DcgwBridgeToken) null);
    }

    public void addFileSuffix(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.drm.DrmSupportInfo#addFileSuffix(java.lang.String)");
    }

    public void addMimeType(java.lang.String arg0) {
        ((android.drm.DrmSupportInfo) real).addMimeType(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.drm.DrmSupportInfo) real).equals(arg0);
    }

    public java.lang.String getDescriprition() {
        return ((android.drm.DrmSupportInfo) real).getDescriprition();
    }

    public java.lang.String getDescription() {
        return ((android.drm.DrmSupportInfo) real).getDescription();
    }

    public int hashCode() {
        return ((android.drm.DrmSupportInfo) real).hashCode();
    }

    public void setDescription(java.lang.String arg0) {
        ((android.drm.DrmSupportInfo) real).setDescription(arg0);
    }

}
