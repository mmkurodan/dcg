// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class AppUriAuthenticationPolicy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppUriAuthenticationPolicy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy wrap(android.security.AppUriAuthenticationPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy(real, (__DcgwBridgeToken) null);
    }

    public android.security.AppUriAuthenticationPolicy getReal() {
        return (android.security.AppUriAuthenticationPolicy) real;
    }

    public android.security.AppUriAuthenticationPolicy unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.security.AppUriAuthenticationPolicy) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.security.AppUriAuthenticationPolicy) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.security.AppUriAuthenticationPolicy) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.security.AppUriAuthenticationPolicy) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.security.AppUriAuthenticationPolicy) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.Builder wrap(android.security.AppUriAuthenticationPolicy.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.security.AppUriAuthenticationPolicy.Builder getReal() {
            return (android.security.AppUriAuthenticationPolicy.Builder) real;
        }

        public android.security.AppUriAuthenticationPolicy.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.security.AppUriAuthenticationPolicy.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.Builder addAppAndUriMapping(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.Builder.wrap(((android.security.AppUriAuthenticationPolicy.Builder) real).addAppAndUriMapping(arg0, arg1 == null ? null : arg1.getReal(), arg2));
        }

        public com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy build() {
            return com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.wrap(((android.security.AppUriAuthenticationPolicy.Builder) real).build());
        }

    }
}
