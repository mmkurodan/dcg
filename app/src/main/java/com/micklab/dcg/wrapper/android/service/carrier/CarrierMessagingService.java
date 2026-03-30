// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class CarrierMessagingService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CarrierMessagingService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService wrap(android.service.carrier.CarrierMessagingService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService(real, (__DcgwBridgeToken) null);
    }

    public android.service.carrier.CarrierMessagingService getReal() {
        return (android.service.carrier.CarrierMessagingService) real;
    }

    public android.service.carrier.CarrierMessagingService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.carrier.CarrierMessagingService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public static final int DOWNLOAD_STATUS_ERROR = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_ERROR;
    public static final int DOWNLOAD_STATUS_OK = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_OK;
    public static final int RECEIVE_OPTIONS_DEFAULT = android.service.carrier.CarrierMessagingService.RECEIVE_OPTIONS_DEFAULT;
    public static final int RECEIVE_OPTIONS_DROP = android.service.carrier.CarrierMessagingService.RECEIVE_OPTIONS_DROP;
    public static final int RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE = android.service.carrier.CarrierMessagingService.RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE;
    public static final int SEND_FLAG_REQUEST_DELIVERY_STATUS = android.service.carrier.CarrierMessagingService.SEND_FLAG_REQUEST_DELIVERY_STATUS;
    public static final int SEND_STATUS_ERROR = android.service.carrier.CarrierMessagingService.SEND_STATUS_ERROR;
    public static final int SEND_STATUS_OK = android.service.carrier.CarrierMessagingService.SEND_STATUS_OK;
    public static final java.lang.String SERVICE_INTERFACE = android.service.carrier.CarrierMessagingService.SERVICE_INTERFACE;

    public static final class ResultCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ResultCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.ResultCallback wrap(android.service.carrier.CarrierMessagingService.ResultCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.ResultCallback(real, (__DcgwBridgeToken) null);
        }

        public android.service.carrier.CarrierMessagingService.ResultCallback getReal() {
            return (android.service.carrier.CarrierMessagingService.ResultCallback) real;
        }

        public android.service.carrier.CarrierMessagingService.ResultCallback unwrap() {
            return getReal();
        }

        public void onReceiveResult(java.lang.Object arg0) throws android.os.RemoteException {
            ((android.service.carrier.CarrierMessagingService.ResultCallback) real).onReceiveResult(arg0);
        }

    }
    public static final class SendMmsResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SendMmsResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendMmsResult wrap(android.service.carrier.CarrierMessagingService.SendMmsResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendMmsResult(real, (__DcgwBridgeToken) null);
        }

        public android.service.carrier.CarrierMessagingService.SendMmsResult getReal() {
            return (android.service.carrier.CarrierMessagingService.SendMmsResult) real;
        }

        public android.service.carrier.CarrierMessagingService.SendMmsResult unwrap() {
            return getReal();
        }

        public SendMmsResult(int arg0, byte[] arg1) {
            this(new android.service.carrier.CarrierMessagingService.SendMmsResult(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public byte[] getSendConfPdu() {
            return ((android.service.carrier.CarrierMessagingService.SendMmsResult) real).getSendConfPdu();
        }

        public int getSendStatus() {
            return ((android.service.carrier.CarrierMessagingService.SendMmsResult) real).getSendStatus();
        }

    }
    public static final class SendMultipartSmsResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SendMultipartSmsResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendMultipartSmsResult wrap(android.service.carrier.CarrierMessagingService.SendMultipartSmsResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendMultipartSmsResult(real, (__DcgwBridgeToken) null);
        }

        public android.service.carrier.CarrierMessagingService.SendMultipartSmsResult getReal() {
            return (android.service.carrier.CarrierMessagingService.SendMultipartSmsResult) real;
        }

        public android.service.carrier.CarrierMessagingService.SendMultipartSmsResult unwrap() {
            return getReal();
        }

        public SendMultipartSmsResult(int arg0, int[] arg1) {
            this(new android.service.carrier.CarrierMessagingService.SendMultipartSmsResult(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public int[] getMessageRefs() {
            return ((android.service.carrier.CarrierMessagingService.SendMultipartSmsResult) real).getMessageRefs();
        }

        public int getSendStatus() {
            return ((android.service.carrier.CarrierMessagingService.SendMultipartSmsResult) real).getSendStatus();
        }

    }
    public static final class SendSmsResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SendSmsResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendSmsResult wrap(android.service.carrier.CarrierMessagingService.SendSmsResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendSmsResult(real, (__DcgwBridgeToken) null);
        }

        public android.service.carrier.CarrierMessagingService.SendSmsResult getReal() {
            return (android.service.carrier.CarrierMessagingService.SendSmsResult) real;
        }

        public android.service.carrier.CarrierMessagingService.SendSmsResult unwrap() {
            return getReal();
        }

        public SendSmsResult(int arg0, int arg1) {
            this(new android.service.carrier.CarrierMessagingService.SendSmsResult(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public int getMessageRef() {
            return ((android.service.carrier.CarrierMessagingService.SendSmsResult) real).getMessageRef();
        }

        public int getSendStatus() {
            return ((android.service.carrier.CarrierMessagingService.SendSmsResult) real).getSendStatus();
        }

    }
}
