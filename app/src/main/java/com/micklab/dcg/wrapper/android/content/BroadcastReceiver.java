// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class BroadcastReceiver {
    private final android.content.BroadcastReceiver real;

    public BroadcastReceiver(android.content.BroadcastReceiver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.BroadcastReceiver wrap(android.content.BroadcastReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.BroadcastReceiver(real);
    }

    public android.content.BroadcastReceiver unwrap() {
        return real;
    }

    public void abortBroadcast() {
        real.abortBroadcast();
    }

    public void clearAbortBroadcast() {
        real.clearAbortBroadcast();
    }

    public boolean getAbortBroadcast() {
        return real.getAbortBroadcast();
    }

    public boolean getDebugUnregister() {
        return real.getDebugUnregister();
    }

    public int getResultCode() {
        return real.getResultCode();
    }

    public java.lang.String getResultData() {
        return real.getResultData();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getResultExtras(boolean arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getResultExtras(arg0));
    }

    public java.lang.String getSentFromPackage() {
        return real.getSentFromPackage();
    }

    public int getSentFromUid() {
        return real.getSentFromUid();
    }

    public com.micklab.dcg.wrapper.android.content.BroadcastReceiver.PendingResult goAsync() {
        return com.micklab.dcg.wrapper.android.content.BroadcastReceiver.PendingResult.wrap(real.goAsync());
    }

    public boolean isInitialStickyBroadcast() {
        return real.isInitialStickyBroadcast();
    }

    public boolean isOrderedBroadcast() {
        return real.isOrderedBroadcast();
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onReceive(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder peekService(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.peekService(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void setDebugUnregister(boolean arg0) {
        real.setDebugUnregister(arg0);
    }

    public void setOrderedHint(boolean arg0) {
        real.setOrderedHint(arg0);
    }

    public void setResult(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.setResult(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setResultCode(int arg0) {
        real.setResultCode(arg0);
    }

    public void setResultData(java.lang.String arg0) {
        real.setResultData(arg0);
    }

    public void setResultExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.setResultExtras(arg0 == null ? null : arg0.unwrap());
    }

    public static final class PendingResult {
        private final android.content.BroadcastReceiver.PendingResult real;

        public PendingResult(android.content.BroadcastReceiver.PendingResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.BroadcastReceiver.PendingResult wrap(android.content.BroadcastReceiver.PendingResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.BroadcastReceiver.PendingResult(real);
        }

        public android.content.BroadcastReceiver.PendingResult unwrap() {
            return real;
        }

        public void abortBroadcast() {
            real.abortBroadcast();
        }

        public void clearAbortBroadcast() {
            real.clearAbortBroadcast();
        }

        public void finish() {
            real.finish();
        }

        public boolean getAbortBroadcast() {
            return real.getAbortBroadcast();
        }

        public int getResultCode() {
            return real.getResultCode();
        }

        public java.lang.String getResultData() {
            return real.getResultData();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getResultExtras(boolean arg0) {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getResultExtras(arg0));
        }

        public void setResult(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.setResult(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void setResultCode(int arg0) {
            real.setResultCode(arg0);
        }

        public void setResultData(java.lang.String arg0) {
            real.setResultData(arg0);
        }

        public void setResultExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.setResultExtras(arg0 == null ? null : arg0.unwrap());
        }

    }
}
