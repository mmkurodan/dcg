// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ExerciseRoute {
    private final android.health.connect.datatypes.ExerciseRoute real;

    public ExerciseRoute(android.health.connect.datatypes.ExerciseRoute real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute wrap(android.health.connect.datatypes.ExerciseRoute real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute(real);
    }

    public android.health.connect.datatypes.ExerciseRoute unwrap() {
        return real;
    }

    public ExerciseRoute(java.util.List arg0) {
        this(new android.health.connect.datatypes.ExerciseRoute(arg0));
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

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Location {
        private final android.health.connect.datatypes.ExerciseRoute.Location real;

        public Location(android.health.connect.datatypes.ExerciseRoute.Location real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location wrap(android.health.connect.datatypes.ExerciseRoute.Location real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location(real);
        }

        public android.health.connect.datatypes.ExerciseRoute.Location unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getAltitude() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(real.getAltitude());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getHorizontalAccuracy() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(real.getHorizontalAccuracy());
        }

        public double getLatitude() {
            return real.getLatitude();
        }

        public double getLongitude() {
            return real.getLongitude();
        }

        public java.time.Instant getTime() {
            return real.getTime();
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getVerticalAccuracy() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(real.getVerticalAccuracy());
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.health.connect.datatypes.ExerciseRoute.Location.Builder real;

            public Builder(android.health.connect.datatypes.ExerciseRoute.Location.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder wrap(android.health.connect.datatypes.ExerciseRoute.Location.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder(real);
            }

            public android.health.connect.datatypes.ExerciseRoute.Location.Builder unwrap() {
                return real;
            }

            public Builder(java.time.Instant arg0, double arg1, double arg2) {
                this(new android.health.connect.datatypes.ExerciseRoute.Location.Builder(arg0, arg1, arg2));
            }

            public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location build() {
                return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder setAltitude(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
                return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder.wrap(real.setAltitude(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder setHorizontalAccuracy(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
                return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder.wrap(real.setHorizontalAccuracy(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder setVerticalAccuracy(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
                return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder.wrap(real.setVerticalAccuracy(arg0 == null ? null : arg0.unwrap()));
            }

        }
    }
}
