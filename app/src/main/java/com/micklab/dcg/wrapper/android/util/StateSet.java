// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class StateSet {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StateSet(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.StateSet wrap(android.util.StateSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.StateSet(real, (__DcgwBridgeToken) null);
    }

    public android.util.StateSet getReal() {
        return (android.util.StateSet) real;
    }

    public android.util.StateSet unwrap() {
        return getReal();
    }

    public static java.lang.String dump(int[] arg0) {
        return android.util.StateSet.dump(arg0);
    }

    public static boolean isWildCard(int[] arg0) {
        return android.util.StateSet.isWildCard(arg0);
    }

    public static boolean stateSetMatches(int[] arg0, int arg1) {
        return android.util.StateSet.stateSetMatches(arg0, arg1);
    }

    public static boolean stateSetMatches(int[] arg0, int[] arg1) {
        return android.util.StateSet.stateSetMatches(arg0, arg1);
    }

    public static int[] trimStateSet(int[] arg0, int arg1) {
        return android.util.StateSet.trimStateSet(arg0, arg1);
    }

    public static final int[] NOTHING = android.util.StateSet.NOTHING;
    public static final int[] WILD_CARD = android.util.StateSet.WILD_CARD;

}
