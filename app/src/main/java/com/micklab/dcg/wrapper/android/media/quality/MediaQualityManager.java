// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.quality;

public final class MediaQualityManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaQualityManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager wrap(android.media.quality.MediaQualityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager(real, (__DcgwBridgeToken) null);
    }

    public android.media.quality.MediaQualityManager getReal() {
        return (android.media.quality.MediaQualityManager) real;
    }

    public android.media.quality.MediaQualityManager unwrap() {
        return getReal();
    }

    public void createPictureProfile(com.micklab.dcg.wrapper.android.media.quality.PictureProfile arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#createPictureProfile(android.media.quality.PictureProfile)");
    }

    public void createSoundProfile(com.micklab.dcg.wrapper.android.media.quality.SoundProfile arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#createSoundProfile(android.media.quality.SoundProfile)");
    }

    public com.micklab.dcg.wrapper.android.media.quality.PictureProfile getPictureProfile(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#getPictureProfile(int,java.lang.String,android.media.quality.MediaQualityManager$ProfileQueryParams)");
    }

    public com.micklab.dcg.wrapper.android.media.quality.SoundProfile getSoundProfile(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#getSoundProfile(int,java.lang.String,android.media.quality.MediaQualityManager$ProfileQueryParams)");
    }

    public boolean isAmbientBacklightEnabled() {
        return ((android.media.quality.MediaQualityManager) real).isAmbientBacklightEnabled();
    }

    public boolean isAutoPictureQualityEnabled() {
        return ((android.media.quality.MediaQualityManager) real).isAutoPictureQualityEnabled();
    }

    public boolean isAutoSoundQualityEnabled() {
        return ((android.media.quality.MediaQualityManager) real).isAutoSoundQualityEnabled();
    }

    public boolean isSuperResolutionEnabled() {
        return ((android.media.quality.MediaQualityManager) real).isSuperResolutionEnabled();
    }

    public void registerAmbientBacklightCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.AmbientBacklightCallback arg1) {
        ((android.media.quality.MediaQualityManager) real).registerAmbientBacklightCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void registerPictureProfileCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.PictureProfileCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#registerPictureProfileCallback(java.util.concurrent.Executor,android.media.quality.MediaQualityManager$PictureProfileCallback)");
    }

    public void registerSoundProfileCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.SoundProfileCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#registerSoundProfileCallback(java.util.concurrent.Executor,android.media.quality.MediaQualityManager$SoundProfileCallback)");
    }

    public void removePictureProfile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#removePictureProfile(java.lang.String)");
    }

    public void removeSoundProfile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#removeSoundProfile(java.lang.String)");
    }

    public void setAmbientBacklightEnabled(boolean arg0) {
        ((android.media.quality.MediaQualityManager) real).setAmbientBacklightEnabled(arg0);
    }

    public void setAmbientBacklightSettings(com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightSettings arg0) {
        ((android.media.quality.MediaQualityManager) real).setAmbientBacklightSettings(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterAmbientBacklightCallback(com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.AmbientBacklightCallback arg0) {
        ((android.media.quality.MediaQualityManager) real).unregisterAmbientBacklightCallback(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterPictureProfileCallback(com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.PictureProfileCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#unregisterPictureProfileCallback(android.media.quality.MediaQualityManager$PictureProfileCallback)");
    }

    public void unregisterSoundProfileCallback(com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.SoundProfileCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#unregisterSoundProfileCallback(android.media.quality.MediaQualityManager$SoundProfileCallback)");
    }

    public void updatePictureProfile(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.quality.PictureProfile arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#updatePictureProfile(java.lang.String,android.media.quality.PictureProfile)");
    }

    public void updateSoundProfile(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.quality.SoundProfile arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager#updateSoundProfile(java.lang.String,android.media.quality.SoundProfile)");
    }

    public static final class AmbientBacklightCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AmbientBacklightCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.AmbientBacklightCallback wrap(android.media.quality.MediaQualityManager.AmbientBacklightCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.AmbientBacklightCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.quality.MediaQualityManager.AmbientBacklightCallback getReal() {
            return (android.media.quality.MediaQualityManager.AmbientBacklightCallback) real;
        }

        public android.media.quality.MediaQualityManager.AmbientBacklightCallback unwrap() {
            return getReal();
        }

        public void onAmbientBacklightEvent(com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightEvent arg0) {
            ((android.media.quality.MediaQualityManager.AmbientBacklightCallback) real).onAmbientBacklightEvent(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class PictureProfileCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PictureProfileCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.PictureProfileCallback wrap(android.media.quality.MediaQualityManager.PictureProfileCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.PictureProfileCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.quality.MediaQualityManager.PictureProfileCallback getReal() {
            return (android.media.quality.MediaQualityManager.PictureProfileCallback) real;
        }

        public android.media.quality.MediaQualityManager.PictureProfileCallback unwrap() {
            return getReal();
        }

        public void onError(java.lang.String arg0, int arg1) {
            ((android.media.quality.MediaQualityManager.PictureProfileCallback) real).onError(arg0, arg1);
        }

        public void onPictureProfileAdded(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.quality.PictureProfile arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager$PictureProfileCallback#onPictureProfileAdded(java.lang.String,android.media.quality.PictureProfile)");
        }

        public void onPictureProfileRemoved(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.quality.PictureProfile arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager$PictureProfileCallback#onPictureProfileRemoved(java.lang.String,android.media.quality.PictureProfile)");
        }

        public void onPictureProfileUpdated(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.quality.PictureProfile arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager$PictureProfileCallback#onPictureProfileUpdated(java.lang.String,android.media.quality.PictureProfile)");
        }

    }
    public static final class ProfileQueryParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ProfileQueryParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams wrap(android.media.quality.MediaQualityManager.ProfileQueryParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams(real, (__DcgwBridgeToken) null);
        }

        public android.media.quality.MediaQualityManager.ProfileQueryParams getReal() {
            return (android.media.quality.MediaQualityManager.ProfileQueryParams) real;
        }

        public android.media.quality.MediaQualityManager.ProfileQueryParams unwrap() {
            return getReal();
        }

        public boolean areParametersIncluded() {
            return ((android.media.quality.MediaQualityManager.ProfileQueryParams) real).areParametersIncluded();
        }

        public int describeContents() {
            return ((android.media.quality.MediaQualityManager.ProfileQueryParams) real).describeContents();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.quality.MediaQualityManager.ProfileQueryParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams.Builder wrap(android.media.quality.MediaQualityManager.ProfileQueryParams.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.media.quality.MediaQualityManager.ProfileQueryParams.Builder getReal() {
                return (android.media.quality.MediaQualityManager.ProfileQueryParams.Builder) real;
            }

            public android.media.quality.MediaQualityManager.ProfileQueryParams.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager$ProfileQueryParams$Builder#android.media.quality.MediaQualityManager$ProfileQueryParams$Builder()");
            }

            public com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams build() {
                return com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams.wrap(((android.media.quality.MediaQualityManager.ProfileQueryParams.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams.Builder setParametersIncluded(boolean arg0) {
                return com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.ProfileQueryParams.Builder.wrap(((android.media.quality.MediaQualityManager.ProfileQueryParams.Builder) real).setParametersIncluded(arg0));
            }

        }
    }
    public static final class SoundProfileCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SoundProfileCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.SoundProfileCallback wrap(android.media.quality.MediaQualityManager.SoundProfileCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.MediaQualityManager.SoundProfileCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.quality.MediaQualityManager.SoundProfileCallback getReal() {
            return (android.media.quality.MediaQualityManager.SoundProfileCallback) real;
        }

        public android.media.quality.MediaQualityManager.SoundProfileCallback unwrap() {
            return getReal();
        }

        public void onError(java.lang.String arg0, int arg1) {
            ((android.media.quality.MediaQualityManager.SoundProfileCallback) real).onError(arg0, arg1);
        }

        public void onSoundProfileAdded(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.quality.SoundProfile arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager$SoundProfileCallback#onSoundProfileAdded(java.lang.String,android.media.quality.SoundProfile)");
        }

        public void onSoundProfileRemoved(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.quality.SoundProfile arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager$SoundProfileCallback#onSoundProfileRemoved(java.lang.String,android.media.quality.SoundProfile)");
        }

        public void onSoundProfileUpdated(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.quality.SoundProfile arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.MediaQualityManager$SoundProfileCallback#onSoundProfileUpdated(java.lang.String,android.media.quality.SoundProfile)");
        }

    }
}
