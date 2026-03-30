// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.observer;

public final class ObserverSpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ObserverSpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec wrap(android.app.appsearch.observer.ObserverSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.observer.ObserverSpec getReal() {
        return (android.app.appsearch.observer.ObserverSpec) real;
    }

    public android.app.appsearch.observer.ObserverSpec unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.observer.ObserverSpec) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.observer.ObserverSpec) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.Builder wrap(android.app.appsearch.observer.ObserverSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.observer.ObserverSpec.Builder getReal() {
            return (android.app.appsearch.observer.ObserverSpec.Builder) real;
        }

        public android.app.appsearch.observer.ObserverSpec.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.observer.ObserverSpec.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.Builder addFilterSchemas(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.Builder.wrap(((android.app.appsearch.observer.ObserverSpec.Builder) real).addFilterSchemas(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.observer.ObserverSpec.wrap(((android.app.appsearch.observer.ObserverSpec.Builder) real).build());
        }

    }
}
