// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCas {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaCas(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCas wrap(android.media.MediaCas real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCas(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaCas getReal() {
        return (android.media.MediaCas) real;
    }

    public android.media.MediaCas unwrap() {
        return getReal();
    }

    public MediaCas(int arg0) throws android.media.MediaCasException.UnsupportedCasException {
        this(new android.media.MediaCas(arg0), (__DcgwBridgeToken) null);
    }

    public MediaCas(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.lang.String arg2, int arg3) throws android.media.MediaCasException.UnsupportedCasException {
        this(new android.media.MediaCas(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public MediaCas(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.lang.String arg2, int arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, com.micklab.dcg.wrapper.android.media.MediaCas.EventListener arg5) throws android.media.MediaCasException.UnsupportedCasException {
        this(new android.media.MediaCas(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.media.MediaCas) real).close();
    }

    public static android.media.MediaCas.PluginDescriptor[] enumeratePlugins() {
        return android.media.MediaCas.enumeratePlugins();
    }

    public static boolean isSystemIdSupported(int arg0) {
        return android.media.MediaCas.isSystemIdSupported(arg0);
    }

    public android.media.MediaCas.Session openSession() throws android.media.MediaCasException {
        return ((android.media.MediaCas) real).openSession();
    }

    public android.media.MediaCas.Session openSession(int arg0, int arg1) throws android.media.MediaCasException {
        return ((android.media.MediaCas) real).openSession(arg0, arg1);
    }

    public void processEmm(byte[] arg0) throws android.media.MediaCasException {
        ((android.media.MediaCas) real).processEmm(arg0);
    }

    public void processEmm(byte[] arg0, int arg1, int arg2) throws android.media.MediaCasException {
        ((android.media.MediaCas) real).processEmm(arg0, arg1, arg2);
    }

    public void provision(java.lang.String arg0) throws android.media.MediaCasException {
        ((android.media.MediaCas) real).provision(arg0);
    }

    public void refreshEntitlements(int arg0, byte[] arg1) throws android.media.MediaCasException {
        ((android.media.MediaCas) real).refreshEntitlements(arg0, arg1);
    }

    public void sendEvent(int arg0, int arg1, byte[] arg2) throws android.media.MediaCasException {
        ((android.media.MediaCas) real).sendEvent(arg0, arg1, arg2);
    }

    public void setEventListener(com.micklab.dcg.wrapper.android.media.MediaCas.EventListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaCas) real).setEventListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setPrivateData(byte[] arg0) throws android.media.MediaCasException {
        ((android.media.MediaCas) real).setPrivateData(arg0);
    }

    public static final int PLUGIN_STATUS_PHYSICAL_MODULE_CHANGED = android.media.MediaCas.PLUGIN_STATUS_PHYSICAL_MODULE_CHANGED;
    public static final int PLUGIN_STATUS_SESSION_NUMBER_CHANGED = android.media.MediaCas.PLUGIN_STATUS_SESSION_NUMBER_CHANGED;
    public static final int SCRAMBLING_MODE_AES128 = android.media.MediaCas.SCRAMBLING_MODE_AES128;
    public static final int SCRAMBLING_MODE_AES_CBC = android.media.MediaCas.SCRAMBLING_MODE_AES_CBC;
    public static final int SCRAMBLING_MODE_AES_ECB = android.media.MediaCas.SCRAMBLING_MODE_AES_ECB;
    public static final int SCRAMBLING_MODE_AES_SCTE52 = android.media.MediaCas.SCRAMBLING_MODE_AES_SCTE52;
    public static final int SCRAMBLING_MODE_DVB_CISSA_V1 = android.media.MediaCas.SCRAMBLING_MODE_DVB_CISSA_V1;
    public static final int SCRAMBLING_MODE_DVB_CSA1 = android.media.MediaCas.SCRAMBLING_MODE_DVB_CSA1;
    public static final int SCRAMBLING_MODE_DVB_CSA2 = android.media.MediaCas.SCRAMBLING_MODE_DVB_CSA2;
    public static final int SCRAMBLING_MODE_DVB_CSA3_ENHANCE = android.media.MediaCas.SCRAMBLING_MODE_DVB_CSA3_ENHANCE;
    public static final int SCRAMBLING_MODE_DVB_CSA3_MINIMAL = android.media.MediaCas.SCRAMBLING_MODE_DVB_CSA3_MINIMAL;
    public static final int SCRAMBLING_MODE_DVB_CSA3_STANDARD = android.media.MediaCas.SCRAMBLING_MODE_DVB_CSA3_STANDARD;
    public static final int SCRAMBLING_MODE_DVB_IDSA = android.media.MediaCas.SCRAMBLING_MODE_DVB_IDSA;
    public static final int SCRAMBLING_MODE_MULTI2 = android.media.MediaCas.SCRAMBLING_MODE_MULTI2;
    public static final int SCRAMBLING_MODE_RESERVED = android.media.MediaCas.SCRAMBLING_MODE_RESERVED;
    public static final int SCRAMBLING_MODE_TDES_ECB = android.media.MediaCas.SCRAMBLING_MODE_TDES_ECB;
    public static final int SCRAMBLING_MODE_TDES_SCTE52 = android.media.MediaCas.SCRAMBLING_MODE_TDES_SCTE52;
    public static final int SESSION_USAGE_LIVE = android.media.MediaCas.SESSION_USAGE_LIVE;
    public static final int SESSION_USAGE_PLAYBACK = android.media.MediaCas.SESSION_USAGE_PLAYBACK;
    public static final int SESSION_USAGE_RECORD = android.media.MediaCas.SESSION_USAGE_RECORD;
    public static final int SESSION_USAGE_TIMESHIFT = android.media.MediaCas.SESSION_USAGE_TIMESHIFT;

    public static final class EventListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EventListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCas.EventListener wrap(android.media.MediaCas.EventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCas.EventListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCas.EventListener getReal() {
            return (android.media.MediaCas.EventListener) real;
        }

        public android.media.MediaCas.EventListener unwrap() {
            return getReal();
        }

        public void onEvent(com.micklab.dcg.wrapper.android.media.MediaCas arg0, int arg1, int arg2, byte[] arg3) {
            ((android.media.MediaCas.EventListener) real).onEvent(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

        public void onPluginStatusUpdate(com.micklab.dcg.wrapper.android.media.MediaCas arg0, int arg1, int arg2) {
            ((android.media.MediaCas.EventListener) real).onPluginStatusUpdate(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public void onResourceLost(com.micklab.dcg.wrapper.android.media.MediaCas arg0) {
            ((android.media.MediaCas.EventListener) real).onResourceLost(arg0 == null ? null : arg0.getReal());
        }

        public void onSessionEvent(com.micklab.dcg.wrapper.android.media.MediaCas arg0, android.media.MediaCas.Session arg1, int arg2, int arg3, byte[] arg4) {
            ((android.media.MediaCas.EventListener) real).onSessionEvent(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
        }

    }
    public static final class PluginDescriptor {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PluginDescriptor(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCas.PluginDescriptor wrap(android.media.MediaCas.PluginDescriptor real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCas.PluginDescriptor(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCas.PluginDescriptor getReal() {
            return (android.media.MediaCas.PluginDescriptor) real;
        }

        public android.media.MediaCas.PluginDescriptor unwrap() {
            return getReal();
        }

        public java.lang.String getName() {
            return ((android.media.MediaCas.PluginDescriptor) real).getName();
        }

        public int getSystemId() {
            return ((android.media.MediaCas.PluginDescriptor) real).getSystemId();
        }

        public java.lang.String toString() {
            return ((android.media.MediaCas.PluginDescriptor) real).toString();
        }

    }
}
