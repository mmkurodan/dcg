// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmUtils {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmUtils(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmUtils wrap(android.drm.DrmUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmUtils(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmUtils getReal() {
        return (android.drm.DrmUtils) real;
    }

    public android.drm.DrmUtils unwrap() {
        return getReal();
    }

    public DrmUtils() {
        this(new android.drm.DrmUtils(), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmUtils.ExtendedMetadataParser getExtendedMetadataParser(byte[] arg0) {
        return com.micklab.dcg.wrapper.android.drm.DrmUtils.ExtendedMetadataParser.wrap(android.drm.DrmUtils.getExtendedMetadataParser(arg0));
    }

    public static final class ExtendedMetadataParser {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ExtendedMetadataParser(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmUtils.ExtendedMetadataParser wrap(android.drm.DrmUtils.ExtendedMetadataParser real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmUtils.ExtendedMetadataParser(real, (__DcgwBridgeToken) null);
        }

        public android.drm.DrmUtils.ExtendedMetadataParser getReal() {
            return (android.drm.DrmUtils.ExtendedMetadataParser) real;
        }

        public android.drm.DrmUtils.ExtendedMetadataParser unwrap() {
            return getReal();
        }

        public java.lang.String get(java.lang.String arg0) {
            return ((android.drm.DrmUtils.ExtendedMetadataParser) real).get(arg0);
        }

    }
}
