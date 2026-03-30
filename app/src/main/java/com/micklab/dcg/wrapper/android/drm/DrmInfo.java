// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmInfo wrap(android.drm.DrmInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmInfo(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmInfo getReal() {
        return (android.drm.DrmInfo) real;
    }

    public android.drm.DrmInfo unwrap() {
        return getReal();
    }

    public DrmInfo(int arg0, byte[] arg1, java.lang.String arg2) {
        this(new android.drm.DrmInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public DrmInfo(int arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.drm.DrmInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public java.lang.Object get(java.lang.String arg0) {
        return ((android.drm.DrmInfo) real).get(arg0);
    }

    public byte[] getData() {
        return ((android.drm.DrmInfo) real).getData();
    }

    public int getInfoType() {
        return ((android.drm.DrmInfo) real).getInfoType();
    }

    public java.lang.String getMimeType() {
        return ((android.drm.DrmInfo) real).getMimeType();
    }

    public void put(java.lang.String arg0, java.lang.Object arg1) {
        ((android.drm.DrmInfo) real).put(arg0, arg1);
    }

}
