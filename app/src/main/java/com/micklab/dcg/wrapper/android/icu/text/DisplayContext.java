// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DisplayContext {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayContext(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DisplayContext wrap(android.icu.text.DisplayContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayContext(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.DisplayContext getReal() {
        return (android.icu.text.DisplayContext) real;
    }

    public android.icu.text.DisplayContext unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type type() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type.wrap(((android.icu.text.DisplayContext) real).type());
    }

    public int value() {
        return ((android.icu.text.DisplayContext) real).value();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DisplayContext valueOf(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.valueOf(arg0));
    }

    public static android.icu.text.DisplayContext[] values() {
        return android.icu.text.DisplayContext.values();
    }

    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext CAPITALIZATION_FOR_STANDALONE = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext CAPITALIZATION_FOR_UI_LIST_OR_MENU = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext CAPITALIZATION_NONE = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.CAPITALIZATION_NONE);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext DIALECT_NAMES = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.DIALECT_NAMES);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext LENGTH_FULL = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.LENGTH_FULL);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext LENGTH_SHORT = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.LENGTH_SHORT);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext NO_SUBSTITUTE = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.NO_SUBSTITUTE);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext STANDARD_NAMES = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.STANDARD_NAMES);
    public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext SUBSTITUTE = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(android.icu.text.DisplayContext.SUBSTITUTE);

    public static final class Type {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Type(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type wrap(android.icu.text.DisplayContext.Type real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DisplayContext.Type getReal() {
            return (android.icu.text.DisplayContext.Type) real;
        }

        public android.icu.text.DisplayContext.Type unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type.wrap(android.icu.text.DisplayContext.Type.valueOf(arg0));
        }

        public static android.icu.text.DisplayContext.Type[] values() {
            return android.icu.text.DisplayContext.Type.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type CAPITALIZATION = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type.wrap(android.icu.text.DisplayContext.Type.CAPITALIZATION);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type DIALECT_HANDLING = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type.wrap(android.icu.text.DisplayContext.Type.DIALECT_HANDLING);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type DISPLAY_LENGTH = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type.wrap(android.icu.text.DisplayContext.Type.DISPLAY_LENGTH);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type SUBSTITUTE_HANDLING = com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type.wrap(android.icu.text.DisplayContext.Type.SUBSTITUTE_HANDLING);

    }
}
