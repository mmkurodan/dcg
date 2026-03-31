// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class TetheringManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TetheringManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.TetheringManager wrap(android.net.TetheringManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.TetheringManager(real, (__DcgwBridgeToken) null);
    }

    public android.net.TetheringManager getReal() {
        return (android.net.TetheringManager) real;
    }

    public android.net.TetheringManager unwrap() {
        return getReal();
    }

    public void registerTetheringEventCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringEventCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager#registerTetheringEventCallback(java.util.concurrent.Executor,android.net.TetheringManager$TetheringEventCallback)");
    }

    public void startTethering(com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.TetheringManager.StartTetheringCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager#startTethering(android.net.TetheringManager$TetheringRequest,java.util.concurrent.Executor,android.net.TetheringManager$StartTetheringCallback)");
    }

    public void stopTethering(com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.TetheringManager.StopTetheringCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager#stopTethering(android.net.TetheringManager$TetheringRequest,java.util.concurrent.Executor,android.net.TetheringManager$StopTetheringCallback)");
    }

    public void unregisterTetheringEventCallback(com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringEventCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager#unregisterTetheringEventCallback(android.net.TetheringManager$TetheringEventCallback)");
    }


    public static final class StartTetheringCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StartTetheringCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.TetheringManager.StartTetheringCallback wrap(android.net.TetheringManager.StartTetheringCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.TetheringManager.StartTetheringCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.TetheringManager.StartTetheringCallback getReal() {
            return (android.net.TetheringManager.StartTetheringCallback) real;
        }

        public android.net.TetheringManager.StartTetheringCallback unwrap() {
            return getReal();
        }

        public void onTetheringFailed(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$StartTetheringCallback#onTetheringFailed(int)");
        }

        public void onTetheringStarted() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$StartTetheringCallback#onTetheringStarted()");
        }

    }
    public static final class StopTetheringCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StopTetheringCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.TetheringManager.StopTetheringCallback wrap(android.net.TetheringManager.StopTetheringCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.TetheringManager.StopTetheringCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.TetheringManager.StopTetheringCallback getReal() {
            return (android.net.TetheringManager.StopTetheringCallback) real;
        }

        public android.net.TetheringManager.StopTetheringCallback unwrap() {
            return getReal();
        }

        public void onStopTetheringFailed(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$StopTetheringCallback#onStopTetheringFailed(int)");
        }

        public void onStopTetheringSucceeded() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$StopTetheringCallback#onStopTetheringSucceeded()");
        }

    }
    public static final class TetheringEventCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TetheringEventCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringEventCallback wrap(android.net.TetheringManager.TetheringEventCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringEventCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.TetheringManager.TetheringEventCallback getReal() {
            return (android.net.TetheringManager.TetheringEventCallback) real;
        }

        public android.net.TetheringManager.TetheringEventCallback unwrap() {
            return getReal();
        }

    }
    public static final class TetheringRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TetheringRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringRequest wrap(android.net.TetheringManager.TetheringRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringRequest(real, (__DcgwBridgeToken) null);
        }

        public android.net.TetheringManager.TetheringRequest getReal() {
            return (android.net.TetheringManager.TetheringRequest) real;
        }

        public android.net.TetheringManager.TetheringRequest unwrap() {
            return getReal();
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$TetheringRequest#describeContents()");
        }

        public boolean equals(java.lang.Object arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$TetheringRequest#equals(java.lang.Object)");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration getSoftApConfiguration() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$TetheringRequest#getSoftApConfiguration()");
        }

        public int hashCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$TetheringRequest#hashCode()");
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$TetheringRequest#toString()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$TetheringRequest#writeToParcel(android.os.Parcel,int)");
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringRequest.Builder wrap(android.net.TetheringManager.TetheringRequest.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringRequest.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.net.TetheringManager.TetheringRequest.Builder getReal() {
                return (android.net.TetheringManager.TetheringRequest.Builder) real;
            }

            public android.net.TetheringManager.TetheringRequest.Builder unwrap() {
                return getReal();
            }

            public Builder(int arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$TetheringRequest$Builder#android.net.TetheringManager$TetheringRequest$Builder(int)");
            }

            public com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringRequest build() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$TetheringRequest$Builder#build()");
            }

            public com.micklab.dcg.wrapper.android.net.TetheringManager.TetheringRequest.Builder setSoftApConfiguration(com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.TetheringManager$TetheringRequest$Builder#setSoftApConfiguration(android.net.wifi.SoftApConfiguration)");
            }

        }
    }
}
