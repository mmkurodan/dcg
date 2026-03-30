// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Build {
    private final android.os.Build real;

    public Build(android.os.Build real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Build wrap(android.os.Build real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Build(real);
    }

    public android.os.Build unwrap() {
        return real;
    }

    public Build() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build#android.os.Build()");
    }

    public static java.lang.String getRadioVersion() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build#getRadioVersion()");
    }

    public static java.lang.String getSerial() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build#getSerial()");
    }


    public static final class Partition {
        private final android.os.Build.Partition real;

        public Partition(android.os.Build.Partition real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Build.Partition wrap(android.os.Build.Partition real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Build.Partition(real);
        }

        public android.os.Build.Partition unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build$Partition#equals(java.lang.Object)");
        }

        public long getBuildTimeMillis() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build$Partition#getBuildTimeMillis()");
        }

        public java.lang.String getFingerprint() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build$Partition#getFingerprint()");
        }

        public java.lang.String getName() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build$Partition#getName()");
        }

        public int hashCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build$Partition#hashCode()");
        }


    }
    public static final class VERSION {
        private final android.os.Build.VERSION real;

        public VERSION(android.os.Build.VERSION real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Build.VERSION wrap(android.os.Build.VERSION real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Build.VERSION(real);
        }

        public android.os.Build.VERSION unwrap() {
            return real;
        }

        public VERSION() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build$VERSION#android.os.Build$VERSION()");
        }


    }
    public static final class VERSION_CODES {
        private final android.os.Build.VERSION_CODES real;

        public VERSION_CODES(android.os.Build.VERSION_CODES real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Build.VERSION_CODES wrap(android.os.Build.VERSION_CODES real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Build.VERSION_CODES(real);
        }

        public android.os.Build.VERSION_CODES unwrap() {
            return real;
        }

        public VERSION_CODES() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build$VERSION_CODES#android.os.Build$VERSION_CODES()");
        }


    }
}
