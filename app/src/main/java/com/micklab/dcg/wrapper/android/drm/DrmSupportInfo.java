// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmSupportInfo {
    private final android.drm.DrmSupportInfo real;

    public DrmSupportInfo(android.drm.DrmSupportInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmSupportInfo wrap(android.drm.DrmSupportInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmSupportInfo(real);
    }

    public android.drm.DrmSupportInfo unwrap() {
        return real;
    }

    public DrmSupportInfo() {
        this(new android.drm.DrmSupportInfo());
    }

    public void addFileSuffix(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.drm.DrmSupportInfo#addFileSuffix(java.lang.String)");
    }

    public void addMimeType(java.lang.String arg0) {
        real.addMimeType(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getDescriprition() {
        return real.getDescriprition();
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void setDescription(java.lang.String arg0) {
        real.setDescription(arg0);
    }

}
