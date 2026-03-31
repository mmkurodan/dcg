// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.oob;

public final class TransportHandle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransportHandle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.oob.TransportHandle wrap(android.ranging.oob.TransportHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.oob.TransportHandle(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.oob.TransportHandle getReal() {
        return (android.ranging.oob.TransportHandle) real;
    }

    public android.ranging.oob.TransportHandle unwrap() {
        return getReal();
    }

    public void registerReceiveCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.ranging.oob.TransportHandle.ReceiveCallback arg1) {
        ((android.ranging.oob.TransportHandle) real).registerReceiveCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void sendData(byte[] arg0) {
        ((android.ranging.oob.TransportHandle) real).sendData(arg0);
    }

    public static final class ReceiveCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ReceiveCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.oob.TransportHandle.ReceiveCallback wrap(android.ranging.oob.TransportHandle.ReceiveCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.oob.TransportHandle.ReceiveCallback(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.oob.TransportHandle.ReceiveCallback getReal() {
            return (android.ranging.oob.TransportHandle.ReceiveCallback) real;
        }

        public android.ranging.oob.TransportHandle.ReceiveCallback unwrap() {
            return getReal();
        }

        public void onClose() {
            ((android.ranging.oob.TransportHandle.ReceiveCallback) real).onClose();
        }

        public void onDisconnect() {
            ((android.ranging.oob.TransportHandle.ReceiveCallback) real).onDisconnect();
        }

        public void onReceiveData(byte[] arg0) {
            ((android.ranging.oob.TransportHandle.ReceiveCallback) real).onReceiveData(arg0);
        }

        public void onReconnect() {
            ((android.ranging.oob.TransportHandle.ReceiveCallback) real).onReconnect();
        }

        public void onSendFailed() {
            ((android.ranging.oob.TransportHandle.ReceiveCallback) real).onSendFailed();
        }

    }
}
