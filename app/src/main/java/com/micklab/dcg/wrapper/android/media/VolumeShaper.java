// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class VolumeShaper {
    private final android.media.VolumeShaper real;

    public VolumeShaper(android.media.VolumeShaper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.VolumeShaper wrap(android.media.VolumeShaper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeShaper(real);
    }

    public android.media.VolumeShaper unwrap() {
        return real;
    }

    public void apply(com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation arg0) {
        real.apply(arg0 == null ? null : arg0.unwrap());
    }

    public void close() {
        real.close();
    }

    public float getVolume() {
        return real.getVolume();
    }

    public void replace(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0, com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation arg1, boolean arg2) {
        real.replace(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static final class Configuration {
        private final android.media.VolumeShaper.Configuration real;

        public Configuration(android.media.VolumeShaper.Configuration real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration wrap(android.media.VolumeShaper.Configuration real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration(real);
        }

        public android.media.VolumeShaper.Configuration unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public long getDuration() {
            return real.getDuration();
        }

        public int getInterpolatorType() {
            return real.getInterpolatorType();
        }

        public static int getMaximumCurvePoints() {
            return android.media.VolumeShaper.Configuration.getMaximumCurvePoints();
        }

        public float[] getTimes() {
            return real.getTimes();
        }

        public float[] getVolumes() {
            return real.getVolumes();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
            private final android.media.VolumeShaper.Configuration.Builder real;

            public Builder(android.media.VolumeShaper.Configuration.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder wrap(android.media.VolumeShaper.Configuration.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder(real);
            }

            public android.media.VolumeShaper.Configuration.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.media.VolumeShaper.Configuration.Builder());
            }

            public Builder(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0) {
                this(new android.media.VolumeShaper.Configuration.Builder(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration build() {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder invertVolumes() {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(real.invertVolumes());
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder reflectTimes() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.VolumeShaper$Configuration$Builder#reflectTimes()");
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder scaleToEndVolume(float arg0) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(real.scaleToEndVolume(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder scaleToStartVolume(float arg0) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(real.scaleToStartVolume(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder setCurve(float[] arg0, float[] arg1) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(real.setCurve(arg0, arg1));
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder setDuration(long arg0) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(real.setDuration(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder setInterpolatorType(int arg0) {
                return com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration.Builder.wrap(real.setInterpolatorType(arg0));
            }

        }
    }
    public static final class Operation {
        private final android.media.VolumeShaper.Operation real;

        public Operation(android.media.VolumeShaper.Operation real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation wrap(android.media.VolumeShaper.Operation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation(real);
        }

        public android.media.VolumeShaper.Operation unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation PLAY = com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation.wrap(android.media.VolumeShaper.Operation.PLAY);
        public static final com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation REVERSE = com.micklab.dcg.wrapper.android.media.VolumeShaper.Operation.wrap(android.media.VolumeShaper.Operation.REVERSE);

    }
}
