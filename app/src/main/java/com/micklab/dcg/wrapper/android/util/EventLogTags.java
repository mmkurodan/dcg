// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class EventLogTags {
    private final android.util.EventLogTags real;

    public EventLogTags(android.util.EventLogTags real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.EventLogTags wrap(android.util.EventLogTags real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.EventLogTags(real);
    }

    public android.util.EventLogTags unwrap() {
        return real;
    }

    public EventLogTags() throws java.io.IOException {
        this(new android.util.EventLogTags());
    }

    public EventLogTags(java.io.BufferedReader arg0) throws java.io.IOException {
        this(new android.util.EventLogTags(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.EventLogTags.Description get(int arg0) {
        return com.micklab.dcg.wrapper.android.util.EventLogTags.Description.wrap(real.get(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.EventLogTags.Description get(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.util.EventLogTags.Description.wrap(real.get(arg0));
    }

    public static final class Description {
        private final android.util.EventLogTags.Description real;

        public Description(android.util.EventLogTags.Description real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.util.EventLogTags.Description wrap(android.util.EventLogTags.Description real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.util.EventLogTags.Description(real);
        }

        public android.util.EventLogTags.Description unwrap() {
            return real;
        }


    }
}
