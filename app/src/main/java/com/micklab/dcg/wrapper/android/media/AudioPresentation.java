// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioPresentation {
    private final android.media.AudioPresentation real;

    public AudioPresentation(android.media.AudioPresentation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioPresentation wrap(android.media.AudioPresentation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPresentation(real);
    }

    public android.media.AudioPresentation unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.util.Locale getLocale() {
        return real.getLocale();
    }

    public int getMasteringIndication() {
        return real.getMasteringIndication();
    }

    public int getPresentationId() {
        return real.getPresentationId();
    }

    public int getProgramId() {
        return real.getProgramId();
    }

    public boolean hasAudioDescription() {
        return real.hasAudioDescription();
    }

    public boolean hasDialogueEnhancement() {
        return real.hasDialogueEnhancement();
    }

    public boolean hasSpokenSubtitles() {
        return real.hasSpokenSubtitles();
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
        private final android.media.AudioPresentation.Builder real;

        public Builder(android.media.AudioPresentation.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder wrap(android.media.AudioPresentation.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder(real);
        }

        public android.media.AudioPresentation.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.media.AudioPresentation.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation build() {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setHasAudioDescription(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(real.setHasAudioDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setHasDialogueEnhancement(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(real.setHasDialogueEnhancement(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setHasSpokenSubtitles(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(real.setHasSpokenSubtitles(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(real.setLocale(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setMasteringIndication(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(real.setMasteringIndication(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder setProgramId(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPresentation.Builder.wrap(real.setProgramId(arg0));
        }

    }
}
