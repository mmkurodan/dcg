// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class CancellationSignal {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CancellationSignal(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.CancellationSignal wrap(android.os.CancellationSignal real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.CancellationSignal(real, (__DcgwBridgeToken) null);
    }

    public android.os.CancellationSignal getReal() {
        return (android.os.CancellationSignal) real;
    }

    public android.os.CancellationSignal unwrap() {
        return getReal();
    }

    public CancellationSignal() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CancellationSignal#android.os.CancellationSignal()");
    }

    public void cancel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CancellationSignal#cancel()");
    }

    public boolean isCanceled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CancellationSignal#isCanceled()");
    }

    public void setOnCancelListener(com.micklab.dcg.wrapper.android.os.CancellationSignal.OnCancelListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CancellationSignal#setOnCancelListener(android.os.CancellationSignal$OnCancelListener)");
    }

    public void throwIfCanceled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CancellationSignal#throwIfCanceled()");
    }

    public static final class OnCancelListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCancelListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.CancellationSignal.OnCancelListener wrap(android.os.CancellationSignal.OnCancelListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.CancellationSignal.OnCancelListener(real, (__DcgwBridgeToken) null);
        }

        public android.os.CancellationSignal.OnCancelListener getReal() {
            return (android.os.CancellationSignal.OnCancelListener) real;
        }

        public android.os.CancellationSignal.OnCancelListener unwrap() {
            return getReal();
        }

        public void onCancel() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CancellationSignal$OnCancelListener#onCancel()");
        }

    }
}
