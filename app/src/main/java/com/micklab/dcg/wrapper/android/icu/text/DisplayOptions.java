// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DisplayOptions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayOptions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions wrap(android.icu.text.DisplayOptions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayOptions(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.DisplayOptions getReal() {
        return (android.icu.text.DisplayOptions) real;
    }

    public android.icu.text.DisplayOptions unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder builder() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder.wrap(android.icu.text.DisplayOptions.builder());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder copyToBuilder() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder.wrap(((android.icu.text.DisplayOptions) real).copyToBuilder());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization getCapitalization() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization.wrap(((android.icu.text.DisplayOptions) real).getCapitalization());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength getDisplayLength() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength.wrap(((android.icu.text.DisplayOptions) real).getDisplayLength());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase getGrammaticalCase() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(((android.icu.text.DisplayOptions) real).getGrammaticalCase());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle getNameStyle() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle.wrap(((android.icu.text.DisplayOptions) real).getNameStyle());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass getNounClass() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(((android.icu.text.DisplayOptions) real).getNounClass());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory getPluralCategory() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(((android.icu.text.DisplayOptions) real).getPluralCategory());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling getSubstituteHandling() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling.wrap(((android.icu.text.DisplayOptions) real).getSubstituteHandling());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder wrap(android.icu.text.DisplayOptions.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DisplayOptions.Builder getReal() {
            return (android.icu.text.DisplayOptions.Builder) real;
        }

        public android.icu.text.DisplayOptions.Builder unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions build() {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.wrap(((android.icu.text.DisplayOptions.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder setCapitalization(com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder.wrap(((android.icu.text.DisplayOptions.Builder) real).setCapitalization(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder setDisplayLength(com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder.wrap(((android.icu.text.DisplayOptions.Builder) real).setDisplayLength(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder setGrammaticalCase(com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder.wrap(((android.icu.text.DisplayOptions.Builder) real).setGrammaticalCase(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder setNameStyle(com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder.wrap(((android.icu.text.DisplayOptions.Builder) real).setNameStyle(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder setNounClass(com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder.wrap(((android.icu.text.DisplayOptions.Builder) real).setNounClass(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder setPluralCategory(com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder.wrap(((android.icu.text.DisplayOptions.Builder) real).setPluralCategory(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder setSubstituteHandling(com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Builder.wrap(((android.icu.text.DisplayOptions.Builder) real).setSubstituteHandling(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class Capitalization {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Capitalization(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization wrap(android.icu.text.DisplayOptions.Capitalization real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DisplayOptions.Capitalization getReal() {
            return (android.icu.text.DisplayOptions.Capitalization) real;
        }

        public android.icu.text.DisplayOptions.Capitalization unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization.wrap(android.icu.text.DisplayOptions.Capitalization.valueOf(arg0));
        }

        public static android.icu.text.DisplayOptions.Capitalization[] values() {
            return android.icu.text.DisplayOptions.Capitalization.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization BEGINNING_OF_SENTENCE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization.wrap(android.icu.text.DisplayOptions.Capitalization.BEGINNING_OF_SENTENCE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization MIDDLE_OF_SENTENCE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization.wrap(android.icu.text.DisplayOptions.Capitalization.MIDDLE_OF_SENTENCE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization STANDALONE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization.wrap(android.icu.text.DisplayOptions.Capitalization.STANDALONE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization UI_LIST_OR_MENU = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization.wrap(android.icu.text.DisplayOptions.Capitalization.UI_LIST_OR_MENU);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization UNDEFINED = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.Capitalization.wrap(android.icu.text.DisplayOptions.Capitalization.UNDEFINED);

    }
    public static final class DisplayLength {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DisplayLength(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength wrap(android.icu.text.DisplayOptions.DisplayLength real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DisplayOptions.DisplayLength getReal() {
            return (android.icu.text.DisplayOptions.DisplayLength) real;
        }

        public android.icu.text.DisplayOptions.DisplayLength unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength.wrap(android.icu.text.DisplayOptions.DisplayLength.valueOf(arg0));
        }

        public static android.icu.text.DisplayOptions.DisplayLength[] values() {
            return android.icu.text.DisplayOptions.DisplayLength.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength LENGTH_FULL = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength.wrap(android.icu.text.DisplayOptions.DisplayLength.LENGTH_FULL);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength LENGTH_SHORT = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength.wrap(android.icu.text.DisplayOptions.DisplayLength.LENGTH_SHORT);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength UNDEFINED = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.DisplayLength.wrap(android.icu.text.DisplayOptions.DisplayLength.UNDEFINED);

    }
    public static final class GrammaticalCase {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private GrammaticalCase(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase wrap(android.icu.text.DisplayOptions.GrammaticalCase real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DisplayOptions.GrammaticalCase getReal() {
            return (android.icu.text.DisplayOptions.GrammaticalCase) real;
        }

        public android.icu.text.DisplayOptions.GrammaticalCase unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase fromIdentifier(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.fromIdentifier(arg0));
        }

        public java.lang.String getIdentifier() {
            return ((android.icu.text.DisplayOptions.GrammaticalCase) real).getIdentifier();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.valueOf(arg0));
        }

        public static android.icu.text.DisplayOptions.GrammaticalCase[] values() {
            return android.icu.text.DisplayOptions.GrammaticalCase.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase ABLATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.ABLATIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase ACCUSATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.ACCUSATIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase COMITATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.COMITATIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase DATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.DATIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase ERGATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.ERGATIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase GENITIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.GENITIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase INSTRUMENTAL = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.INSTRUMENTAL);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase LOCATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.LOCATIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase LOCATIVE_COPULATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.LOCATIVE_COPULATIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase NOMINATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.NOMINATIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase OBLIQUE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.OBLIQUE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase PREPOSITIONAL = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.PREPOSITIONAL);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase SOCIATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.SOCIATIVE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase UNDEFINED = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.UNDEFINED);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase VOCATIVE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.GrammaticalCase.wrap(android.icu.text.DisplayOptions.GrammaticalCase.VOCATIVE);

    }
    public static final class NameStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NameStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle wrap(android.icu.text.DisplayOptions.NameStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DisplayOptions.NameStyle getReal() {
            return (android.icu.text.DisplayOptions.NameStyle) real;
        }

        public android.icu.text.DisplayOptions.NameStyle unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle.wrap(android.icu.text.DisplayOptions.NameStyle.valueOf(arg0));
        }

        public static android.icu.text.DisplayOptions.NameStyle[] values() {
            return android.icu.text.DisplayOptions.NameStyle.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle DIALECT_NAMES = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle.wrap(android.icu.text.DisplayOptions.NameStyle.DIALECT_NAMES);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle STANDARD_NAMES = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle.wrap(android.icu.text.DisplayOptions.NameStyle.STANDARD_NAMES);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle UNDEFINED = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NameStyle.wrap(android.icu.text.DisplayOptions.NameStyle.UNDEFINED);

    }
    public static final class NounClass {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NounClass(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass wrap(android.icu.text.DisplayOptions.NounClass real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DisplayOptions.NounClass getReal() {
            return (android.icu.text.DisplayOptions.NounClass) real;
        }

        public android.icu.text.DisplayOptions.NounClass unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass fromIdentifier(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.fromIdentifier(arg0));
        }

        public java.lang.String getIdentifier() {
            return ((android.icu.text.DisplayOptions.NounClass) real).getIdentifier();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.valueOf(arg0));
        }

        public static android.icu.text.DisplayOptions.NounClass[] values() {
            return android.icu.text.DisplayOptions.NounClass.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass ANIMATE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.ANIMATE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass COMMON = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.COMMON);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass FEMININE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.FEMININE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass INANIMATE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.INANIMATE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass MASCULINE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.MASCULINE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass NEUTER = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.NEUTER);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass OTHER = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.OTHER);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass PERSONAL = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.PERSONAL);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass UNDEFINED = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(android.icu.text.DisplayOptions.NounClass.UNDEFINED);

    }
    public static final class PluralCategory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PluralCategory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory wrap(android.icu.text.DisplayOptions.PluralCategory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DisplayOptions.PluralCategory getReal() {
            return (android.icu.text.DisplayOptions.PluralCategory) real;
        }

        public android.icu.text.DisplayOptions.PluralCategory unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory fromIdentifier(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(android.icu.text.DisplayOptions.PluralCategory.fromIdentifier(arg0));
        }

        public java.lang.String getIdentifier() {
            return ((android.icu.text.DisplayOptions.PluralCategory) real).getIdentifier();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(android.icu.text.DisplayOptions.PluralCategory.valueOf(arg0));
        }

        public static android.icu.text.DisplayOptions.PluralCategory[] values() {
            return android.icu.text.DisplayOptions.PluralCategory.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory FEW = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(android.icu.text.DisplayOptions.PluralCategory.FEW);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory MANY = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(android.icu.text.DisplayOptions.PluralCategory.MANY);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory ONE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(android.icu.text.DisplayOptions.PluralCategory.ONE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory OTHER = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(android.icu.text.DisplayOptions.PluralCategory.OTHER);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory TWO = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(android.icu.text.DisplayOptions.PluralCategory.TWO);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory UNDEFINED = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(android.icu.text.DisplayOptions.PluralCategory.UNDEFINED);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory ZERO = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.PluralCategory.wrap(android.icu.text.DisplayOptions.PluralCategory.ZERO);

    }
    public static final class SubstituteHandling {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SubstituteHandling(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling wrap(android.icu.text.DisplayOptions.SubstituteHandling real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DisplayOptions.SubstituteHandling getReal() {
            return (android.icu.text.DisplayOptions.SubstituteHandling) real;
        }

        public android.icu.text.DisplayOptions.SubstituteHandling unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling.wrap(android.icu.text.DisplayOptions.SubstituteHandling.valueOf(arg0));
        }

        public static android.icu.text.DisplayOptions.SubstituteHandling[] values() {
            return android.icu.text.DisplayOptions.SubstituteHandling.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling NO_SUBSTITUTE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling.wrap(android.icu.text.DisplayOptions.SubstituteHandling.NO_SUBSTITUTE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling SUBSTITUTE = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling.wrap(android.icu.text.DisplayOptions.SubstituteHandling.SUBSTITUTE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling UNDEFINED = com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.SubstituteHandling.wrap(android.icu.text.DisplayOptions.SubstituteHandling.UNDEFINED);

    }
}
