// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.quality;

public final class PictureProfile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PictureProfile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.quality.PictureProfile wrap(android.media.quality.PictureProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.PictureProfile(real, (__DcgwBridgeToken) null);
    }

    public android.media.quality.PictureProfile getReal() {
        return (android.media.quality.PictureProfile) real;
    }

    public android.media.quality.PictureProfile unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.quality.PictureProfile) real).describeContents();
    }

    public java.lang.String getInputId() {
        return ((android.media.quality.PictureProfile) real).getInputId();
    }

    public java.lang.String getName() {
        return ((android.media.quality.PictureProfile) real).getName();
    }

    public java.lang.String getPackageName() {
        return ((android.media.quality.PictureProfile) real).getPackageName();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getParameters() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.media.quality.PictureProfile) real).getParameters());
    }

    public java.lang.String getProfileId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.PictureProfile#getProfileId()");
    }

    public int getProfileType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.PictureProfile#getProfileType()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.quality.PictureProfile) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ERROR_DUPLICATE = android.media.quality.PictureProfile.ERROR_DUPLICATE;
    public static final int ERROR_INVALID_ARGUMENT = android.media.quality.PictureProfile.ERROR_INVALID_ARGUMENT;
    public static final int ERROR_NOT_ALLOWLISTED = android.media.quality.PictureProfile.ERROR_NOT_ALLOWLISTED;
    public static final int ERROR_NO_PERMISSION = android.media.quality.PictureProfile.ERROR_NO_PERMISSION;
    public static final int ERROR_UNKNOWN = android.media.quality.PictureProfile.ERROR_UNKNOWN;
    public static final int TYPE_APPLICATION = android.media.quality.PictureProfile.TYPE_APPLICATION;
    public static final int TYPE_SYSTEM = android.media.quality.PictureProfile.TYPE_SYSTEM;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.quality.PictureProfile.Builder wrap(android.media.quality.PictureProfile.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.PictureProfile.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.quality.PictureProfile.Builder getReal() {
            return (android.media.quality.PictureProfile.Builder) real;
        }

        public android.media.quality.PictureProfile.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.media.quality.PictureProfile arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.PictureProfile$Builder#android.media.quality.PictureProfile$Builder(android.media.quality.PictureProfile)");
        }

        public Builder(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.PictureProfile$Builder#android.media.quality.PictureProfile$Builder(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.media.quality.PictureProfile build() {
            return com.micklab.dcg.wrapper.android.media.quality.PictureProfile.wrap(((android.media.quality.PictureProfile.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.quality.PictureProfile.Builder setParameters(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.media.quality.PictureProfile.Builder.wrap(((android.media.quality.PictureProfile.Builder) real).setParameters(arg0 == null ? null : arg0.getReal()));
        }

    }
}
