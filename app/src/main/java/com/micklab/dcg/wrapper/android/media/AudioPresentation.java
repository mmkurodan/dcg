// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioPresentation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioPresentation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioPresentation wrap(android.media.AudioPresentation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPresentation(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioPresentation getReal() {
        return (android.media.AudioPresentation) real;
    }

    public android.media.AudioPresentation unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.AudioPresentation) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.AudioPresentation) real).equals(arg0);
    }

    public java.util.Locale getLocale() {
        return ((android.media.AudioPresentation) real).getLocale();
    }

    public int getMasteringIndication() {
        return ((android.media.AudioPresentation) real).getMasteringIndication();
    }

    public int getPresentationId() {
        return ((android.media.AudioPresentation) real).getPresentationId();
    }

    public int getProgramId() {
        return ((android.media.AudioPresentation) real).getProgramId();
    }

    public boolean hasAudioDescription() {
        return ((android.media.AudioPresentation) real).hasAudioDescription();
    }

    public boolean hasDialogueEnhancement() {
        return ((android.media.AudioPresentation) real).hasDialogueEnhancement();
    }

    public boolean hasSpokenSubtitles() {
        return ((android.media.AudioPresentation) real).hasSpokenSubtitles();
    }

    public int hashCode() {
        return ((android.media.AudioPresentation) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.AudioPresentation) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.AudioPresentation) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CONTENT_COMMENTARY = android.media.AudioPresentation.CONTENT_COMMENTARY;
    public static final int CONTENT_DIALOG = android.media.AudioPresentation.CONTENT_DIALOG;
    public static final int CONTENT_EMERGENCY = android.media.AudioPresentation.CONTENT_EMERGENCY;
    public static final int CONTENT_HEARING_IMPAIRED = android.media.AudioPresentation.CONTENT_HEARING_IMPAIRED;
    public static final int CONTENT_MAIN = android.media.AudioPresentation.CONTENT_MAIN;
    public static final int CONTENT_MUSIC_AND_EFFECTS = android.media.AudioPresentation.CONTENT_MUSIC_AND_EFFECTS;
    public static final int CONTENT_UNKNOWN = android.media.AudioPresentation.CONTENT_UNKNOWN;
    public static final int CONTENT_VISUALLY_IMPAIRED = android.media.AudioPresentation.CONTENT_VISUALLY_IMPAIRED;
    public static final int CONTENT_VOICEOVER = android.media.AudioPresentation.CONTENT_VOICEOVER;
    public static final int MASTERED_FOR_3D = android.media.AudioPresentation.MASTERED_FOR_3D;
    public static final int MASTERED_FOR_HEADPHONE = android.media.AudioPresentation.MASTERED_FOR_HEADPHONE;
    public static final int MASTERED_FOR_STEREO = android.media.AudioPresentation.MASTERED_FOR_STEREO;
    public static final int MASTERED_FOR_SURROUND = android.media.AudioPresentation.MASTERED_FOR_SURROUND;
    public static final int MASTERING_NOT_INDICATED = android.media.AudioPresentation.MASTERING_NOT_INDICATED;
    public static final int PRESENTATION_ID_UNKNOWN = android.media.AudioPresentation.PRESENTATION_ID_UNKNOWN;
    public static final int PROGRAM_ID_UNKNOWN = android.media.AudioPresentation.PROGRAM_ID_UNKNOWN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder wrap(android.media.AudioPresentation.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioPresentation.Builder getReal() {
            return (android.media.AudioPresentation.Builder) real;
        }

        public android.media.AudioPresentation.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.media.AudioPresentation.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation build() {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.wrap(((android.media.AudioPresentation.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setHasAudioDescription(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(((android.media.AudioPresentation.Builder) real).setHasAudioDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setHasDialogueEnhancement(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(((android.media.AudioPresentation.Builder) real).setHasDialogueEnhancement(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setHasSpokenSubtitles(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(((android.media.AudioPresentation.Builder) real).setHasSpokenSubtitles(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(((android.media.AudioPresentation.Builder) real).setLocale(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setMasteringIndication(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(((android.media.AudioPresentation.Builder) real).setMasteringIndication(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setProgramId(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(((android.media.AudioPresentation.Builder) real).setProgramId(arg0));
        }

    }
}
