// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionPart {
    private final android.speech.RecognitionPart real;

    public RecognitionPart(android.speech.RecognitionPart real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionPart wrap(android.speech.RecognitionPart real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionPart(real);
    }

    public android.speech.RecognitionPart unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getConfidenceLevel() {
        return real.getConfidenceLevel();
    }

    public java.lang.String getFormattedText() {
        return real.getFormattedText();
    }

    public java.lang.String getRawText() {
        return real.getRawText();
    }

    public long getTimestampMillis() {
        return real.getTimestampMillis();
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

    public static final int CONFIDENCE_LEVEL_HIGH = android.speech.RecognitionPart.CONFIDENCE_LEVEL_HIGH;
    public static final int CONFIDENCE_LEVEL_LOW = android.speech.RecognitionPart.CONFIDENCE_LEVEL_LOW;
    public static final int CONFIDENCE_LEVEL_MEDIUM = android.speech.RecognitionPart.CONFIDENCE_LEVEL_MEDIUM;
    public static final int CONFIDENCE_LEVEL_MEDIUM_HIGH = android.speech.RecognitionPart.CONFIDENCE_LEVEL_MEDIUM_HIGH;
    public static final int CONFIDENCE_LEVEL_MEDIUM_LOW = android.speech.RecognitionPart.CONFIDENCE_LEVEL_MEDIUM_LOW;
    public static final int CONFIDENCE_LEVEL_UNKNOWN = android.speech.RecognitionPart.CONFIDENCE_LEVEL_UNKNOWN;

    public static final class Builder {
        private final android.speech.RecognitionPart.Builder real;

        public Builder(android.speech.RecognitionPart.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder wrap(android.speech.RecognitionPart.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder(real);
        }

        public android.speech.RecognitionPart.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.speech.RecognitionPart.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart build() {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder setConfidenceLevel(int arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder.wrap(real.setConfidenceLevel(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder setFormattedText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder.wrap(real.setFormattedText(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder setRawText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder.wrap(real.setRawText(arg0));
        }

        public com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder setTimestampMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.speech.RecognitionPart.Builder.wrap(real.setTimestampMillis(arg0));
        }

    }
}
