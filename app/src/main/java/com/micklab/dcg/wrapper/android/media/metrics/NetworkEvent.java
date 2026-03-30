// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class NetworkEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent wrap(android.media.metrics.NetworkEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.NetworkEvent getReal() {
        return (android.media.metrics.NetworkEvent) real;
    }

    public android.media.metrics.NetworkEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.metrics.NetworkEvent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.metrics.NetworkEvent) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.metrics.NetworkEvent) real).getMetricsBundle());
    }

    public int getNetworkType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.NetworkEvent#getNetworkType()");
    }

    public long getTimeSinceCreatedMillis() {
        return ((android.media.metrics.NetworkEvent) real).getTimeSinceCreatedMillis();
    }

    public int hashCode() {
        return ((android.media.metrics.NetworkEvent) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.metrics.NetworkEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.metrics.NetworkEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder wrap(android.media.metrics.NetworkEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.metrics.NetworkEvent.Builder getReal() {
            return (android.media.metrics.NetworkEvent.Builder) real;
        }

        public android.media.metrics.NetworkEvent.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.NetworkEvent$Builder#android.media.metrics.NetworkEvent$Builder()");
        }

        public com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent build() {
            return com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.wrap(((android.media.metrics.NetworkEvent.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder setMetricsBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder.wrap(((android.media.metrics.NetworkEvent.Builder) real).setMetricsBundle(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder setNetworkType(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.NetworkEvent$Builder#setNetworkType(int)");
        }

        public com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder setTimeSinceCreatedMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder.wrap(((android.media.metrics.NetworkEvent.Builder) real).setTimeSinceCreatedMillis(arg0));
        }

    }
}
