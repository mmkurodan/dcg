// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class EmojiConsistency {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EmojiConsistency(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.EmojiConsistency wrap(android.text.EmojiConsistency real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.EmojiConsistency(real, (__DcgwBridgeToken) null);
    }

    public android.text.EmojiConsistency getReal() {
        return (android.text.EmojiConsistency) real;
    }

    public android.text.EmojiConsistency unwrap() {
        return getReal();
    }

}
