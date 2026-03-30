// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class PlaybackErrorEvent {
    private final android.media.metrics.PlaybackErrorEvent real;

    public PlaybackErrorEvent(android.media.metrics.PlaybackErrorEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent wrap(android.media.metrics.PlaybackErrorEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent(real);
    }

    public android.media.metrics.PlaybackErrorEvent unwrap() {
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

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getMetricsBundle());
    }

    public int getSubErrorCode() {
        return real.getSubErrorCode();
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

    public static final int ERROR_AUDIO_TRACK_INIT_FAILED = android.media.metrics.PlaybackErrorEvent.ERROR_AUDIO_TRACK_INIT_FAILED;
    public static final int ERROR_AUDIO_TRACK_OTHER = android.media.metrics.PlaybackErrorEvent.ERROR_AUDIO_TRACK_OTHER;
    public static final int ERROR_AUDIO_TRACK_WRITE_FAILED = android.media.metrics.PlaybackErrorEvent.ERROR_AUDIO_TRACK_WRITE_FAILED;
    public static final int ERROR_DECODER_INIT_FAILED = android.media.metrics.PlaybackErrorEvent.ERROR_DECODER_INIT_FAILED;
    public static final int ERROR_DECODING_FAILED = android.media.metrics.PlaybackErrorEvent.ERROR_DECODING_FAILED;
    public static final int ERROR_DECODING_FORMAT_EXCEEDS_CAPABILITIES = android.media.metrics.PlaybackErrorEvent.ERROR_DECODING_FORMAT_EXCEEDS_CAPABILITIES;
    public static final int ERROR_DECODING_FORMAT_UNSUPPORTED = android.media.metrics.PlaybackErrorEvent.ERROR_DECODING_FORMAT_UNSUPPORTED;
    public static final int ERROR_DECODING_OTHER = android.media.metrics.PlaybackErrorEvent.ERROR_DECODING_OTHER;
    public static final int ERROR_DRM_CONTENT_ERROR = android.media.metrics.PlaybackErrorEvent.ERROR_DRM_CONTENT_ERROR;
    public static final int ERROR_DRM_DEVICE_REVOKED = android.media.metrics.PlaybackErrorEvent.ERROR_DRM_DEVICE_REVOKED;
    public static final int ERROR_DRM_DISALLOWED_OPERATION = android.media.metrics.PlaybackErrorEvent.ERROR_DRM_DISALLOWED_OPERATION;
    public static final int ERROR_DRM_LICENSE_ACQUISITION_FAILED = android.media.metrics.PlaybackErrorEvent.ERROR_DRM_LICENSE_ACQUISITION_FAILED;
    public static final int ERROR_DRM_OTHER = android.media.metrics.PlaybackErrorEvent.ERROR_DRM_OTHER;
    public static final int ERROR_DRM_PROVISIONING_FAILED = android.media.metrics.PlaybackErrorEvent.ERROR_DRM_PROVISIONING_FAILED;
    public static final int ERROR_DRM_SCHEME_UNSUPPORTED = android.media.metrics.PlaybackErrorEvent.ERROR_DRM_SCHEME_UNSUPPORTED;
    public static final int ERROR_DRM_SYSTEM_ERROR = android.media.metrics.PlaybackErrorEvent.ERROR_DRM_SYSTEM_ERROR;
    public static final int ERROR_IO_BAD_HTTP_STATUS = android.media.metrics.PlaybackErrorEvent.ERROR_IO_BAD_HTTP_STATUS;
    public static final int ERROR_IO_CONNECTION_CLOSED = android.media.metrics.PlaybackErrorEvent.ERROR_IO_CONNECTION_CLOSED;
    public static final int ERROR_IO_CONNECTION_TIMEOUT = android.media.metrics.PlaybackErrorEvent.ERROR_IO_CONNECTION_TIMEOUT;
    public static final int ERROR_IO_DNS_FAILED = android.media.metrics.PlaybackErrorEvent.ERROR_IO_DNS_FAILED;
    public static final int ERROR_IO_NO_PERMISSION = android.media.metrics.PlaybackErrorEvent.ERROR_IO_NO_PERMISSION;
    public static final int ERROR_IO_OTHER = android.media.metrics.PlaybackErrorEvent.ERROR_IO_OTHER;
    public static final int ERROR_OTHER = android.media.metrics.PlaybackErrorEvent.ERROR_OTHER;
    public static final int ERROR_PARSING_CONTAINER_MALFORMED = android.media.metrics.PlaybackErrorEvent.ERROR_PARSING_CONTAINER_MALFORMED;
    public static final int ERROR_PARSING_CONTAINER_UNSUPPORTED = android.media.metrics.PlaybackErrorEvent.ERROR_PARSING_CONTAINER_UNSUPPORTED;
    public static final int ERROR_PARSING_MANIFEST_MALFORMED = android.media.metrics.PlaybackErrorEvent.ERROR_PARSING_MANIFEST_MALFORMED;
    public static final int ERROR_PARSING_MANIFEST_UNSUPPORTED = android.media.metrics.PlaybackErrorEvent.ERROR_PARSING_MANIFEST_UNSUPPORTED;
    public static final int ERROR_PARSING_OTHER = android.media.metrics.PlaybackErrorEvent.ERROR_PARSING_OTHER;
    public static final int ERROR_PLAYER_BEHIND_LIVE_WINDOW = android.media.metrics.PlaybackErrorEvent.ERROR_PLAYER_BEHIND_LIVE_WINDOW;
    public static final int ERROR_PLAYER_OTHER = android.media.metrics.PlaybackErrorEvent.ERROR_PLAYER_OTHER;
    public static final int ERROR_PLAYER_REMOTE = android.media.metrics.PlaybackErrorEvent.ERROR_PLAYER_REMOTE;
    public static final int ERROR_RUNTIME = android.media.metrics.PlaybackErrorEvent.ERROR_RUNTIME;
    public static final int ERROR_UNKNOWN = android.media.metrics.PlaybackErrorEvent.ERROR_UNKNOWN;

    public static final class Builder {
        private final android.media.metrics.PlaybackErrorEvent.Builder real;

        public Builder(android.media.metrics.PlaybackErrorEvent.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder wrap(android.media.metrics.PlaybackErrorEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder(real);
        }

        public android.media.metrics.PlaybackErrorEvent.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.metrics.PlaybackErrorEvent.Builder());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent build() {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder setErrorCode(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder.wrap(real.setErrorCode(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder setException(java.lang.Exception arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder.wrap(real.setException(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder setMetricsBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder.wrap(real.setMetricsBundle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder setSubErrorCode(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder.wrap(real.setSubErrorCode(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder setTimeSinceCreatedMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent.Builder.wrap(real.setTimeSinceCreatedMillis(arg0));
        }

    }
}
