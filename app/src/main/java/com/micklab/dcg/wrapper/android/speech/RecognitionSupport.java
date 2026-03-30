// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionSupport {
    private final android.speech.RecognitionSupport real;

    public RecognitionSupport(android.speech.RecognitionSupport real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionSupport wrap(android.speech.RecognitionSupport real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionSupport(real);
    }

    public android.speech.RecognitionSupport unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.speech.RecognitionSupport.Builder real;

        public Builder(android.speech.RecognitionSupport.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder wrap(android.speech.RecognitionSupport.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder(real);
        }

        public android.speech.RecognitionSupport.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.speech.RecognitionSupport.Builder());
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder addInstalledOnDeviceLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder.wrap(real.addInstalledOnDeviceLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder addOnlineLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder.wrap(real.addOnlineLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder addPendingOnDeviceLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder.wrap(real.addPendingOnDeviceLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder addSupportedOnDeviceLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.Builder.wrap(real.addSupportedOnDeviceLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionSupport build() {
            return com.micklab.dcg.wrapper.android.speech.RecognitionSupport.wrap(real.build());
        }

    }
}
