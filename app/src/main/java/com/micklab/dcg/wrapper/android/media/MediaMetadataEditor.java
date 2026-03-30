// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaMetadataEditor {
    private final android.media.MediaMetadataEditor real;

    public MediaMetadataEditor(android.media.MediaMetadataEditor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaMetadataEditor wrap(android.media.MediaMetadataEditor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMetadataEditor(real);
    }

    public android.media.MediaMetadataEditor unwrap() {
        return real;
    }

    public void addEditableKey(int arg0) {
        real.addEditableKey(arg0);
    }

    public void apply() {
        real.apply();
    }

    public void clear() {
        real.clear();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap(int arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getBitmap(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int[] getEditableKeys() {
        return real.getEditableKeys();
    }

    public long getLong(int arg0, long arg1) throws java.lang.IllegalArgumentException {
        return real.getLong(arg0, arg1);
    }

    public java.lang.Object getObject(int arg0, java.lang.Object arg1) throws java.lang.IllegalArgumentException {
        return real.getObject(arg0, arg1);
    }

    public java.lang.String getString(int arg0, java.lang.String arg1) throws java.lang.IllegalArgumentException {
        return real.getString(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadataEditor putBitmap(int arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaMetadataEditor.wrap(real.putBitmap(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadataEditor putLong(int arg0, long arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaMetadataEditor.wrap(real.putLong(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadataEditor putObject(int arg0, java.lang.Object arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaMetadataEditor.wrap(real.putObject(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadataEditor putString(int arg0, java.lang.String arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaMetadataEditor.wrap(real.putString(arg0, arg1));
    }

    public void removeEditableKeys() {
        real.removeEditableKeys();
    }

    public static final int BITMAP_KEY_ARTWORK = android.media.MediaMetadataEditor.BITMAP_KEY_ARTWORK;
    public static final int RATING_KEY_BY_OTHERS = android.media.MediaMetadataEditor.RATING_KEY_BY_OTHERS;
    public static final int RATING_KEY_BY_USER = android.media.MediaMetadataEditor.RATING_KEY_BY_USER;

}
