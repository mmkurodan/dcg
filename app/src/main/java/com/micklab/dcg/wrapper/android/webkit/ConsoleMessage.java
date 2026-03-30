// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ConsoleMessage {
    private final android.webkit.ConsoleMessage real;

    public ConsoleMessage(android.webkit.ConsoleMessage real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ConsoleMessage wrap(android.webkit.ConsoleMessage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ConsoleMessage(real);
    }

    public android.webkit.ConsoleMessage unwrap() {
        return real;
    }

    public ConsoleMessage(java.lang.String arg0, java.lang.String arg1, int arg2, com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel arg3) {
        this(new android.webkit.ConsoleMessage(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public int lineNumber() {
        return real.lineNumber();
    }

    public java.lang.String message() {
        return real.message();
    }

    public com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel messageLevel() {
        return com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel.wrap(real.messageLevel());
    }

    public java.lang.String sourceId() {
        return real.sourceId();
    }

    public static final class MessageLevel {
        private final android.webkit.ConsoleMessage.MessageLevel real;

        public MessageLevel(android.webkit.ConsoleMessage.MessageLevel real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel wrap(android.webkit.ConsoleMessage.MessageLevel real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel(real);
        }

        public android.webkit.ConsoleMessage.MessageLevel unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel.wrap(android.webkit.ConsoleMessage.MessageLevel.valueOf(arg0));
        }

        public static android.webkit.ConsoleMessage.MessageLevel[] values() {
            return android.webkit.ConsoleMessage.MessageLevel.values();
        }

        public static final com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel DEBUG = com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel.wrap(android.webkit.ConsoleMessage.MessageLevel.DEBUG);
        public static final com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel ERROR = com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel.wrap(android.webkit.ConsoleMessage.MessageLevel.ERROR);
        public static final com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel LOG = com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel.wrap(android.webkit.ConsoleMessage.MessageLevel.LOG);
        public static final com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel TIP = com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel.wrap(android.webkit.ConsoleMessage.MessageLevel.TIP);
        public static final com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel WARNING = com.micklab.dcg.wrapper.android.webkit.ConsoleMessage.MessageLevel.wrap(android.webkit.ConsoleMessage.MessageLevel.WARNING);

    }
}
