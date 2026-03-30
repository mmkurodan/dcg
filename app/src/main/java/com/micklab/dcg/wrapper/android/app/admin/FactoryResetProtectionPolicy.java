// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class FactoryResetProtectionPolicy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FactoryResetProtectionPolicy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy wrap(android.app.admin.FactoryResetProtectionPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.FactoryResetProtectionPolicy getReal() {
        return (android.app.admin.FactoryResetProtectionPolicy) real;
    }

    public android.app.admin.FactoryResetProtectionPolicy unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.admin.FactoryResetProtectionPolicy) real).describeContents();
    }

    public boolean isFactoryResetProtectionEnabled() {
        return ((android.app.admin.FactoryResetProtectionPolicy) real).isFactoryResetProtectionEnabled();
    }

    public java.lang.String toString() {
        return ((android.app.admin.FactoryResetProtectionPolicy) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.FactoryResetProtectionPolicy) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.Builder wrap(android.app.admin.FactoryResetProtectionPolicy.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.admin.FactoryResetProtectionPolicy.Builder getReal() {
            return (android.app.admin.FactoryResetProtectionPolicy.Builder) real;
        }

        public android.app.admin.FactoryResetProtectionPolicy.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.admin.FactoryResetProtectionPolicy.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy build() {
            return com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.wrap(((android.app.admin.FactoryResetProtectionPolicy.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.Builder setFactoryResetProtectionEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.Builder.wrap(((android.app.admin.FactoryResetProtectionPolicy.Builder) real).setFactoryResetProtectionEnabled(arg0));
        }

    }
}
