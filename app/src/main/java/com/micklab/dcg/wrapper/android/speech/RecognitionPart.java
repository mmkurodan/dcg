// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionPart {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecognitionPart(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionPart wrap(android.speech.RecognitionPart real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionPart(real, (__DcgwBridgeToken) null);
    }

    public android.speech.RecognitionPart getReal() {
        return (android.speech.RecognitionPart) real;
    }

    public android.speech.RecognitionPart unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.speech.RecognitionPart) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.speech.RecognitionPart) real).equals(arg0);
    }

    public int getConfidenceLevel() {
        return ((android.speech.RecognitionPart) real).getConfidenceLevel();
    }

    public java.lang.String getFormattedText() {
        return ((android.speech.RecognitionPart) real).getFormattedText();
    }

    public java.lang.String getRawText() {
        return ((android.speech.RecognitionPart) real).getRawText();
    }

    public long getTimestampMillis() {
        return ((android.speech.RecognitionPart) real).getTimestampMillis();
    }

    public int hashCode() {
        return ((android.speech.RecognitionPart) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.speech.RecognitionPart) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.speech.RecognitionPart) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CONFIDENCE_LEVEL_HIGH = android.speech.RecognitionPart.CONFIDENCE_LEVEL_HIGH;
    public static final int CONFIDENCE_LEVEL_LOW = android.speech.RecognitionPart.CONFIDENCE_LEVEL_LOW;
    public static final int CONFIDENCE_LEVEL_MEDIUM = android.speech.RecognitionPart.CONFIDENCE_LEVEL_MEDIUM;
    public static final int CONFIDENCE_LEVEL_MEDIUM_HIGH = android.speech.RecognitionPart.CONFIDENCE_LEVEL_MEDIUM_HIGH;
    public static final int CONFIDENCE_LEVEL_MEDIUM_LOW = android.speech.RecognitionPart.CONFIDENCE_LEVEL_MEDIUM_LOW;
    public static final int CONFIDENCE_LEVEL_UNKNOWN = android.speech.RecognitionPart.CONFIDENCE_LEVEL_UNKNOWN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder wrap(android.speech.RecognitionPart.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.speech.RecognitionPart.Builder getReal() {
            return (android.speech.RecognitionPart.Builder) real;
        }

        public android.speech.RecognitionPart.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.speech.RecognitionPart.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart build() {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.wrap(((android.speech.RecognitionPart.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder setConfidenceLevel(int arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder.wrap(((android.speech.RecognitionPart.Builder) real).setConfidenceLevel(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder setFormattedText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder.wrap(((android.speech.RecognitionPart.Builder) real).setFormattedText(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder setRawText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder.wrap(((android.speech.RecognitionPart.Builder) real).setRawText(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder setTimestampMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder.wrap(((android.speech.RecognitionPart.Builder) real).setTimestampMillis(arg0));
        }

    }
}
