// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ExerciseRoute {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExerciseRoute(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute wrap(android.health.connect.datatypes.ExerciseRoute real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.ExerciseRoute getReal() {
        return (android.health.connect.datatypes.ExerciseRoute) real;
    }

    public android.health.connect.datatypes.ExerciseRoute unwrap() {
        return getReal();
    }

    public ExerciseRoute(java.util.List arg0) {
        this(new android.health.connect.datatypes.ExerciseRoute(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.health.connect.datatypes.ExerciseRoute) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.ExerciseRoute) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.ExerciseRoute) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.datatypes.ExerciseRoute) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Location {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Location(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location wrap(android.health.connect.datatypes.ExerciseRoute.Location real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.ExerciseRoute.Location getReal() {
            return (android.health.connect.datatypes.ExerciseRoute.Location) real;
        }

        public android.health.connect.datatypes.ExerciseRoute.Location unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.health.connect.datatypes.ExerciseRoute.Location) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.health.connect.datatypes.ExerciseRoute.Location) real).equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getAltitude() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(((android.health.connect.datatypes.ExerciseRoute.Location) real).getAltitude());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getHorizontalAccuracy() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(((android.health.connect.datatypes.ExerciseRoute.Location) real).getHorizontalAccuracy());
        }

        public double getLatitude() {
            return ((android.health.connect.datatypes.ExerciseRoute.Location) real).getLatitude();
        }

        public double getLongitude() {
            return ((android.health.connect.datatypes.ExerciseRoute.Location) real).getLongitude();
        }

        public java.time.Instant getTime() {
            return ((android.health.connect.datatypes.ExerciseRoute.Location) real).getTime();
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getVerticalAccuracy() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(((android.health.connect.datatypes.ExerciseRoute.Location) real).getVerticalAccuracy());
        }

        public int hashCode() {
            return ((android.health.connect.datatypes.ExerciseRoute.Location) real).hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.health.connect.datatypes.ExerciseRoute.Location) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder wrap(android.health.connect.datatypes.ExerciseRoute.Location.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.health.connect.datatypes.ExerciseRoute.Location.Builder getReal() {
                return (android.health.connect.datatypes.ExerciseRoute.Location.Builder) real;
            }

            public android.health.connect.datatypes.ExerciseRoute.Location.Builder unwrap() {
                return getReal();
            }

            public Builder(java.time.Instant arg0, double arg1, double arg2) {
                this(new android.health.connect.datatypes.ExerciseRoute.Location.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location build() {
                return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.wrap(((android.health.connect.datatypes.ExerciseRoute.Location.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder setAltitude(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
                return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder.wrap(((android.health.connect.datatypes.ExerciseRoute.Location.Builder) real).setAltitude(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder setHorizontalAccuracy(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
                return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder.wrap(((android.health.connect.datatypes.ExerciseRoute.Location.Builder) real).setHorizontalAccuracy(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder setVerticalAccuracy(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
                return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.Location.Builder.wrap(((android.health.connect.datatypes.ExerciseRoute.Location.Builder) real).setVerticalAccuracy(arg0 == null ? null : arg0.getReal()));
            }

        }
    }
}
