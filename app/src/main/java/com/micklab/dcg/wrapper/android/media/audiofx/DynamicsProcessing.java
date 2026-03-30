// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class DynamicsProcessing {
    private final android.media.audiofx.DynamicsProcessing real;

    public DynamicsProcessing(android.media.audiofx.DynamicsProcessing real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing wrap(android.media.audiofx.DynamicsProcessing real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing(real);
    }

    public android.media.audiofx.DynamicsProcessing unwrap() {
        return real;
    }

    public DynamicsProcessing(int arg0) {
        this(new android.media.audiofx.DynamicsProcessing(arg0));
    }

    public DynamicsProcessing(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config arg2) {
        this(new android.media.audiofx.DynamicsProcessing(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel getChannelByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel.wrap(real.getChannelByChannelIndex(arg0));
    }

    public int getChannelCount() {
        return real.getChannelCount();
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config getConfig() {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.wrap(real.getConfig());
    }

    public float getInputGainByChannelIndex(int arg0) {
        return real.getInputGainByChannelIndex(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter getLimiterByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter.wrap(real.getLimiterByChannelIndex(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand getMbcBandByChannelIndex(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand.wrap(real.getMbcBandByChannelIndex(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc getMbcByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc.wrap(real.getMbcByChannelIndex(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPostEqBandByChannelIndex(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(real.getPostEqBandByChannelIndex(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPostEqByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(real.getPostEqByChannelIndex(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPreEqBandByChannelIndex(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(real.getPreEqBandByChannelIndex(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPreEqByChannelIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(real.getPreEqByChannelIndex(arg0));
    }

    public void setAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg0) {
        real.setAllChannelsTo(arg0 == null ? null : arg0.unwrap());
    }

    public void setChannelTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg1) {
        real.setChannelTo(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setInputGainAllChannelsTo(float arg0) {
        real.setInputGainAllChannelsTo(arg0);
    }

    public void setInputGainbyChannel(int arg0, float arg1) {
        real.setInputGainbyChannel(arg0, arg1);
    }

    public void setLimiterAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
        real.setLimiterAllChannelsTo(arg0 == null ? null : arg0.unwrap());
    }

    public void setLimiterByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg1) {
        real.setLimiterByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setMbcAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
        real.setMbcAllChannelsTo(arg0 == null ? null : arg0.unwrap());
    }

    public void setMbcBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg1) {
        real.setMbcBandAllChannelsTo(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setMbcBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg2) {
        real.setMbcBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setMbcByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg1) {
        real.setMbcByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setPostEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
        real.setPostEqAllChannelsTo(arg0 == null ? null : arg0.unwrap());
    }

    public void setPostEqBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
        real.setPostEqBandAllChannelsTo(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setPostEqBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg2) {
        real.setPostEqBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setPostEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
        real.setPostEqByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setPreEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
        real.setPreEqAllChannelsTo(arg0 == null ? null : arg0.unwrap());
    }

    public void setPreEqBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
        real.setPreEqBandAllChannelsTo(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setPreEqBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg2) {
        real.setPreEqBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setPreEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
        real.setPreEqByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final int VARIANT_FAVOR_FREQUENCY_RESOLUTION = android.media.audiofx.DynamicsProcessing.VARIANT_FAVOR_FREQUENCY_RESOLUTION;
    public static final int VARIANT_FAVOR_TIME_RESOLUTION = android.media.audiofx.DynamicsProcessing.VARIANT_FAVOR_TIME_RESOLUTION;

    public static final class BandBase {
        private final android.media.audiofx.DynamicsProcessing.BandBase real;

        public BandBase(android.media.audiofx.DynamicsProcessing.BandBase real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.BandBase wrap(android.media.audiofx.DynamicsProcessing.BandBase real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.BandBase(real);
        }

        public android.media.audiofx.DynamicsProcessing.BandBase unwrap() {
            return real;
        }

        public BandBase(boolean arg0, float arg1) {
            this(new android.media.audiofx.DynamicsProcessing.BandBase(arg0, arg1));
        }

        public float getCutoffFrequency() {
            return real.getCutoffFrequency();
        }

        public boolean isEnabled() {
            return real.isEnabled();
        }

        public void setCutoffFrequency(float arg0) {
            real.setCutoffFrequency(arg0);
        }

        public void setEnabled(boolean arg0) {
            real.setEnabled(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class BandStage {
        private final android.media.audiofx.DynamicsProcessing.BandStage real;

        public BandStage(android.media.audiofx.DynamicsProcessing.BandStage real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.BandStage wrap(android.media.audiofx.DynamicsProcessing.BandStage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.BandStage(real);
        }

        public android.media.audiofx.DynamicsProcessing.BandStage unwrap() {
            return real;
        }

        public BandStage(boolean arg0, boolean arg1, int arg2) {
            this(new android.media.audiofx.DynamicsProcessing.BandStage(arg0, arg1, arg2));
        }

        public int getBandCount() {
            return real.getBandCount();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class Channel {
        private final android.media.audiofx.DynamicsProcessing.Channel real;

        public Channel(android.media.audiofx.DynamicsProcessing.Channel real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel wrap(android.media.audiofx.DynamicsProcessing.Channel real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel(real);
        }

        public android.media.audiofx.DynamicsProcessing.Channel unwrap() {
            return real;
        }

        public Channel(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg0) {
            this(new android.media.audiofx.DynamicsProcessing.Channel(arg0 == null ? null : arg0.unwrap()));
        }

        public Channel(float arg0, boolean arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
            this(new android.media.audiofx.DynamicsProcessing.Channel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7));
        }

        public float getInputGain() {
            return real.getInputGain();
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter getLimiter() {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter.wrap(real.getLimiter());
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc getMbc() {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc.wrap(real.getMbc());
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand getMbcBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand.wrap(real.getMbcBand(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPostEq() {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(real.getPostEq());
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPostEqBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(real.getPostEqBand(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPreEq() {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(real.getPreEq());
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPreEqBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(real.getPreEqBand(arg0));
        }

        public void setInputGain(float arg0) {
            real.setInputGain(arg0);
        }

        public void setLimiter(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
            real.setLimiter(arg0 == null ? null : arg0.unwrap());
        }

        public void setMbc(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
            real.setMbc(arg0 == null ? null : arg0.unwrap());
        }

        public void setMbcBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg1) {
            real.setMbcBand(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setPostEq(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            real.setPostEq(arg0 == null ? null : arg0.unwrap());
        }

        public void setPostEqBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            real.setPostEqBand(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setPreEq(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            real.setPreEq(arg0 == null ? null : arg0.unwrap());
        }

        public void setPreEqBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            real.setPreEqBand(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class Config {
        private final android.media.audiofx.DynamicsProcessing.Config real;

        public Config(android.media.audiofx.DynamicsProcessing.Config real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config wrap(android.media.audiofx.DynamicsProcessing.Config real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config(real);
        }

        public android.media.audiofx.DynamicsProcessing.Config unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel getChannelByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel.wrap(real.getChannelByChannelIndex(arg0));
        }

        public float getInputGainByChannelIndex(int arg0) {
            return real.getInputGainByChannelIndex(arg0);
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter getLimiterByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter.wrap(real.getLimiterByChannelIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand getMbcBandByChannelIndex(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand.wrap(real.getMbcBandByChannelIndex(arg0, arg1));
        }

        public int getMbcBandCount() {
            return real.getMbcBandCount();
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc getMbcByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc.wrap(real.getMbcByChannelIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPostEqBandByChannelIndex(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(real.getPostEqBandByChannelIndex(arg0, arg1));
        }

        public int getPostEqBandCount() {
            return real.getPostEqBandCount();
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPostEqByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(real.getPostEqByChannelIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getPreEqBandByChannelIndex(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(real.getPreEqBandByChannelIndex(arg0, arg1));
        }

        public int getPreEqBandCount() {
            return real.getPreEqBandCount();
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq getPreEqByChannelIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq.wrap(real.getPreEqByChannelIndex(arg0));
        }

        public float getPreferredFrameDuration() {
            return real.getPreferredFrameDuration();
        }

        public int getVariant() {
            return real.getVariant();
        }

        public boolean isLimiterInUse() {
            return real.isLimiterInUse();
        }

        public boolean isMbcInUse() {
            return real.isMbcInUse();
        }

        public boolean isPostEqInUse() {
            return real.isPostEqInUse();
        }

        public boolean isPreEqInUse() {
            return real.isPreEqInUse();
        }

        public void setAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg0) {
            real.setAllChannelsTo(arg0 == null ? null : arg0.unwrap());
        }

        public void setChannelTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg1) {
            real.setChannelTo(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setInputGainAllChannelsTo(float arg0) {
            real.setInputGainAllChannelsTo(arg0);
        }

        public void setInputGainByChannelIndex(int arg0, float arg1) {
            real.setInputGainByChannelIndex(arg0, arg1);
        }

        public void setLimiterAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
            real.setLimiterAllChannelsTo(arg0 == null ? null : arg0.unwrap());
        }

        public void setLimiterByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg1) {
            real.setLimiterByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setMbcAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
            real.setMbcAllChannelsTo(arg0 == null ? null : arg0.unwrap());
        }

        public void setMbcBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg1) {
            real.setMbcBandAllChannelsTo(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setMbcBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg2) {
            real.setMbcBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void setMbcByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg1) {
            real.setMbcByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setPostEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            real.setPostEqAllChannelsTo(arg0 == null ? null : arg0.unwrap());
        }

        public void setPostEqBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            real.setPostEqBandAllChannelsTo(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setPostEqBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg2) {
            real.setPostEqBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void setPostEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
            real.setPostEqByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setPreEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            real.setPreEqAllChannelsTo(arg0 == null ? null : arg0.unwrap());
        }

        public void setPreEqBandAllChannelsTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            real.setPreEqBandAllChannelsTo(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setPreEqBandByChannelIndex(int arg0, int arg1, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg2) {
            real.setPreEqBandByChannelIndex(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void setPreEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
            real.setPreEqByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public static final class Builder {
            private final android.media.audiofx.DynamicsProcessing.Config.Builder real;

            public Builder(android.media.audiofx.DynamicsProcessing.Config.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder wrap(android.media.audiofx.DynamicsProcessing.Config.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder(real);
            }

            public android.media.audiofx.DynamicsProcessing.Config.Builder unwrap() {
                return real;
            }

            public Builder(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
                this(new android.media.audiofx.DynamicsProcessing.Config.Builder(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config build() {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setAllChannelsTo(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setChannelTo(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Channel arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setChannelTo(arg0, arg1 == null ? null : arg1.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setInputGainAllChannelsTo(float arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setInputGainAllChannelsTo(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setInputGainByChannelIndex(int arg0, float arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setInputGainByChannelIndex(arg0, arg1));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setLimiterAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setLimiterAllChannelsTo(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setLimiterByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setLimiterByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setMbcAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setMbcAllChannelsTo(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setMbcByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setMbcByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPostEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setPostEqAllChannelsTo(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPostEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setPostEqByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPreEqAllChannelsTo(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setPreEqAllChannelsTo(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPreEqByChannelIndex(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg1) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setPreEqByChannelIndex(arg0, arg1 == null ? null : arg1.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder setPreferredFrameDuration(float arg0) {
                return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Config.Builder.wrap(real.setPreferredFrameDuration(arg0));
            }

        }
    }
    public static final class Eq {
        private final android.media.audiofx.DynamicsProcessing.Eq real;

        public Eq(android.media.audiofx.DynamicsProcessing.Eq real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq wrap(android.media.audiofx.DynamicsProcessing.Eq real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq(real);
        }

        public android.media.audiofx.DynamicsProcessing.Eq unwrap() {
            return real;
        }

        public Eq(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Eq arg0) {
            this(new android.media.audiofx.DynamicsProcessing.Eq(arg0 == null ? null : arg0.unwrap()));
        }

        public Eq(boolean arg0, boolean arg1, int arg2) {
            this(new android.media.audiofx.DynamicsProcessing.Eq(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand getBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand.wrap(real.getBand(arg0));
        }

        public void setBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg1) {
            real.setBand(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class EqBand {
        private final android.media.audiofx.DynamicsProcessing.EqBand real;

        public EqBand(android.media.audiofx.DynamicsProcessing.EqBand real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand wrap(android.media.audiofx.DynamicsProcessing.EqBand real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand(real);
        }

        public android.media.audiofx.DynamicsProcessing.EqBand unwrap() {
            return real;
        }

        public EqBand(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.EqBand arg0) {
            this(new android.media.audiofx.DynamicsProcessing.EqBand(arg0 == null ? null : arg0.unwrap()));
        }

        public EqBand(boolean arg0, float arg1, float arg2) {
            this(new android.media.audiofx.DynamicsProcessing.EqBand(arg0, arg1, arg2));
        }

        public float getGain() {
            return real.getGain();
        }

        public void setGain(float arg0) {
            real.setGain(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class Limiter {
        private final android.media.audiofx.DynamicsProcessing.Limiter real;

        public Limiter(android.media.audiofx.DynamicsProcessing.Limiter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter wrap(android.media.audiofx.DynamicsProcessing.Limiter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter(real);
        }

        public android.media.audiofx.DynamicsProcessing.Limiter unwrap() {
            return real;
        }

        public Limiter(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Limiter arg0) {
            this(new android.media.audiofx.DynamicsProcessing.Limiter(arg0 == null ? null : arg0.unwrap()));
        }

        public Limiter(boolean arg0, boolean arg1, int arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
            this(new android.media.audiofx.DynamicsProcessing.Limiter(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7));
        }

        public float getAttackTime() {
            return real.getAttackTime();
        }

        public int getLinkGroup() {
            return real.getLinkGroup();
        }

        public float getPostGain() {
            return real.getPostGain();
        }

        public float getRatio() {
            return real.getRatio();
        }

        public float getReleaseTime() {
            return real.getReleaseTime();
        }

        public float getThreshold() {
            return real.getThreshold();
        }

        public void setAttackTime(float arg0) {
            real.setAttackTime(arg0);
        }

        public void setLinkGroup(int arg0) {
            real.setLinkGroup(arg0);
        }

        public void setPostGain(float arg0) {
            real.setPostGain(arg0);
        }

        public void setRatio(float arg0) {
            real.setRatio(arg0);
        }

        public void setReleaseTime(float arg0) {
            real.setReleaseTime(arg0);
        }

        public void setThreshold(float arg0) {
            real.setThreshold(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class Mbc {
        private final android.media.audiofx.DynamicsProcessing.Mbc real;

        public Mbc(android.media.audiofx.DynamicsProcessing.Mbc real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc wrap(android.media.audiofx.DynamicsProcessing.Mbc real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc(real);
        }

        public android.media.audiofx.DynamicsProcessing.Mbc unwrap() {
            return real;
        }

        public Mbc(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Mbc arg0) {
            this(new android.media.audiofx.DynamicsProcessing.Mbc(arg0 == null ? null : arg0.unwrap()));
        }

        public Mbc(boolean arg0, boolean arg1, int arg2) {
            this(new android.media.audiofx.DynamicsProcessing.Mbc(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand getBand(int arg0) {
            return com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand.wrap(real.getBand(arg0));
        }

        public void setBand(int arg0, com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg1) {
            real.setBand(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class MbcBand {
        private final android.media.audiofx.DynamicsProcessing.MbcBand real;

        public MbcBand(android.media.audiofx.DynamicsProcessing.MbcBand real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand wrap(android.media.audiofx.DynamicsProcessing.MbcBand real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand(real);
        }

        public android.media.audiofx.DynamicsProcessing.MbcBand unwrap() {
            return real;
        }

        public MbcBand(com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.MbcBand arg0) {
            this(new android.media.audiofx.DynamicsProcessing.MbcBand(arg0 == null ? null : arg0.unwrap()));
        }

        public MbcBand(boolean arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10) {
            this(new android.media.audiofx.DynamicsProcessing.MbcBand(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10));
        }

        public float getAttackTime() {
            return real.getAttackTime();
        }

        public float getExpanderRatio() {
            return real.getExpanderRatio();
        }

        public float getKneeWidth() {
            return real.getKneeWidth();
        }

        public float getNoiseGateThreshold() {
            return real.getNoiseGateThreshold();
        }

        public float getPostGain() {
            return real.getPostGain();
        }

        public float getPreGain() {
            return real.getPreGain();
        }

        public float getRatio() {
            return real.getRatio();
        }

        public float getReleaseTime() {
            return real.getReleaseTime();
        }

        public float getThreshold() {
            return real.getThreshold();
        }

        public void setAttackTime(float arg0) {
            real.setAttackTime(arg0);
        }

        public void setExpanderRatio(float arg0) {
            real.setExpanderRatio(arg0);
        }

        public void setKneeWidth(float arg0) {
            real.setKneeWidth(arg0);
        }

        public void setNoiseGateThreshold(float arg0) {
            real.setNoiseGateThreshold(arg0);
        }

        public void setPostGain(float arg0) {
            real.setPostGain(arg0);
        }

        public void setPreGain(float arg0) {
            real.setPreGain(arg0);
        }

        public void setRatio(float arg0) {
            real.setRatio(arg0);
        }

        public void setReleaseTime(float arg0) {
            real.setReleaseTime(arg0);
        }

        public void setThreshold(float arg0) {
            real.setThreshold(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class Stage {
        private final android.media.audiofx.DynamicsProcessing.Stage real;

        public Stage(android.media.audiofx.DynamicsProcessing.Stage real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Stage wrap(android.media.audiofx.DynamicsProcessing.Stage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.DynamicsProcessing.Stage(real);
        }

        public android.media.audiofx.DynamicsProcessing.Stage unwrap() {
            return real;
        }

        public Stage(boolean arg0, boolean arg1) {
            this(new android.media.audiofx.DynamicsProcessing.Stage(arg0, arg1));
        }

        public boolean isEnabled() {
            return real.isEnabled();
        }

        public boolean isInUse() {
            return real.isInUse();
        }

        public void setEnabled(boolean arg0) {
            real.setEnabled(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
