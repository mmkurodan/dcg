// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmManagerClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrmManagerClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmManagerClient wrap(android.drm.DrmManagerClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmManagerClient(real, (__DcgwBridgeToken) null);
    }

    public android.drm.DrmManagerClient getReal() {
        return (android.drm.DrmManagerClient) real;
    }

    public android.drm.DrmManagerClient unwrap() {
        return getReal();
    }

    public DrmManagerClient(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.drm.DrmManagerClient(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.drm.DrmInfo acquireDrmInfo(com.micklab.dcg.wrapper.android.drm.DrmInfoRequest arg0) {
        return com.micklab.dcg.wrapper.android.drm.DrmInfo.wrap(((android.drm.DrmManagerClient) real).acquireDrmInfo(arg0 == null ? null : arg0.getReal()));
    }

    public int acquireRights(com.micklab.dcg.wrapper.android.drm.DrmInfoRequest arg0) {
        return ((android.drm.DrmManagerClient) real).acquireRights(arg0 == null ? null : arg0.getReal());
    }

    public boolean canHandle(java.lang.String arg0, java.lang.String arg1) {
        return ((android.drm.DrmManagerClient) real).canHandle(arg0, arg1);
    }

    public boolean canHandle(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return ((android.drm.DrmManagerClient) real).canHandle(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int checkRightsStatus(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.drm.DrmManagerClient) real).checkRightsStatus(arg0 == null ? null : arg0.getReal());
    }

    public int checkRightsStatus(java.lang.String arg0) {
        return ((android.drm.DrmManagerClient) real).checkRightsStatus(arg0);
    }

    public int checkRightsStatus(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return ((android.drm.DrmManagerClient) real).checkRightsStatus(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int checkRightsStatus(java.lang.String arg0, int arg1) {
        return ((android.drm.DrmManagerClient) real).checkRightsStatus(arg0, arg1);
    }

    public void close() {
        ((android.drm.DrmManagerClient) real).close();
    }

    public com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus closeConvertSession(int arg0) {
        return com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus.wrap(((android.drm.DrmManagerClient) real).closeConvertSession(arg0));
    }

    public com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus convertData(int arg0, byte[] arg1) {
        return com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus.wrap(((android.drm.DrmManagerClient) real).convertData(arg0, arg1));
    }

    public java.lang.String[] getAvailableDrmEngines() {
        return ((android.drm.DrmManagerClient) real).getAvailableDrmEngines();
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getConstraints(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(((android.drm.DrmManagerClient) real).getConstraints(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getConstraints(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(((android.drm.DrmManagerClient) real).getConstraints(arg0, arg1));
    }

    public int getDrmObjectType(java.lang.String arg0, java.lang.String arg1) {
        return ((android.drm.DrmManagerClient) real).getDrmObjectType(arg0, arg1);
    }

    public int getDrmObjectType(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return ((android.drm.DrmManagerClient) real).getDrmObjectType(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getMetadata(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(((android.drm.DrmManagerClient) real).getMetadata(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getMetadata(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(((android.drm.DrmManagerClient) real).getMetadata(arg0));
    }

    public java.lang.String getOriginalMimeType(java.lang.String arg0) {
        return ((android.drm.DrmManagerClient) real).getOriginalMimeType(arg0);
    }

    public java.lang.String getOriginalMimeType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.drm.DrmManagerClient) real).getOriginalMimeType(arg0 == null ? null : arg0.getReal());
    }

    public int openConvertSession(java.lang.String arg0) {
        return ((android.drm.DrmManagerClient) real).openConvertSession(arg0);
    }

    public int processDrmInfo(com.micklab.dcg.wrapper.android.drm.DrmInfo arg0) {
        return ((android.drm.DrmManagerClient) real).processDrmInfo(arg0 == null ? null : arg0.getReal());
    }

    public void release() {
        ((android.drm.DrmManagerClient) real).release();
    }

    public int removeAllRights() {
        return ((android.drm.DrmManagerClient) real).removeAllRights();
    }

    public int removeRights(java.lang.String arg0) {
        return ((android.drm.DrmManagerClient) real).removeRights(arg0);
    }

    public int removeRights(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.drm.DrmManagerClient) real).removeRights(arg0 == null ? null : arg0.getReal());
    }

    public int saveRights(com.micklab.dcg.wrapper.android.drm.DrmRights arg0, java.lang.String arg1, java.lang.String arg2) throws java.io.IOException {
        return ((android.drm.DrmManagerClient) real).saveRights(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void setOnErrorListener(com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnErrorListener arg0) {
        ((android.drm.DrmManagerClient) real).setOnErrorListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnEventListener(com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnEventListener arg0) {
        ((android.drm.DrmManagerClient) real).setOnEventListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnInfoListener(com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnInfoListener arg0) {
        ((android.drm.DrmManagerClient) real).setOnInfoListener(arg0 == null ? null : arg0.getReal());
    }

    public static final int ERROR_NONE = android.drm.DrmManagerClient.ERROR_NONE;
    public static final int ERROR_UNKNOWN = android.drm.DrmManagerClient.ERROR_UNKNOWN;

    public static final class OnErrorListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnErrorListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnErrorListener wrap(android.drm.DrmManagerClient.OnErrorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnErrorListener(real, (__DcgwBridgeToken) null);
        }

        public android.drm.DrmManagerClient.OnErrorListener getReal() {
            return (android.drm.DrmManagerClient.OnErrorListener) real;
        }

        public android.drm.DrmManagerClient.OnErrorListener unwrap() {
            return getReal();
        }

        public void onError(com.micklab.dcg.wrapper.android.drm.DrmManagerClient arg0, com.micklab.dcg.wrapper.android.drm.DrmErrorEvent arg1) {
            ((android.drm.DrmManagerClient.OnErrorListener) real).onError(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnEventListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnEventListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnEventListener wrap(android.drm.DrmManagerClient.OnEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnEventListener(real, (__DcgwBridgeToken) null);
        }

        public android.drm.DrmManagerClient.OnEventListener getReal() {
            return (android.drm.DrmManagerClient.OnEventListener) real;
        }

        public android.drm.DrmManagerClient.OnEventListener unwrap() {
            return getReal();
        }

        public void onEvent(com.micklab.dcg.wrapper.android.drm.DrmManagerClient arg0, com.micklab.dcg.wrapper.android.drm.DrmEvent arg1) {
            ((android.drm.DrmManagerClient.OnEventListener) real).onEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnInfoListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnInfoListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnInfoListener wrap(android.drm.DrmManagerClient.OnInfoListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnInfoListener(real, (__DcgwBridgeToken) null);
        }

        public android.drm.DrmManagerClient.OnInfoListener getReal() {
            return (android.drm.DrmManagerClient.OnInfoListener) real;
        }

        public android.drm.DrmManagerClient.OnInfoListener unwrap() {
            return getReal();
        }

        public void onInfo(com.micklab.dcg.wrapper.android.drm.DrmManagerClient arg0, com.micklab.dcg.wrapper.android.drm.DrmInfoEvent arg1) {
            ((android.drm.DrmManagerClient.OnInfoListener) real).onInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
