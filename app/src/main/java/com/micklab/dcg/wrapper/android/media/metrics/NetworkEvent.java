// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class NetworkEvent {
    private final android.media.metrics.NetworkEvent real;

    public NetworkEvent(android.media.metrics.NetworkEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent wrap(android.media.metrics.NetworkEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent(real);
    }

    public android.media.metrics.NetworkEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getMetricsBundle());
    }

    public int getNetworkType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.NetworkEvent#getNetworkType()");
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


    public static final class Builder {
        private final android.media.metrics.NetworkEvent.Builder real;

        public Builder(android.media.metrics.NetworkEvent.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder wrap(android.media.metrics.NetworkEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder(real);
        }

        public android.media.metrics.NetworkEvent.Builder unwrap() {
            return real;
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.NetworkEvent$Builder#android.media.metrics.NetworkEvent$Builder()");
        }

        public com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent build() {
            return com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder setMetricsBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder.wrap(real.setMetricsBundle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder setNetworkType(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.NetworkEvent$Builder#setNetworkType(int)");
        }

        public com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder setTimeSinceCreatedMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent.Builder.wrap(real.setTimeSinceCreatedMillis(arg0));
        }

    }
}
