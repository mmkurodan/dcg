// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.euicc;

public final class DownloadableSubscription {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DownloadableSubscription(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription wrap(android.telephony.euicc.DownloadableSubscription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.euicc.DownloadableSubscription getReal() {
        return (android.telephony.euicc.DownloadableSubscription) real;
    }

    public android.telephony.euicc.DownloadableSubscription unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription#describeContents()");
    }

    public static com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription forActivationCode(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription#forActivationCode(java.lang.String)");
    }

    public java.lang.String getConfirmationCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription#getConfirmationCode()");
    }

    public java.lang.String getEncodedActivationCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription#getEncodedActivationCode()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription.Builder wrap(android.telephony.euicc.DownloadableSubscription.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.euicc.DownloadableSubscription.Builder getReal() {
            return (android.telephony.euicc.DownloadableSubscription.Builder) real;
        }

        public android.telephony.euicc.DownloadableSubscription.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription$Builder#android.telephony.euicc.DownloadableSubscription$Builder(android.telephony.euicc.DownloadableSubscription)");
        }

        public Builder(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription$Builder#android.telephony.euicc.DownloadableSubscription$Builder(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription.Builder setConfirmationCode(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription$Builder#setConfirmationCode(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription.Builder setEncodedActivationCode(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.DownloadableSubscription$Builder#setEncodedActivationCode(java.lang.String)");
        }

    }
}
