// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class DrmInitData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmInitData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.DrmInitData wrap(android.media.DrmInitData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.DrmInitData(real, (__DcgwBridgeToken) null);
    }

    public android.media.DrmInitData getReal() {
        return (android.media.DrmInitData) real;
    }

    public android.media.DrmInitData unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData get(java.util.UUID arg0) {
        return com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData.wrap(((android.media.DrmInitData) real).get(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData getSchemeInitDataAt(int arg0) {
        return com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData.wrap(((android.media.DrmInitData) real).getSchemeInitDataAt(arg0));
    }

    public int getSchemeInitDataCount() {
        return ((android.media.DrmInitData) real).getSchemeInitDataCount();
    }

    public static final class SchemeInitData {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SchemeInitData(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData wrap(android.media.DrmInitData.SchemeInitData real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.DrmInitData.SchemeInitData(real, (__DcgwBridgeToken) null);
        }

        public android.media.DrmInitData.SchemeInitData getReal() {
            return (android.media.DrmInitData.SchemeInitData) real;
        }

        public android.media.DrmInitData.SchemeInitData unwrap() {
            return getReal();
        }

        public SchemeInitData(java.util.UUID arg0, java.lang.String arg1, byte[] arg2) {
            this(new android.media.DrmInitData.SchemeInitData(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.DrmInitData.SchemeInitData) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.media.DrmInitData.SchemeInitData) real).hashCode();
        }

        public static final java.util.UUID UUID_NIL = android.media.DrmInitData.SchemeInitData.UUID_NIL;

    }
}
