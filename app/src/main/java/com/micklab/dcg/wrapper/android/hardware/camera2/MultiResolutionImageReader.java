// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class MultiResolutionImageReader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MultiResolutionImageReader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.MultiResolutionImageReader wrap(android.hardware.camera2.MultiResolutionImageReader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.MultiResolutionImageReader(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.MultiResolutionImageReader getReal() {
        return (android.hardware.camera2.MultiResolutionImageReader) real;
    }

    public android.hardware.camera2.MultiResolutionImageReader unwrap() {
        return getReal();
    }

    public MultiResolutionImageReader(java.util.Collection arg0, int arg1, int arg2) {
        this(new android.hardware.camera2.MultiResolutionImageReader(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public MultiResolutionImageReader(java.util.Collection arg0, int arg1, int arg2, long arg3) {
        this(new android.hardware.camera2.MultiResolutionImageReader(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.hardware.camera2.MultiResolutionImageReader) real).close();
    }

    public void flush() {
        ((android.hardware.camera2.MultiResolutionImageReader) real).flush();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamInfo getStreamInfoForImageReader(com.micklab.dcg.wrapper.android.media.ImageReader arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamInfo.wrap(((android.hardware.camera2.MultiResolutionImageReader) real).getStreamInfoForImageReader(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.hardware.camera2.MultiResolutionImageReader) real).getSurface());
    }

    public void setOnImageAvailableListener(com.micklab.dcg.wrapper.android.media.ImageReader.OnImageAvailableListener arg0, java.util.concurrent.Executor arg1) {
        ((android.hardware.camera2.MultiResolutionImageReader) real).setOnImageAvailableListener(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
