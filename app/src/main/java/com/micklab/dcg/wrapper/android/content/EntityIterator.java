// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class EntityIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EntityIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.EntityIterator wrap(android.content.EntityIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.EntityIterator(real, (__DcgwBridgeToken) null);
    }

    public android.content.EntityIterator getReal() {
        return (android.content.EntityIterator) real;
    }

    public android.content.EntityIterator unwrap() {
        return getReal();
    }

    public void close() {
        ((android.content.EntityIterator) real).close();
    }

    public void reset() {
        ((android.content.EntityIterator) real).reset();
    }

}
