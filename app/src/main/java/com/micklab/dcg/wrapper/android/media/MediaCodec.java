// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCodec {
    private final android.media.MediaCodec real;

    public MediaCodec(android.media.MediaCodec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodec wrap(android.media.MediaCodec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec(real);
    }

    public android.media.MediaCodec unwrap() {
        return real;
    }

    public void configure(com.micklab.dcg.wrapper.android.media.MediaFormat arg0, com.micklab.dcg.wrapper.android.view.Surface arg1, int arg2, com.micklab.dcg.wrapper.android.media.MediaDescrambler arg3) {
        real.configure(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void configure(com.micklab.dcg.wrapper.android.media.MediaFormat arg0, com.micklab.dcg.wrapper.android.view.Surface arg1, com.micklab.dcg.wrapper.android.media.MediaCrypto arg2, int arg3) {
        real.configure(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
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
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.createInputSurface());
    }

    public static com.micklab.dcg.wrapper.android.view.Surface createPersistentInputSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(android.media.MediaCodec.createPersistentInputSurface());
    }

    public int dequeueInputBuffer(long arg0) {
        return real.dequeueInputBuffer(arg0);
    }

    public int dequeueOutputBuffer(com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo arg0, long arg1) {
        return real.dequeueOutputBuffer(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void detachOutputSurface() {
        real.detachOutputSurface();
    }

    public void flush() {
        real.flush();
    }

    public java.lang.String getCanonicalName() {
        return real.getCanonicalName();
    }

    public com.micklab.dcg.wrapper.android.media.MediaCodecInfo getCodecInfo() {
        return com.micklab.dcg.wrapper.android.media.MediaCodecInfo.wrap(real.getCodecInfo());
    }

    public java.nio.ByteBuffer getInputBuffer(int arg0) {
        return real.getInputBuffer(arg0);
    }

    public java.nio.ByteBuffer[] getInputBuffers() {
        return real.getInputBuffers();
    }

    public com.micklab.dcg.wrapper.android.media.MediaFormat getInputFormat() {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(real.getInputFormat());
    }

    public com.micklab.dcg.wrapper.android.media.Image getInputImage(int arg0) {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(real.getInputImage(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getMetrics());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public java.nio.ByteBuffer getOutputBuffer(int arg0) {
        return real.getOutputBuffer(arg0);
    }

    public java.nio.ByteBuffer[] getOutputBuffers() {
        return real.getOutputBuffers();
    }

    public com.micklab.dcg.wrapper.android.media.MediaFormat getOutputFormat() {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(real.getOutputFormat());
    }

    public com.micklab.dcg.wrapper.android.media.MediaFormat getOutputFormat(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(real.getOutputFormat(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.MediaCodec.OutputFrame getOutputFrame(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaCodec.OutputFrame.wrap(real.getOutputFrame(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.Image getOutputImage(int arg0) {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(real.getOutputImage(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.MediaCodec.ParameterDescriptor getParameterDescriptor(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaCodec.ParameterDescriptor.wrap(real.getParameterDescriptor(arg0));
    }

    public android.media.MediaCodec.QueueRequest getQueueRequest(int arg0) {
        return real.getQueueRequest(arg0);
    }

    public static com.micklab.dcg.wrapper.android.media.Image mapHardwareBuffer(com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg0) {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(android.media.MediaCodec.mapHardwareBuffer(arg0 == null ? null : arg0.unwrap()));
    }

    public void queueInputBuffer(int arg0, int arg1, int arg2, long arg3, int arg4) throws android.media.MediaCodec.CryptoException {
        real.queueInputBuffer(arg0, arg1, arg2, arg3, arg4);
    }

    public void queueSecureInputBuffer(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo arg2, long arg3, int arg4) throws android.media.MediaCodec.CryptoException {
        real.queueSecureInputBuffer(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4);
    }

    public void release() {
        real.release();
    }

    public void releaseOutputBuffer(int arg0, boolean arg1) {
        real.releaseOutputBuffer(arg0, arg1);
    }

    public void releaseOutputBuffer(int arg0, long arg1) {
        real.releaseOutputBuffer(arg0, arg1);
    }

    public void reset() {
        real.reset();
    }

    public void setAudioPresentation(com.micklab.dcg.wrapper.android.media.AudioPresentation arg0) {
        real.setAudioPresentation(arg0 == null ? null : arg0.unwrap());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.MediaCodec.Callback arg0) {
        real.setCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.MediaCodec.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setInputSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.setInputSurface(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnFirstTunnelFrameReadyListener(com.micklab.dcg.wrapper.android.os.Handler arg0, com.micklab.dcg.wrapper.android.media.MediaCodec.OnFirstTunnelFrameReadyListener arg1) {
        real.setOnFirstTunnelFrameReadyListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setOnFrameRenderedListener(com.micklab.dcg.wrapper.android.media.MediaCodec.OnFrameRenderedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setOnFrameRenderedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setOutputSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.setOutputSurface(arg0 == null ? null : arg0.unwrap());
    }

    public void setParameters(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.setParameters(arg0 == null ? null : arg0.unwrap());
    }

    public void setVideoScalingMode(int arg0) {
        real.setVideoScalingMode(arg0);
    }

    public void signalEndOfInputStream() {
        real.signalEndOfInputStream();
    }

    public void start() {
        real.start();
    }

    public void stop() {
        real.stop();
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
        private final android.media.MediaCodec.BufferInfo real;

        public BufferInfo(android.media.MediaCodec.BufferInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo wrap(android.media.MediaCodec.BufferInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo(real);
        }

        public android.media.MediaCodec.BufferInfo unwrap() {
            return real;
        }

        public BufferInfo() {
            this(new android.media.MediaCodec.BufferInfo());
        }

        public void set(int arg0, int arg1, long arg2, int arg3) {
            real.set(arg0, arg1, arg2, arg3);
        }


    }
    public static final class Callback {
        private final android.media.MediaCodec.Callback real;

        public Callback(android.media.MediaCodec.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.Callback wrap(android.media.MediaCodec.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.Callback(real);
        }

        public android.media.MediaCodec.Callback unwrap() {
            return real;
        }

        public void onCryptoError(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoException arg1) {
            real.onCryptoError(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onError(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, com.micklab.dcg.wrapper.android.media.MediaCodec.CodecException arg1) {
            real.onError(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onInputBufferAvailable(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, int arg1) {
            real.onInputBufferAvailable(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onOutputBufferAvailable(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo arg2) {
            real.onOutputBufferAvailable(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onOutputFormatChanged(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, com.micklab.dcg.wrapper.android.media.MediaFormat arg1) {
            real.onOutputFormatChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class CodecException {
        private final android.media.MediaCodec.CodecException real;

        public CodecException(android.media.MediaCodec.CodecException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.CodecException wrap(android.media.MediaCodec.CodecException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.CodecException(real);
        }

        public android.media.MediaCodec.CodecException unwrap() {
            return real;
        }

        public java.lang.String getDiagnosticInfo() {
            return real.getDiagnosticInfo();
        }

        public int getErrorCode() {
            return real.getErrorCode();
        }

        public boolean isRecoverable() {
            return real.isRecoverable();
        }

        public boolean isTransient() {
            return real.isTransient();
        }

        public static final int ERROR_INSUFFICIENT_RESOURCE = android.media.MediaCodec.CodecException.ERROR_INSUFFICIENT_RESOURCE;
        public static final int ERROR_RECLAIMED = android.media.MediaCodec.CodecException.ERROR_RECLAIMED;

    }
    public static final class CryptoException {
        private final android.media.MediaCodec.CryptoException real;

        public CryptoException(android.media.MediaCodec.CryptoException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoException wrap(android.media.MediaCodec.CryptoException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoException(real);
        }

        public android.media.MediaCodec.CryptoException unwrap() {
            return real;
        }

        public CryptoException(int arg0, java.lang.String arg1) {
            this(new android.media.MediaCodec.CryptoException(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo getCryptoInfo() {
            return com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.wrap(real.getCryptoInfo());
        }

        public int getErrorCode() {
            return real.getErrorCode();
        }

        public int getErrorContext() {
            return real.getErrorContext();
        }

        public int getOemError() {
            return real.getOemError();
        }

        public int getVendorError() {
            return real.getVendorError();
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
        private final android.media.MediaCodec.CryptoInfo real;

        public CryptoInfo(android.media.MediaCodec.CryptoInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo wrap(android.media.MediaCodec.CryptoInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo(real);
        }

        public android.media.MediaCodec.CryptoInfo unwrap() {
            return real;
        }

        public CryptoInfo() {
            this(new android.media.MediaCodec.CryptoInfo());
        }

        public com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern getPattern() {
            return com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern.wrap(real.getPattern());
        }

        public void set(int arg0, int[] arg1, int[] arg2, byte[] arg3, byte[] arg4, int arg5) {
            real.set(arg0, arg1, arg2, arg3, arg4, arg5);
        }

        public void setPattern(com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern arg0) {
            real.setPattern(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.String toString() {
            return real.toString();
        }


        public static final class Pattern {
            private final android.media.MediaCodec.CryptoInfo.Pattern real;

            public Pattern(android.media.MediaCodec.CryptoInfo.Pattern real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern wrap(android.media.MediaCodec.CryptoInfo.Pattern real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo.Pattern(real);
            }

            public android.media.MediaCodec.CryptoInfo.Pattern unwrap() {
                return real;
            }

            public Pattern(int arg0, int arg1) {
                this(new android.media.MediaCodec.CryptoInfo.Pattern(arg0, arg1));
            }

            public int getEncryptBlocks() {
                return real.getEncryptBlocks();
            }

            public int getSkipBlocks() {
                return real.getSkipBlocks();
            }

            public void set(int arg0, int arg1) {
                real.set(arg0, arg1);
            }

        }
    }
    public static final class LinearBlock {
        private final android.media.MediaCodec.LinearBlock real;

        public LinearBlock(android.media.MediaCodec.LinearBlock real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock wrap(android.media.MediaCodec.LinearBlock real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock(real);
        }

        public android.media.MediaCodec.LinearBlock unwrap() {
            return real;
        }

        public static boolean isCodecCopyFreeCompatible(java.lang.String[] arg0) {
            return android.media.MediaCodec.LinearBlock.isCodecCopyFreeCompatible(arg0);
        }

        public boolean isMappable() {
            return real.isMappable();
        }

        public java.nio.ByteBuffer map() {
            return real.map();
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock obtain(int arg0, java.lang.String[] arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock.wrap(android.media.MediaCodec.LinearBlock.obtain(arg0, arg1));
        }

        public void recycle() {
            real.recycle();
        }

    }
    public static final class MetricsConstants {
        private final android.media.MediaCodec.MetricsConstants real;

        public MetricsConstants(android.media.MediaCodec.MetricsConstants real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.MetricsConstants wrap(android.media.MediaCodec.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.MetricsConstants(real);
        }

        public android.media.MediaCodec.MetricsConstants unwrap() {
            return real;
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
        private final android.media.MediaCodec.OnFirstTunnelFrameReadyListener real;

        public OnFirstTunnelFrameReadyListener(android.media.MediaCodec.OnFirstTunnelFrameReadyListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.OnFirstTunnelFrameReadyListener wrap(android.media.MediaCodec.OnFirstTunnelFrameReadyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.OnFirstTunnelFrameReadyListener(real);
        }

        public android.media.MediaCodec.OnFirstTunnelFrameReadyListener unwrap() {
            return real;
        }

        public void onFirstTunnelFrameReady(com.micklab.dcg.wrapper.android.media.MediaCodec arg0) {
            real.onFirstTunnelFrameReady(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnFrameRenderedListener {
        private final android.media.MediaCodec.OnFrameRenderedListener real;

        public OnFrameRenderedListener(android.media.MediaCodec.OnFrameRenderedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.OnFrameRenderedListener wrap(android.media.MediaCodec.OnFrameRenderedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.OnFrameRenderedListener(real);
        }

        public android.media.MediaCodec.OnFrameRenderedListener unwrap() {
            return real;
        }

        public void onFrameRendered(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, long arg1, long arg2) {
            real.onFrameRendered(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
    public static final class OutputFrame {
        private final android.media.MediaCodec.OutputFrame real;

        public OutputFrame(android.media.MediaCodec.OutputFrame real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.OutputFrame wrap(android.media.MediaCodec.OutputFrame real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.OutputFrame(real);
        }

        public android.media.MediaCodec.OutputFrame unwrap() {
            return real;
        }

        public int getFlags() {
            return real.getFlags();
        }

        public com.micklab.dcg.wrapper.android.media.MediaFormat getFormat() {
            return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(real.getFormat());
        }

        public com.micklab.dcg.wrapper.android.hardware.HardwareBuffer getHardwareBuffer() {
            return com.micklab.dcg.wrapper.android.hardware.HardwareBuffer.wrap(real.getHardwareBuffer());
        }

        public com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock getLinearBlock() {
            return com.micklab.dcg.wrapper.android.media.MediaCodec.LinearBlock.wrap(real.getLinearBlock());
        }

        public long getPresentationTimeUs() {
            return real.getPresentationTimeUs();
        }

    }
    public static final class ParameterDescriptor {
        private final android.media.MediaCodec.ParameterDescriptor real;

        public ParameterDescriptor(android.media.MediaCodec.ParameterDescriptor real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodec.ParameterDescriptor wrap(android.media.MediaCodec.ParameterDescriptor real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodec.ParameterDescriptor(real);
        }

        public android.media.MediaCodec.ParameterDescriptor unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String getName() {
            return real.getName();
        }

        public int getType() {
            return real.getType();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
