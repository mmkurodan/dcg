// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class KeyedFrequencyCap {
    private final android.adservices.common.KeyedFrequencyCap real;

    public KeyedFrequencyCap(android.adservices.common.KeyedFrequencyCap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap wrap(android.adservices.common.KeyedFrequencyCap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap(real);
    }

    public android.adservices.common.KeyedFrequencyCap unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAdCounterKey() {
        return real.getAdCounterKey();
    }

    public java.time.Duration getInterval() {
        return real.getInterval();
    }

    public int getMaxCount() {
        return real.getMaxCount();
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
        private final android.adservices.common.KeyedFrequencyCap.Builder real;

        public Builder(android.adservices.common.KeyedFrequencyCap.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder wrap(android.adservices.common.KeyedFrequencyCap.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder(real);
        }

        public android.adservices.common.KeyedFrequencyCap.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, int arg1, java.time.Duration arg2) {
            this(new android.adservices.common.KeyedFrequencyCap.Builder(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap build() {
            return com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder setAdCounterKey(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder.wrap(real.setAdCounterKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder setInterval(java.time.Duration arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder.wrap(real.setInterval(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder setMaxCount(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.KeyedFrequencyCap.Builder.wrap(real.setMaxCount(arg0));
        }

    }
}
