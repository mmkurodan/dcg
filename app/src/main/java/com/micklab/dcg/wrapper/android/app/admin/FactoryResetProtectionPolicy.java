// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class FactoryResetProtectionPolicy {
    private final android.app.admin.FactoryResetProtectionPolicy real;

    public FactoryResetProtectionPolicy(android.app.admin.FactoryResetProtectionPolicy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy wrap(android.app.admin.FactoryResetProtectionPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy(real);
    }

    public android.app.admin.FactoryResetProtectionPolicy unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean isFactoryResetProtectionEnabled() {
        return real.isFactoryResetProtectionEnabled();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.admin.FactoryResetProtectionPolicy.Builder real;

        public Builder(android.app.admin.FactoryResetProtectionPolicy.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.Builder wrap(android.app.admin.FactoryResetProtectionPolicy.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.Builder(real);
        }

        public android.app.admin.FactoryResetProtectionPolicy.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.admin.FactoryResetProtectionPolicy.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy build() {
            return com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.Builder setFactoryResetProtectionEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.Builder.wrap(real.setFactoryResetProtectionEnabled(arg0));
        }

    }
}
