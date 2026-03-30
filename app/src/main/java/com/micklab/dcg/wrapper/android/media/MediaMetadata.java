// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaMetadata {
    private final android.media.MediaMetadata real;

    public MediaMetadata(android.media.MediaMetadata real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaMetadata wrap(android.media.MediaMetadata real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMetadata(real);
    }

    public android.media.MediaMetadata unwrap() {
        return real;
    }

    public boolean containsKey(java.lang.String arg0) {
        return real.containsKey(arg0);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getBitmap(arg0));
    }

    public int getBitmapDimensionLimit() {
        return real.getBitmapDimensionLimit();
    }

    public com.micklab.dcg.wrapper.android.media.MediaDescription getDescription() {
        return com.micklab.dcg.wrapper.android.media.MediaDescription.wrap(real.getDescription());
    }

    public long getLong(java.lang.String arg0) {
        return real.getLong(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.Rating getRating(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.Rating.wrap(real.getRating(arg0));
    }

    public java.lang.String getString(java.lang.String arg0) {
        return real.getString(arg0);
    }

    public java.lang.CharSequence getText(java.lang.String arg0) {
        return real.getText(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int size() {
        return real.size();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String METADATA_KEY_ALBUM = android.media.MediaMetadata.METADATA_KEY_ALBUM;
    public static final java.lang.String METADATA_KEY_ALBUM_ART = android.media.MediaMetadata.METADATA_KEY_ALBUM_ART;
    public static final java.lang.String METADATA_KEY_ALBUM_ARTIST = android.media.MediaMetadata.METADATA_KEY_ALBUM_ARTIST;
    public static final java.lang.String METADATA_KEY_ALBUM_ART_URI = android.media.MediaMetadata.METADATA_KEY_ALBUM_ART_URI;
    public static final java.lang.String METADATA_KEY_ART = android.media.MediaMetadata.METADATA_KEY_ART;
    public static final java.lang.String METADATA_KEY_ARTIST = android.media.MediaMetadata.METADATA_KEY_ARTIST;
    public static final java.lang.String METADATA_KEY_ART_URI = android.media.MediaMetadata.METADATA_KEY_ART_URI;
    public static final java.lang.String METADATA_KEY_AUTHOR = android.media.MediaMetadata.METADATA_KEY_AUTHOR;
    public static final java.lang.String METADATA_KEY_BT_FOLDER_TYPE = android.media.MediaMetadata.METADATA_KEY_BT_FOLDER_TYPE;
    public static final java.lang.String METADATA_KEY_COMPILATION = android.media.MediaMetadata.METADATA_KEY_COMPILATION;
    public static final java.lang.String METADATA_KEY_COMPOSER = android.media.MediaMetadata.METADATA_KEY_COMPOSER;
    public static final java.lang.String METADATA_KEY_DATE = android.media.MediaMetadata.METADATA_KEY_DATE;
    public static final java.lang.String METADATA_KEY_DISC_NUMBER = android.media.MediaMetadata.METADATA_KEY_DISC_NUMBER;
    public static final java.lang.String METADATA_KEY_DISPLAY_DESCRIPTION = android.media.MediaMetadata.METADATA_KEY_DISPLAY_DESCRIPTION;
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON = android.media.MediaMetadata.METADATA_KEY_DISPLAY_ICON;
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON_URI = android.media.MediaMetadata.METADATA_KEY_DISPLAY_ICON_URI;
    public static final java.lang.String METADATA_KEY_DISPLAY_SUBTITLE = android.media.MediaMetadata.METADATA_KEY_DISPLAY_SUBTITLE;
    public static final java.lang.String METADATA_KEY_DISPLAY_TITLE = android.media.MediaMetadata.METADATA_KEY_DISPLAY_TITLE;
    public static final java.lang.String METADATA_KEY_DURATION = android.media.MediaMetadata.METADATA_KEY_DURATION;
    public static final java.lang.String METADATA_KEY_GENRE = android.media.MediaMetadata.METADATA_KEY_GENRE;
    public static final java.lang.String METADATA_KEY_MEDIA_ID = android.media.MediaMetadata.METADATA_KEY_MEDIA_ID;
    public static final java.lang.String METADATA_KEY_MEDIA_URI = android.media.MediaMetadata.METADATA_KEY_MEDIA_URI;
    public static final java.lang.String METADATA_KEY_NUM_TRACKS = android.media.MediaMetadata.METADATA_KEY_NUM_TRACKS;
    public static final java.lang.String METADATA_KEY_RATING = android.media.MediaMetadata.METADATA_KEY_RATING;
    public static final java.lang.String METADATA_KEY_TITLE = android.media.MediaMetadata.METADATA_KEY_TITLE;
    public static final java.lang.String METADATA_KEY_TRACK_NUMBER = android.media.MediaMetadata.METADATA_KEY_TRACK_NUMBER;
    public static final java.lang.String METADATA_KEY_USER_RATING = android.media.MediaMetadata.METADATA_KEY_USER_RATING;
    public static final java.lang.String METADATA_KEY_WRITER = android.media.MediaMetadata.METADATA_KEY_WRITER;
    public static final java.lang.String METADATA_KEY_YEAR = android.media.MediaMetadata.METADATA_KEY_YEAR;

    public static final class Builder {
        private final android.media.MediaMetadata.Builder real;

        public Builder(android.media.MediaMetadata.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder wrap(android.media.MediaMetadata.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder(real);
        }

        public android.media.MediaMetadata.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.MediaMetadata.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.media.MediaMetadata arg0) {
            this(new android.media.MediaMetadata.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaMetadata build() {
            return com.micklab.dcg.wrapper.android.media.MediaMetadata.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder putBitmap(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder.wrap(real.putBitmap(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder putLong(java.lang.String arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder.wrap(real.putLong(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder putRating(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.Rating arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder.wrap(real.putRating(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder putString(java.lang.String arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder.wrap(real.putString(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder putText(java.lang.String arg0, java.lang.CharSequence arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder.wrap(real.putText(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder setBitmapDimensionLimit(int arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaMetadata.Builder.wrap(real.setBitmapDimensionLimit(arg0));
        }

    }
}
