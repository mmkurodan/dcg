// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmUtils {
    private final android.drm.DrmUtils real;

    public DrmUtils(android.drm.DrmUtils real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmUtils wrap(android.drm.DrmUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmUtils(real);
    }

    public android.drm.DrmUtils unwrap() {
        return real;
    }

    public DrmUtils() {
        this(new android.drm.DrmUtils());
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmUtils.ExtendedMetadataParser getExtendedMetadataParser(byte[] arg0) {
        return com.micklab.dcg.wrapper.android.drm.DrmUtils.ExtendedMetadataParser.wrap(android.drm.DrmUtils.getExtendedMetadataParser(arg0));
    }

    public static final class ExtendedMetadataParser {
        private final android.drm.DrmUtils.ExtendedMetadataParser real;

        public ExtendedMetadataParser(android.drm.DrmUtils.ExtendedMetadataParser real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmUtils.ExtendedMetadataParser wrap(android.drm.DrmUtils.ExtendedMetadataParser real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmUtils.ExtendedMetadataParser(real);
        }

        public android.drm.DrmUtils.ExtendedMetadataParser unwrap() {
            return real;
        }

        public java.lang.String get(java.lang.String arg0) {
            return real.get(arg0);
        }

    }
}
