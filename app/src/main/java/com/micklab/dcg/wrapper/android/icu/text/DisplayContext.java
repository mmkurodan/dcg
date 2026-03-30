// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DisplayContext {
    private final android.icu.text.DisplayContext real;

    public DisplayContext(android.icu.text.DisplayContext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DisplayContext wrap(android.icu.text.DisplayContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayContext(real);
    }

    public android.icu.text.DisplayContext unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type type() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type.wrap(real.type());
    }

    public int value() {
        return real.value();
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
        private final android.icu.text.DisplayContext.Type real;

        public Type(android.icu.text.DisplayContext.Type real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type wrap(android.icu.text.DisplayContext.Type real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type(real);
        }

        public android.icu.text.DisplayContext.Type unwrap() {
            return real;
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
