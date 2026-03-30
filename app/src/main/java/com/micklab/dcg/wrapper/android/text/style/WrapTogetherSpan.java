// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class WrapTogetherSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WrapTogetherSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.WrapTogetherSpan wrap(android.text.style.WrapTogetherSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.WrapTogetherSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.WrapTogetherSpan getReal() {
        return (android.text.style.WrapTogetherSpan) real;
    }

    public android.text.style.WrapTogetherSpan unwrap() {
        return getReal();
    }

}
