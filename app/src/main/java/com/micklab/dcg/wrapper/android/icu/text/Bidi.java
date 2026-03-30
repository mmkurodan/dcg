// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Bidi {
    private final android.icu.text.Bidi real;

    public Bidi(android.icu.text.Bidi real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Bidi wrap(android.icu.text.Bidi real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Bidi(real);
    }

    public android.icu.text.Bidi unwrap() {
        return real;
    }

    public Bidi() {
        this(new android.icu.text.Bidi());
    }

    public Bidi(java.text.AttributedCharacterIterator arg0) {
        this(new android.icu.text.Bidi(arg0));
    }

    public Bidi(java.lang.String arg0, int arg1) {
        this(new android.icu.text.Bidi(arg0, arg1));
    }

    public Bidi(int arg0, int arg1) {
        this(new android.icu.text.Bidi(arg0, arg1));
    }

    public Bidi(char[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.text.Bidi(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public boolean baseIsLeftToRight() {
        return real.baseIsLeftToRight();
    }

    public int countParagraphs() {
        return real.countParagraphs();
    }

    public int countRuns() {
        return real.countRuns();
    }

    public com.micklab.dcg.wrapper.android.icu.text.Bidi createLineBidi(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.Bidi.wrap(real.createLineBidi(arg0, arg1));
    }

    public static byte getBaseDirection(java.lang.CharSequence arg0) {
        return android.icu.text.Bidi.getBaseDirection(arg0);
    }

    public int getBaseLevel() {
        return real.getBaseLevel();
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiClassifier getCustomClassifier() {
        return com.micklab.dcg.wrapper.android.icu.text.BidiClassifier.wrap(real.getCustomClassifier());
    }

    public int getCustomizedClass(int arg0) {
        return real.getCustomizedClass(arg0);
    }

    public byte getDirection() {
        return real.getDirection();
    }

    public int getLength() {
        return real.getLength();
    }

    public byte getLevelAt(int arg0) {
        return real.getLevelAt(arg0);
    }

    public byte[] getLevels() {
        return real.getLevels();
    }

    public int getLogicalIndex(int arg0) {
        return real.getLogicalIndex(arg0);
    }

    public int[] getLogicalMap() {
        return real.getLogicalMap();
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiRun getLogicalRun(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BidiRun.wrap(real.getLogicalRun(arg0));
    }

    public byte getParaLevel() {
        return real.getParaLevel();
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiRun getParagraph(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BidiRun.wrap(real.getParagraph(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiRun getParagraphByIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BidiRun.wrap(real.getParagraphByIndex(arg0));
    }

    public int getParagraphIndex(int arg0) {
        return real.getParagraphIndex(arg0);
    }

    public int getProcessedLength() {
        return real.getProcessedLength();
    }

    public int getReorderingMode() {
        return real.getReorderingMode();
    }

    public int getReorderingOptions() {
        return real.getReorderingOptions();
    }

    public int getResultLength() {
        return real.getResultLength();
    }

    public int getRunCount() {
        return real.getRunCount();
    }

    public int getRunLevel(int arg0) {
        return real.getRunLevel(arg0);
    }

    public int getRunLimit(int arg0) {
        return real.getRunLimit(arg0);
    }

    public int getRunStart(int arg0) {
        return real.getRunStart(arg0);
    }

    public char[] getText() {
        return real.getText();
    }

    public java.lang.String getTextAsString() {
        return real.getTextAsString();
    }

    public int getVisualIndex(int arg0) {
        return real.getVisualIndex(arg0);
    }

    public int[] getVisualMap() {
        return real.getVisualMap();
    }

    public com.micklab.dcg.wrapper.android.icu.text.BidiRun getVisualRun(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.BidiRun.wrap(real.getVisualRun(arg0));
    }

    public static int[] invertMap(int[] arg0) {
        return android.icu.text.Bidi.invertMap(arg0);
    }

    public boolean isInverse() {
        return real.isInverse();
    }

    public boolean isLeftToRight() {
        return real.isLeftToRight();
    }

    public boolean isMixed() {
        return real.isMixed();
    }

    public boolean isOrderParagraphsLTR() {
        return real.isOrderParagraphsLTR();
    }

    public boolean isRightToLeft() {
        return real.isRightToLeft();
    }

    public void orderParagraphsLTR(boolean arg0) {
        real.orderParagraphsLTR(arg0);
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
        real.setContext(arg0, arg1);
    }

    public void setCustomClassifier(com.micklab.dcg.wrapper.android.icu.text.BidiClassifier arg0) {
        real.setCustomClassifier(arg0 == null ? null : arg0.unwrap());
    }

    public void setInverse(boolean arg0) {
        real.setInverse(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Bidi setLine(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.Bidi.wrap(real.setLine(arg0, arg1));
    }

    public void setPara(java.text.AttributedCharacterIterator arg0) {
        real.setPara(arg0);
    }

    public void setPara(java.lang.String arg0, byte arg1, byte[] arg2) {
        real.setPara(arg0, arg1, arg2);
    }

    public void setPara(char[] arg0, byte arg1, byte[] arg2) {
        real.setPara(arg0, arg1, arg2);
    }

    public void setReorderingMode(int arg0) {
        real.setReorderingMode(arg0);
    }

    public void setReorderingOptions(int arg0) {
        real.setReorderingOptions(arg0);
    }

    public java.lang.String writeReordered(int arg0) {
        return real.writeReordered(arg0);
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
