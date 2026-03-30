// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class CancellationSignal {
    private final android.os.CancellationSignal real;

    public CancellationSignal(android.os.CancellationSignal real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.CancellationSignal wrap(android.os.CancellationSignal real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.CancellationSignal(real);
    }

    public android.os.CancellationSignal unwrap() {
        return real;
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
        private final android.os.CancellationSignal.OnCancelListener real;

        public OnCancelListener(android.os.CancellationSignal.OnCancelListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.CancellationSignal.OnCancelListener wrap(android.os.CancellationSignal.OnCancelListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.CancellationSignal.OnCancelListener(real);
        }

        public android.os.CancellationSignal.OnCancelListener unwrap() {
            return real;
        }

        public void onCancel() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CancellationSignal$OnCancelListener#onCancel()");
        }

    }
}
