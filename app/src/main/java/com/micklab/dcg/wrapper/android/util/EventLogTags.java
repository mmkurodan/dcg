// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class EventLogTags {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EventLogTags(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.EventLogTags wrap(android.util.EventLogTags real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.EventLogTags(real, (__DcgwBridgeToken) null);
    }

    public android.util.EventLogTags getReal() {
        return (android.util.EventLogTags) real;
    }

    public android.util.EventLogTags unwrap() {
        return getReal();
    }

    public EventLogTags() throws java.io.IOException {
        this(new android.util.EventLogTags(), (__DcgwBridgeToken) null);
    }

    public EventLogTags(java.io.BufferedReader arg0) throws java.io.IOException {
        this(new android.util.EventLogTags(arg0), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.util.EventLogTags.Description get(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.util.EventLogTags.Description.wrap(((android.util.EventLogTags) real).get(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.EventLogTags.Description get(int arg0) {
        return com.micklab.dcg.wrapper.android.util.EventLogTags.Description.wrap(((android.util.EventLogTags) real).get(arg0));
    }

    public static final class Description {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Description(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.util.EventLogTags.Description wrap(android.util.EventLogTags.Description real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.util.EventLogTags.Description(real, (__DcgwBridgeToken) null);
        }

        public android.util.EventLogTags.Description getReal() {
            return (android.util.EventLogTags.Description) real;
        }

        public android.util.EventLogTags.Description unwrap() {
            return getReal();
        }


    }
}
