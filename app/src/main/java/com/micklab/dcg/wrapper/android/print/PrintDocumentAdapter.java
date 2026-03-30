// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintDocumentAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintDocumentAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter wrap(android.print.PrintDocumentAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrintDocumentAdapter getReal() {
        return (android.print.PrintDocumentAdapter) real;
    }

    public android.print.PrintDocumentAdapter unwrap() {
        return getReal();
    }

    public void onFinish() {
        ((android.print.PrintDocumentAdapter) real).onFinish();
    }

    public void onLayout(com.micklab.dcg.wrapper.android.print.PrintAttributes arg0, com.micklab.dcg.wrapper.android.print.PrintAttributes arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2, com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.LayoutResultCallback arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
        ((android.print.PrintDocumentAdapter) real).onLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public void onStart() {
        ((android.print.PrintDocumentAdapter) real).onStart();
    }

    public void onWrite(android.print.PageRange[] arg0, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2, com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.WriteResultCallback arg3) {
        ((android.print.PrintDocumentAdapter) real).onWrite(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public static final java.lang.String EXTRA_PRINT_PREVIEW = android.print.PrintDocumentAdapter.EXTRA_PRINT_PREVIEW;

    public static final class LayoutResultCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutResultCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.LayoutResultCallback wrap(android.print.PrintDocumentAdapter.LayoutResultCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.LayoutResultCallback(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrintDocumentAdapter.LayoutResultCallback getReal() {
            return (android.print.PrintDocumentAdapter.LayoutResultCallback) real;
        }

        public android.print.PrintDocumentAdapter.LayoutResultCallback unwrap() {
            return getReal();
        }

        public void onLayoutCancelled() {
            ((android.print.PrintDocumentAdapter.LayoutResultCallback) real).onLayoutCancelled();
        }

        public void onLayoutFailed(java.lang.CharSequence arg0) {
            ((android.print.PrintDocumentAdapter.LayoutResultCallback) real).onLayoutFailed(arg0);
        }

        public void onLayoutFinished(com.micklab.dcg.wrapper.android.print.PrintDocumentInfo arg0, boolean arg1) {
            ((android.print.PrintDocumentAdapter.LayoutResultCallback) real).onLayoutFinished(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class WriteResultCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WriteResultCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.WriteResultCallback wrap(android.print.PrintDocumentAdapter.WriteResultCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.WriteResultCallback(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrintDocumentAdapter.WriteResultCallback getReal() {
            return (android.print.PrintDocumentAdapter.WriteResultCallback) real;
        }

        public android.print.PrintDocumentAdapter.WriteResultCallback unwrap() {
            return getReal();
        }

        public void onWriteCancelled() {
            ((android.print.PrintDocumentAdapter.WriteResultCallback) real).onWriteCancelled();
        }

        public void onWriteFailed(java.lang.CharSequence arg0) {
            ((android.print.PrintDocumentAdapter.WriteResultCallback) real).onWriteFailed(arg0);
        }

        public void onWriteFinished(android.print.PageRange[] arg0) {
            ((android.print.PrintDocumentAdapter.WriteResultCallback) real).onWriteFinished(arg0);
        }

    }
}
