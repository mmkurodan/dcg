// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class MessagePattern {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MessagePattern(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern wrap(android.icu.text.MessagePattern real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.MessagePattern getReal() {
        return (android.icu.text.MessagePattern) real;
    }

    public android.icu.text.MessagePattern unwrap() {
        return getReal();
    }

    public MessagePattern() {
        this(new android.icu.text.MessagePattern(), (__DcgwBridgeToken) null);
    }

    public MessagePattern(java.lang.String arg0) {
        this(new android.icu.text.MessagePattern(arg0), (__DcgwBridgeToken) null);
    }

    public MessagePattern(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode arg0) {
        this(new android.icu.text.MessagePattern(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.String autoQuoteApostropheDeep() {
        return ((android.icu.text.MessagePattern) real).autoQuoteApostropheDeep();
    }

    public void clear() {
        ((android.icu.text.MessagePattern) real).clear();
    }

    public void clearPatternAndSetApostropheMode(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode arg0) {
        ((android.icu.text.MessagePattern) real).clearPatternAndSetApostropheMode(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.Object clone() {
        return ((android.icu.text.MessagePattern) real).clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(((android.icu.text.MessagePattern) real).cloneAsThawed());
    }

    public int countParts() {
        return ((android.icu.text.MessagePattern) real).countParts();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.MessagePattern) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(((android.icu.text.MessagePattern) real).freeze());
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode getApostropheMode() {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode.wrap(((android.icu.text.MessagePattern) real).getApostropheMode());
    }

    public int getLimitPartIndex(int arg0) {
        return ((android.icu.text.MessagePattern) real).getLimitPartIndex(arg0);
    }

    public double getNumericValue(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part arg0) {
        return ((android.icu.text.MessagePattern) real).getNumericValue(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part getPart(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.wrap(((android.icu.text.MessagePattern) real).getPart(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type getPartType(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(((android.icu.text.MessagePattern) real).getPartType(arg0));
    }

    public int getPatternIndex(int arg0) {
        return ((android.icu.text.MessagePattern) real).getPatternIndex(arg0);
    }

    public java.lang.String getPatternString() {
        return ((android.icu.text.MessagePattern) real).getPatternString();
    }

    public double getPluralOffset(int arg0) {
        return ((android.icu.text.MessagePattern) real).getPluralOffset(arg0);
    }

    public java.lang.String getSubstring(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part arg0) {
        return ((android.icu.text.MessagePattern) real).getSubstring(arg0 == null ? null : arg0.getReal());
    }

    public boolean hasNamedArguments() {
        return ((android.icu.text.MessagePattern) real).hasNamedArguments();
    }

    public boolean hasNumberedArguments() {
        return ((android.icu.text.MessagePattern) real).hasNumberedArguments();
    }

    public int hashCode() {
        return ((android.icu.text.MessagePattern) real).hashCode();
    }

    public boolean isFrozen() {
        return ((android.icu.text.MessagePattern) real).isFrozen();
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern parse(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(((android.icu.text.MessagePattern) real).parse(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern parseChoiceStyle(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(((android.icu.text.MessagePattern) real).parseChoiceStyle(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern parsePluralStyle(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(((android.icu.text.MessagePattern) real).parsePluralStyle(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern parseSelectStyle(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.wrap(((android.icu.text.MessagePattern) real).parseSelectStyle(arg0));
    }

    public boolean partSubstringMatches(com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part arg0, java.lang.String arg1) {
        return ((android.icu.text.MessagePattern) real).partSubstringMatches(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.String toString() {
        return ((android.icu.text.MessagePattern) real).toString();
    }

    public static int validateArgumentName(java.lang.String arg0) {
        return android.icu.text.MessagePattern.validateArgumentName(arg0);
    }

    public static final int ARG_NAME_NOT_NUMBER = android.icu.text.MessagePattern.ARG_NAME_NOT_NUMBER;
    public static final int ARG_NAME_NOT_VALID = android.icu.text.MessagePattern.ARG_NAME_NOT_VALID;
    public static final double NO_NUMERIC_VALUE = android.icu.text.MessagePattern.NO_NUMERIC_VALUE;

    public static final class ApostropheMode {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ApostropheMode(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode wrap(android.icu.text.MessagePattern.ApostropheMode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.MessagePattern.ApostropheMode getReal() {
            return (android.icu.text.MessagePattern.ApostropheMode) real;
        }

        public android.icu.text.MessagePattern.ApostropheMode unwrap() {
            return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ArgType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType wrap(android.icu.text.MessagePattern.ArgType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.MessagePattern.ArgType getReal() {
            return (android.icu.text.MessagePattern.ArgType) real;
        }

        public android.icu.text.MessagePattern.ArgType unwrap() {
            return getReal();
        }

        public boolean hasPluralStyle() {
            return ((android.icu.text.MessagePattern.ArgType) real).hasPluralStyle();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Part(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part wrap(android.icu.text.MessagePattern.Part real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.MessagePattern.Part getReal() {
            return (android.icu.text.MessagePattern.Part) real;
        }

        public android.icu.text.MessagePattern.Part unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.icu.text.MessagePattern.Part) real).equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType getArgType() {
            return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ArgType.wrap(((android.icu.text.MessagePattern.Part) real).getArgType());
        }

        public int getIndex() {
            return ((android.icu.text.MessagePattern.Part) real).getIndex();
        }

        public int getLength() {
            return ((android.icu.text.MessagePattern.Part) real).getLength();
        }

        public int getLimit() {
            return ((android.icu.text.MessagePattern.Part) real).getLimit();
        }

        public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type getType() {
            return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type.wrap(((android.icu.text.MessagePattern.Part) real).getType());
        }

        public int getValue() {
            return ((android.icu.text.MessagePattern.Part) real).getValue();
        }

        public int hashCode() {
            return ((android.icu.text.MessagePattern.Part) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.icu.text.MessagePattern.Part) real).toString();
        }

        public static final class Type {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Type(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type wrap(android.icu.text.MessagePattern.Part.Type real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessagePattern.Part.Type(real, (__DcgwBridgeToken) null);
            }

            public android.icu.text.MessagePattern.Part.Type getReal() {
                return (android.icu.text.MessagePattern.Part.Type) real;
            }

            public android.icu.text.MessagePattern.Part.Type unwrap() {
                return getReal();
            }

            public boolean hasNumericValue() {
                return ((android.icu.text.MessagePattern.Part.Type) real).hasNumericValue();
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
