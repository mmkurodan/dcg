// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class DrmInitData {
    private final android.media.DrmInitData real;

    public DrmInitData(android.media.DrmInitData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.DrmInitData wrap(android.media.DrmInitData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.DrmInitData(real);
    }

    public android.media.DrmInitData unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData get(java.util.UUID arg0) {
        return com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData.wrap(real.get(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData getSchemeInitDataAt(int arg0) {
        return com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData.wrap(real.getSchemeInitDataAt(arg0));
    }

    public int getSchemeInitDataCount() {
        return real.getSchemeInitDataCount();
    }

    public static final class SchemeInitData {
        private final android.media.DrmInitData.SchemeInitData real;

        public SchemeInitData(android.media.DrmInitData.SchemeInitData real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData wrap(android.media.DrmInitData.SchemeInitData real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData(real);
        }

        public android.media.DrmInitData.SchemeInitData unwrap() {
            return real;
        }

        public SchemeInitData(java.util.UUID arg0, java.lang.String arg1, byte[] arg2) {
            this(new android.media.DrmInitData.SchemeInitData(arg0, arg1, arg2));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public static final java.util.UUID UUID_NIL = android.media.DrmInitData.SchemeInitData.UUID_NIL;

    }
}
