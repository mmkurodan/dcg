// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class TabStopSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TabStopSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.TabStopSpan wrap(android.text.style.TabStopSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TabStopSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.TabStopSpan getReal() {
        return (android.text.style.TabStopSpan) real;
    }

    public android.text.style.TabStopSpan unwrap() {
        return getReal();
    }

    public int getTabStop() {
        return ((android.text.style.TabStopSpan) real).getTabStop();
    }

    public static final class Standard {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Standard(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TabStopSpan.Standard wrap(android.text.style.TabStopSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TabStopSpan.Standard(real, (__DcgwBridgeToken) null);
        }

        public android.text.style.TabStopSpan.Standard getReal() {
            return (android.text.style.TabStopSpan.Standard) real;
        }

        public android.text.style.TabStopSpan.Standard unwrap() {
            return getReal();
        }

        public Standard(int arg0) {
            this(new android.text.style.TabStopSpan.Standard(arg0), (__DcgwBridgeToken) null);
        }

        public int getTabStop() {
            return ((android.text.style.TabStopSpan.Standard) real).getTabStop();
        }

        public java.lang.String toString() {
            return ((android.text.style.TabStopSpan.Standard) real).toString();
        }

    }
}
