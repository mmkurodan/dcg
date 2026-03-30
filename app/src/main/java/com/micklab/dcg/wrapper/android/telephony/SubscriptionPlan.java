// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class SubscriptionPlan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SubscriptionPlan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan wrap(android.telephony.SubscriptionPlan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.SubscriptionPlan getReal() {
        return (android.telephony.SubscriptionPlan) real;
    }

    public android.telephony.SubscriptionPlan unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#equals(java.lang.Object)");
    }

    public int getDataLimitBehavior() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#getDataLimitBehavior()");
    }

    public long getDataLimitBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#getDataLimitBytes()");
    }

    public long getDataUsageBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#getDataUsageBytes()");
    }

    public long getDataUsageTime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#getDataUsageTime()");
    }

    public int[] getNetworkTypes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#getNetworkTypes()");
    }

    public java.lang.CharSequence getSummary() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#getSummary()");
    }

    public java.lang.CharSequence getTitle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#getTitle()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder wrap(android.telephony.SubscriptionPlan.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.SubscriptionPlan.Builder getReal() {
            return (android.telephony.SubscriptionPlan.Builder) real;
        }

        public android.telephony.SubscriptionPlan.Builder unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan$Builder#build()");
        }

        public static com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder createNonrecurring(java.time.ZonedDateTime arg0, java.time.ZonedDateTime arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan$Builder#createNonrecurring(java.time.ZonedDateTime,java.time.ZonedDateTime)");
        }

        public static com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder createRecurring(java.time.ZonedDateTime arg0, java.time.Period arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan$Builder#createRecurring(java.time.ZonedDateTime,java.time.Period)");
        }

        public com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder resetNetworkTypes() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan$Builder#resetNetworkTypes()");
        }

        public com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder setDataLimit(long arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan$Builder#setDataLimit(long,int)");
        }

        public com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder setDataUsage(long arg0, long arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan$Builder#setDataUsage(long,long)");
        }

        public com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder setNetworkTypes(int[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan$Builder#setNetworkTypes([I)");
        }

        public com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder setSummary(java.lang.CharSequence arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan$Builder#setSummary(java.lang.CharSequence)");
        }

        public com.micklab.dcg.wrapper.android.telephony.SubscriptionPlan.Builder setTitle(java.lang.CharSequence arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionPlan$Builder#setTitle(java.lang.CharSequence)");
        }

    }
}
