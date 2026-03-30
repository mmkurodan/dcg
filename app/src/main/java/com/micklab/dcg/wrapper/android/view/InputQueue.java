// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class InputQueue {
    private final android.view.InputQueue real;

    public InputQueue(android.view.InputQueue real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.InputQueue wrap(android.view.InputQueue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.InputQueue(real);
    }

    public android.view.InputQueue unwrap() {
        return real;
    }

    public static final class Callback {
        private final android.view.InputQueue.Callback real;

        public Callback(android.view.InputQueue.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.InputQueue.Callback wrap(android.view.InputQueue.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.InputQueue.Callback(real);
        }

        public android.view.InputQueue.Callback unwrap() {
            return real;
        }

        public void onInputQueueCreated(com.micklab.dcg.wrapper.android.view.InputQueue arg0) {
            real.onInputQueueCreated(arg0 == null ? null : arg0.unwrap());
        }

        public void onInputQueueDestroyed(com.micklab.dcg.wrapper.android.view.InputQueue arg0) {
            real.onInputQueueDestroyed(arg0 == null ? null : arg0.unwrap());
        }

    }
}
