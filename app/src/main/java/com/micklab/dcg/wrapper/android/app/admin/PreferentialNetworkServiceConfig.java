// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class PreferentialNetworkServiceConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PreferentialNetworkServiceConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig wrap(android.app.admin.PreferentialNetworkServiceConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.PreferentialNetworkServiceConfig getReal() {
        return (android.app.admin.PreferentialNetworkServiceConfig) real;
    }

    public android.app.admin.PreferentialNetworkServiceConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.admin.PreferentialNetworkServiceConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.admin.PreferentialNetworkServiceConfig) real).equals(arg0);
    }

    public int[] getExcludedUids() {
        return ((android.app.admin.PreferentialNetworkServiceConfig) real).getExcludedUids();
    }

    public int[] getIncludedUids() {
        return ((android.app.admin.PreferentialNetworkServiceConfig) real).getIncludedUids();
    }

    public int getNetworkId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig#getNetworkId()");
    }

    public int hashCode() {
        return ((android.app.admin.PreferentialNetworkServiceConfig) real).hashCode();
    }

    public boolean isEnabled() {
        return ((android.app.admin.PreferentialNetworkServiceConfig) real).isEnabled();
    }

    public boolean isFallbackToDefaultConnectionAllowed() {
        return ((android.app.admin.PreferentialNetworkServiceConfig) real).isFallbackToDefaultConnectionAllowed();
    }

    public boolean shouldBlockNonMatchingNetworks() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig#shouldBlockNonMatchingNetworks()");
    }

    public java.lang.String toString() {
        return ((android.app.admin.PreferentialNetworkServiceConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.PreferentialNetworkServiceConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder wrap(android.app.admin.PreferentialNetworkServiceConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.admin.PreferentialNetworkServiceConfig.Builder getReal() {
            return (android.app.admin.PreferentialNetworkServiceConfig.Builder) real;
        }

        public android.app.admin.PreferentialNetworkServiceConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig$Builder#android.app.admin.PreferentialNetworkServiceConfig$Builder()");
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig build() {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.wrap(((android.app.admin.PreferentialNetworkServiceConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder.wrap(((android.app.admin.PreferentialNetworkServiceConfig.Builder) real).setEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setExcludedUids(int[] arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder.wrap(((android.app.admin.PreferentialNetworkServiceConfig.Builder) real).setExcludedUids(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setFallbackToDefaultConnectionAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder.wrap(((android.app.admin.PreferentialNetworkServiceConfig.Builder) real).setFallbackToDefaultConnectionAllowed(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setIncludedUids(int[] arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder.wrap(((android.app.admin.PreferentialNetworkServiceConfig.Builder) real).setIncludedUids(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setNetworkId(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig$Builder#setNetworkId(int)");
        }

        public com.micklab.dcg.wrapper.android.app.admin.PreferentialNetworkServiceConfig.Builder setShouldBlockNonMatchingNetworks(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.PreferentialNetworkServiceConfig$Builder#setShouldBlockNonMatchingNetworks(boolean)");
        }

    }
}
