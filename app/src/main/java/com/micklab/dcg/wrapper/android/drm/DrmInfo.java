// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmInfo {
    private final android.drm.DrmInfo real;

    public DrmInfo(android.drm.DrmInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmInfo wrap(android.drm.DrmInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmInfo(real);
    }

    public android.drm.DrmInfo unwrap() {
        return real;
    }

    public DrmInfo(int arg0, byte[] arg1, java.lang.String arg2) {
        this(new android.drm.DrmInfo(arg0, arg1, arg2));
    }

    public DrmInfo(int arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.drm.DrmInfo(arg0, arg1, arg2));
    }

    public java.lang.Object get(java.lang.String arg0) {
        return real.get(arg0);
    }

    public byte[] getData() {
        return real.getData();
    }

    public int getInfoType() {
        return real.getInfoType();
    }

    public java.lang.String getMimeType() {
        return real.getMimeType();
    }

    public void put(java.lang.String arg0, java.lang.Object arg1) {
        real.put(arg0, arg1);
    }

}
