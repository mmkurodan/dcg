// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class DynamicsProcessing {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DynamicsProcessing(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing wrap(android.media.audiofx.DynamicsProcessing real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.DynamicsProcessing getReal() {
        return (android.media.audiofx.DynamicsProcessing) real;
    }

    public android.media.audiofx.DynamicsProcessing unwrap() {
        return getReal();
    }

    public DynamicsProcessing(int arg0) {
        this(new android.media.audiofx.DynamicsProcessing(arg0), (__DcgwBridgeToken) null);
    }

    public DynamicsProcessing(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config arg2) {
        this(new android.media.audiofx.DynamicsProcessing(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel getChannelByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel.wrap(((android.media.audiofx.DynamicsProcessing) real).getChannelByChannelIndex(arg0));
    }

    public int getChannelCount() {
        return ((android.media.audiofx.DynamicsProcessing) real).getChannelCount();
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config getConfig() {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.wrap(((android.media.audiofx.DynamicsProcessing) real).getConfig());
    }

    public float getInputGainByChannelIndex(int arg0) {
        return ((android.media.audiofx.DynamicsProcessing) real).getInputGainByChannelIndex(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter getLimiterByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter.wrap(((android.media.audiofx.DynamicsProcessing) real).getLimiterByChannelIndex(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand getMbcBandByChannelIndex(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand.wrap(((android.media.audiofx.DynamicsProcessing) real).getMbcBandByChannelIndex(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc getMbcByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc.wrap(((android.media.audiofx.DynamicsProcessing) real).getMbcByChannelIndex(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPostEqBandByChannelIndex(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(((android.media.audiofx.DynamicsProcessing) real).getPostEqBandByChannelIndex(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPostEqByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(((android.media.audiofx.DynamicsProcessing) real).getPostEqByChannelIndex(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPreEqBandByChannelIndex(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(((android.media.audiofx.DynamicsProcessing) real).getPreEqBandByChannelIndex(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPreEqByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(((android.media.audiofx.DynamicsProcessing) real).getPreEqByChannelIndex(arg0));
    }

    public void setAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg0) {
        ((android.media.audiofx.DynamicsProcessing) real).setAllChannelsTo(arg0 == null ? null : arg0.getReal());
    }

    public void setChannelTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg1) {
        ((android.media.audiofx.DynamicsProcessing) real).setChannelTo(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setInputGainAllChannelsTo(float arg0) {
        ((android.media.audiofx.DynamicsProcessing) real).setInputGainAllChannelsTo(arg0);
    }

    public void setInputGainbyChannel(int arg0, float arg1) {
        ((android.media.audiofx.DynamicsProcessing) real).setInputGainbyChannel(arg0, arg1);
    }

    public void setLimiterAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
        ((android.media.audiofx.DynamicsProcessing) real).setLimiterAllChannelsTo(arg0 == null ? null : arg0.getReal());
    }

    public void setLimiterByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg1) {
        ((android.media.audiofx.DynamicsProcessing) real).setLimiterByChannelIndex(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setMbcAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
        ((android.media.audiofx.DynamicsProcessing) real).setMbcAllChannelsTo(arg0 == null ? null : arg0.getReal());
    }

    public void setMbcBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg1) {
        ((android.media.audiofx.DynamicsProcessing) real).setMbcBandAllChannelsTo(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setMbcBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg2) {
        ((android.media.audiofx.DynamicsProcessing) real).setMbcBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setMbcByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg1) {
        ((android.media.audiofx.DynamicsProcessing) real).setMbcByChannelIndex(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setPostEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
        ((android.media.audiofx.DynamicsProcessing) real).setPostEqAllChannelsTo(arg0 == null ? null : arg0.getReal());
    }

    public void setPostEqBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
        ((android.media.audiofx.DynamicsProcessing) real).setPostEqBandAllChannelsTo(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setPostEqBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg2) {
        ((android.media.audiofx.DynamicsProcessing) real).setPostEqBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setPostEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
        ((android.media.audiofx.DynamicsProcessing) real).setPostEqByChannelIndex(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setPreEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
        ((android.media.audiofx.DynamicsProcessing) real).setPreEqAllChannelsTo(arg0 == null ? null : arg0.getReal());
    }

    public void setPreEqBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
        ((android.media.audiofx.DynamicsProcessing) real).setPreEqBandAllChannelsTo(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setPreEqBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg2) {
        ((android.media.audiofx.DynamicsProcessing) real).setPreEqBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setPreEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
        ((android.media.audiofx.DynamicsProcessing) real).setPreEqByChannelIndex(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static final int VARIANT_FAVOR_FREQUENCY_RESOLUTION = android.media.audiofx.DynamicsProcessing.VARIANT_FAVOR_FREQUENCY_RESOLUTION;
    public static final int VARIANT_FAVOR_TIME_RESOLUTION = android.media.audiofx.DynamicsProcessing.VARIANT_FAVOR_TIME_RESOLUTION;

    public static final class BandBase {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BandBase(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.BandBase wrap(android.media.audiofx.DynamicsProcessing.BandBase real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.BandBase(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.BandBase getReal() {
            return (android.media.audiofx.DynamicsProcessing.BandBase) real;
        }

        public android.media.audiofx.DynamicsProcessing.BandBase unwrap() {
            return getReal();
        }

        public BandBase(boolean arg0, float arg1) {
            this(new android.media.audiofx.DynamicsProcessing.BandBase(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public float getCutoffFrequency() {
            return ((android.media.audiofx.DynamicsProcessing.BandBase) real).getCutoffFrequency();
        }

        public boolean isEnabled() {
            return ((android.media.audiofx.DynamicsProcessing.BandBase) real).isEnabled();
        }

        public void setCutoffFrequency(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.BandBase) real).setCutoffFrequency(arg0);
        }

        public void setEnabled(boolean arg0) {
            ((android.media.audiofx.DynamicsProcessing.BandBase) real).setEnabled(arg0);
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.BandBase) real).toString();
        }

    }
    public static final class BandStage {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BandStage(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.BandStage wrap(android.media.audiofx.DynamicsProcessing.BandStage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.BandStage(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.BandStage getReal() {
            return (android.media.audiofx.DynamicsProcessing.BandStage) real;
        }

        public android.media.audiofx.DynamicsProcessing.BandStage unwrap() {
            return getReal();
        }

        public BandStage(boolean arg0, boolean arg1, int arg2) {
            this(new android.media.audiofx.DynamicsProcessing.BandStage(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public int getBandCount() {
            return ((android.media.audiofx.DynamicsProcessing.BandStage) real).getBandCount();
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.BandStage) real).toString();
        }

    }
    public static final class Channel {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Channel(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel wrap(android.media.audiofx.DynamicsProcessing.Channel real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.Channel getReal() {
            return (android.media.audiofx.DynamicsProcessing.Channel) real;
        }

        public android.media.audiofx.DynamicsProcessing.Channel unwrap() {
            return getReal();
        }

        public Channel(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg0) {
            this(new android.media.audiofx.DynamicsProcessing.Channel(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Channel(float arg0, boolean arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
            this(new android.media.audiofx.DynamicsProcessing.Channel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7), (__DcgwBridgeToken) null);
        }

        public float getInputGain() {
            return ((android.media.audiofx.DynamicsProcessing.Channel) real).getInputGain();
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter getLimiter() {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter.wrap(((android.media.audiofx.DynamicsProcessing.Channel) real).getLimiter());
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc getMbc() {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc.wrap(((android.media.audiofx.DynamicsProcessing.Channel) real).getMbc());
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand getMbcBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand.wrap(((android.media.audiofx.DynamicsProcessing.Channel) real).getMbcBand(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPostEq() {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(((android.media.audiofx.DynamicsProcessing.Channel) real).getPostEq());
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPostEqBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(((android.media.audiofx.DynamicsProcessing.Channel) real).getPostEqBand(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPreEq() {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(((android.media.audiofx.DynamicsProcessing.Channel) real).getPreEq());
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPreEqBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(((android.media.audiofx.DynamicsProcessing.Channel) real).getPreEqBand(arg0));
        }

        public void setInputGain(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.Channel) real).setInputGain(arg0);
        }

        public void setLimiter(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
            ((android.media.audiofx.DynamicsProcessing.Channel) real).setLimiter(arg0 == null ? null : arg0.getReal());
        }

        public void setMbc(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
            ((android.media.audiofx.DynamicsProcessing.Channel) real).setMbc(arg0 == null ? null : arg0.getReal());
        }

        public void setMbcBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg1) {
            ((android.media.audiofx.DynamicsProcessing.Channel) real).setMbcBand(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setPostEq(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            ((android.media.audiofx.DynamicsProcessing.Channel) real).setPostEq(arg0 == null ? null : arg0.getReal());
        }

        public void setPostEqBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            ((android.media.audiofx.DynamicsProcessing.Channel) real).setPostEqBand(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setPreEq(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            ((android.media.audiofx.DynamicsProcessing.Channel) real).setPreEq(arg0 == null ? null : arg0.getReal());
        }

        public void setPreEqBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            ((android.media.audiofx.DynamicsProcessing.Channel) real).setPreEqBand(arg0, arg1 == null ? null : arg1.getReal());
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.Channel) real).toString();
        }

    }
    public static final class Config {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Config(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config wrap(android.media.audiofx.DynamicsProcessing.Config real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.Config getReal() {
            return (android.media.audiofx.DynamicsProcessing.Config) real;
        }

        public android.media.audiofx.DynamicsProcessing.Config unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel getChannelByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel.wrap(((android.media.audiofx.DynamicsProcessing.Config) real).getChannelByChannelIndex(arg0));
        }

        public float getInputGainByChannelIndex(int arg0) {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).getInputGainByChannelIndex(arg0);
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter getLimiterByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter.wrap(((android.media.audiofx.DynamicsProcessing.Config) real).getLimiterByChannelIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand getMbcBandByChannelIndex(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand.wrap(((android.media.audiofx.DynamicsProcessing.Config) real).getMbcBandByChannelIndex(arg0, arg1));
        }

        public int getMbcBandCount() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).getMbcBandCount();
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc getMbcByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc.wrap(((android.media.audiofx.DynamicsProcessing.Config) real).getMbcByChannelIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPostEqBandByChannelIndex(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(((android.media.audiofx.DynamicsProcessing.Config) real).getPostEqBandByChannelIndex(arg0, arg1));
        }

        public int getPostEqBandCount() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).getPostEqBandCount();
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPostEqByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(((android.media.audiofx.DynamicsProcessing.Config) real).getPostEqByChannelIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPreEqBandByChannelIndex(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(((android.media.audiofx.DynamicsProcessing.Config) real).getPreEqBandByChannelIndex(arg0, arg1));
        }

        public int getPreEqBandCount() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).getPreEqBandCount();
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPreEqByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(((android.media.audiofx.DynamicsProcessing.Config) real).getPreEqByChannelIndex(arg0));
        }

        public float getPreferredFrameDuration() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).getPreferredFrameDuration();
        }

        public int getVariant() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).getVariant();
        }

        public boolean isLimiterInUse() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).isLimiterInUse();
        }

        public boolean isMbcInUse() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).isMbcInUse();
        }

        public boolean isPostEqInUse() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).isPostEqInUse();
        }

        public boolean isPreEqInUse() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).isPreEqInUse();
        }

        public void setAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg0) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setAllChannelsTo(arg0 == null ? null : arg0.getReal());
        }

        public void setChannelTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg1) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setChannelTo(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setInputGainAllChannelsTo(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setInputGainAllChannelsTo(arg0);
        }

        public void setInputGainByChannelIndex(int arg0, float arg1) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setInputGainByChannelIndex(arg0, arg1);
        }

        public void setLimiterAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setLimiterAllChannelsTo(arg0 == null ? null : arg0.getReal());
        }

        public void setLimiterByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg1) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setLimiterByChannelIndex(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setMbcAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setMbcAllChannelsTo(arg0 == null ? null : arg0.getReal());
        }

        public void setMbcBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg1) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setMbcBandAllChannelsTo(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setMbcBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg2) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setMbcBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public void setMbcByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg1) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setMbcByChannelIndex(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setPostEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setPostEqAllChannelsTo(arg0 == null ? null : arg0.getReal());
        }

        public void setPostEqBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setPostEqBandAllChannelsTo(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setPostEqBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg2) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setPostEqBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public void setPostEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setPostEqByChannelIndex(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setPreEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setPreEqAllChannelsTo(arg0 == null ? null : arg0.getReal());
        }

        public void setPreEqBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setPreEqBandAllChannelsTo(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setPreEqBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg2) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setPreEqBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public void setPreEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
            ((android.media.audiofx.DynamicsProcessing.Config) real).setPreEqByChannelIndex(arg0, arg1 == null ? null : arg1.getReal());
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.Config) real).toString();
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder wrap(android.media.audiofx.DynamicsProcessing.Config.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.media.audiofx.DynamicsProcessing.Config.Builder getReal() {
                return (android.media.audiofx.DynamicsProcessing.Config.Builder) real;
            }

            public android.media.audiofx.DynamicsProcessing.Config.Builder unwrap() {
                return getReal();
            }

            public Builder(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
                this(new android.media.audiofx.DynamicsProcessing.Config.Builder(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config build() {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setAllChannelsTo(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setChannelTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setChannelTo(arg0, arg1 == null ? null : arg1.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setInputGainAllChannelsTo(float arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setInputGainAllChannelsTo(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setInputGainByChannelIndex(int arg0, float arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setInputGainByChannelIndex(arg0, arg1));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setLimiterAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setLimiterAllChannelsTo(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setLimiterByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setLimiterByChannelIndex(arg0, arg1 == null ? null : arg1.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setMbcAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setMbcAllChannelsTo(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setMbcByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setMbcByChannelIndex(arg0, arg1 == null ? null : arg1.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPostEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setPostEqAllChannelsTo(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPostEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setPostEqByChannelIndex(arg0, arg1 == null ? null : arg1.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPreEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setPreEqAllChannelsTo(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPreEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setPreEqByChannelIndex(arg0, arg1 == null ? null : arg1.getReal()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPreferredFrameDuration(float arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(((android.media.audiofx.DynamicsProcessing.Config.Builder) real).setPreferredFrameDuration(arg0));
            }

        }
    }
    public static final class Eq {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Eq(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq wrap(android.media.audiofx.DynamicsProcessing.Eq real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.Eq getReal() {
            return (android.media.audiofx.DynamicsProcessing.Eq) real;
        }

        public android.media.audiofx.DynamicsProcessing.Eq unwrap() {
            return getReal();
        }

        public Eq(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            this(new android.media.audiofx.DynamicsProcessing.Eq(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Eq(boolean arg0, boolean arg1, int arg2) {
            this(new android.media.audiofx.DynamicsProcessing.Eq(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(((android.media.audiofx.DynamicsProcessing.Eq) real).getBand(arg0));
        }

        public void setBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            ((android.media.audiofx.DynamicsProcessing.Eq) real).setBand(arg0, arg1 == null ? null : arg1.getReal());
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.Eq) real).toString();
        }

    }
    public static final class EqBand {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EqBand(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand wrap(android.media.audiofx.DynamicsProcessing.EqBand real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.EqBand getReal() {
            return (android.media.audiofx.DynamicsProcessing.EqBand) real;
        }

        public android.media.audiofx.DynamicsProcessing.EqBand unwrap() {
            return getReal();
        }

        public EqBand(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg0) {
            this(new android.media.audiofx.DynamicsProcessing.EqBand(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public EqBand(boolean arg0, float arg1, float arg2) {
            this(new android.media.audiofx.DynamicsProcessing.EqBand(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public float getGain() {
            return ((android.media.audiofx.DynamicsProcessing.EqBand) real).getGain();
        }

        public void setGain(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.EqBand) real).setGain(arg0);
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.EqBand) real).toString();
        }

    }
    public static final class Limiter {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Limiter(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter wrap(android.media.audiofx.DynamicsProcessing.Limiter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.Limiter getReal() {
            return (android.media.audiofx.DynamicsProcessing.Limiter) real;
        }

        public android.media.audiofx.DynamicsProcessing.Limiter unwrap() {
            return getReal();
        }

        public Limiter(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
            this(new android.media.audiofx.DynamicsProcessing.Limiter(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Limiter(boolean arg0, boolean arg1, int arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
            this(new android.media.audiofx.DynamicsProcessing.Limiter(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7), (__DcgwBridgeToken) null);
        }

        public float getAttackTime() {
            return ((android.media.audiofx.DynamicsProcessing.Limiter) real).getAttackTime();
        }

        public int getLinkGroup() {
            return ((android.media.audiofx.DynamicsProcessing.Limiter) real).getLinkGroup();
        }

        public float getPostGain() {
            return ((android.media.audiofx.DynamicsProcessing.Limiter) real).getPostGain();
        }

        public float getRatio() {
            return ((android.media.audiofx.DynamicsProcessing.Limiter) real).getRatio();
        }

        public float getReleaseTime() {
            return ((android.media.audiofx.DynamicsProcessing.Limiter) real).getReleaseTime();
        }

        public float getThreshold() {
            return ((android.media.audiofx.DynamicsProcessing.Limiter) real).getThreshold();
        }

        public void setAttackTime(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.Limiter) real).setAttackTime(arg0);
        }

        public void setLinkGroup(int arg0) {
            ((android.media.audiofx.DynamicsProcessing.Limiter) real).setLinkGroup(arg0);
        }

        public void setPostGain(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.Limiter) real).setPostGain(arg0);
        }

        public void setRatio(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.Limiter) real).setRatio(arg0);
        }

        public void setReleaseTime(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.Limiter) real).setReleaseTime(arg0);
        }

        public void setThreshold(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.Limiter) real).setThreshold(arg0);
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.Limiter) real).toString();
        }

    }
    public static final class Mbc {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Mbc(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc wrap(android.media.audiofx.DynamicsProcessing.Mbc real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.Mbc getReal() {
            return (android.media.audiofx.DynamicsProcessing.Mbc) real;
        }

        public android.media.audiofx.DynamicsProcessing.Mbc unwrap() {
            return getReal();
        }

        public Mbc(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
            this(new android.media.audiofx.DynamicsProcessing.Mbc(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Mbc(boolean arg0, boolean arg1, int arg2) {
            this(new android.media.audiofx.DynamicsProcessing.Mbc(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand getBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand.wrap(((android.media.audiofx.DynamicsProcessing.Mbc) real).getBand(arg0));
        }

        public void setBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg1) {
            ((android.media.audiofx.DynamicsProcessing.Mbc) real).setBand(arg0, arg1 == null ? null : arg1.getReal());
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.Mbc) real).toString();
        }

    }
    public static final class MbcBand {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MbcBand(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand wrap(android.media.audiofx.DynamicsProcessing.MbcBand real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.MbcBand getReal() {
            return (android.media.audiofx.DynamicsProcessing.MbcBand) real;
        }

        public android.media.audiofx.DynamicsProcessing.MbcBand unwrap() {
            return getReal();
        }

        public MbcBand(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg0) {
            this(new android.media.audiofx.DynamicsProcessing.MbcBand(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public MbcBand(boolean arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10) {
            this(new android.media.audiofx.DynamicsProcessing.MbcBand(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10), (__DcgwBridgeToken) null);
        }

        public float getAttackTime() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).getAttackTime();
        }

        public float getExpanderRatio() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).getExpanderRatio();
        }

        public float getKneeWidth() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).getKneeWidth();
        }

        public float getNoiseGateThreshold() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).getNoiseGateThreshold();
        }

        public float getPostGain() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).getPostGain();
        }

        public float getPreGain() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).getPreGain();
        }

        public float getRatio() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).getRatio();
        }

        public float getReleaseTime() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).getReleaseTime();
        }

        public float getThreshold() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).getThreshold();
        }

        public void setAttackTime(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.MbcBand) real).setAttackTime(arg0);
        }

        public void setExpanderRatio(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.MbcBand) real).setExpanderRatio(arg0);
        }

        public void setKneeWidth(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.MbcBand) real).setKneeWidth(arg0);
        }

        public void setNoiseGateThreshold(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.MbcBand) real).setNoiseGateThreshold(arg0);
        }

        public void setPostGain(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.MbcBand) real).setPostGain(arg0);
        }

        public void setPreGain(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.MbcBand) real).setPreGain(arg0);
        }

        public void setRatio(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.MbcBand) real).setRatio(arg0);
        }

        public void setReleaseTime(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.MbcBand) real).setReleaseTime(arg0);
        }

        public void setThreshold(float arg0) {
            ((android.media.audiofx.DynamicsProcessing.MbcBand) real).setThreshold(arg0);
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.MbcBand) real).toString();
        }

    }
    public static final class Stage {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Stage(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Stage wrap(android.media.audiofx.DynamicsProcessing.Stage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Stage(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.DynamicsProcessing.Stage getReal() {
            return (android.media.audiofx.DynamicsProcessing.Stage) real;
        }

        public android.media.audiofx.DynamicsProcessing.Stage unwrap() {
            return getReal();
        }

        public Stage(boolean arg0, boolean arg1) {
            this(new android.media.audiofx.DynamicsProcessing.Stage(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean isEnabled() {
            return ((android.media.audiofx.DynamicsProcessing.Stage) real).isEnabled();
        }

        public boolean isInUse() {
            return ((android.media.audiofx.DynamicsProcessing.Stage) real).isInUse();
        }

        public void setEnabled(boolean arg0) {
            ((android.media.audiofx.DynamicsProcessing.Stage) real).setEnabled(arg0);
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.DynamicsProcessing.Stage) real).toString();
        }

    }
}
