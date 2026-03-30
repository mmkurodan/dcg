// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintDocumentAdapter {
    private final android.print.PrintDocumentAdapter real;

    public PrintDocumentAdapter(android.print.PrintDocumentAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter wrap(android.print.PrintDocumentAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter(real);
    }

    public android.print.PrintDocumentAdapter unwrap() {
        return real;
    }

    public void onFinish() {
        real.onFinish();
    }

    public void onLayout(com.micklab.dcg.wrapper.android.print.PrintAttributes arg0, com.micklab.dcg.wrapper.android.print.PrintAttributes arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2, com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.LayoutResultCallback arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
        real.onLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public void onStart() {
        real.onStart();
    }

    public void onWrite(android.print.PageRange[] arg0, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2, com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.WriteResultCallback arg3) {
        real.onWrite(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public static final java.lang.String EXTRA_PRINT_PREVIEW = android.print.PrintDocumentAdapter.EXTRA_PRINT_PREVIEW;

    public static final class LayoutResultCallback {
        private final android.print.PrintDocumentAdapter.LayoutResultCallback real;

        public LayoutResultCallback(android.print.PrintDocumentAdapter.LayoutResultCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.LayoutResultCallback wrap(android.print.PrintDocumentAdapter.LayoutResultCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.LayoutResultCallback(real);
        }

        public android.print.PrintDocumentAdapter.LayoutResultCallback unwrap() {
            return real;
        }

        public void onLayoutCancelled() {
            real.onLayoutCancelled();
        }

        public void onLayoutFailed(java.lang.CharSequence arg0) {
            real.onLayoutFailed(arg0);
        }

        public void onLayoutFinished(com.micklab.dcg.wrapper.android.print.PrintDocumentInfo arg0, boolean arg1) {
            real.onLayoutFinished(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class WriteResultCallback {
        private final android.print.PrintDocumentAdapter.WriteResultCallback real;

        public WriteResultCallback(android.print.PrintDocumentAdapter.WriteResultCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.WriteResultCallback wrap(android.print.PrintDocumentAdapter.WriteResultCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.WriteResultCallback(real);
        }

        public android.print.PrintDocumentAdapter.WriteResultCallback unwrap() {
            return real;
        }

        public void onWriteCancelled() {
            real.onWriteCancelled();
        }

        public void onWriteFailed(java.lang.CharSequence arg0) {
            real.onWriteFailed(arg0);
        }

        public void onWriteFinished(android.print.PageRange[] arg0) {
            real.onWriteFinished(arg0);
        }

    }
}
