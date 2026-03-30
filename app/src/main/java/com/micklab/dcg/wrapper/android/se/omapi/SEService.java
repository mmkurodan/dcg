// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.se.omapi;

public final class SEService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SEService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.se.omapi.SEService wrap(android.se.omapi.SEService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.SEService(real, (__DcgwBridgeToken) null);
    }

    public android.se.omapi.SEService getReal() {
        return (android.se.omapi.SEService) real;
    }

    public android.se.omapi.SEService unwrap() {
        return getReal();
    }

    public SEService(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.se.omapi.SEService.OnConnectedListener arg2) {
        this(new android.se.omapi.SEService(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public android.se.omapi.Reader[] getReaders() {
        return ((android.se.omapi.SEService) real).getReaders();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Reader getUiccReader(int arg0) {
        return com.micklab.dcg.wrapper.android.se.omapi.Reader.wrap(((android.se.omapi.SEService) real).getUiccReader(arg0));
    }

    public java.lang.String getVersion() {
        return ((android.se.omapi.SEService) real).getVersion();
    }

    public boolean isConnected() {
        return ((android.se.omapi.SEService) real).isConnected();
    }

    public void shutdown() {
        ((android.se.omapi.SEService) real).shutdown();
    }

    public static final java.lang.String ACTION_SECURE_ELEMENT_STATE_CHANGED = android.se.omapi.SEService.ACTION_SECURE_ELEMENT_STATE_CHANGED;
    public static final java.lang.String EXTRA_READER_NAME = android.se.omapi.SEService.EXTRA_READER_NAME;
    public static final java.lang.String EXTRA_READER_STATE = android.se.omapi.SEService.EXTRA_READER_STATE;

    public static final class OnConnectedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnConnectedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.se.omapi.SEService.OnConnectedListener wrap(android.se.omapi.SEService.OnConnectedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.SEService.OnConnectedListener(real, (__DcgwBridgeToken) null);
        }

        public android.se.omapi.SEService.OnConnectedListener getReal() {
            return (android.se.omapi.SEService.OnConnectedListener) real;
        }

        public android.se.omapi.SEService.OnConnectedListener unwrap() {
            return getReal();
        }

        public void onConnected() {
            ((android.se.omapi.SEService.OnConnectedListener) real).onConnected();
        }

    }
}
