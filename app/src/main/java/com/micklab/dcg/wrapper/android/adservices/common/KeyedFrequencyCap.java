// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class KeyedFrequencyCap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyedFrequencyCap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap wrap(android.adservices.common.KeyedFrequencyCap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.KeyedFrequencyCap getReal() {
        return (android.adservices.common.KeyedFrequencyCap) real;
    }

    public android.adservices.common.KeyedFrequencyCap unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.common.KeyedFrequencyCap) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.common.KeyedFrequencyCap) real).equals(arg0);
    }

    public int getAdCounterKey() {
        return ((android.adservices.common.KeyedFrequencyCap) real).getAdCounterKey();
    }

    public java.time.Duration getInterval() {
        return ((android.adservices.common.KeyedFrequencyCap) real).getInterval();
    }

    public int getMaxCount() {
        return ((android.adservices.common.KeyedFrequencyCap) real).getMaxCount();
    }

    public int hashCode() {
        return ((android.adservices.common.KeyedFrequencyCap) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.common.KeyedFrequencyCap) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.common.KeyedFrequencyCap) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder wrap(android.adservices.common.KeyedFrequencyCap.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.common.KeyedFrequencyCap.Builder getReal() {
            return (android.adservices.common.KeyedFrequencyCap.Builder) real;
        }

        public android.adservices.common.KeyedFrequencyCap.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1, java.time.Duration arg2) {
            this(new android.adservices.common.KeyedFrequencyCap.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap build() {
            return com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.wrap(((android.adservices.common.KeyedFrequencyCap.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder setAdCounterKey(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder.wrap(((android.adservices.common.KeyedFrequencyCap.Builder) real).setAdCounterKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder setInterval(java.time.Duration arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder.wrap(((android.adservices.common.KeyedFrequencyCap.Builder) real).setInterval(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder setMaxCount(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder.wrap(((android.adservices.common.KeyedFrequencyCap.Builder) real).setMaxCount(arg0));
        }

    }
}
