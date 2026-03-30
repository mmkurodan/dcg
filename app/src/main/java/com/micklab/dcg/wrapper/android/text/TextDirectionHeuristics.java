// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextDirectionHeuristics {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextDirectionHeuristics(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextDirectionHeuristics wrap(android.text.TextDirectionHeuristics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextDirectionHeuristics(real, (__DcgwBridgeToken) null);
    }

    public android.text.TextDirectionHeuristics getReal() {
        return (android.text.TextDirectionHeuristics) real;
    }

    public android.text.TextDirectionHeuristics unwrap() {
        return getReal();
    }

    public TextDirectionHeuristics() {
        this(new android.text.TextDirectionHeuristics(), (__DcgwBridgeToken) null);
    }

    public static final com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic ANYRTL_LTR = com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(android.text.TextDirectionHeuristics.ANYRTL_LTR);
    public static final com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic FIRSTSTRONG_LTR = com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR);
    public static final com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic FIRSTSTRONG_RTL = com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL);
    public static final com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic LOCALE = com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(android.text.TextDirectionHeuristics.LOCALE);
    public static final com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic LTR = com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(android.text.TextDirectionHeuristics.LTR);
    public static final com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic RTL = com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(android.text.TextDirectionHeuristics.RTL);

}
