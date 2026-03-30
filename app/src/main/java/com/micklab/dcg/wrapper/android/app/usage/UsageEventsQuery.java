// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class UsageEventsQuery {
    private final android.app.usage.UsageEventsQuery real;

    public UsageEventsQuery(android.app.usage.UsageEventsQuery real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery wrap(android.app.usage.UsageEventsQuery real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery(real);
    }

    public android.app.usage.UsageEventsQuery unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getBeginTimeMillis() {
        return real.getBeginTimeMillis();
    }

    public long getEndTimeMillis() {
        return real.getEndTimeMillis();
    }

    public int[] getEventTypes() {
        return real.getEventTypes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.usage.UsageEventsQuery.Builder real;

        public Builder(android.app.usage.UsageEventsQuery.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder wrap(android.app.usage.UsageEventsQuery.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder(real);
        }

        public android.app.usage.UsageEventsQuery.Builder unwrap() {
            return real;
        }

        public Builder(long arg0, long arg1) {
            this(new android.app.usage.UsageEventsQuery.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery build() {
            return com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder setEventTypes(int... arg0) {
            return com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder.wrap(real.setEventTypes(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder setPackageNames(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery.Builder.wrap(real.setPackageNames(arg0));
        }

    }
}
