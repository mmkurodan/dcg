// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class ULocale {
    private final android.icu.util.ULocale real;

    public ULocale(android.icu.util.ULocale real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale wrap(android.icu.util.ULocale real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ULocale(real);
    }

    public android.icu.util.ULocale unwrap() {
        return real;
    }

    public ULocale(java.lang.String arg0) {
        this(new android.icu.util.ULocale(arg0));
    }

    public ULocale(java.lang.String arg0, java.lang.String arg1) {
        this(new android.icu.util.ULocale(arg0, arg1));
    }

    public ULocale(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.icu.util.ULocale(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale acceptLanguage(java.lang.String arg0, boolean[] arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.acceptLanguage(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale acceptLanguage(android.icu.util.ULocale[] arg0, boolean[] arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.acceptLanguage(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale acceptLanguage(java.lang.String arg0, android.icu.util.ULocale[] arg1, boolean[] arg2) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.acceptLanguage(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale acceptLanguage(android.icu.util.ULocale[] arg0, android.icu.util.ULocale[] arg1, boolean[] arg2) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.acceptLanguage(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale addLikelySubtags(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.addLikelySubtags(arg0 == null ? null : arg0.unwrap()));
    }

    public static java.lang.String canonicalize(java.lang.String arg0) {
        return android.icu.util.ULocale.canonicalize(arg0);
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale createCanonical(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.createCanonical(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale createCanonical(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.createCanonical(arg0));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale forLanguageTag(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.forLanguageTag(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale forLocale(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.forLocale(arg0));
    }

    public static android.icu.util.ULocale[] getAvailableLocales() {
        return android.icu.util.ULocale.getAvailableLocales();
    }

    public java.lang.String getBaseName() {
        return real.getBaseName();
    }

    public static java.lang.String getBaseName(java.lang.String arg0) {
        return android.icu.util.ULocale.getBaseName(arg0);
    }

    public java.lang.String getCharacterOrientation() {
        return real.getCharacterOrientation();
    }

    public java.lang.String getCountry() {
        return real.getCountry();
    }

    public static java.lang.String getCountry(java.lang.String arg0) {
        return android.icu.util.ULocale.getCountry(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale getDefault() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.getDefault());
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale getDefault(com.micklab.dcg.wrapper.android.icu.util.ULocale.Category arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.getDefault(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String getDisplayCountry() {
        return real.getDisplayCountry();
    }

    public java.lang.String getDisplayCountry(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getDisplayCountry(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getDisplayCountry(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.util.ULocale.getDisplayCountry(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static java.lang.String getDisplayCountry(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.getDisplayCountry(arg0, arg1);
    }

    public static java.lang.String getDisplayKeyword(java.lang.String arg0) {
        return android.icu.util.ULocale.getDisplayKeyword(arg0);
    }

    public static java.lang.String getDisplayKeyword(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.util.ULocale.getDisplayKeyword(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static java.lang.String getDisplayKeyword(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.getDisplayKeyword(arg0, arg1);
    }

    public java.lang.String getDisplayKeywordValue(java.lang.String arg0) {
        return real.getDisplayKeywordValue(arg0);
    }

    public java.lang.String getDisplayKeywordValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return real.getDisplayKeywordValue(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static java.lang.String getDisplayKeywordValue(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        return android.icu.util.ULocale.getDisplayKeywordValue(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static java.lang.String getDisplayKeywordValue(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return android.icu.util.ULocale.getDisplayKeywordValue(arg0, arg1, arg2);
    }

    public java.lang.String getDisplayLanguage() {
        return real.getDisplayLanguage();
    }

    public java.lang.String getDisplayLanguage(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getDisplayLanguage(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getDisplayLanguage(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.getDisplayLanguage(arg0, arg1);
    }

    public static java.lang.String getDisplayLanguage(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.util.ULocale.getDisplayLanguage(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String getDisplayLanguageWithDialect() {
        return real.getDisplayLanguageWithDialect();
    }

    public java.lang.String getDisplayLanguageWithDialect(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getDisplayLanguageWithDialect(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getDisplayLanguageWithDialect(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.getDisplayLanguageWithDialect(arg0, arg1);
    }

    public static java.lang.String getDisplayLanguageWithDialect(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.util.ULocale.getDisplayLanguageWithDialect(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String getDisplayName() {
        return real.getDisplayName();
    }

    public java.lang.String getDisplayName(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getDisplayName(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getDisplayName(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.getDisplayName(arg0, arg1);
    }

    public static java.lang.String getDisplayName(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.util.ULocale.getDisplayName(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String getDisplayNameWithDialect() {
        return real.getDisplayNameWithDialect();
    }

    public java.lang.String getDisplayNameWithDialect(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getDisplayNameWithDialect(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getDisplayNameWithDialect(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.getDisplayNameWithDialect(arg0, arg1);
    }

    public static java.lang.String getDisplayNameWithDialect(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.util.ULocale.getDisplayNameWithDialect(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String getDisplayScript() {
        return real.getDisplayScript();
    }

    public java.lang.String getDisplayScript(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getDisplayScript(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getDisplayScript(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.util.ULocale.getDisplayScript(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static java.lang.String getDisplayScript(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.getDisplayScript(arg0, arg1);
    }

    public java.lang.String getDisplayVariant() {
        return real.getDisplayVariant();
    }

    public java.lang.String getDisplayVariant(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getDisplayVariant(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getDisplayVariant(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.util.ULocale.getDisplayVariant(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static java.lang.String getDisplayVariant(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.getDisplayVariant(arg0, arg1);
    }

    public java.lang.String getExtension(char arg0) {
        return real.getExtension(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getFallback() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.getFallback());
    }

    public static java.lang.String getFallback(java.lang.String arg0) {
        return android.icu.util.ULocale.getFallback(arg0);
    }

    public java.lang.String getISO3Country() {
        return real.getISO3Country();
    }

    public static java.lang.String getISO3Country(java.lang.String arg0) {
        return android.icu.util.ULocale.getISO3Country(arg0);
    }

    public java.lang.String getISO3Language() {
        return real.getISO3Language();
    }

    public static java.lang.String getISO3Language(java.lang.String arg0) {
        return android.icu.util.ULocale.getISO3Language(arg0);
    }

    public static java.lang.String[] getISOCountries() {
        return android.icu.util.ULocale.getISOCountries();
    }

    public static java.lang.String[] getISOLanguages() {
        return android.icu.util.ULocale.getISOLanguages();
    }

    public java.lang.String getKeywordValue(java.lang.String arg0) {
        return real.getKeywordValue(arg0);
    }

    public static java.lang.String getKeywordValue(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.getKeywordValue(arg0, arg1);
    }

    public java.lang.String getLanguage() {
        return real.getLanguage();
    }

    public static java.lang.String getLanguage(java.lang.String arg0) {
        return android.icu.util.ULocale.getLanguage(arg0);
    }

    public java.lang.String getLineOrientation() {
        return real.getLineOrientation();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public static java.lang.String getName(java.lang.String arg0) {
        return android.icu.util.ULocale.getName(arg0);
    }

    public java.lang.String getScript() {
        return real.getScript();
    }

    public static java.lang.String getScript(java.lang.String arg0) {
        return android.icu.util.ULocale.getScript(arg0);
    }

    public java.lang.String getUnicodeLocaleType(java.lang.String arg0) {
        return real.getUnicodeLocaleType(arg0);
    }

    public java.lang.String getVariant() {
        return real.getVariant();
    }

    public static java.lang.String getVariant(java.lang.String arg0) {
        return android.icu.util.ULocale.getVariant(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isRightToLeft() {
        return real.isRightToLeft();
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale minimizeSubtags(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.minimizeSubtags(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale setKeywordValue(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.setKeywordValue(arg0, arg1));
    }

    public static java.lang.String setKeywordValue(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return android.icu.util.ULocale.setKeywordValue(arg0, arg1, arg2);
    }

    public java.lang.String toLanguageTag() {
        return real.toLanguageTag();
    }

    public static java.lang.String toLegacyKey(java.lang.String arg0) {
        return android.icu.util.ULocale.toLegacyKey(arg0);
    }

    public static java.lang.String toLegacyType(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.toLegacyType(arg0, arg1);
    }

    public java.util.Locale toLocale() {
        return real.toLocale();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static java.lang.String toUnicodeLocaleKey(java.lang.String arg0) {
        return android.icu.util.ULocale.toUnicodeLocaleKey(arg0);
    }

    public static java.lang.String toUnicodeLocaleType(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.ULocale.toUnicodeLocaleType(arg0, arg1);
    }

    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale CANADA = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.CANADA);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale CANADA_FRENCH = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.CANADA_FRENCH);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale CHINA = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.CHINA);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale CHINESE = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.CHINESE);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale ENGLISH = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.ENGLISH);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale FRANCE = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.FRANCE);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale FRENCH = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.FRENCH);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale GERMAN = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.GERMAN);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale GERMANY = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.GERMANY);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale ITALIAN = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.ITALIAN);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale ITALY = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.ITALY);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale JAPAN = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.JAPAN);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale JAPANESE = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.JAPANESE);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale KOREA = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.KOREA);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale KOREAN = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.KOREAN);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale PRC = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.PRC);
    public static final char PRIVATE_USE_EXTENSION = android.icu.util.ULocale.PRIVATE_USE_EXTENSION;
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale ROOT = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.ROOT);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale SIMPLIFIED_CHINESE = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.SIMPLIFIED_CHINESE);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale TAIWAN = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.TAIWAN);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale TRADITIONAL_CHINESE = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.TRADITIONAL_CHINESE);
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale UK = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.UK);
    public static final char UNICODE_LOCALE_EXTENSION = android.icu.util.ULocale.UNICODE_LOCALE_EXTENSION;
    public static final com.micklab.dcg.wrapper.android.icu.util.ULocale US = com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.util.ULocale.US);

    public static final class AvailableType {
        private final android.icu.util.ULocale.AvailableType real;

        public AvailableType(android.icu.util.ULocale.AvailableType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType wrap(android.icu.util.ULocale.AvailableType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType(real);
        }

        public android.icu.util.ULocale.AvailableType unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType.wrap(android.icu.util.ULocale.AvailableType.valueOf(arg0));
        }

        public static android.icu.util.ULocale.AvailableType[] values() {
            return android.icu.util.ULocale.AvailableType.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType DEFAULT = com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType.wrap(android.icu.util.ULocale.AvailableType.DEFAULT);
        public static final com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType ONLY_LEGACY_ALIASES = com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType.wrap(android.icu.util.ULocale.AvailableType.ONLY_LEGACY_ALIASES);
        public static final com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType WITH_LEGACY_ALIASES = com.micklab.dcg.wrapper.android.icu.util.ULocale.AvailableType.wrap(android.icu.util.ULocale.AvailableType.WITH_LEGACY_ALIASES);

    }
    public static final class Builder {
        private final android.icu.util.ULocale.Builder real;

        public Builder(android.icu.util.ULocale.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder wrap(android.icu.util.ULocale.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder(real);
        }

        public android.icu.util.ULocale.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.icu.util.ULocale.Builder());
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder addUnicodeLocaleAttribute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.addUnicodeLocaleAttribute(arg0));
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale build() {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder clear() {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.clear());
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder clearExtensions() {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.clearExtensions());
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder removeUnicodeLocaleAttribute(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.removeUnicodeLocaleAttribute(arg0));
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder setExtension(char arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.setExtension(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder setLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.setLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder setLanguageTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.setLanguageTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder setLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.setLocale(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder setRegion(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.setRegion(arg0));
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder setScript(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.setScript(arg0));
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder setUnicodeLocaleKeyword(java.lang.String arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.setUnicodeLocaleKeyword(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder setVariant(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Builder.wrap(real.setVariant(arg0));
        }

    }
    public static final class Category {
        private final android.icu.util.ULocale.Category real;

        public Category(android.icu.util.ULocale.Category real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.ULocale.Category wrap(android.icu.util.ULocale.Category real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ULocale.Category(real);
        }

        public android.icu.util.ULocale.Category unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.ULocale.Category valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.ULocale.Category.wrap(android.icu.util.ULocale.Category.valueOf(arg0));
        }

        public static android.icu.util.ULocale.Category[] values() {
            return android.icu.util.ULocale.Category.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.util.ULocale.Category DISPLAY = com.micklab.dcg.wrapper.android.icu.util.ULocale.Category.wrap(android.icu.util.ULocale.Category.DISPLAY);
        public static final com.micklab.dcg.wrapper.android.icu.util.ULocale.Category FORMAT = com.micklab.dcg.wrapper.android.icu.util.ULocale.Category.wrap(android.icu.util.ULocale.Category.FORMAT);

    }
}
