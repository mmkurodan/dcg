// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class Capability {
    private final android.content.pm.Capability real;

    public Capability(android.content.pm.Capability real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.Capability wrap(android.content.pm.Capability real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.Capability(real);
    }

    public android.content.pm.Capability unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Capability#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Capability#equals(java.lang.Object)");
    }

    public java.lang.String getName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Capability#getName()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Capability#hashCode()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Capability#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private final android.content.pm.Capability.Builder real;

        public Builder(android.content.pm.Capability.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.Capability.Builder wrap(android.content.pm.Capability.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.Capability.Builder(real);
        }

        public android.content.pm.Capability.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Capability$Builder#android.content.pm.Capability$Builder(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.content.pm.Capability build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Capability$Builder#build()");
        }

    }
}
