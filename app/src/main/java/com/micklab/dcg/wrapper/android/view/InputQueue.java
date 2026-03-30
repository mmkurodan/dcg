// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class InputQueue {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputQueue(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.InputQueue wrap(android.view.InputQueue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.InputQueue(real, (__DcgwBridgeToken) null);
    }

    public android.view.InputQueue getReal() {
        return (android.view.InputQueue) real;
    }

    public android.view.InputQueue unwrap() {
        return getReal();
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.InputQueue.Callback wrap(android.view.InputQueue.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.InputQueue.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.view.InputQueue.Callback getReal() {
            return (android.view.InputQueue.Callback) real;
        }

        public android.view.InputQueue.Callback unwrap() {
            return getReal();
        }

        public void onInputQueueCreated(com.micklab.dcg.wrapper.android.view.InputQueue arg0) {
            ((android.view.InputQueue.Callback) real).onInputQueueCreated(arg0 == null ? null : arg0.getReal());
        }

        public void onInputQueueDestroyed(com.micklab.dcg.wrapper.android.view.InputQueue arg0) {
            ((android.view.InputQueue.Callback) real).onInputQueueDestroyed(arg0 == null ? null : arg0.getReal());
        }

    }
}
