// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDescription {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaDescription(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDescription wrap(android.media.MediaDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDescription(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaDescription getReal() {
        return (android.media.MediaDescription) real;
    }

    public android.media.MediaDescription unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.MediaDescription) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.MediaDescription) real).equals(arg0);
    }

    public java.lang.CharSequence getDescription() {
        return ((android.media.MediaDescription) real).getDescription();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.MediaDescription) real).getExtras());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getIconBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.media.MediaDescription) real).getIconBitmap());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getIconUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.media.MediaDescription) real).getIconUri());
    }

    public java.lang.String getMediaId() {
        return ((android.media.MediaDescription) real).getMediaId();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getMediaUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.media.MediaDescription) real).getMediaUri());
    }

    public java.lang.CharSequence getSubtitle() {
        return ((android.media.MediaDescription) real).getSubtitle();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.media.MediaDescription) real).getTitle();
    }

    public java.lang.String toString() {
        return ((android.media.MediaDescription) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.MediaDescription) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final long BT_FOLDER_TYPE_ALBUMS = android.media.MediaDescription.BT_FOLDER_TYPE_ALBUMS;
    public static final long BT_FOLDER_TYPE_ARTISTS = android.media.MediaDescription.BT_FOLDER_TYPE_ARTISTS;
    public static final long BT_FOLDER_TYPE_GENRES = android.media.MediaDescription.BT_FOLDER_TYPE_GENRES;
    public static final long BT_FOLDER_TYPE_MIXED = android.media.MediaDescription.BT_FOLDER_TYPE_MIXED;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = android.media.MediaDescription.BT_FOLDER_TYPE_PLAYLISTS;
    public static final long BT_FOLDER_TYPE_TITLES = android.media.MediaDescription.BT_FOLDER_TYPE_TITLES;
    public static final long BT_FOLDER_TYPE_YEARS = android.media.MediaDescription.BT_FOLDER_TYPE_YEARS;
    public static final java.lang.String EXTRA_BT_FOLDER_TYPE = android.media.MediaDescription.EXTRA_BT_FOLDER_TYPE;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDescription.Builder wrap(android.media.MediaDescription.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDescription.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDescription.Builder getReal() {
            return (android.media.MediaDescription.Builder) real;
        }

        public android.media.MediaDescription.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.media.MediaDescription.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription build() {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.wrap(((android.media.MediaDescription.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.Builder.wrap(((android.media.MediaDescription.Builder) real).setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.Builder.wrap(((android.media.MediaDescription.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription.Builder setIconBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.Builder.wrap(((android.media.MediaDescription.Builder) real).setIconBitmap(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription.Builder setIconUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.Builder.wrap(((android.media.MediaDescription.Builder) real).setIconUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription.Builder setMediaId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.Builder.wrap(((android.media.MediaDescription.Builder) real).setMediaId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription.Builder setMediaUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.Builder.wrap(((android.media.MediaDescription.Builder) real).setMediaUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription.Builder setSubtitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.Builder.wrap(((android.media.MediaDescription.Builder) real).setSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.Builder.wrap(((android.media.MediaDescription.Builder) real).setTitle(arg0));
        }

    }
}
