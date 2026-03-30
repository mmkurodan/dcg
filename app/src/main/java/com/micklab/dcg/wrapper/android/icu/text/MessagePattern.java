// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class MessagePattern {
    private final android.icu.text.MessagePattern real;

    public MessagePattern(android.icu.text.MessagePattern real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern wrap(android.icu.text.MessagePattern real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern(real);
    }

    public android.icu.text.MessagePattern unwrap() {
        return real;
    }

    public MessagePattern() {
        this(new android.icu.text.MessagePattern());
    }

    public MessagePattern(java.lang.String arg0) {
        this(new android.icu.text.MessagePattern(arg0));
    }

    public MessagePattern(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode arg0) {
        this(new android.icu.text.MessagePattern(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String autoQuoteApostropheDeep() {
        return real.autoQuoteApostropheDeep();
    }

    public void clear() {
        real.clear();
    }

    public void clearPatternAndSetApostropheMode(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode arg0) {
        real.clearPatternAndSetApostropheMode(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(real.cloneAsThawed());
    }

    public int countParts() {
        return real.countParts();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(real.freeze());
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode getApostropheMode() {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode.wrap(real.getApostropheMode());
    }

    public int getLimitPartIndex(int arg0) {
        return real.getLimitPartIndex(arg0);
    }

    public double getNumericValue(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part arg0) {
        return real.getNumericValue(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part getPart(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.wrap(real.getPart(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type getPartType(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(real.getPartType(arg0));
    }

    public int getPatternIndex(int arg0) {
        return real.getPatternIndex(arg0);
    }

    public java.lang.String getPatternString() {
        return real.getPatternString();
    }

    public double getPluralOffset(int arg0) {
        return real.getPluralOffset(arg0);
    }

    public java.lang.String getSubstring(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part arg0) {
        return real.getSubstring(arg0 == null ? null : arg0.unwrap());
    }

    public boolean hasNamedArguments() {
        return real.hasNamedArguments();
    }

    public boolean hasNumberedArguments() {
        return real.hasNumberedArguments();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isFrozen() {
        return real.isFrozen();
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern parse(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(real.parse(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern parseChoiceStyle(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(real.parseChoiceStyle(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern parsePluralStyle(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(real.parsePluralStyle(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern parseSelectStyle(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(real.parseSelectStyle(arg0));
    }

    public boolean partSubstringMatches(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part arg0, java.lang.String arg1) {
        return real.partSubstringMatches(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static int validateArgumentName(java.lang.String arg0) {
        return android.icu.text.MessagePattern.validateArgumentName(arg0);
    }

    public static final int ARG_NAME_NOT_NUMBER = android.icu.text.MessagePattern.ARG_NAME_NOT_NUMBER;
    public static final int ARG_NAME_NOT_VALID = android.icu.text.MessagePattern.ARG_NAME_NOT_VALID;
    public static final double NO_NUMERIC_VALUE = android.icu.text.MessagePattern.NO_NUMERIC_VALUE;

    public static final class ApostropheMode {
        private final android.icu.text.MessagePattern.ApostropheMode real;

        public ApostropheMode(android.icu.text.MessagePattern.ApostropheMode real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode wrap(android.icu.text.MessagePattern.ApostropheMode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode(real);
        }

        public android.icu.text.MessagePattern.ApostropheMode unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode.wrap(android.icu.text.MessagePattern.ApostropheMode.valueOf(arg0));
        }

        public static android.icu.text.MessagePattern.ApostropheMode[] values() {
            return android.icu.text.MessagePattern.ApostropheMode.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode DOUBLE_OPTIONAL = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode.wrap(android.icu.text.MessagePattern.ApostropheMode.DOUBLE_OPTIONAL);
        public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode DOUBLE_REQUIRED = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode.wrap(android.icu.text.MessagePattern.ApostropheMode.DOUBLE_REQUIRED);

    }
    public static final class ArgType {
        private final android.icu.text.MessagePattern.ArgType real;

        public ArgType(android.icu.text.MessagePattern.ArgType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType wrap(android.icu.text.MessagePattern.ArgType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType(real);
        }

        public android.icu.text.MessagePattern.ArgType unwrap() {
            return real;
        }

        public boolean hasPluralStyle() {
            return real.hasPluralStyle();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType.wrap(android.icu.text.MessagePattern.ArgType.valueOf(arg0));
        }

        public static android.icu.text.MessagePattern.ArgType[] values() {
            return android.icu.text.MessagePattern.ArgType.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType CHOICE = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType.wrap(android.icu.text.MessagePattern.ArgType.CHOICE);
        public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType NONE = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType.wrap(android.icu.text.MessagePattern.ArgType.NONE);
        public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType PLURAL = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType.wrap(android.icu.text.MessagePattern.ArgType.PLURAL);
        public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType SELECT = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType.wrap(android.icu.text.MessagePattern.ArgType.SELECT);
        public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType SELECTORDINAL = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType.wrap(android.icu.text.MessagePattern.ArgType.SELECTORDINAL);
        public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType SIMPLE = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType.wrap(android.icu.text.MessagePattern.ArgType.SIMPLE);

    }
    public static final class Part {
        private final android.icu.text.MessagePattern.Part real;

        public Part(android.icu.text.MessagePattern.Part real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part wrap(android.icu.text.MessagePattern.Part real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part(real);
        }

        public android.icu.text.MessagePattern.Part unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType getArgType() {
            return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType.wrap(real.getArgType());
        }

        public int getIndex() {
            return real.getIndex();
        }

        public int getLength() {
            return real.getLength();
        }

        public int getLimit() {
            return real.getLimit();
        }

        public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type getType() {
            return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(real.getType());
        }

        public int getValue() {
            return real.getValue();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public static final class Type {
            private final android.icu.text.MessagePattern.Part.Type real;

            public Type(android.icu.text.MessagePattern.Part.Type real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type wrap(android.icu.text.MessagePattern.Part.Type real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type(real);
            }

            public android.icu.text.MessagePattern.Part.Type unwrap() {
                return real;
            }

            public boolean hasNumericValue() {
                return real.hasNumericValue();
            }

            public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type valueOf(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.valueOf(arg0));
            }

            public static android.icu.text.MessagePattern.Part.Type[] values() {
                return android.icu.text.MessagePattern.Part.Type.values();
            }

            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type ARG_DOUBLE = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.ARG_DOUBLE);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type ARG_INT = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.ARG_INT);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type ARG_LIMIT = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.ARG_LIMIT);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type ARG_NAME = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.ARG_NAME);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type ARG_NUMBER = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.ARG_NUMBER);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type ARG_SELECTOR = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.ARG_SELECTOR);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type ARG_START = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.ARG_START);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type ARG_STYLE = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.ARG_STYLE);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type ARG_TYPE = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.ARG_TYPE);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type INSERT_CHAR = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.INSERT_CHAR);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type MSG_LIMIT = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.MSG_LIMIT);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type MSG_START = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.MSG_START);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type REPLACE_NUMBER = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.REPLACE_NUMBER);
            public static final com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type SKIP_SYNTAX = com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(android.icu.text.MessagePattern.Part.Type.SKIP_SYNTAX);

        }
    }
}
