// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmManagerClient {
    private final android.drm.DrmManagerClient real;

    public DrmManagerClient(android.drm.DrmManagerClient real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmManagerClient wrap(android.drm.DrmManagerClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmManagerClient(real);
    }

    public android.drm.DrmManagerClient unwrap() {
        return real;
    }

    public DrmManagerClient(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.drm.DrmManagerClient(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.drm.DrmInfo acquireDrmInfo(com.micklab.dcg.wrapper.android.drm.DrmInfoRequest arg0) {
        return com.micklab.dcg.wrapper.android.drm.DrmInfo.wrap(real.acquireDrmInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public int acquireRights(com.micklab.dcg.wrapper.android.drm.DrmInfoRequest arg0) {
        return real.acquireRights(arg0 == null ? null : arg0.unwrap());
    }

    public boolean canHandle(java.lang.String arg0, java.lang.String arg1) {
        return real.canHandle(arg0, arg1);
    }

    public boolean canHandle(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return real.canHandle(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int checkRightsStatus(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.checkRightsStatus(arg0 == null ? null : arg0.unwrap());
    }

    public int checkRightsStatus(java.lang.String arg0) {
        return real.checkRightsStatus(arg0);
    }

    public int checkRightsStatus(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return real.checkRightsStatus(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int checkRightsStatus(java.lang.String arg0, int arg1) {
        return real.checkRightsStatus(arg0, arg1);
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus closeConvertSession(int arg0) {
        return com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus.wrap(real.closeConvertSession(arg0));
    }

    public com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus convertData(int arg0, byte[] arg1) {
        return com.micklab.dcg.wrapper.android.drm.DrmConvertedStatus.wrap(real.convertData(arg0, arg1));
    }

    public java.lang.String[] getAvailableDrmEngines() {
        return real.getAvailableDrmEngines();
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getConstraints(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(real.getConstraints(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getConstraints(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(real.getConstraints(arg0, arg1));
    }

    public int getDrmObjectType(java.lang.String arg0, java.lang.String arg1) {
        return real.getDrmObjectType(arg0, arg1);
    }

    public int getDrmObjectType(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return real.getDrmObjectType(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getMetadata(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(real.getMetadata(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getMetadata(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(real.getMetadata(arg0));
    }

    public java.lang.String getOriginalMimeType(java.lang.String arg0) {
        return real.getOriginalMimeType(arg0);
    }

    public java.lang.String getOriginalMimeType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.getOriginalMimeType(arg0 == null ? null : arg0.unwrap());
    }

    public int openConvertSession(java.lang.String arg0) {
        return real.openConvertSession(arg0);
    }

    public int processDrmInfo(com.micklab.dcg.wrapper.android.drm.DrmInfo arg0) {
        return real.processDrmInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void release() {
        real.release();
    }

    public int removeAllRights() {
        return real.removeAllRights();
    }

    public int removeRights(java.lang.String arg0) {
        return real.removeRights(arg0);
    }

    public int removeRights(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.removeRights(arg0 == null ? null : arg0.unwrap());
    }

    public int saveRights(com.micklab.dcg.wrapper.android.drm.DrmRights arg0, java.lang.String arg1, java.lang.String arg2) throws java.io.IOException {
        return real.saveRights(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setOnErrorListener(com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnErrorListener arg0) {
        real.setOnErrorListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnEventListener(com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnEventListener arg0) {
        real.setOnEventListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnInfoListener(com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnInfoListener arg0) {
        real.setOnInfoListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final int ERROR_NONE = android.drm.DrmManagerClient.ERROR_NONE;
    public static final int ERROR_UNKNOWN = android.drm.DrmManagerClient.ERROR_UNKNOWN;

    public static final class OnErrorListener {
        private final android.drm.DrmManagerClient.OnErrorListener real;

        public OnErrorListener(android.drm.DrmManagerClient.OnErrorListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnErrorListener wrap(android.drm.DrmManagerClient.OnErrorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnErrorListener(real);
        }

        public android.drm.DrmManagerClient.OnErrorListener unwrap() {
            return real;
        }

        public void onError(com.micklab.dcg.wrapper.android.drm.DrmManagerClient arg0, com.micklab.dcg.wrapper.android.drm.DrmErrorEvent arg1) {
            real.onError(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnEventListener {
        private final android.drm.DrmManagerClient.OnEventListener real;

        public OnEventListener(android.drm.DrmManagerClient.OnEventListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnEventListener wrap(android.drm.DrmManagerClient.OnEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnEventListener(real);
        }

        public android.drm.DrmManagerClient.OnEventListener unwrap() {
            return real;
        }

        public void onEvent(com.micklab.dcg.wrapper.android.drm.DrmManagerClient arg0, com.micklab.dcg.wrapper.android.drm.DrmEvent arg1) {
            real.onEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnInfoListener {
        private final android.drm.DrmManagerClient.OnInfoListener real;

        public OnInfoListener(android.drm.DrmManagerClient.OnInfoListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnInfoListener wrap(android.drm.DrmManagerClient.OnInfoListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmManagerClient.OnInfoListener(real);
        }

        public android.drm.DrmManagerClient.OnInfoListener unwrap() {
            return real;
        }

        public void onInfo(com.micklab.dcg.wrapper.android.drm.DrmManagerClient arg0, com.micklab.dcg.wrapper.android.drm.DrmInfoEvent arg1) {
            real.onInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
