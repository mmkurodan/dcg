// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class BroadcastReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BroadcastReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.BroadcastReceiver wrap(android.content.BroadcastReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.BroadcastReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.content.BroadcastReceiver getReal() {
        return (android.content.BroadcastReceiver) real;
    }

    public android.content.BroadcastReceiver unwrap() {
        return getReal();
    }

    public void abortBroadcast() {
        ((android.content.BroadcastReceiver) real).abortBroadcast();
    }

    public void clearAbortBroadcast() {
        ((android.content.BroadcastReceiver) real).clearAbortBroadcast();
    }

    public boolean getAbortBroadcast() {
        return ((android.content.BroadcastReceiver) real).getAbortBroadcast();
    }

    public boolean getDebugUnregister() {
        return ((android.content.BroadcastReceiver) real).getDebugUnregister();
    }

    public int getResultCode() {
        return ((android.content.BroadcastReceiver) real).getResultCode();
    }

    public java.lang.String getResultData() {
        return ((android.content.BroadcastReceiver) real).getResultData();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getResultExtras(boolean arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.BroadcastReceiver) real).getResultExtras(arg0));
    }

    public java.lang.String getSentFromPackage() {
        return ((android.content.BroadcastReceiver) real).getSentFromPackage();
    }

    public int getSentFromUid() {
        return ((android.content.BroadcastReceiver) real).getSentFromUid();
    }

    public com.micklab.dcg.wrapper.android.content.BroadcastReceiver.PendingResult goAsync() {
        return com.micklab.dcg.wrapper.android.content.BroadcastReceiver.PendingResult.wrap(((android.content.BroadcastReceiver) real).goAsync());
    }

    public boolean isInitialStickyBroadcast() {
        return ((android.content.BroadcastReceiver) real).isInitialStickyBroadcast();
    }

    public boolean isOrderedBroadcast() {
        return ((android.content.BroadcastReceiver) real).isOrderedBroadcast();
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.content.BroadcastReceiver) real).onReceive(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder peekService(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.content.BroadcastReceiver) real).peekService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void setDebugUnregister(boolean arg0) {
        ((android.content.BroadcastReceiver) real).setDebugUnregister(arg0);
    }

    public void setOrderedHint(boolean arg0) {
        ((android.content.BroadcastReceiver) real).setOrderedHint(arg0);
    }

    public void setResult(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.content.BroadcastReceiver) real).setResult(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setResultCode(int arg0) {
        ((android.content.BroadcastReceiver) real).setResultCode(arg0);
    }

    public void setResultData(java.lang.String arg0) {
        ((android.content.BroadcastReceiver) real).setResultData(arg0);
    }

    public void setResultExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.content.BroadcastReceiver) real).setResultExtras(arg0 == null ? null : arg0.getReal());
    }

    public static final class PendingResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PendingResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.BroadcastReceiver.PendingResult wrap(android.content.BroadcastReceiver.PendingResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.BroadcastReceiver.PendingResult(real, (__DcgwBridgeToken) null);
        }

        public android.content.BroadcastReceiver.PendingResult getReal() {
            return (android.content.BroadcastReceiver.PendingResult) real;
        }

        public android.content.BroadcastReceiver.PendingResult unwrap() {
            return getReal();
        }

        public void abortBroadcast() {
            ((android.content.BroadcastReceiver.PendingResult) real).abortBroadcast();
        }

        public void clearAbortBroadcast() {
            ((android.content.BroadcastReceiver.PendingResult) real).clearAbortBroadcast();
        }

        public void finish() {
            ((android.content.BroadcastReceiver.PendingResult) real).finish();
        }

        public boolean getAbortBroadcast() {
            return ((android.content.BroadcastReceiver.PendingResult) real).getAbortBroadcast();
        }

        public int getResultCode() {
            return ((android.content.BroadcastReceiver.PendingResult) real).getResultCode();
        }

        public java.lang.String getResultData() {
            return ((android.content.BroadcastReceiver.PendingResult) real).getResultData();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getResultExtras(boolean arg0) {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.BroadcastReceiver.PendingResult) real).getResultExtras(arg0));
        }

        public void setResult(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.content.BroadcastReceiver.PendingResult) real).setResult(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public void setResultCode(int arg0) {
            ((android.content.BroadcastReceiver.PendingResult) real).setResultCode(arg0);
        }

        public void setResultData(java.lang.String arg0) {
            ((android.content.BroadcastReceiver.PendingResult) real).setResultData(arg0);
        }

        public void setResultExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.content.BroadcastReceiver.PendingResult) real).setResultExtras(arg0 == null ? null : arg0.getReal());
        }

    }
}
