// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCodec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaCodec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodec wrap(android.media.MediaCodec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaCodec getReal() {
        return (android.media.MediaCodec) real;
    }

    public android.media.MediaCodec unwrap() {
        return getReal();
    }

    public void configure(com.micklab.dcg.wrapper.android.media.MediaFormat arg0, com.micklab.dcg.wrapper.android.view.Surface arg1, int arg2, com.micklab.dcg.wrapper.android.media.MediaDescrambler arg3) {
        ((android.media.MediaCodec) real).configure(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void configure(com.micklab.dcg.wrapper.android.media.MediaFormat arg0, com.micklab.dcg.wrapper.android.view.Surface arg1, com.micklab.dcg.wrapper.android.media.MediaCrypto arg2, int arg3) {
        ((android.media.MediaCodec) real).configure(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodec createByCodecName(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.media.MediaCodec.wrap(android.media.MediaCodec.createByCodecName(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodec createDecoderByType(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.media.MediaCodec.wrap(android.media.MediaCodec.createDecoderByType(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodec createEncoderByType(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.media.MediaCodec.wrap(android.media.MediaCodec.createEncoderByType(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.Surface createInputSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.media.MediaCodec) real).createInputSurface());
    }

    public static com.micklab.dcg.wrapper.android.view.Surface createPersistentInputSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(android.media.MediaCodec.createPersistentInputSurface());
    }

    public int dequeueInputBuffer(long arg0) {
        return ((android.media.MediaCodec) real).dequeueInputBuffer(arg0);
    }

    public int dequeueOutputBuffer(com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo arg0, long arg1) {
        return ((android.media.MediaCodec) real).dequeueOutputBuffer(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void detachOutputSurface() {
        ((android.media.MediaCodec) real).detachOutputSurface();
    }

    public void flush() {
        ((android.media.MediaCodec) real).flush();
    }

    public java.lang.String getCanonicalName() {
        return ((android.media.MediaCodec) real).getCanonicalName();
    }

    public com.micklab.dcg.wrapper.android.media.MediaCodecInfo getCodecInfo() {
        return com.micklab.dcg.wrapper.android.media.MediaCodecInfo.wrap(((android.media.MediaCodec) real).getCodecInfo());
    }

    public java.nio.ByteBuffer getInputBuffer(int arg0) {
        return ((android.media.MediaCodec) real).getInputBuffer(arg0);
    }

    public java.nio.ByteBuffer[] getInputBuffers() {
        return ((android.media.MediaCodec) real).getInputBuffers();
    }

    public com.micklab.dcg.wrapper.android.media.MediaFormat getInputFormat() {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(((android.media.MediaCodec) real).getInputFormat());
    }

    public com.micklab.dcg.wrapper.android.media.Image getInputImage(int arg0) {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(((android.media.MediaCodec) real).getInputImage(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.media.MediaCodec) real).getMetrics());
    }

    public java.lang.String getName() {
        return ((android.media.MediaCodec) real).getName();
    }

    public java.nio.ByteBuffer getOutputBuffer(int arg0) {
        return ((android.media.MediaCodec) real).getOutputBuffer(arg0);
    }

    public java.nio.ByteBuffer[] getOutputBuffers() {
        return ((android.media.MediaCodec) real).getOutputBuffers();
    }

    public com.micklab.dcg.wrapper.android.media.MediaFormat getOutputFormat() {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(((android.media.MediaCodec) real).getOutputFormat());
    }

    public com.micklab.dcg.wrapper.android.media.MediaFormat getOutputFormat(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(((android.media.MediaCodec) real).getOutputFormat(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.MediaCodec.OutputFrame getOutputFrame(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaCodec.OutputFrame.wrap(((android.media.MediaCodec) real).getOutputFrame(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.Image getOutputImage(int arg0) {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(((android.media.MediaCodec) real).getOutputImage(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.MediaCodec.ParameterDescriptor getParameterDescriptor(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaCodec.ParameterDescriptor.wrap(((android.media.MediaCodec) real).getParameterDescriptor(arg0));
    }

    public android.media.MediaCodec.QueueRequest getQueueRequest(int arg0) {
        return ((android.media.MediaCodec) real).getQueueRequest(arg0);
    }

    public static com.micklab.dcg.wrapper.android.media.Image mapHardwareBuffer(com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg0) {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(android.media.MediaCodec.mapHardwareBuffer(arg0 == null ? null : arg0.getReal()));
    }

    public void queueInputBuffer(int arg0, int arg1, int arg2, long arg3, int arg4) throws android.media.MediaCodec.CryptoException {
        ((android.media.MediaCodec) real).queueInputBuffer(arg0, arg1, arg2, arg3, arg4);
    }

    public void queueSecureInputBuffer(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo arg2, long arg3, int arg4) throws android.media.MediaCodec.CryptoException {
        ((android.media.MediaCodec) real).queueSecureInputBuffer(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4);
    }

    public void release() {
        ((android.media.MediaCodec) real).release();
    }

    public void releaseOutputBuffer(int arg0, long arg1) {
        ((android.media.MediaCodec) real).releaseOutputBuffer(arg0, arg1);
    }

    public void releaseOutputBuffer(int arg0, boolean arg1) {
        ((android.media.MediaCodec) real).releaseOutputBuffer(arg0, arg1);
    }

    public void reset() {
        ((android.media.MediaCodec) real).reset();
    }

    public void setAudioPresentation(com.micklab.dcg.wrapper.android.media.AudioPresentation arg0) {
        ((android.media.MediaCodec) real).setAudioPresentation(arg0 == null ? null : arg0.getReal());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.MediaCodec.Callback arg0) {
        ((android.media.MediaCodec) real).setCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.MediaCodec.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaCodec) real).setCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setInputSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.media.MediaCodec) real).setInputSurface(arg0 == null ? null : arg0.getReal());
    }

    public void setOnFirstTunnelFrameReadyListener(com.micklab.dcg.wrapper.android.os.Handler arg0, com.micklab.dcg.wrapper.android.media.MediaCodec.OnFirstTunnelFrameReadyListener arg1) {
        ((android.media.MediaCodec) real).setOnFirstTunnelFrameReadyListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnFrameRenderedListener(com.micklab.dcg.wrapper.android.media.MediaCodec.OnFrameRenderedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaCodec) real).setOnFrameRenderedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOutputSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.media.MediaCodec) real).setOutputSurface(arg0 == null ? null : arg0.getReal());
    }

    public void setParameters(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.media.MediaCodec) real).setParameters(arg0 == null ? null : arg0.getReal());
    }

    public void setVideoScalingMode(int arg0) {
        ((android.media.MediaCodec) real).setVideoScalingMode(arg0);
    }

    public void signalEndOfInputStream() {
        ((android.media.MediaCodec) real).signalEndOfInputStream();
    }

    public void start() {
        ((android.media.MediaCodec) real).start();
    }

    public void stop() {
        ((android.media.MediaCodec) real).stop();
    }

    public static final int BUFFER_FLAG_CODEC_CONFIG = android.media.MediaCodec.BUFFER_FLAG_CODEC_CONFIG;
    public static final int BUFFER_FLAG_DECODE_ONLY = android.media.MediaCodec.BUFFER_FLAG_DECODE_ONLY;
    public static final int BUFFER_FLAG_END_OF_STREAM = android.media.MediaCodec.BUFFER_FLAG_END_OF_STREAM;
    public static final int BUFFER_FLAG_KEY_FRAME = android.media.MediaCodec.BUFFER_FLAG_KEY_FRAME;
    public static final int BUFFER_FLAG_PARTIAL_FRAME = android.media.MediaCodec.BUFFER_FLAG_PARTIAL_FRAME;
    public static final int BUFFER_FLAG_SYNC_FRAME = android.media.MediaCodec.BUFFER_FLAG_SYNC_FRAME;
    public static final int CONFIGURE_FLAG_DETACHED_SURFACE = android.media.MediaCodec.CONFIGURE_FLAG_DETACHED_SURFACE;
    public static final int CONFIGURE_FLAG_ENCODE = android.media.MediaCodec.CONFIGURE_FLAG_ENCODE;
    public static final int CONFIGURE_FLAG_USE_BLOCK_MODEL = android.media.MediaCodec.CONFIGURE_FLAG_USE_BLOCK_MODEL;
    public static final int CONFIGURE_FLAG_USE_CRYPTO_ASYNC = android.media.MediaCodec.CONFIGURE_FLAG_USE_CRYPTO_ASYNC;
    public static final int CRYPTO_MODE_AES_CBC = android.media.MediaCodec.CRYPTO_MODE_AES_CBC;
    public static final int CRYPTO_MODE_AES_CTR = android.media.MediaCodec.CRYPTO_MODE_AES_CTR;
    public static final int CRYPTO_MODE_UNENCRYPTED = android.media.MediaCodec.CRYPTO_MODE_UNENCRYPTED;
    public static final int INFO_OUTPUT_BUFFERS_CHANGED = android.media.MediaCodec.INFO_OUTPUT_BUFFERS_CHANGED;
    public static final int INFO_OUTPUT_FORMAT_CHANGED = android.media.MediaCodec.INFO_OUTPUT_FORMAT_CHANGED;
    public static final int INFO_TRY_AGAIN_LATER = android.media.MediaCodec.INFO_TRY_AGAIN_LATER;
    public static final java.lang.String PARAMETER_KEY_HDR10_PLUS_INFO = android.media.MediaCodec.PARAMETER_KEY_HDR10_PLUS_INFO;
    public static final java.lang.String PARAMETER_KEY_LOW_LATENCY = android.media.MediaCodec.PARAMETER_KEY_LOW_LATENCY;
    public static final java.lang.String PARAMETER_KEY_OFFSET_TIME = android.media.MediaCodec.PARAMETER_KEY_OFFSET_TIME;
    public static final java.lang.String PARAMETER_KEY_QP_OFFSET_MAP = android.media.MediaCodec.PARAMETER_KEY_QP_OFFSET_MAP;
    public static final java.lang.String PARAMETER_KEY_QP_OFFSET_RECTS = android.media.MediaCodec.PARAMETER_KEY_QP_OFFSET_RECTS;
    public static final java.lang.String PARAMETER_KEY_REQUEST_SYNC_FRAME = android.media.MediaCodec.PARAMETER_KEY_REQUEST_SYNC_FRAME;
    public static final java.lang.String PARAMETER_KEY_SUSPEND = android.media.MediaCodec.PARAMETER_KEY_SUSPEND;
    public static final java.lang.String PARAMETER_KEY_SUSPEND_TIME = android.media.MediaCodec.PARAMETER_KEY_SUSPEND_TIME;
    public static final java.lang.String PARAMETER_KEY_TUNNEL_PEEK = android.media.MediaCodec.PARAMETER_KEY_TUNNEL_PEEK;
    public static final java.lang.String PARAMETER_KEY_VIDEO_BITRATE = android.media.MediaCodec.PARAMETER_KEY_VIDEO_BITRATE;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = android.media.MediaCodec.VIDEO_SCALING_MODE_SCALE_TO_FIT;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = android.media.MediaCodec.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING;

    public static final class BufferInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BufferInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo wrap(android.media.MediaCodec.BufferInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.BufferInfo getReal() {
            return (android.media.MediaCodec.BufferInfo) real;
        }

        public android.media.MediaCodec.BufferInfo unwrap() {
            return getReal();
        }

        public BufferInfo() {
            this(new android.media.MediaCodec.BufferInfo(), (__DcgwBridgeToken) null);
        }

        public void set(int arg0, int arg1, long arg2, int arg3) {
            ((android.media.MediaCodec.BufferInfo) real).set(arg0, arg1, arg2, arg3);
        }


    }
    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.Callback wrap(android.media.MediaCodec.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.Callback getReal() {
            return (android.media.MediaCodec.Callback) real;
        }

        public android.media.MediaCodec.Callback unwrap() {
            return getReal();
        }

        public void onCryptoError(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoException arg1) {
            ((android.media.MediaCodec.Callback) real).onCryptoError(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onError(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, com.micklab.dcg.wrapper.android.media.MediaCodec.CodecException arg1) {
            ((android.media.MediaCodec.Callback) real).onError(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onInputBufferAvailable(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, int arg1) {
            ((android.media.MediaCodec.Callback) real).onInputBufferAvailable(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onMetricsFlushed(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
            ((android.media.MediaCodec.Callback) real).onMetricsFlushed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onOutputBufferAvailable(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo arg2) {
            ((android.media.MediaCodec.Callback) real).onOutputBufferAvailable(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onOutputFormatChanged(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, com.micklab.dcg.wrapper.android.media.MediaFormat arg1) {
            ((android.media.MediaCodec.Callback) real).onOutputFormatChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class CodecException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CodecException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.CodecException wrap(android.media.MediaCodec.CodecException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.CodecException(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.CodecException getReal() {
            return (android.media.MediaCodec.CodecException) real;
        }

        public android.media.MediaCodec.CodecException unwrap() {
            return getReal();
        }

        public java.lang.String getDiagnosticInfo() {
            return ((android.media.MediaCodec.CodecException) real).getDiagnosticInfo();
        }

        public int getErrorCode() {
            return ((android.media.MediaCodec.CodecException) real).getErrorCode();
        }

        public boolean isRecoverable() {
            return ((android.media.MediaCodec.CodecException) real).isRecoverable();
        }

        public boolean isTransient() {
            return ((android.media.MediaCodec.CodecException) real).isTransient();
        }

        public static final int ERROR_INSUFFICIENT_RESOURCE = android.media.MediaCodec.CodecException.ERROR_INSUFFICIENT_RESOURCE;
        public static final int ERROR_RECLAIMED = android.media.MediaCodec.CodecException.ERROR_RECLAIMED;

    }
    public static final class CryptoException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CryptoException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoException wrap(android.media.MediaCodec.CryptoException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoException(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.CryptoException getReal() {
            return (android.media.MediaCodec.CryptoException) real;
        }

        public android.media.MediaCodec.CryptoException unwrap() {
            return getReal();
        }

        public CryptoException(int arg0, java.lang.String arg1) {
            this(new android.media.MediaCodec.CryptoException(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo getCryptoInfo() {
            return com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.wrap(((android.media.MediaCodec.CryptoException) real).getCryptoInfo());
        }

        public int getErrorCode() {
            return ((android.media.MediaCodec.CryptoException) real).getErrorCode();
        }

        public int getErrorContext() {
            return ((android.media.MediaCodec.CryptoException) real).getErrorContext();
        }

        public int getOemError() {
            return ((android.media.MediaCodec.CryptoException) real).getOemError();
        }

        public int getVendorError() {
            return ((android.media.MediaCodec.CryptoException) real).getVendorError();
        }

        public static final int ERROR_FRAME_TOO_LARGE = android.media.MediaCodec.CryptoException.ERROR_FRAME_TOO_LARGE;
        public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = android.media.MediaCodec.CryptoException.ERROR_INSUFFICIENT_OUTPUT_PROTECTION;
        public static final int ERROR_INSUFFICIENT_SECURITY = android.media.MediaCodec.CryptoException.ERROR_INSUFFICIENT_SECURITY;
        public static final int ERROR_KEY_EXPIRED = android.media.MediaCodec.CryptoException.ERROR_KEY_EXPIRED;
        public static final int ERROR_LOST_STATE = android.media.MediaCodec.CryptoException.ERROR_LOST_STATE;
        public static final int ERROR_NO_KEY = android.media.MediaCodec.CryptoException.ERROR_NO_KEY;
        public static final int ERROR_RESOURCE_BUSY = android.media.MediaCodec.CryptoException.ERROR_RESOURCE_BUSY;
        public static final int ERROR_SESSION_NOT_OPENED = android.media.MediaCodec.CryptoException.ERROR_SESSION_NOT_OPENED;
        public static final int ERROR_UNSUPPORTED_OPERATION = android.media.MediaCodec.CryptoException.ERROR_UNSUPPORTED_OPERATION;

    }
    public static final class CryptoInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CryptoInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo wrap(android.media.MediaCodec.CryptoInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.CryptoInfo getReal() {
            return (android.media.MediaCodec.CryptoInfo) real;
        }

        public android.media.MediaCodec.CryptoInfo unwrap() {
            return getReal();
        }

        public CryptoInfo() {
            this(new android.media.MediaCodec.CryptoInfo(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern getPattern() {
            return com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern.wrap(((android.media.MediaCodec.CryptoInfo) real).getPattern());
        }

        public void set(int arg0, int[] arg1, int[] arg2, byte[] arg3, byte[] arg4, int arg5) {
            ((android.media.MediaCodec.CryptoInfo) real).set(arg0, arg1, arg2, arg3, arg4, arg5);
        }

        public void setPattern(com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern arg0) {
            ((android.media.MediaCodec.CryptoInfo) real).setPattern(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.String toString() {
            return ((android.media.MediaCodec.CryptoInfo) real).toString();
        }


        public static final class Pattern {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Pattern(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern wrap(android.media.MediaCodec.CryptoInfo.Pattern real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern(real, (__DcgwBridgeToken) null);
            }

            public android.media.MediaCodec.CryptoInfo.Pattern getReal() {
                return (android.media.MediaCodec.CryptoInfo.Pattern) real;
            }

            public android.media.MediaCodec.CryptoInfo.Pattern unwrap() {
                return getReal();
            }

            public Pattern(int arg0, int arg1) {
                this(new android.media.MediaCodec.CryptoInfo.Pattern(arg0, arg1), (__DcgwBridgeToken) null);
            }

            public int getEncryptBlocks() {
                return ((android.media.MediaCodec.CryptoInfo.Pattern) real).getEncryptBlocks();
            }

            public int getSkipBlocks() {
                return ((android.media.MediaCodec.CryptoInfo.Pattern) real).getSkipBlocks();
            }

            public void set(int arg0, int arg1) {
                ((android.media.MediaCodec.CryptoInfo.Pattern) real).set(arg0, arg1);
            }

        }
    }
    public static final class LinearBlock {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LinearBlock(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock wrap(android.media.MediaCodec.LinearBlock real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.LinearBlock getReal() {
            return (android.media.MediaCodec.LinearBlock) real;
        }

        public android.media.MediaCodec.LinearBlock unwrap() {
            return getReal();
        }

        public static boolean isCodecCopyFreeCompatible(java.lang.String[] arg0) {
            return android.media.MediaCodec.LinearBlock.isCodecCopyFreeCompatible(arg0);
        }

        public boolean isMappable() {
            return ((android.media.MediaCodec.LinearBlock) real).isMappable();
        }

        public java.nio.ByteBuffer map() {
            return ((android.media.MediaCodec.LinearBlock) real).map();
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock obtain(int arg0, java.lang.String[] arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock.wrap(android.media.MediaCodec.LinearBlock.obtain(arg0, arg1));
        }

        public void recycle() {
            ((android.media.MediaCodec.LinearBlock) real).recycle();
        }

    }
    public static final class MetricsConstants {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MetricsConstants(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.MetricsConstants wrap(android.media.MediaCodec.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.MetricsConstants(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.MetricsConstants getReal() {
            return (android.media.MediaCodec.MetricsConstants) real;
        }

        public android.media.MediaCodec.MetricsConstants unwrap() {
            return getReal();
        }

        public static final java.lang.String CODEC = android.media.MediaCodec.MetricsConstants.CODEC;
        public static final java.lang.String ENCODER = android.media.MediaCodec.MetricsConstants.ENCODER;
        public static final java.lang.String HEIGHT = android.media.MediaCodec.MetricsConstants.HEIGHT;
        public static final java.lang.String MIME_TYPE = android.media.MediaCodec.MetricsConstants.MIME_TYPE;
        public static final java.lang.String MODE = android.media.MediaCodec.MetricsConstants.MODE;
        public static final java.lang.String MODE_AUDIO = android.media.MediaCodec.MetricsConstants.MODE_AUDIO;
        public static final java.lang.String MODE_VIDEO = android.media.MediaCodec.MetricsConstants.MODE_VIDEO;
        public static final java.lang.String ROTATION = android.media.MediaCodec.MetricsConstants.ROTATION;
        public static final java.lang.String SECURE = android.media.MediaCodec.MetricsConstants.SECURE;
        public static final java.lang.String WIDTH = android.media.MediaCodec.MetricsConstants.WIDTH;

    }
    public static final class OnFirstTunnelFrameReadyListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnFirstTunnelFrameReadyListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.OnFirstTunnelFrameReadyListener wrap(android.media.MediaCodec.OnFirstTunnelFrameReadyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.OnFirstTunnelFrameReadyListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.OnFirstTunnelFrameReadyListener getReal() {
            return (android.media.MediaCodec.OnFirstTunnelFrameReadyListener) real;
        }

        public android.media.MediaCodec.OnFirstTunnelFrameReadyListener unwrap() {
            return getReal();
        }

        public void onFirstTunnelFrameReady(com.micklab.dcg.wrapper.android.media.MediaCodec arg0) {
            ((android.media.MediaCodec.OnFirstTunnelFrameReadyListener) real).onFirstTunnelFrameReady(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnFrameRenderedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnFrameRenderedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.OnFrameRenderedListener wrap(android.media.MediaCodec.OnFrameRenderedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.OnFrameRenderedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.OnFrameRenderedListener getReal() {
            return (android.media.MediaCodec.OnFrameRenderedListener) real;
        }

        public android.media.MediaCodec.OnFrameRenderedListener unwrap() {
            return getReal();
        }

        public void onFrameRendered(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, long arg1, long arg2) {
            ((android.media.MediaCodec.OnFrameRenderedListener) real).onFrameRendered(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
    public static final class OutputFrame {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OutputFrame(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.OutputFrame wrap(android.media.MediaCodec.OutputFrame real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.OutputFrame(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.OutputFrame getReal() {
            return (android.media.MediaCodec.OutputFrame) real;
        }

        public android.media.MediaCodec.OutputFrame unwrap() {
            return getReal();
        }

        public int getFlags() {
            return ((android.media.MediaCodec.OutputFrame) real).getFlags();
        }

        public com.micklab.dcg.wrapper.android.media.MediaFormat getFormat() {
            return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(((android.media.MediaCodec.OutputFrame) real).getFormat());
        }

        public com.micklab.dcg.wrapper.android.hardware.HardwareBuffer getHardwareBuffer() {
            return com.micklab.dcg.wrapper.android.hardware.HardwareBuffer.wrap(((android.media.MediaCodec.OutputFrame) real).getHardwareBuffer());
        }

        public com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock getLinearBlock() {
            return com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock.wrap(((android.media.MediaCodec.OutputFrame) real).getLinearBlock());
        }

        public long getPresentationTimeUs() {
            return ((android.media.MediaCodec.OutputFrame) real).getPresentationTimeUs();
        }

    }
    public static final class ParameterDescriptor {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ParameterDescriptor(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.ParameterDescriptor wrap(android.media.MediaCodec.ParameterDescriptor real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.ParameterDescriptor(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaCodec.ParameterDescriptor getReal() {
            return (android.media.MediaCodec.ParameterDescriptor) real;
        }

        public android.media.MediaCodec.ParameterDescriptor unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.MediaCodec.ParameterDescriptor) real).equals(arg0);
        }

        public java.lang.String getName() {
            return ((android.media.MediaCodec.ParameterDescriptor) real).getName();
        }

        public int getType() {
            return ((android.media.MediaCodec.ParameterDescriptor) real).getType();
        }

        public int hashCode() {
            return ((android.media.MediaCodec.ParameterDescriptor) real).hashCode();
        }

    }
}
