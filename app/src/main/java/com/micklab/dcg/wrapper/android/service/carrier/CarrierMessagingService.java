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
    public static final int DOWNLOAD_STATUS_MMS_ERROR_CONFIGURATION_ERROR = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_CONFIGURATION_ERROR;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_DATA_DISABLED = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_DATA_DISABLED;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_HTTP_FAILURE = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_HTTP_FAILURE;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_INACTIVE_SUBSCRIPTION = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_INACTIVE_SUBSCRIPTION;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_INVALID_APN = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_INVALID_APN;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_INVALID_SUBSCRIPTION_ID = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_INVALID_SUBSCRIPTION_ID;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_IO_ERROR = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_IO_ERROR;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_MMS_DISABLED_BY_CARRIER = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_MMS_DISABLED_BY_CARRIER;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_RETRY = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_RETRY;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_UNABLE_CONNECT_MMS = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_UNABLE_CONNECT_MMS;
    public static final int DOWNLOAD_STATUS_MMS_ERROR_UNSPECIFIED = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_MMS_ERROR_UNSPECIFIED;
    public static final int DOWNLOAD_STATUS_OK = android.service.carrier.CarrierMessagingService.DOWNLOAD_STATUS_OK;
    public static final int RECEIVE_OPTIONS_DEFAULT = android.service.carrier.CarrierMessagingService.RECEIVE_OPTIONS_DEFAULT;
    public static final int RECEIVE_OPTIONS_DROP = android.service.carrier.CarrierMessagingService.RECEIVE_OPTIONS_DROP;
    public static final int RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE = android.service.carrier.CarrierMessagingService.RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE;
    public static final int SEND_FLAG_REQUEST_DELIVERY_STATUS = android.service.carrier.CarrierMessagingService.SEND_FLAG_REQUEST_DELIVERY_STATUS;
    public static final int SEND_STATUS_ERROR = android.service.carrier.CarrierMessagingService.SEND_STATUS_ERROR;
    public static final int SEND_STATUS_MMS_ERROR_CONFIGURATION_ERROR = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_CONFIGURATION_ERROR;
    public static final int SEND_STATUS_MMS_ERROR_DATA_DISABLED = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_DATA_DISABLED;
    public static final int SEND_STATUS_MMS_ERROR_HTTP_FAILURE = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_HTTP_FAILURE;
    public static final int SEND_STATUS_MMS_ERROR_INACTIVE_SUBSCRIPTION = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_INACTIVE_SUBSCRIPTION;
    public static final int SEND_STATUS_MMS_ERROR_INVALID_APN = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_INVALID_APN;
    public static final int SEND_STATUS_MMS_ERROR_INVALID_SUBSCRIPTION_ID = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_INVALID_SUBSCRIPTION_ID;
    public static final int SEND_STATUS_MMS_ERROR_IO_ERROR = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_IO_ERROR;
    public static final int SEND_STATUS_MMS_ERROR_MMS_DISABLED_BY_CARRIER = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_MMS_DISABLED_BY_CARRIER;
    public static final int SEND_STATUS_MMS_ERROR_RETRY = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_RETRY;
    public static final int SEND_STATUS_MMS_ERROR_UNABLE_CONNECT_MMS = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_UNABLE_CONNECT_MMS;
    public static final int SEND_STATUS_MMS_ERROR_UNSPECIFIED = android.service.carrier.CarrierMessagingService.SEND_STATUS_MMS_ERROR_UNSPECIFIED;
    public static final int SEND_STATUS_OK = android.service.carrier.CarrierMessagingService.SEND_STATUS_OK;
    public static final int SEND_STATUS_RESULT_CANCELLED = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_CANCELLED;
    public static final int SEND_STATUS_RESULT_ENCODING_ERROR = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_ENCODING_ERROR;
    public static final int SEND_STATUS_RESULT_ERROR_FDN_CHECK_FAILURE = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_ERROR_FDN_CHECK_FAILURE;
    public static final int SEND_STATUS_RESULT_ERROR_GENERIC_FAILURE = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_ERROR_GENERIC_FAILURE;
    public static final int SEND_STATUS_RESULT_ERROR_LIMIT_EXCEEDED = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_ERROR_LIMIT_EXCEEDED;
    public static final int SEND_STATUS_RESULT_ERROR_NO_SERVICE = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_ERROR_NO_SERVICE;
    public static final int SEND_STATUS_RESULT_ERROR_NULL_PDU = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_ERROR_NULL_PDU;
    public static final int SEND_STATUS_RESULT_ERROR_SHORT_CODE_NEVER_ALLOWED = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_ERROR_SHORT_CODE_NEVER_ALLOWED;
    public static final int SEND_STATUS_RESULT_ERROR_SHORT_CODE_NOT_ALLOWED = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_ERROR_SHORT_CODE_NOT_ALLOWED;
    public static final int SEND_STATUS_RESULT_INVALID_ARGUMENTS = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_INVALID_ARGUMENTS;
    public static final int SEND_STATUS_RESULT_INVALID_SMSC_ADDRESS = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_INVALID_SMSC_ADDRESS;
    public static final int SEND_STATUS_RESULT_INVALID_SMS_FORMAT = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_INVALID_SMS_FORMAT;
    public static final int SEND_STATUS_RESULT_INVALID_STATE = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_INVALID_STATE;
    public static final int SEND_STATUS_RESULT_OPERATION_NOT_ALLOWED = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_OPERATION_NOT_ALLOWED;
    public static final int SEND_STATUS_RESULT_REQUEST_NOT_SUPPORTED = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_REQUEST_NOT_SUPPORTED;
    public static final int SEND_STATUS_RESULT_SMS_BLOCKED_DURING_EMERGENCY = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_SMS_BLOCKED_DURING_EMERGENCY;
    public static final int SEND_STATUS_RESULT_SMS_SEND_RETRY_FAILED = android.service.carrier.CarrierMessagingService.SEND_STATUS_RESULT_SMS_SEND_RETRY_FAILED;
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
