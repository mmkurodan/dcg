// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextDirectionHeuristic {
    private final android.text.TextDirectionHeuristic real;

    public TextDirectionHeuristic(android.text.TextDirectionHeuristic real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic wrap(android.text.TextDirectionHeuristic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic(real);
    }

    public android.text.TextDirectionHeuristic unwrap() {
        return real;
    }

    public boolean isRtl(char[] arg0, int arg1, int arg2) {
        return real.isRtl(arg0, arg1, arg2);
    }

    public boolean isRtl(java.lang.CharSequence arg0, int arg1, int arg2) {
        return real.isRtl(arg0, arg1, arg2);
    }

}
