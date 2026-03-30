// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class PreferentialNetworkServiceConfig {
    private final android.app.admin.PreferentialNetworkServiceConfig real;

    public PreferentialNetworkServiceConfig(android.app.admin.PreferentialNetworkServiceConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig wrap(android.app.admin.PreferentialNetworkServiceConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig(real);
    }

    public android.app.admin.PreferentialNetworkServiceConfig unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int[] getExcludedUids() {
        return real.getExcludedUids();
    }

    public int[] getIncludedUids() {
        return real.getIncludedUids();
    }

    public int getNetworkId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig#getNetworkId()");
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isFallbackToDefaultConnectionAllowed() {
        return real.isFallbackToDefaultConnectionAllowed();
    }

    public boolean shouldBlockNonMatchingNetworks() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig#shouldBlockNonMatchingNetworks()");
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.admin.PreferentialNetworkServiceConfig.Builder real;

        public Builder(android.app.admin.PreferentialNetworkServiceConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder wrap(android.app.admin.PreferentialNetworkServiceConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder(real);
        }

        public android.app.admin.PreferentialNetworkServiceConfig.Builder unwrap() {
            return real;
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig$Builder#android.app.admin.PreferentialNetworkServiceConfig$Builder()");
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig build() {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder.wrap(real.setEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setExcludedUids(int[] arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder.wrap(real.setExcludedUids(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setFallbackToDefaultConnectionAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder.wrap(real.setFallbackToDefaultConnectionAllowed(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setIncludedUids(int[] arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder.wrap(real.setIncludedUids(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setNetworkId(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig$Builder#setNetworkId(int)");
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setShouldBlockNonMatchingNetworks(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig$Builder#setShouldBlockNonMatchingNetworks(boolean)");
        }

    }
}
