// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.observer;

public final class ObserverSpec {
    private final android.app.appsearch.observer.ObserverSpec real;

    public ObserverSpec(android.app.appsearch.observer.ObserverSpec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec wrap(android.app.appsearch.observer.ObserverSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec(real);
    }

    public android.app.appsearch.observer.ObserverSpec unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.appsearch.observer.ObserverSpec.Builder real;

        public Builder(android.app.appsearch.observer.ObserverSpec.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.Builder wrap(android.app.appsearch.observer.ObserverSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.Builder(real);
        }

        public android.app.appsearch.observer.ObserverSpec.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.appsearch.observer.ObserverSpec.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.Builder addFilterSchemas(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.Builder.wrap(real.addFilterSchemas(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.wrap(real.build());
        }

    }
}
