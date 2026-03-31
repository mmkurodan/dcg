// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.quality;

public final class SoundProfile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SoundProfile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.quality.SoundProfile wrap(android.media.quality.SoundProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.SoundProfile(real, (__DcgwBridgeToken) null);
    }

    public android.media.quality.SoundProfile getReal() {
        return (android.media.quality.SoundProfile) real;
    }

    public android.media.quality.SoundProfile unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.quality.SoundProfile) real).describeContents();
    }

    public java.lang.String getInputId() {
        return ((android.media.quality.SoundProfile) real).getInputId();
    }

    public java.lang.String getName() {
        return ((android.media.quality.SoundProfile) real).getName();
    }

    public java.lang.String getPackageName() {
        return ((android.media.quality.SoundProfile) real).getPackageName();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getParameters() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.media.quality.SoundProfile) real).getParameters());
    }

    public java.lang.String getProfileId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.SoundProfile#getProfileId()");
    }

    public int getProfileType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.SoundProfile#getProfileType()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.quality.SoundProfile) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ERROR_DUPLICATE = android.media.quality.SoundProfile.ERROR_DUPLICATE;
    public static final int ERROR_INVALID_ARGUMENT = android.media.quality.SoundProfile.ERROR_INVALID_ARGUMENT;
    public static final int ERROR_NOT_ALLOWLISTED = android.media.quality.SoundProfile.ERROR_NOT_ALLOWLISTED;
    public static final int ERROR_NO_PERMISSION = android.media.quality.SoundProfile.ERROR_NO_PERMISSION;
    public static final int ERROR_UNKNOWN = android.media.quality.SoundProfile.ERROR_UNKNOWN;
    public static final int TYPE_APPLICATION = android.media.quality.SoundProfile.TYPE_APPLICATION;
    public static final int TYPE_SYSTEM = android.media.quality.SoundProfile.TYPE_SYSTEM;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.quality.SoundProfile.Builder wrap(android.media.quality.SoundProfile.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.SoundProfile.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.quality.SoundProfile.Builder getReal() {
            return (android.media.quality.SoundProfile.Builder) real;
        }

        public android.media.quality.SoundProfile.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.media.quality.SoundProfile arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.SoundProfile$Builder#android.media.quality.SoundProfile$Builder(android.media.quality.SoundProfile)");
        }

        public Builder(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.SoundProfile$Builder#android.media.quality.SoundProfile$Builder(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.media.quality.SoundProfile build() {
            return com.micklab.dcg.wrapper.android.media.quality.SoundProfile.wrap(((android.media.quality.SoundProfile.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.quality.SoundProfile.Builder setParameters(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.media.quality.SoundProfile.Builder.wrap(((android.media.quality.SoundProfile.Builder) real).setParameters(arg0 == null ? null : arg0.getReal()));
        }

    }
}
