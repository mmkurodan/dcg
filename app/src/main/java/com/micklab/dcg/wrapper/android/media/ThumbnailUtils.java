// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ThumbnailUtils {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ThumbnailUtils(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ThumbnailUtils wrap(android.media.ThumbnailUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ThumbnailUtils(real, (__DcgwBridgeToken) null);
    }

    public android.media.ThumbnailUtils getReal() {
        return (android.media.ThumbnailUtils) real;
    }

    public android.media.ThumbnailUtils unwrap() {
        return getReal();
    }

    public ThumbnailUtils() {
        this(new android.media.ThumbnailUtils(), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createAudioThumbnail(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.media.ThumbnailUtils.createAudioThumbnail(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createAudioThumbnail(java.io.File arg0, com.micklab.dcg.wrapper.android.util.Size arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.media.ThumbnailUtils.createAudioThumbnail(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createImageThumbnail(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.media.ThumbnailUtils.createImageThumbnail(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createImageThumbnail(java.io.File arg0, com.micklab.dcg.wrapper.android.util.Size arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.media.ThumbnailUtils.createImageThumbnail(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createVideoThumbnail(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.media.ThumbnailUtils.createVideoThumbnail(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createVideoThumbnail(java.io.File arg0, com.micklab.dcg.wrapper.android.util.Size arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.media.ThumbnailUtils.createVideoThumbnail(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap extractThumbnail(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.media.ThumbnailUtils.extractThumbnail(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap extractThumbnail(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.media.ThumbnailUtils.extractThumbnail(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
    }

    public static final int OPTIONS_RECYCLE_INPUT = android.media.ThumbnailUtils.OPTIONS_RECYCLE_INPUT;

}
