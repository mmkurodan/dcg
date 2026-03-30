// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class StrictMode {
    private final android.os.StrictMode real;

    public StrictMode(android.os.StrictMode real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.StrictMode wrap(android.os.StrictMode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.StrictMode(real);
    }

    public android.os.StrictMode unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy allowThreadDiskReads() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode#allowThreadDiskReads()");
    }

    public static com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy allowThreadDiskWrites() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode#allowThreadDiskWrites()");
    }

    public static void enableDefaults() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode#enableDefaults()");
    }

    public static com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy getThreadPolicy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode#getThreadPolicy()");
    }

    public static com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy getVmPolicy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode#getVmPolicy()");
    }

    public static void noteSlowCall(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode#noteSlowCall(java.lang.String)");
    }

    public static void setThreadPolicy(com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode#setThreadPolicy(android.os.StrictMode$ThreadPolicy)");
    }

    public static void setVmPolicy(com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode#setVmPolicy(android.os.StrictMode$VmPolicy)");
    }

    public static final class OnThreadViolationListener {
        private final android.os.StrictMode.OnThreadViolationListener real;

        public OnThreadViolationListener(android.os.StrictMode.OnThreadViolationListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.StrictMode.OnThreadViolationListener wrap(android.os.StrictMode.OnThreadViolationListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.StrictMode.OnThreadViolationListener(real);
        }

        public android.os.StrictMode.OnThreadViolationListener unwrap() {
            return real;
        }

        public void onThreadViolation(com.micklab.dcg.wrapper.android.os.strictmode.Violation arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$OnThreadViolationListener#onThreadViolation(android.os.strictmode.Violation)");
        }

    }
    public static final class OnVmViolationListener {
        private final android.os.StrictMode.OnVmViolationListener real;

        public OnVmViolationListener(android.os.StrictMode.OnVmViolationListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.StrictMode.OnVmViolationListener wrap(android.os.StrictMode.OnVmViolationListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.StrictMode.OnVmViolationListener(real);
        }

        public android.os.StrictMode.OnVmViolationListener unwrap() {
            return real;
        }

        public void onVmViolation(com.micklab.dcg.wrapper.android.os.strictmode.Violation arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$OnVmViolationListener#onVmViolation(android.os.strictmode.Violation)");
        }

    }
    public static final class ThreadPolicy {
        private final android.os.StrictMode.ThreadPolicy real;

        public ThreadPolicy(android.os.StrictMode.ThreadPolicy real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy wrap(android.os.StrictMode.ThreadPolicy real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy(real);
        }

        public android.os.StrictMode.ThreadPolicy unwrap() {
            return real;
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy#toString()");
        }


        public static final class Builder {
            private final android.os.StrictMode.ThreadPolicy.Builder real;

            public Builder(android.os.StrictMode.ThreadPolicy.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder wrap(android.os.StrictMode.ThreadPolicy.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder(real);
            }

            public android.os.StrictMode.ThreadPolicy.Builder unwrap() {
                return real;
            }

            public Builder() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#android.os.StrictMode$ThreadPolicy$Builder()");
            }

            public Builder(com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#android.os.StrictMode$ThreadPolicy$Builder(android.os.StrictMode$ThreadPolicy)");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy build() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#build()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder detectAll() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#detectAll()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder detectCustomSlowCalls() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#detectCustomSlowCalls()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder detectDiskReads() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#detectDiskReads()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder detectDiskWrites() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#detectDiskWrites()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder detectExplicitGc() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#detectExplicitGc()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder detectNetwork() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#detectNetwork()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder detectResourceMismatches() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#detectResourceMismatches()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder detectUnbufferedIo() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#detectUnbufferedIo()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder penaltyDeath() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#penaltyDeath()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder penaltyDeathOnNetwork() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#penaltyDeathOnNetwork()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder penaltyDialog() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#penaltyDialog()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder penaltyDropBox() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#penaltyDropBox()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder penaltyFlashScreen() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#penaltyFlashScreen()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder penaltyListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.os.StrictMode.OnThreadViolationListener arg1) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#penaltyListener(java.util.concurrent.Executor,android.os.StrictMode$OnThreadViolationListener)");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder penaltyLog() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#penaltyLog()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder permitAll() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#permitAll()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder permitCustomSlowCalls() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#permitCustomSlowCalls()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder permitDiskReads() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#permitDiskReads()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder permitDiskWrites() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#permitDiskWrites()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder permitExplicitGc() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#permitExplicitGc()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder permitNetwork() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#permitNetwork()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder permitResourceMismatches() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#permitResourceMismatches()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.ThreadPolicy.Builder permitUnbufferedIo() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$ThreadPolicy$Builder#permitUnbufferedIo()");
            }

        }
    }
    public static final class VmPolicy {
        private final android.os.StrictMode.VmPolicy real;

        public VmPolicy(android.os.StrictMode.VmPolicy real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy wrap(android.os.StrictMode.VmPolicy real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy(real);
        }

        public android.os.StrictMode.VmPolicy unwrap() {
            return real;
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy#toString()");
        }


        public static final class Builder {
            private final android.os.StrictMode.VmPolicy.Builder real;

            public Builder(android.os.StrictMode.VmPolicy.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder wrap(android.os.StrictMode.VmPolicy.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder(real);
            }

            public android.os.StrictMode.VmPolicy.Builder unwrap() {
                return real;
            }

            public Builder() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#android.os.StrictMode$VmPolicy$Builder()");
            }

            public Builder(com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#android.os.StrictMode$VmPolicy$Builder(android.os.StrictMode$VmPolicy)");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy build() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#build()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectActivityLeaks() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectActivityLeaks()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectAll() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectAll()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectCleartextNetwork() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectCleartextNetwork()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectContentUriWithoutPermission() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectContentUriWithoutPermission()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectCredentialProtectedWhileLocked() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectCredentialProtectedWhileLocked()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectFileUriExposure() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectFileUriExposure()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectImplicitDirectBoot() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectImplicitDirectBoot()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectIncorrectContextUse() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectIncorrectContextUse()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectLeakedClosableObjects() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectLeakedClosableObjects()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectLeakedRegistrationObjects() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectLeakedRegistrationObjects()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectLeakedSqlLiteObjects() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectLeakedSqlLiteObjects()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectNonSdkApiUsage() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectNonSdkApiUsage()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectUnsafeIntentLaunch() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectUnsafeIntentLaunch()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder detectUntaggedSockets() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#detectUntaggedSockets()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder penaltyDeath() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#penaltyDeath()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder penaltyDeathOnCleartextNetwork() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#penaltyDeathOnCleartextNetwork()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder penaltyDeathOnFileUriExposure() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#penaltyDeathOnFileUriExposure()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder penaltyDropBox() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#penaltyDropBox()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder penaltyListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.os.StrictMode.OnVmViolationListener arg1) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#penaltyListener(java.util.concurrent.Executor,android.os.StrictMode$OnVmViolationListener)");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder penaltyLog() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#penaltyLog()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder permitNonSdkApiUsage() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#permitNonSdkApiUsage()");
            }

            public com.micklab.dcg.wrapper.android.os.StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StrictMode$VmPolicy$Builder#permitUnsafeIntentLaunch()");
            }

        }
    }
}
