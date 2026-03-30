// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionSupport {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecognitionSupport(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionSupport wrap(android.speech.RecognitionSupport real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionSupport(real, (__DcgwBridgeToken) null);
    }

    public android.speech.RecognitionSupport getReal() {
        return (android.speech.RecognitionSupport) real;
    }

    public android.speech.RecognitionSupport unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.speech.RecognitionSupport) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.speech.RecognitionSupport) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.speech.RecognitionSupport) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.speech.RecognitionSupport) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.speech.RecognitionSupport) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder wrap(android.speech.RecognitionSupport.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.speech.RecognitionSupport.Builder getReal() {
            return (android.speech.RecognitionSupport.Builder) real;
        }

        public android.speech.RecognitionSupport.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.speech.RecognitionSupport.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder addInstalledOnDeviceLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder.wrap(((android.speech.RecognitionSupport.Builder) real).addInstalledOnDeviceLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder addOnlineLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder.wrap(((android.speech.RecognitionSupport.Builder) real).addOnlineLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder addPendingOnDeviceLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder.wrap(((android.speech.RecognitionSupport.Builder) real).addPendingOnDeviceLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder addSupportedOnDeviceLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder.wrap(((android.speech.RecognitionSupport.Builder) real).addSupportedOnDeviceLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport build() {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.wrap(((android.speech.RecognitionSupport.Builder) real).build());
        }

    }
}
