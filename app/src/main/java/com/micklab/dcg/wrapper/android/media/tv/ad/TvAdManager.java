// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.ad;

public final class TvAdManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvAdManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.ad.TvAdManager wrap(android.media.tv.ad.TvAdManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.ad.TvAdManager(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.ad.TvAdManager getReal() {
        return (android.media.tv.ad.TvAdManager) real;
    }

    public android.media.tv.ad.TvAdManager unwrap() {
        return getReal();
    }

    public void registerCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.tv.ad.TvAdManager.TvAdServiceCallback arg1) {
        ((android.media.tv.ad.TvAdManager) real).registerCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void sendAppLinkCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.ad.TvAdManager) real).sendAppLinkCommand(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.media.tv.ad.TvAdManager.TvAdServiceCallback arg0) {
        ((android.media.tv.ad.TvAdManager) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_APP_LINK_COMMAND = android.media.tv.ad.TvAdManager.ACTION_APP_LINK_COMMAND;
    public static final java.lang.String APP_LINK_KEY_BACK_URI = android.media.tv.ad.TvAdManager.APP_LINK_KEY_BACK_URI;
    public static final java.lang.String APP_LINK_KEY_CLASS_NAME = android.media.tv.ad.TvAdManager.APP_LINK_KEY_CLASS_NAME;
    public static final java.lang.String APP_LINK_KEY_COMMAND_TYPE = android.media.tv.ad.TvAdManager.APP_LINK_KEY_COMMAND_TYPE;
    public static final java.lang.String APP_LINK_KEY_PACKAGE_NAME = android.media.tv.ad.TvAdManager.APP_LINK_KEY_PACKAGE_NAME;
    public static final java.lang.String APP_LINK_KEY_SERVICE_ID = android.media.tv.ad.TvAdManager.APP_LINK_KEY_SERVICE_ID;
    public static final int ERROR_BLOCKED = android.media.tv.ad.TvAdManager.ERROR_BLOCKED;
    public static final int ERROR_ENCRYPTED = android.media.tv.ad.TvAdManager.ERROR_ENCRYPTED;
    public static final int ERROR_NONE = android.media.tv.ad.TvAdManager.ERROR_NONE;
    public static final int ERROR_NOT_SUPPORTED = android.media.tv.ad.TvAdManager.ERROR_NOT_SUPPORTED;
    public static final int ERROR_RESOURCE_UNAVAILABLE = android.media.tv.ad.TvAdManager.ERROR_RESOURCE_UNAVAILABLE;
    public static final int ERROR_UNKNOWN = android.media.tv.ad.TvAdManager.ERROR_UNKNOWN;
    public static final int ERROR_UNKNOWN_CHANNEL = android.media.tv.ad.TvAdManager.ERROR_UNKNOWN_CHANNEL;
    public static final int ERROR_WEAK_SIGNAL = android.media.tv.ad.TvAdManager.ERROR_WEAK_SIGNAL;
    public static final java.lang.String INTENT_KEY_AD_SERVICE_ID = android.media.tv.ad.TvAdManager.INTENT_KEY_AD_SERVICE_ID;
    public static final java.lang.String INTENT_KEY_CHANNEL_URI = android.media.tv.ad.TvAdManager.INTENT_KEY_CHANNEL_URI;
    public static final java.lang.String INTENT_KEY_COMMAND_TYPE = android.media.tv.ad.TvAdManager.INTENT_KEY_COMMAND_TYPE;
    public static final java.lang.String INTENT_KEY_TV_INPUT_ID = android.media.tv.ad.TvAdManager.INTENT_KEY_TV_INPUT_ID;
    public static final java.lang.String SESSION_DATA_KEY_AD_BUFFER = android.media.tv.ad.TvAdManager.SESSION_DATA_KEY_AD_BUFFER;
    public static final java.lang.String SESSION_DATA_KEY_AD_REQUEST = android.media.tv.ad.TvAdManager.SESSION_DATA_KEY_AD_REQUEST;
    public static final java.lang.String SESSION_DATA_KEY_BROADCAST_INFO_REQUEST = android.media.tv.ad.TvAdManager.SESSION_DATA_KEY_BROADCAST_INFO_REQUEST;
    public static final java.lang.String SESSION_DATA_KEY_REQUEST_ID = android.media.tv.ad.TvAdManager.SESSION_DATA_KEY_REQUEST_ID;
    public static final java.lang.String SESSION_DATA_TYPE_AD_BUFFER_READY = android.media.tv.ad.TvAdManager.SESSION_DATA_TYPE_AD_BUFFER_READY;
    public static final java.lang.String SESSION_DATA_TYPE_AD_REQUEST = android.media.tv.ad.TvAdManager.SESSION_DATA_TYPE_AD_REQUEST;
    public static final java.lang.String SESSION_DATA_TYPE_BROADCAST_INFO_REQUEST = android.media.tv.ad.TvAdManager.SESSION_DATA_TYPE_BROADCAST_INFO_REQUEST;
    public static final java.lang.String SESSION_DATA_TYPE_REMOVE_BROADCAST_INFO_REQUEST = android.media.tv.ad.TvAdManager.SESSION_DATA_TYPE_REMOVE_BROADCAST_INFO_REQUEST;
    public static final int SESSION_STATE_ERROR = android.media.tv.ad.TvAdManager.SESSION_STATE_ERROR;
    public static final int SESSION_STATE_RUNNING = android.media.tv.ad.TvAdManager.SESSION_STATE_RUNNING;
    public static final int SESSION_STATE_STOPPED = android.media.tv.ad.TvAdManager.SESSION_STATE_STOPPED;

    public static final class TvAdServiceCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TvAdServiceCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.ad.TvAdManager.TvAdServiceCallback wrap(android.media.tv.ad.TvAdManager.TvAdServiceCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.ad.TvAdManager.TvAdServiceCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.ad.TvAdManager.TvAdServiceCallback getReal() {
            return (android.media.tv.ad.TvAdManager.TvAdServiceCallback) real;
        }

        public android.media.tv.ad.TvAdManager.TvAdServiceCallback unwrap() {
            return getReal();
        }

        public void onAdServiceAdded(java.lang.String arg0) {
            ((android.media.tv.ad.TvAdManager.TvAdServiceCallback) real).onAdServiceAdded(arg0);
        }

        public void onAdServiceRemoved(java.lang.String arg0) {
            ((android.media.tv.ad.TvAdManager.TvAdServiceCallback) real).onAdServiceRemoved(arg0);
        }

        public void onAdServiceUpdated(java.lang.String arg0) {
            ((android.media.tv.ad.TvAdManager.TvAdServiceCallback) real).onAdServiceUpdated(arg0);
        }

    }
}
