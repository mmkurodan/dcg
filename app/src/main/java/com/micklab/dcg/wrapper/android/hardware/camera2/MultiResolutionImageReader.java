// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class MultiResolutionImageReader {
    private final android.hardware.camera2.MultiResolutionImageReader real;

    public MultiResolutionImageReader(android.hardware.camera2.MultiResolutionImageReader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.MultiResolutionImageReader wrap(android.hardware.camera2.MultiResolutionImageReader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.MultiResolutionImageReader(real);
    }

    public android.hardware.camera2.MultiResolutionImageReader unwrap() {
        return real;
    }

    public MultiResolutionImageReader(java.util.Collection arg0, int arg1, int arg2) {
        this(new android.hardware.camera2.MultiResolutionImageReader(arg0, arg1, arg2));
    }

    public void close() {
        real.close();
    }

    public void flush() {
        real.flush();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamInfo getStreamInfoForImageReader(com.micklab.dcg.wrapper.android.media.ImageReader arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamInfo.wrap(real.getStreamInfoForImageReader(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.getSurface());
    }

    public void setOnImageAvailableListener(com.micklab.dcg.wrapper.android.media.ImageReader.OnImageAvailableListener arg0, java.util.concurrent.Executor arg1) {
        real.setOnImageAvailableListener(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
