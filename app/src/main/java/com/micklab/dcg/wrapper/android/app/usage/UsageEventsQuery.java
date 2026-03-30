// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class UsageEventsQuery {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsageEventsQuery(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery wrap(android.app.usage.UsageEventsQuery real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.UsageEventsQuery getReal() {
        return (android.app.usage.UsageEventsQuery) real;
    }

    public android.app.usage.UsageEventsQuery unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.usage.UsageEventsQuery) real).describeContents();
    }

    public long getBeginTimeMillis() {
        return ((android.app.usage.UsageEventsQuery) real).getBeginTimeMillis();
    }

    public long getEndTimeMillis() {
        return ((android.app.usage.UsageEventsQuery) real).getEndTimeMillis();
    }

    public int[] getEventTypes() {
        return ((android.app.usage.UsageEventsQuery) real).getEventTypes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.usage.UsageEventsQuery) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder wrap(android.app.usage.UsageEventsQuery.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.usage.UsageEventsQuery.Builder getReal() {
            return (android.app.usage.UsageEventsQuery.Builder) real;
        }

        public android.app.usage.UsageEventsQuery.Builder unwrap() {
            return getReal();
        }

        public Builder(long arg0, long arg1) {
            this(new android.app.usage.UsageEventsQuery.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery build() {
            return com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.wrap(((android.app.usage.UsageEventsQuery.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder setEventTypes(int... arg0) {
            return com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder.wrap(((android.app.usage.UsageEventsQuery.Builder) real).setEventTypes(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder setPackageNames(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder.wrap(((android.app.usage.UsageEventsQuery.Builder) real).setPackageNames(arg0));
        }

    }
}
