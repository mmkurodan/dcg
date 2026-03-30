// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class FrequencyCapFilters {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FrequencyCapFilters(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters wrap(android.adservices.common.FrequencyCapFilters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.FrequencyCapFilters getReal() {
        return (android.adservices.common.FrequencyCapFilters) real;
    }

    public android.adservices.common.FrequencyCapFilters unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.common.FrequencyCapFilters) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.common.FrequencyCapFilters) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.adservices.common.FrequencyCapFilters) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.common.FrequencyCapFilters) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.common.FrequencyCapFilters) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int AD_EVENT_TYPE_CLICK = android.adservices.common.FrequencyCapFilters.AD_EVENT_TYPE_CLICK;
    public static final int AD_EVENT_TYPE_IMPRESSION = android.adservices.common.FrequencyCapFilters.AD_EVENT_TYPE_IMPRESSION;
    public static final int AD_EVENT_TYPE_VIEW = android.adservices.common.FrequencyCapFilters.AD_EVENT_TYPE_VIEW;
    public static final int AD_EVENT_TYPE_WIN = android.adservices.common.FrequencyCapFilters.AD_EVENT_TYPE_WIN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters.Builder wrap(android.adservices.common.FrequencyCapFilters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.common.FrequencyCapFilters.Builder getReal() {
            return (android.adservices.common.FrequencyCapFilters.Builder) real;
        }

        public android.adservices.common.FrequencyCapFilters.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.common.FrequencyCapFilters.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters build() {
            return com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters.wrap(((android.adservices.common.FrequencyCapFilters.Builder) real).build());
        }

    }
}
