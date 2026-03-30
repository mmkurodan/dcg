// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class FrequencyCapFilters {
    private final android.adservices.common.FrequencyCapFilters real;

    public FrequencyCapFilters(android.adservices.common.FrequencyCapFilters real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters wrap(android.adservices.common.FrequencyCapFilters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters(real);
    }

    public android.adservices.common.FrequencyCapFilters unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
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

    public static final int AD_EVENT_TYPE_CLICK = android.adservices.common.FrequencyCapFilters.AD_EVENT_TYPE_CLICK;
    public static final int AD_EVENT_TYPE_IMPRESSION = android.adservices.common.FrequencyCapFilters.AD_EVENT_TYPE_IMPRESSION;
    public static final int AD_EVENT_TYPE_VIEW = android.adservices.common.FrequencyCapFilters.AD_EVENT_TYPE_VIEW;
    public static final int AD_EVENT_TYPE_WIN = android.adservices.common.FrequencyCapFilters.AD_EVENT_TYPE_WIN;

    public static final class Builder {
        private final android.adservices.common.FrequencyCapFilters.Builder real;

        public Builder(android.adservices.common.FrequencyCapFilters.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters.Builder wrap(android.adservices.common.FrequencyCapFilters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters.Builder(real);
        }

        public android.adservices.common.FrequencyCapFilters.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.common.FrequencyCapFilters.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters build() {
            return com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters.wrap(real.build());
        }

    }
}
