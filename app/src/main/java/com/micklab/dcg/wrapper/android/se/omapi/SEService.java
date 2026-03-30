// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.se.omapi;

public final class SEService {
    private final android.se.omapi.SEService real;

    public SEService(android.se.omapi.SEService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.se.omapi.SEService wrap(android.se.omapi.SEService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.SEService(real);
    }

    public android.se.omapi.SEService unwrap() {
        return real;
    }

    public SEService(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.se.omapi.SEService.OnConnectedListener arg2) {
        this(new android.se.omapi.SEService(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public android.se.omapi.Reader[] getReaders() {
        return real.getReaders();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Reader getUiccReader(int arg0) {
        return com.micklab.dcg.wrapper.android.se.omapi.Reader.wrap(real.getUiccReader(arg0));
    }

    public java.lang.String getVersion() {
        return real.getVersion();
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public void shutdown() {
        real.shutdown();
    }

    public static final java.lang.String ACTION_SECURE_ELEMENT_STATE_CHANGED = android.se.omapi.SEService.ACTION_SECURE_ELEMENT_STATE_CHANGED;
    public static final java.lang.String EXTRA_READER_NAME = android.se.omapi.SEService.EXTRA_READER_NAME;
    public static final java.lang.String EXTRA_READER_STATE = android.se.omapi.SEService.EXTRA_READER_STATE;

    public static final class OnConnectedListener {
        private final android.se.omapi.SEService.OnConnectedListener real;

        public OnConnectedListener(android.se.omapi.SEService.OnConnectedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.se.omapi.SEService.OnConnectedListener wrap(android.se.omapi.SEService.OnConnectedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.SEService.OnConnectedListener(real);
        }

        public android.se.omapi.SEService.OnConnectedListener unwrap() {
            return real;
        }

        public void onConnected() {
            real.onConnected();
        }

    }
}
