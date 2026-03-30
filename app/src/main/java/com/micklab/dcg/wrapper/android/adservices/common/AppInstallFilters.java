// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AppInstallFilters {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppInstallFilters(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters wrap(android.adservices.common.AppInstallFilters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.AppInstallFilters getReal() {
        return (android.adservices.common.AppInstallFilters) real;
    }

    public android.adservices.common.AppInstallFilters unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.common.AppInstallFilters) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.common.AppInstallFilters) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.adservices.common.AppInstallFilters) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.common.AppInstallFilters) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.common.AppInstallFilters) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters.Builder wrap(android.adservices.common.AppInstallFilters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.common.AppInstallFilters.Builder getReal() {
            return (android.adservices.common.AppInstallFilters.Builder) real;
        }

        public android.adservices.common.AppInstallFilters.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.common.AppInstallFilters.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters build() {
            return com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters.wrap(((android.adservices.common.AppInstallFilters.Builder) real).build());
        }

    }
}
