// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class AppUriAuthenticationPolicy {
    private final android.security.AppUriAuthenticationPolicy real;

    public AppUriAuthenticationPolicy(android.security.AppUriAuthenticationPolicy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy wrap(android.security.AppUriAuthenticationPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy(real);
    }

    public android.security.AppUriAuthenticationPolicy unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
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
        private final android.security.AppUriAuthenticationPolicy.Builder real;

        public Builder(android.security.AppUriAuthenticationPolicy.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.Builder wrap(android.security.AppUriAuthenticationPolicy.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.Builder(real);
        }

        public android.security.AppUriAuthenticationPolicy.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.security.AppUriAuthenticationPolicy.Builder());
        }

        public com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.Builder addAppAndUriMapping(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.Builder.wrap(real.addAppAndUriMapping(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy build() {
            return com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.wrap(real.build());
        }

    }
}
