// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class BreakIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BreakIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator wrap(android.icu.text.BreakIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.BreakIterator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.BreakIterator getReal() {
        return (android.icu.text.BreakIterator) real;
    }

    public android.icu.text.BreakIterator unwrap() {
        return getReal();
    }

    public java.lang.Object clone() {
        return ((android.icu.text.BreakIterator) real).clone();
    }

    public int current() {
        return ((android.icu.text.BreakIterator) real).current();
    }

    public int first() {
        return ((android.icu.text.BreakIterator) real).first();
    }

    public int following(int arg0) {
        return ((android.icu.text.BreakIterator) real).following(arg0);
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.text.BreakIterator.getAvailableLocales();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getCharacterInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getCharacterInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getCharacterInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getCharacterInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getCharacterInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getCharacterInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getLineInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getLineInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getLineInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getLineInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getLineInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getLineInstance(arg0));
    }

    public int getRuleStatus() {
        return ((android.icu.text.BreakIterator) real).getRuleStatus();
    }

    public int getRuleStatusVec(int[] arg0) {
        return ((android.icu.text.BreakIterator) real).getRuleStatusVec(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getSentenceInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getSentenceInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getSentenceInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getSentenceInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getSentenceInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getSentenceInstance(arg0 == null ? null : arg0.getReal()));
    }

    public java.text.CharacterIterator getText() {
        return ((android.icu.text.BreakIterator) real).getText();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getTitleInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getTitleInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getTitleInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getTitleInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getTitleInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getTitleInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getWordInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getWordInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getWordInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getWordInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BreakIterator getWordInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(android.icu.text.BreakIterator.getWordInstance(arg0));
    }

    public boolean isBoundary(int arg0) {
        return ((android.icu.text.BreakIterator) real).isBoundary(arg0);
    }

    public int last() {
        return ((android.icu.text.BreakIterator) real).last();
    }

    public int next() {
        return ((android.icu.text.BreakIterator) real).next();
    }

    public int next(int arg0) {
        return ((android.icu.text.BreakIterator) real).next(arg0);
    }

    public int preceding(int arg0) {
        return ((android.icu.text.BreakIterator) real).preceding(arg0);
    }

    public int previous() {
        return ((android.icu.text.BreakIterator) real).previous();
    }

    public void setText(java.lang.String arg0) {
        ((android.icu.text.BreakIterator) real).setText(arg0);
    }

    public void setText(java.lang.CharSequence arg0) {
        ((android.icu.text.BreakIterator) real).setText(arg0);
    }

    public void setText(java.text.CharacterIterator arg0) {
        ((android.icu.text.BreakIterator) real).setText(arg0);
    }

    public static final int DONE = android.icu.text.BreakIterator.DONE;
    public static final int KIND_CHARACTER = android.icu.text.BreakIterator.KIND_CHARACTER;
    public static final int KIND_LINE = android.icu.text.BreakIterator.KIND_LINE;
    public static final int KIND_SENTENCE = android.icu.text.BreakIterator.KIND_SENTENCE;
    public static final int KIND_TITLE = android.icu.text.BreakIterator.KIND_TITLE;
    public static final int KIND_WORD = android.icu.text.BreakIterator.KIND_WORD;
    public static final int WORD_IDEO = android.icu.text.BreakIterator.WORD_IDEO;
    public static final int WORD_IDEO_LIMIT = android.icu.text.BreakIterator.WORD_IDEO_LIMIT;
    public static final int WORD_KANA = android.icu.text.BreakIterator.WORD_KANA;
    public static final int WORD_KANA_LIMIT = android.icu.text.BreakIterator.WORD_KANA_LIMIT;
    public static final int WORD_LETTER = android.icu.text.BreakIterator.WORD_LETTER;
    public static final int WORD_LETTER_LIMIT = android.icu.text.BreakIterator.WORD_LETTER_LIMIT;
    public static final int WORD_NONE = android.icu.text.BreakIterator.WORD_NONE;
    public static final int WORD_NONE_LIMIT = android.icu.text.BreakIterator.WORD_NONE_LIMIT;
    public static final int WORD_NUMBER = android.icu.text.BreakIterator.WORD_NUMBER;
    public static final int WORD_NUMBER_LIMIT = android.icu.text.BreakIterator.WORD_NUMBER_LIMIT;

}
