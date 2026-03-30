// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Selection {
    private final android.text.Selection real;

    public Selection(android.text.Selection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Selection wrap(android.text.Selection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Selection(real);
    }

    public android.text.Selection unwrap() {
        return real;
    }

    public static boolean extendDown(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.extendDown(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean extendLeft(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.extendLeft(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean extendRight(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.extendRight(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static void extendSelection(com.micklab.dcg.wrapper.android.text.Spannable arg0, int arg1) {
        android.text.Selection.extendSelection(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static boolean extendToLeftEdge(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.extendToLeftEdge(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean extendToParagraphEnd(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        return android.text.Selection.extendToParagraphEnd(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean extendToParagraphStart(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        return android.text.Selection.extendToParagraphStart(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean extendToRightEdge(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.extendToRightEdge(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean extendUp(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.extendUp(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static int getSelectionEnd(java.lang.CharSequence arg0) {
        return android.text.Selection.getSelectionEnd(arg0);
    }

    public static int getSelectionStart(java.lang.CharSequence arg0) {
        return android.text.Selection.getSelectionStart(arg0);
    }

    public static boolean moveDown(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.moveDown(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean moveLeft(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.moveLeft(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean moveRight(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.moveRight(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean moveToLeftEdge(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.moveToLeftEdge(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean moveToParagraphEnd(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.moveToParagraphEnd(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean moveToParagraphStart(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.moveToParagraphStart(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean moveToRightEdge(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.moveToRightEdge(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean moveUp(com.micklab.dcg.wrapper.android.text.Spannable arg0, com.micklab.dcg.wrapper.android.text.Layout arg1) {
        return android.text.Selection.moveUp(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static void removeSelection(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.text.Selection.removeSelection(arg0 == null ? null : arg0.unwrap());
    }

    public static void selectAll(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.text.Selection.selectAll(arg0 == null ? null : arg0.unwrap());
    }

    public static void setSelection(com.micklab.dcg.wrapper.android.text.Spannable arg0, int arg1) {
        android.text.Selection.setSelection(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static void setSelection(com.micklab.dcg.wrapper.android.text.Spannable arg0, int arg1, int arg2) {
        android.text.Selection.setSelection(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static final java.lang.Object SELECTION_END = android.text.Selection.SELECTION_END;
    public static final java.lang.Object SELECTION_START = android.text.Selection.SELECTION_START;

}
