// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class VolumeShaper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VolumeShaper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.VolumeShaper wrap(android.media.VolumeShaper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeShaper(real, (__DcgwBridgeToken) null);
    }

    public android.media.VolumeShaper getReal() {
        return (android.media.VolumeShaper) real;
    }

    public android.media.VolumeShaper unwrap() {
        return getReal();
    }

    public void apply(com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation arg0) {
        ((android.media.VolumeShaper) real).apply(arg0 == null ? null : arg0.getReal());
    }

    public void close() {
        ((android.media.VolumeShaper) real).close();
    }

    public float getVolume() {
        return ((android.media.VolumeShaper) real).getVolume();
    }

    public void replace(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0, com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation arg1, boolean arg2) {
        ((android.media.VolumeShaper) real).replace(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static final class Configuration {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Configuration(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration wrap(android.media.VolumeShaper.Configuration real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration(real, (__DcgwBridgeToken) null);
        }

        public android.media.VolumeShaper.Configuration getReal() {
            return (android.media.VolumeShaper.Configuration) real;
        }

        public android.media.VolumeShaper.Configuration unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.media.VolumeShaper.Configuration) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.VolumeShaper.Configuration) real).equals(arg0);
        }

        public long getDuration() {
            return ((android.media.VolumeShaper.Configuration) real).getDuration();
        }

        public int getInterpolatorType() {
            return ((android.media.VolumeShaper.Configuration) real).getInterpolatorType();
        }

        public static int getMaximumCurvePoints() {
            return android.media.VolumeShaper.Configuration.getMaximumCurvePoints();
        }

        public float[] getTimes() {
            return ((android.media.VolumeShaper.Configuration) real).getTimes();
        }

        public float[] getVolumes() {
            return ((android.media.VolumeShaper.Configuration) real).getVolumes();
        }

        public int hashCode() {
            return ((android.media.VolumeShaper.Configuration) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.media.VolumeShaper.Configuration) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.VolumeShaper.Configuration) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration CUBIC_RAMP = com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.wrap(android.media.VolumeShaper.Configuration.CUBIC_RAMP);
        public static final int INTERPOLATOR_TYPE_CUBIC = android.media.VolumeShaper.Configuration.INTERPOLATOR_TYPE_CUBIC;
        public static final int INTERPOLATOR_TYPE_CUBIC_MONOTONIC = android.media.VolumeShaper.Configuration.INTERPOLATOR_TYPE_CUBIC_MONOTONIC;
        public static final int INTERPOLATOR_TYPE_LINEAR = android.media.VolumeShaper.Configuration.INTERPOLATOR_TYPE_LINEAR;
        public static final int INTERPOLATOR_TYPE_STEP = android.media.VolumeShaper.Configuration.INTERPOLATOR_TYPE_STEP;
        public static final com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration LINEAR_RAMP = com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.wrap(android.media.VolumeShaper.Configuration.LINEAR_RAMP);
        public static final com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration SCURVE_RAMP = com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.wrap(android.media.VolumeShaper.Configuration.SCURVE_RAMP);
        public static final com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration SINE_RAMP = com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.wrap(android.media.VolumeShaper.Configuration.SINE_RAMP);

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder wrap(android.media.VolumeShaper.Configuration.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.media.VolumeShaper.Configuration.Builder getReal() {
                return (android.media.VolumeShaper.Configuration.Builder) real;
            }

            public android.media.VolumeShaper.Configuration.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.media.VolumeShaper.Configuration.Builder(), (__DcgwBridgeToken) null);
            }

            public Builder(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0) {
                this(new android.media.VolumeShaper.Configuration.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration build() {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.wrap(((android.media.VolumeShaper.Configuration.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder invertVolumes() {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(((android.media.VolumeShaper.Configuration.Builder) real).invertVolumes());
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder reflectTimes() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.VolumeShaper$Configuration$Builder#reflectTimes()");
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder scaleToEndVolume(float arg0) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(((android.media.VolumeShaper.Configuration.Builder) real).scaleToEndVolume(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder scaleToStartVolume(float arg0) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(((android.media.VolumeShaper.Configuration.Builder) real).scaleToStartVolume(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder setCurve(float[] arg0, float[] arg1) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(((android.media.VolumeShaper.Configuration.Builder) real).setCurve(arg0, arg1));
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder setDuration(long arg0) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(((android.media.VolumeShaper.Configuration.Builder) real).setDuration(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder setInterpolatorType(int arg0) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(((android.media.VolumeShaper.Configuration.Builder) real).setInterpolatorType(arg0));
            }

        }
    }
    public static final class Operation {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Operation(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation wrap(android.media.VolumeShaper.Operation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation(real, (__DcgwBridgeToken) null);
        }

        public android.media.VolumeShaper.Operation getReal() {
            return (android.media.VolumeShaper.Operation) real;
        }

        public android.media.VolumeShaper.Operation unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.media.VolumeShaper.Operation) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.VolumeShaper.Operation) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.media.VolumeShaper.Operation) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.media.VolumeShaper.Operation) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.VolumeShaper.Operation) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation PLAY = com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation.wrap(android.media.VolumeShaper.Operation.PLAY);
        public static final com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation REVERSE = com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation.wrap(android.media.VolumeShaper.Operation.REVERSE);

    }
}
