// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaMetadataRetriever {
    private final android.media.MediaMetadataRetriever real;

    public MediaMetadataRetriever(android.media.MediaMetadataRetriever real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaMetadataRetriever wrap(android.media.MediaMetadataRetriever real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMetadataRetriever(real);
    }

    public android.media.MediaMetadataRetriever unwrap() {
        return real;
    }

    public MediaMetadataRetriever() {
        this(new android.media.MediaMetadataRetriever());
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public java.lang.String extractMetadata(int arg0) {
        return real.extractMetadata(arg0);
    }

    public byte[] getEmbeddedPicture() {
        return real.getEmbeddedPicture();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFrameAtIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getFrameAtIndex(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFrameAtIndex(int arg0, com.micklab.dcg.wrapper.android.media.MediaMetadataRetriever.BitmapParams arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getFrameAtIndex(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFrameAtTime() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getFrameAtTime());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFrameAtTime(long arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getFrameAtTime(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFrameAtTime(long arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getFrameAtTime(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFrameAtTime(long arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaMetadataRetriever.BitmapParams arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getFrameAtTime(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getImageAtIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getImageAtIndex(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getImageAtIndex(int arg0, com.micklab.dcg.wrapper.android.media.MediaMetadataRetriever.BitmapParams arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getImageAtIndex(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getPrimaryImage() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getPrimaryImage());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getPrimaryImage(com.micklab.dcg.wrapper.android.media.MediaMetadataRetriever.BitmapParams arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getPrimaryImage(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getScaledFrameAtTime(long arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getScaledFrameAtTime(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getScaledFrameAtTime(long arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.media.MediaMetadataRetriever.BitmapParams arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getScaledFrameAtTime(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap()));
    }

    public void release() throws java.io.IOException {
        real.release();
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.media.MediaDataSource arg0) throws java.lang.IllegalArgumentException {
        real.setDataSource(arg0 == null ? null : arg0.unwrap());
    }

    public void setDataSource(java.lang.String arg0) throws java.lang.IllegalArgumentException {
        real.setDataSource(arg0);
    }

    public void setDataSource(java.io.FileDescriptor arg0) throws java.lang.IllegalArgumentException {
        real.setDataSource(arg0);
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) throws java.lang.IllegalArgumentException, java.lang.SecurityException {
        real.setDataSource(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setDataSource(java.io.FileDescriptor arg0, long arg1, long arg2) throws java.lang.IllegalArgumentException {
        real.setDataSource(arg0, arg1, arg2);
    }

    public static final int METADATA_KEY_ALBUM = android.media.MediaMetadataRetriever.METADATA_KEY_ALBUM;
    public static final int METADATA_KEY_ALBUMARTIST = android.media.MediaMetadataRetriever.METADATA_KEY_ALBUMARTIST;
    public static final int METADATA_KEY_ARTIST = android.media.MediaMetadataRetriever.METADATA_KEY_ARTIST;
    public static final int METADATA_KEY_AUTHOR = android.media.MediaMetadataRetriever.METADATA_KEY_AUTHOR;
    public static final int METADATA_KEY_BITRATE = android.media.MediaMetadataRetriever.METADATA_KEY_BITRATE;
    public static final int METADATA_KEY_BITS_PER_SAMPLE = android.media.MediaMetadataRetriever.METADATA_KEY_BITS_PER_SAMPLE;
    public static final int METADATA_KEY_CAPTURE_FRAMERATE = android.media.MediaMetadataRetriever.METADATA_KEY_CAPTURE_FRAMERATE;
    public static final int METADATA_KEY_CD_TRACK_NUMBER = android.media.MediaMetadataRetriever.METADATA_KEY_CD_TRACK_NUMBER;
    public static final int METADATA_KEY_COLOR_RANGE = android.media.MediaMetadataRetriever.METADATA_KEY_COLOR_RANGE;
    public static final int METADATA_KEY_COLOR_STANDARD = android.media.MediaMetadataRetriever.METADATA_KEY_COLOR_STANDARD;
    public static final int METADATA_KEY_COLOR_TRANSFER = android.media.MediaMetadataRetriever.METADATA_KEY_COLOR_TRANSFER;
    public static final int METADATA_KEY_COMPILATION = android.media.MediaMetadataRetriever.METADATA_KEY_COMPILATION;
    public static final int METADATA_KEY_COMPOSER = android.media.MediaMetadataRetriever.METADATA_KEY_COMPOSER;
    public static final int METADATA_KEY_DATE = android.media.MediaMetadataRetriever.METADATA_KEY_DATE;
    public static final int METADATA_KEY_DISC_NUMBER = android.media.MediaMetadataRetriever.METADATA_KEY_DISC_NUMBER;
    public static final int METADATA_KEY_DURATION = android.media.MediaMetadataRetriever.METADATA_KEY_DURATION;
    public static final int METADATA_KEY_EXIF_LENGTH = android.media.MediaMetadataRetriever.METADATA_KEY_EXIF_LENGTH;
    public static final int METADATA_KEY_EXIF_OFFSET = android.media.MediaMetadataRetriever.METADATA_KEY_EXIF_OFFSET;
    public static final int METADATA_KEY_GENRE = android.media.MediaMetadataRetriever.METADATA_KEY_GENRE;
    public static final int METADATA_KEY_HAS_AUDIO = android.media.MediaMetadataRetriever.METADATA_KEY_HAS_AUDIO;
    public static final int METADATA_KEY_HAS_IMAGE = android.media.MediaMetadataRetriever.METADATA_KEY_HAS_IMAGE;
    public static final int METADATA_KEY_HAS_VIDEO = android.media.MediaMetadataRetriever.METADATA_KEY_HAS_VIDEO;
    public static final int METADATA_KEY_IMAGE_COUNT = android.media.MediaMetadataRetriever.METADATA_KEY_IMAGE_COUNT;
    public static final int METADATA_KEY_IMAGE_HEIGHT = android.media.MediaMetadataRetriever.METADATA_KEY_IMAGE_HEIGHT;
    public static final int METADATA_KEY_IMAGE_PRIMARY = android.media.MediaMetadataRetriever.METADATA_KEY_IMAGE_PRIMARY;
    public static final int METADATA_KEY_IMAGE_ROTATION = android.media.MediaMetadataRetriever.METADATA_KEY_IMAGE_ROTATION;
    public static final int METADATA_KEY_IMAGE_WIDTH = android.media.MediaMetadataRetriever.METADATA_KEY_IMAGE_WIDTH;
    public static final int METADATA_KEY_LOCATION = android.media.MediaMetadataRetriever.METADATA_KEY_LOCATION;
    public static final int METADATA_KEY_MIMETYPE = android.media.MediaMetadataRetriever.METADATA_KEY_MIMETYPE;
    public static final int METADATA_KEY_NUM_TRACKS = android.media.MediaMetadataRetriever.METADATA_KEY_NUM_TRACKS;
    public static final int METADATA_KEY_SAMPLERATE = android.media.MediaMetadataRetriever.METADATA_KEY_SAMPLERATE;
    public static final int METADATA_KEY_TITLE = android.media.MediaMetadataRetriever.METADATA_KEY_TITLE;
    public static final int METADATA_KEY_VIDEO_FRAME_COUNT = android.media.MediaMetadataRetriever.METADATA_KEY_VIDEO_FRAME_COUNT;
    public static final int METADATA_KEY_VIDEO_HEIGHT = android.media.MediaMetadataRetriever.METADATA_KEY_VIDEO_HEIGHT;
    public static final int METADATA_KEY_VIDEO_ROTATION = android.media.MediaMetadataRetriever.METADATA_KEY_VIDEO_ROTATION;
    public static final int METADATA_KEY_VIDEO_WIDTH = android.media.MediaMetadataRetriever.METADATA_KEY_VIDEO_WIDTH;
    public static final int METADATA_KEY_WRITER = android.media.MediaMetadataRetriever.METADATA_KEY_WRITER;
    public static final int METADATA_KEY_XMP_LENGTH = android.media.MediaMetadataRetriever.METADATA_KEY_XMP_LENGTH;
    public static final int METADATA_KEY_XMP_OFFSET = android.media.MediaMetadataRetriever.METADATA_KEY_XMP_OFFSET;
    public static final int METADATA_KEY_YEAR = android.media.MediaMetadataRetriever.METADATA_KEY_YEAR;
    public static final int OPTION_CLOSEST = android.media.MediaMetadataRetriever.OPTION_CLOSEST;
    public static final int OPTION_CLOSEST_SYNC = android.media.MediaMetadataRetriever.OPTION_CLOSEST_SYNC;
    public static final int OPTION_NEXT_SYNC = android.media.MediaMetadataRetriever.OPTION_NEXT_SYNC;
    public static final int OPTION_PREVIOUS_SYNC = android.media.MediaMetadataRetriever.OPTION_PREVIOUS_SYNC;

    public static final class BitmapParams {
        private final android.media.MediaMetadataRetriever.BitmapParams real;

        public BitmapParams(android.media.MediaMetadataRetriever.BitmapParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaMetadataRetriever.BitmapParams wrap(android.media.MediaMetadataRetriever.BitmapParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMetadataRetriever.BitmapParams(real);
        }

        public android.media.MediaMetadataRetriever.BitmapParams unwrap() {
            return real;
        }

        public BitmapParams() {
            this(new android.media.MediaMetadataRetriever.BitmapParams());
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap.Config getActualConfig() {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(real.getActualConfig());
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap.Config getPreferredConfig() {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(real.getPreferredConfig());
        }

        public void setPreferredConfig(com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg0) {
            real.setPreferredConfig(arg0 == null ? null : arg0.unwrap());
        }

    }
}
