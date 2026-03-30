// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallScreeningService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallScreeningService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallScreeningService wrap(android.telecom.CallScreeningService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallScreeningService(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.CallScreeningService getReal() {
        return (android.telecom.CallScreeningService) real;
    }

    public android.telecom.CallScreeningService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.telecom.CallScreeningService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onScreenCall(com.micklab.dcg.wrapper.android.telecom.Call.Details arg0) {
        ((android.telecom.CallScreeningService) real).onScreenCall(arg0 == null ? null : arg0.getReal());
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.telecom.CallScreeningService) real).onUnbind(arg0 == null ? null : arg0.getReal());
    }

    public void respondToCall(com.micklab.dcg.wrapper.android.telecom.Call.Details arg0, com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse arg1) {
        ((android.telecom.CallScreeningService) real).respondToCall(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.telecom.CallScreeningService.SERVICE_INTERFACE;

    public static final class CallResponse {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CallResponse(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse wrap(android.telecom.CallScreeningService.CallResponse real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.CallScreeningService.CallResponse getReal() {
            return (android.telecom.CallScreeningService.CallResponse) real;
        }

        public android.telecom.CallScreeningService.CallResponse unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.telecom.CallScreeningService.CallResponse) real).equals(arg0);
        }

        public int getCallComposerAttachmentsToShow() {
            return ((android.telecom.CallScreeningService.CallResponse) real).getCallComposerAttachmentsToShow();
        }

        public boolean getDisallowCall() {
            return ((android.telecom.CallScreeningService.CallResponse) real).getDisallowCall();
        }

        public boolean getRejectCall() {
            return ((android.telecom.CallScreeningService.CallResponse) real).getRejectCall();
        }

        public boolean getSilenceCall() {
            return ((android.telecom.CallScreeningService.CallResponse) real).getSilenceCall();
        }

        public boolean getSkipCallLog() {
            return ((android.telecom.CallScreeningService.CallResponse) real).getSkipCallLog();
        }

        public boolean getSkipNotification() {
            return ((android.telecom.CallScreeningService.CallResponse) real).getSkipNotification();
        }

        public int hashCode() {
            return ((android.telecom.CallScreeningService.CallResponse) real).hashCode();
        }

        public static final int CALL_COMPOSER_ATTACHMENT_LOCATION = android.telecom.CallScreeningService.CallResponse.CALL_COMPOSER_ATTACHMENT_LOCATION;
        public static final int CALL_COMPOSER_ATTACHMENT_PICTURE = android.telecom.CallScreeningService.CallResponse.CALL_COMPOSER_ATTACHMENT_PICTURE;
        public static final int CALL_COMPOSER_ATTACHMENT_PRIORITY = android.telecom.CallScreeningService.CallResponse.CALL_COMPOSER_ATTACHMENT_PRIORITY;
        public static final int CALL_COMPOSER_ATTACHMENT_SUBJECT = android.telecom.CallScreeningService.CallResponse.CALL_COMPOSER_ATTACHMENT_SUBJECT;

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder wrap(android.telecom.CallScreeningService.CallResponse.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.telecom.CallScreeningService.CallResponse.Builder getReal() {
                return (android.telecom.CallScreeningService.CallResponse.Builder) real;
            }

            public android.telecom.CallScreeningService.CallResponse.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.telecom.CallScreeningService.CallResponse.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse build() {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.wrap(((android.telecom.CallScreeningService.CallResponse.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setCallComposerAttachmentsToShow(int arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(((android.telecom.CallScreeningService.CallResponse.Builder) real).setCallComposerAttachmentsToShow(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setDisallowCall(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(((android.telecom.CallScreeningService.CallResponse.Builder) real).setDisallowCall(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setRejectCall(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(((android.telecom.CallScreeningService.CallResponse.Builder) real).setRejectCall(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setSilenceCall(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(((android.telecom.CallScreeningService.CallResponse.Builder) real).setSilenceCall(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setSkipCallLog(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(((android.telecom.CallScreeningService.CallResponse.Builder) real).setSkipCallLog(arg0));
            }

            public com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder setSkipNotification(boolean arg0) {
                return com.micklab.dcg.wrapper.android.telecom.CallScreeningService.CallResponse.Builder.wrap(((android.telecom.CallScreeningService.CallResponse.Builder) real).setSkipNotification(arg0));
            }

        }
    }
}
