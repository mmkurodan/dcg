// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ProfilingTrigger {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProfilingTrigger(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ProfilingTrigger wrap(android.os.ProfilingTrigger real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ProfilingTrigger(real, (__DcgwBridgeToken) null);
    }

    public android.os.ProfilingTrigger getReal() {
        return (android.os.ProfilingTrigger) real;
    }

    public android.os.ProfilingTrigger unwrap() {
        return getReal();
    }

    public int getRateLimitingPeriodHours() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingTrigger#getRateLimitingPeriodHours()");
    }

    public int getTriggerType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingTrigger#getTriggerType()");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.ProfilingTrigger.Builder wrap(android.os.ProfilingTrigger.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.ProfilingTrigger.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.os.ProfilingTrigger.Builder getReal() {
            return (android.os.ProfilingTrigger.Builder) real;
        }

        public android.os.ProfilingTrigger.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingTrigger$Builder#android.os.ProfilingTrigger$Builder(int)");
        }

        public com.micklab.dcg.wrapper.android.os.ProfilingTrigger build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingTrigger$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.os.ProfilingTrigger.Builder setRateLimitingPeriodHours(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingTrigger$Builder#setRateLimitingPeriodHours(int)");
        }

    }
}
