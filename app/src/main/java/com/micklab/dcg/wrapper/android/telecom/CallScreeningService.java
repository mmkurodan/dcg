// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallScreeningService {
    private final android.telecom.CallScreeningService real;

    public CallScreeningService(android.telecom.CallScreeningService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallScreeningService wrap(android.telecom.CallScreeningService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallScreeningService(real);
    }

    public android.telecom.CallScreeningService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onScreenCall(com.micklab.dcg.wrapper.android.telecom.Call.Details arg0) {
        real.onScreenCall(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.onUnbind(arg0 == null ? null : arg0.unwrap());
    }

    public void respondToCall(com.micklab.dcg.wrapper.android.telecom.Call.Details arg0, com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse arg1) {
        real.respondToCall(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.telecom.CallScreeningService.SERVICE_INTERFACE;

    public static final class CallResponse {
        private final android.telecom.CallScreeningService.CallResponse real;

        public CallResponse(android.telecom.CallScreeningService.CallResponse real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse wrap(android.telecom.CallScreeningService.CallResponse real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse(real);
        }

        public android.telecom.CallScreeningService.CallResponse unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int getCallComposerAttachmentsToShow() {
            return real.getCallComposerAttachmentsToShow();
        }

        public boolean getDisallowCall() {
            return real.getDisallowCall();
        }

        public boolean getRejectCall() {
            return real.getRejectCall();
        }

        public boolean getSilenceCall() {
            return real.getSilenceCall();
        }

        public boolean getSkipCallLog() {
            return real.getSkipCallLog();
        }

        public boolean getSkipNotification() {
            return real.getSkipNotification();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public static final int CALL_COMPOSER_ATTACHMENT_LOCATION = android.telecom.CallScreeningService.CallResponse.CALL_COMPOSER_ATTACHMENT_LOCATION;
        public static final int CALL_COMPOSER_ATTACHMENT_PICTURE = android.telecom.CallScreeningService.CallResponse.CALL_COMPOSER_ATTACHMENT_PICTURE;
        public static final int CALL_COMPOSER_ATTACHMENT_PRIORITY = android.telecom.CallScreeningService.CallResponse.CALL_COMPOSER_ATTACHMENT_PRIORITY;
        public static final int CALL_COMPOSER_ATTACHMENT_SUBJECT = android.telecom.CallScreeningService.CallResponse.CALL_COMPOSER_ATTACHMENT_SUBJECT;

        public static final class Builder {
            private final android.telecom.CallScreeningService.CallResponse.Builder real;

            public Builder(android.telecom.CallScreeningService.CallResponse.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder wrap(android.telecom.CallScreeningService.CallResponse.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder(real);
            }

            public android.telecom.CallScreeningService.CallResponse.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.telecom.CallScreeningService.CallResponse.Builder());
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse build() {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setCallComposerAttachmentsToShow(int arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(real.setCallComposerAttachmentsToShow(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setDisallowCall(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(real.setDisallowCall(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setRejectCall(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(real.setRejectCall(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setSilenceCall(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(real.setSilenceCall(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setSkipCallLog(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(real.setSkipCallLog(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setSkipNotification(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(real.setSkipNotification(arg0));
            }

        }
    }
}
