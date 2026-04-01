// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Bidi {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Bidi(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Bidi wrap(android.icu.text.Bidi real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Bidi(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.Bidi getReal() {
        return (android.icu.text.Bidi) real;
    }

    public android.icu.text.Bidi unwrap() {
        return getReal();
    }

    public Bidi() {
        this(new android.icu.text.Bidi(), (__DcgwBridgeToken) null);
    }

    public Bidi(java.text.AttributedCharacterIterator arg0) {
        this(new android.icu.text.Bidi(arg0), (__DcgwBridgeToken) null);
    }

    public Bidi(java.lang.String arg0, int arg1) {
        this(new android.icu.text.Bidi(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public Bidi(int arg0, int arg1) {
        this(new android.icu.text.Bidi(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public Bidi(char[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.text.Bidi(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public boolean baseIsLeftToRight() {
        return ((android.icu.text.Bidi) real).baseIsLeftToRight();
    }

    public int countParagraphs() {
        return ((android.icu.text.Bidi) real).countParagraphs();
    }

    public int countRuns() {
        return ((android.icu.text.Bidi) real).countRuns();
    }

    public com.micklab.dcg.wrapper.android.icu.text.Bidi createLineBidi(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.Bidi.wrap(((android.icu.text.Bidi) real).createLineBidi(arg0, arg1));
    }

    public static byte getBaseDirection(java.lang.CharSequence arg0) {
        return android.icu.text.Bidi.getBaseDirection(arg0);
    }

    public int getBaseLevel() {
        return ((android.icu.text.Bidi) real).getBaseLevel();
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiClassifier getCustomClassifier() {
        return com.micklab.dcg.wrapper.android.icu.text.BidiClassifier.wrap(((android.icu.text.Bidi) real).getCustomClassifier());
    }

    public int getCustomizedClass(int arg0) {
        return ((android.icu.text.Bidi) real).getCustomizedClass(arg0);
    }

    public byte getDirection() {
        return ((android.icu.text.Bidi) real).getDirection();
    }

    public int getLength() {
        return ((android.icu.text.Bidi) real).getLength();
    }

    public byte getLevelAt(int arg0) {
        return ((android.icu.text.Bidi) real).getLevelAt(arg0);
    }

    public byte[] getLevels() {
        return ((android.icu.text.Bidi) real).getLevels();
    }

    public int getLogicalIndex(int arg0) {
        return ((android.icu.text.Bidi) real).getLogicalIndex(arg0);
    }

    public int[] getLogicalMap() {
        return ((android.icu.text.Bidi) real).getLogicalMap();
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiRun getLogicalRun(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BidiRun.wrap(((android.icu.text.Bidi) real).getLogicalRun(arg0));
    }

    public byte getParaLevel() {
        return ((android.icu.text.Bidi) real).getParaLevel();
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiRun getParagraph(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BidiRun.wrap(((android.icu.text.Bidi) real).getParagraph(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiRun getParagraphByIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BidiRun.wrap(((android.icu.text.Bidi) real).getParagraphByIndex(arg0));
    }

    public int getParagraphIndex(int arg0) {
        return ((android.icu.text.Bidi) real).getParagraphIndex(arg0);
    }

    public int getProcessedLength() {
        return ((android.icu.text.Bidi) real).getProcessedLength();
    }

    public int getReorderingMode() {
        return ((android.icu.text.Bidi) real).getReorderingMode();
    }

    public int getReorderingOptions() {
        return ((android.icu.text.Bidi) real).getReorderingOptions();
    }

    public int getResultLength() {
        return ((android.icu.text.Bidi) real).getResultLength();
    }

    public int getRunCount() {
        return ((android.icu.text.Bidi) real).getRunCount();
    }

    public int getRunLevel(int arg0) {
        return ((android.icu.text.Bidi) real).getRunLevel(arg0);
    }

    public int getRunLimit(int arg0) {
        return ((android.icu.text.Bidi) real).getRunLimit(arg0);
    }

    public int getRunStart(int arg0) {
        return ((android.icu.text.Bidi) real).getRunStart(arg0);
    }

    public char[] getText() {
        return ((android.icu.text.Bidi) real).getText();
    }

    public java.lang.String getTextAsString() {
        return ((android.icu.text.Bidi) real).getTextAsString();
    }

    public int getVisualIndex(int arg0) {
        return ((android.icu.text.Bidi) real).getVisualIndex(arg0);
    }

    public int[] getVisualMap() {
        return ((android.icu.text.Bidi) real).getVisualMap();
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiRun getVisualRun(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BidiRun.wrap(((android.icu.text.Bidi) real).getVisualRun(arg0));
    }

    public static int[] invertMap(int[] arg0) {
        return android.icu.text.Bidi.invertMap(arg0);
    }

    public boolean isInverse() {
        return ((android.icu.text.Bidi) real).isInverse();
    }

    public boolean isLeftToRight() {
        return ((android.icu.text.Bidi) real).isLeftToRight();
    }

    public boolean isMixed() {
        return ((android.icu.text.Bidi) real).isMixed();
    }

    public boolean isOrderParagraphsLTR() {
        return ((android.icu.text.Bidi) real).isOrderParagraphsLTR();
    }

    public boolean isRightToLeft() {
        return ((android.icu.text.Bidi) real).isRightToLeft();
    }

    public void orderParagraphsLTR(boolean arg0) {
        ((android.icu.text.Bidi) real).orderParagraphsLTR(arg0);
    }

    public static int[] reorderLogical(byte[] arg0) {
        return android.icu.text.Bidi.reorderLogical(arg0);
    }

    public static int[] reorderVisual(byte[] arg0) {
        return android.icu.text.Bidi.reorderVisual(arg0);
    }

    public static void reorderVisually(byte[] arg0, int arg1, java.lang.Object[] arg2, int arg3, int arg4) {
        android.icu.text.Bidi.reorderVisually(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean requiresBidi(char[] arg0, int arg1, int arg2) {
        return android.icu.text.Bidi.requiresBidi(arg0, arg1, arg2);
    }

    public void setContext(java.lang.String arg0, java.lang.String arg1) {
        ((android.icu.text.Bidi) real).setContext(arg0, arg1);
    }

    public void setCustomClassifier(com.micklab.dcg.wrapper.android.icu.text.BidiClassifier arg0) {
        ((android.icu.text.Bidi) real).setCustomClassifier(arg0 == null ? null : arg0.getReal());
    }

    public void setInverse(boolean arg0) {
        ((android.icu.text.Bidi) real).setInverse(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Bidi setLine(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.Bidi.wrap(((android.icu.text.Bidi) real).setLine(arg0, arg1));
    }

    public void setPara(java.text.AttributedCharacterIterator arg0) {
        ((android.icu.text.Bidi) real).setPara(arg0);
    }

    public void setPara(char[] arg0, byte arg1, byte[] arg2) {
        ((android.icu.text.Bidi) real).setPara(arg0, arg1, arg2);
    }

    public void setPara(java.lang.String arg0, byte arg1, byte[] arg2) {
        ((android.icu.text.Bidi) real).setPara(arg0, arg1, arg2);
    }

    public void setReorderingMode(int arg0) {
        ((android.icu.text.Bidi) real).setReorderingMode(arg0);
    }

    public void setReorderingOptions(int arg0) {
        ((android.icu.text.Bidi) real).setReorderingOptions(arg0);
    }

    public java.lang.String writeReordered(int arg0) {
        return ((android.icu.text.Bidi) real).writeReordered(arg0);
    }

    public static java.lang.String writeReverse(java.lang.String arg0, int arg1) {
        return android.icu.text.Bidi.writeReverse(arg0, arg1);
    }

    public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = android.icu.text.Bidi.DIRECTION_DEFAULT_LEFT_TO_RIGHT;
    public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = android.icu.text.Bidi.DIRECTION_DEFAULT_RIGHT_TO_LEFT;
    public static final int DIRECTION_LEFT_TO_RIGHT = android.icu.text.Bidi.DIRECTION_LEFT_TO_RIGHT;
    public static final int DIRECTION_RIGHT_TO_LEFT = android.icu.text.Bidi.DIRECTION_RIGHT_TO_LEFT;
    public static final short DO_MIRRORING = android.icu.text.Bidi.DO_MIRRORING;
    public static final short INSERT_LRM_FOR_NUMERIC = android.icu.text.Bidi.INSERT_LRM_FOR_NUMERIC;
    public static final short KEEP_BASE_COMBINING = android.icu.text.Bidi.KEEP_BASE_COMBINING;
    public static final byte LEVEL_DEFAULT_LTR = android.icu.text.Bidi.LEVEL_DEFAULT_LTR;
    public static final byte LEVEL_DEFAULT_RTL = android.icu.text.Bidi.LEVEL_DEFAULT_RTL;
    public static final byte LEVEL_OVERRIDE = android.icu.text.Bidi.LEVEL_OVERRIDE;
    public static final byte LTR = android.icu.text.Bidi.LTR;
    public static final int MAP_NOWHERE = android.icu.text.Bidi.MAP_NOWHERE;
    public static final byte MAX_EXPLICIT_LEVEL = android.icu.text.Bidi.MAX_EXPLICIT_LEVEL;
    public static final byte MIXED = android.icu.text.Bidi.MIXED;
    public static final byte NEUTRAL = android.icu.text.Bidi.NEUTRAL;
    public static final int OPTION_DEFAULT = android.icu.text.Bidi.OPTION_DEFAULT;
    public static final int OPTION_INSERT_MARKS = android.icu.text.Bidi.OPTION_INSERT_MARKS;
    public static final int OPTION_REMOVE_CONTROLS = android.icu.text.Bidi.OPTION_REMOVE_CONTROLS;
    public static final int OPTION_STREAMING = android.icu.text.Bidi.OPTION_STREAMING;
    public static final short OUTPUT_REVERSE = android.icu.text.Bidi.OUTPUT_REVERSE;
    public static final short REMOVE_BIDI_CONTROLS = android.icu.text.Bidi.REMOVE_BIDI_CONTROLS;
    public static final short REORDER_DEFAULT = android.icu.text.Bidi.REORDER_DEFAULT;
    public static final short REORDER_GROUP_NUMBERS_WITH_R = android.icu.text.Bidi.REORDER_GROUP_NUMBERS_WITH_R;
    public static final short REORDER_INVERSE_FOR_NUMBERS_SPECIAL = android.icu.text.Bidi.REORDER_INVERSE_FOR_NUMBERS_SPECIAL;
    public static final short REORDER_INVERSE_LIKE_DIRECT = android.icu.text.Bidi.REORDER_INVERSE_LIKE_DIRECT;
    public static final short REORDER_INVERSE_NUMBERS_AS_L = android.icu.text.Bidi.REORDER_INVERSE_NUMBERS_AS_L;
    public static final short REORDER_NUMBERS_SPECIAL = android.icu.text.Bidi.REORDER_NUMBERS_SPECIAL;
    public static final short REORDER_RUNS_ONLY = android.icu.text.Bidi.REORDER_RUNS_ONLY;
    public static final byte RTL = android.icu.text.Bidi.RTL;

}
