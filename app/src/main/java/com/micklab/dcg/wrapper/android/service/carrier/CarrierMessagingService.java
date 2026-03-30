// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class CarrierMessagingService {
    private final android.service.carrier.CarrierMessagingService real;

    public CarrierMessagingService(android.service.carrier.CarrierMessagingService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService wrap(android.service.carrier.CarrierMessagingService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService(real);
    }

    public android.service.carrier.CarrierMessagingService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
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
        private final android.service.carrier.CarrierMessagingService.ResultCallback real;

        public ResultCallback(android.service.carrier.CarrierMessagingService.ResultCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.ResultCallback wrap(android.service.carrier.CarrierMessagingService.ResultCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.ResultCallback(real);
        }

        public android.service.carrier.CarrierMessagingService.ResultCallback unwrap() {
            return real;
        }

        public void onReceiveResult(java.lang.Object arg0) throws android.os.RemoteException {
            real.onReceiveResult(arg0);
        }

    }
    public static final class SendMmsResult {
        private final android.service.carrier.CarrierMessagingService.SendMmsResult real;

        public SendMmsResult(android.service.carrier.CarrierMessagingService.SendMmsResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendMmsResult wrap(android.service.carrier.CarrierMessagingService.SendMmsResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendMmsResult(real);
        }

        public android.service.carrier.CarrierMessagingService.SendMmsResult unwrap() {
            return real;
        }

        public SendMmsResult(int arg0, byte[] arg1) {
            this(new android.service.carrier.CarrierMessagingService.SendMmsResult(arg0, arg1));
        }

        public byte[] getSendConfPdu() {
            return real.getSendConfPdu();
        }

        public int getSendStatus() {
            return real.getSendStatus();
        }

    }
    public static final class SendMultipartSmsResult {
        private final android.service.carrier.CarrierMessagingService.SendMultipartSmsResult real;

        public SendMultipartSmsResult(android.service.carrier.CarrierMessagingService.SendMultipartSmsResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendMultipartSmsResult wrap(android.service.carrier.CarrierMessagingService.SendMultipartSmsResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendMultipartSmsResult(real);
        }

        public android.service.carrier.CarrierMessagingService.SendMultipartSmsResult unwrap() {
            return real;
        }

        public SendMultipartSmsResult(int arg0, int[] arg1) {
            this(new android.service.carrier.CarrierMessagingService.SendMultipartSmsResult(arg0, arg1));
        }

        public int[] getMessageRefs() {
            return real.getMessageRefs();
        }

        public int getSendStatus() {
            return real.getSendStatus();
        }

    }
    public static final class SendSmsResult {
        private final android.service.carrier.CarrierMessagingService.SendSmsResult real;

        public SendSmsResult(android.service.carrier.CarrierMessagingService.SendSmsResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendSmsResult wrap(android.service.carrier.CarrierMessagingService.SendSmsResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingService.SendSmsResult(real);
        }

        public android.service.carrier.CarrierMessagingService.SendSmsResult unwrap() {
            return real;
        }

        public SendSmsResult(int arg0, int arg1) {
            this(new android.service.carrier.CarrierMessagingService.SendSmsResult(arg0, arg1));
        }

        public int getMessageRef() {
            return real.getMessageRef();
        }

        public int getSendStatus() {
            return real.getSendStatus();
        }

    }
}
