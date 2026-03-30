// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextDirectionHeuristic {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextDirectionHeuristic(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic wrap(android.text.TextDirectionHeuristic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic(real, (__DcgwBridgeToken) null);
    }

    public android.text.TextDirectionHeuristic getReal() {
        return (android.text.TextDirectionHeuristic) real;
    }

    public android.text.TextDirectionHeuristic unwrap() {
        return getReal();
    }

    public boolean isRtl(char[] arg0, int arg1, int arg2) {
        return ((android.text.TextDirectionHeuristic) real).isRtl(arg0, arg1, arg2);
    }

    public boolean isRtl(java.lang.CharSequence arg0, int arg1, int arg2) {
        return ((android.text.TextDirectionHeuristic) real).isRtl(arg0, arg1, arg2);
    }

}
