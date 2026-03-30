// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.interactive;

public final class TvInteractiveAppManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvInteractiveAppManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppManager wrap(android.media.tv.interactive.TvInteractiveAppManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppManager(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.interactive.TvInteractiveAppManager getReal() {
        return (android.media.tv.interactive.TvInteractiveAppManager) real;
    }

    public android.media.tv.interactive.TvInteractiveAppManager unwrap() {
        return getReal();
    }

    public void registerAppLinkInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo arg1) {
        ((android.media.tv.interactive.TvInteractiveAppManager) real).registerAppLinkInfo(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void registerCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback arg1) {
        ((android.media.tv.interactive.TvInteractiveAppManager) real).registerCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void sendAppLinkCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.interactive.TvInteractiveAppManager) real).sendAppLinkCommand(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterAppLinkInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo arg1) {
        ((android.media.tv.interactive.TvInteractiveAppManager) real).unregisterAppLinkInfo(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback arg0) {
        ((android.media.tv.interactive.TvInteractiveAppManager) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_APP_LINK_COMMAND = android.media.tv.interactive.TvInteractiveAppManager.ACTION_APP_LINK_COMMAND;
    public static final java.lang.String APP_LINK_KEY_BACK_URI = android.media.tv.interactive.TvInteractiveAppManager.APP_LINK_KEY_BACK_URI;
    public static final java.lang.String APP_LINK_KEY_CLASS_NAME = android.media.tv.interactive.TvInteractiveAppManager.APP_LINK_KEY_CLASS_NAME;
    public static final java.lang.String APP_LINK_KEY_COMMAND_TYPE = android.media.tv.interactive.TvInteractiveAppManager.APP_LINK_KEY_COMMAND_TYPE;
    public static final java.lang.String APP_LINK_KEY_PACKAGE_NAME = android.media.tv.interactive.TvInteractiveAppManager.APP_LINK_KEY_PACKAGE_NAME;
    public static final java.lang.String APP_LINK_KEY_SERVICE_ID = android.media.tv.interactive.TvInteractiveAppManager.APP_LINK_KEY_SERVICE_ID;
    public static final int ERROR_BLOCKED = android.media.tv.interactive.TvInteractiveAppManager.ERROR_BLOCKED;
    public static final int ERROR_ENCRYPTED = android.media.tv.interactive.TvInteractiveAppManager.ERROR_ENCRYPTED;
    public static final int ERROR_NONE = android.media.tv.interactive.TvInteractiveAppManager.ERROR_NONE;
    public static final int ERROR_NOT_SUPPORTED = android.media.tv.interactive.TvInteractiveAppManager.ERROR_NOT_SUPPORTED;
    public static final int ERROR_RESOURCE_UNAVAILABLE = android.media.tv.interactive.TvInteractiveAppManager.ERROR_RESOURCE_UNAVAILABLE;
    public static final int ERROR_UNKNOWN = android.media.tv.interactive.TvInteractiveAppManager.ERROR_UNKNOWN;
    public static final int ERROR_UNKNOWN_CHANNEL = android.media.tv.interactive.TvInteractiveAppManager.ERROR_UNKNOWN_CHANNEL;
    public static final int ERROR_WEAK_SIGNAL = android.media.tv.interactive.TvInteractiveAppManager.ERROR_WEAK_SIGNAL;
    public static final java.lang.String INTENT_KEY_BI_INTERACTIVE_APP_TYPE = android.media.tv.interactive.TvInteractiveAppManager.INTENT_KEY_BI_INTERACTIVE_APP_TYPE;
    public static final java.lang.String INTENT_KEY_BI_INTERACTIVE_APP_URI = android.media.tv.interactive.TvInteractiveAppManager.INTENT_KEY_BI_INTERACTIVE_APP_URI;
    public static final java.lang.String INTENT_KEY_CHANNEL_URI = android.media.tv.interactive.TvInteractiveAppManager.INTENT_KEY_CHANNEL_URI;
    public static final java.lang.String INTENT_KEY_COMMAND_TYPE = android.media.tv.interactive.TvInteractiveAppManager.INTENT_KEY_COMMAND_TYPE;
    public static final java.lang.String INTENT_KEY_INTERACTIVE_APP_SERVICE_ID = android.media.tv.interactive.TvInteractiveAppManager.INTENT_KEY_INTERACTIVE_APP_SERVICE_ID;
    public static final java.lang.String INTENT_KEY_TV_INPUT_ID = android.media.tv.interactive.TvInteractiveAppManager.INTENT_KEY_TV_INPUT_ID;
    public static final int INTERACTIVE_APP_STATE_ERROR = android.media.tv.interactive.TvInteractiveAppManager.INTERACTIVE_APP_STATE_ERROR;
    public static final int INTERACTIVE_APP_STATE_RUNNING = android.media.tv.interactive.TvInteractiveAppManager.INTERACTIVE_APP_STATE_RUNNING;
    public static final int INTERACTIVE_APP_STATE_STOPPED = android.media.tv.interactive.TvInteractiveAppManager.INTERACTIVE_APP_STATE_STOPPED;
    public static final int SERVICE_STATE_ERROR = android.media.tv.interactive.TvInteractiveAppManager.SERVICE_STATE_ERROR;
    public static final int SERVICE_STATE_PREPARING = android.media.tv.interactive.TvInteractiveAppManager.SERVICE_STATE_PREPARING;
    public static final int SERVICE_STATE_READY = android.media.tv.interactive.TvInteractiveAppManager.SERVICE_STATE_READY;
    public static final int SERVICE_STATE_UNREALIZED = android.media.tv.interactive.TvInteractiveAppManager.SERVICE_STATE_UNREALIZED;
    public static final int TELETEXT_APP_STATE_ERROR = android.media.tv.interactive.TvInteractiveAppManager.TELETEXT_APP_STATE_ERROR;
    public static final int TELETEXT_APP_STATE_HIDE = android.media.tv.interactive.TvInteractiveAppManager.TELETEXT_APP_STATE_HIDE;
    public static final int TELETEXT_APP_STATE_SHOW = android.media.tv.interactive.TvInteractiveAppManager.TELETEXT_APP_STATE_SHOW;

    public static final class TvInteractiveAppCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TvInteractiveAppCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback wrap(android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback getReal() {
            return (android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback) real;
        }

        public android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback unwrap() {
            return getReal();
        }

        public void onInteractiveAppServiceAdded(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback) real).onInteractiveAppServiceAdded(arg0);
        }

        public void onInteractiveAppServiceRemoved(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback) real).onInteractiveAppServiceRemoved(arg0);
        }

        public void onInteractiveAppServiceUpdated(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback) real).onInteractiveAppServiceUpdated(arg0);
        }

        public void onTvInteractiveAppServiceStateChanged(java.lang.String arg0, int arg1, int arg2, int arg3) {
            ((android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback) real).onTvInteractiveAppServiceStateChanged(arg0, arg1, arg2, arg3);
        }

    }
}
