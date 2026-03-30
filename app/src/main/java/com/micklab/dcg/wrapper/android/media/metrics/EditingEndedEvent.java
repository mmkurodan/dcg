// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class EditingEndedEvent {
    private final android.media.metrics.EditingEndedEvent real;

    public EditingEndedEvent(android.media.metrics.EditingEndedEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent wrap(android.media.metrics.EditingEndedEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent(real);
    }

    public android.media.metrics.EditingEndedEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getErrorCode() {
        return real.getErrorCode();
    }

    public java.lang.String getExporterName() {
        return real.getExporterName();
    }

    public float getFinalProgressPercent() {
        return real.getFinalProgressPercent();
    }

    public int getFinalState() {
        return real.getFinalState();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getMetricsBundle());
    }

    public java.lang.String getMuxerName() {
        return real.getMuxerName();
    }

    public long getOperationTypes() {
        return real.getOperationTypes();
    }

    public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo getOutputMediaItemInfo() {
        return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.wrap(real.getOutputMediaItemInfo());
    }

    public long getTimeSinceCreatedMillis() {
        return real.getTimeSinceCreatedMillis();
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

    public static final int ERROR_CODE_AUDIO_PROCESSING_FAILED = android.media.metrics.EditingEndedEvent.ERROR_CODE_AUDIO_PROCESSING_FAILED;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = android.media.metrics.EditingEndedEvent.ERROR_CODE_DECODER_INIT_FAILED;
    public static final int ERROR_CODE_DECODING_FAILED = android.media.metrics.EditingEndedEvent.ERROR_CODE_DECODING_FAILED;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = android.media.metrics.EditingEndedEvent.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED;
    public static final int ERROR_CODE_ENCODER_INIT_FAILED = android.media.metrics.EditingEndedEvent.ERROR_CODE_ENCODER_INIT_FAILED;
    public static final int ERROR_CODE_ENCODING_FAILED = android.media.metrics.EditingEndedEvent.ERROR_CODE_ENCODING_FAILED;
    public static final int ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED = android.media.metrics.EditingEndedEvent.ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = android.media.metrics.EditingEndedEvent.ERROR_CODE_FAILED_RUNTIME_CHECK;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = android.media.metrics.EditingEndedEvent.ERROR_CODE_IO_BAD_HTTP_STATUS;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = android.media.metrics.EditingEndedEvent.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED;
    public static final int ERROR_CODE_IO_NO_PERMISSION = android.media.metrics.EditingEndedEvent.ERROR_CODE_IO_NO_PERMISSION;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = android.media.metrics.EditingEndedEvent.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE;
    public static final int ERROR_CODE_IO_UNSPECIFIED = android.media.metrics.EditingEndedEvent.ERROR_CODE_IO_UNSPECIFIED;
    public static final int ERROR_CODE_MUXING_FAILED = android.media.metrics.EditingEndedEvent.ERROR_CODE_MUXING_FAILED;
    public static final int ERROR_CODE_NONE = android.media.metrics.EditingEndedEvent.ERROR_CODE_NONE;
    public static final int ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED = android.media.metrics.EditingEndedEvent.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED;
    public static final int FINAL_STATE_CANCELED = android.media.metrics.EditingEndedEvent.FINAL_STATE_CANCELED;
    public static final int FINAL_STATE_ERROR = android.media.metrics.EditingEndedEvent.FINAL_STATE_ERROR;
    public static final int FINAL_STATE_SUCCEEDED = android.media.metrics.EditingEndedEvent.FINAL_STATE_SUCCEEDED;
    public static final long OPERATION_TYPE_AUDIO_EDIT = android.media.metrics.EditingEndedEvent.OPERATION_TYPE_AUDIO_EDIT;
    public static final long OPERATION_TYPE_AUDIO_TRANSCODE = android.media.metrics.EditingEndedEvent.OPERATION_TYPE_AUDIO_TRANSCODE;
    public static final long OPERATION_TYPE_AUDIO_TRANSMUX = android.media.metrics.EditingEndedEvent.OPERATION_TYPE_AUDIO_TRANSMUX;
    public static final long OPERATION_TYPE_PAUSED = android.media.metrics.EditingEndedEvent.OPERATION_TYPE_PAUSED;
    public static final long OPERATION_TYPE_RESUMED = android.media.metrics.EditingEndedEvent.OPERATION_TYPE_RESUMED;
    public static final long OPERATION_TYPE_VIDEO_EDIT = android.media.metrics.EditingEndedEvent.OPERATION_TYPE_VIDEO_EDIT;
    public static final long OPERATION_TYPE_VIDEO_TRANSCODE = android.media.metrics.EditingEndedEvent.OPERATION_TYPE_VIDEO_TRANSCODE;
    public static final long OPERATION_TYPE_VIDEO_TRANSMUX = android.media.metrics.EditingEndedEvent.OPERATION_TYPE_VIDEO_TRANSMUX;
    public static final int PROGRESS_PERCENT_UNKNOWN = android.media.metrics.EditingEndedEvent.PROGRESS_PERCENT_UNKNOWN;
    public static final int TIME_SINCE_CREATED_UNKNOWN = android.media.metrics.EditingEndedEvent.TIME_SINCE_CREATED_UNKNOWN;

    public static final class Builder {
        private final android.media.metrics.EditingEndedEvent.Builder real;

        public Builder(android.media.metrics.EditingEndedEvent.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder wrap(android.media.metrics.EditingEndedEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder(real);
        }

        public android.media.metrics.EditingEndedEvent.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.media.metrics.EditingEndedEvent.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder addInputMediaItemInfo(com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder.wrap(real.addInputMediaItemInfo(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder addOperationType(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder.wrap(real.addOperationType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent build() {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder setErrorCode(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder.wrap(real.setErrorCode(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder setExporterName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder.wrap(real.setExporterName(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder setFinalProgressPercent(float arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder.wrap(real.setFinalProgressPercent(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder setMetricsBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder.wrap(real.setMetricsBundle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder setMuxerName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder.wrap(real.setMuxerName(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder setOutputMediaItemInfo(com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder.wrap(real.setOutputMediaItemInfo(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder setTimeSinceCreatedMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent.Builder.wrap(real.setTimeSinceCreatedMillis(arg0));
        }

    }
}
