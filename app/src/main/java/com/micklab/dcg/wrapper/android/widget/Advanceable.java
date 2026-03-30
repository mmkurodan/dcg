// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Advanceable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Advanceable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Advanceable wrap(android.widget.Advanceable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Advanceable(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Advanceable getReal() {
        return (android.widget.Advanceable) real;
    }

    public android.widget.Advanceable unwrap() {
        return getReal();
    }

    public void advance() {
        ((android.widget.Advanceable) real).advance();
    }

    public void fyiWillBeAdvancedByHostKThx() {
        ((android.widget.Advanceable) real).fyiWillBeAdvancedByHostKThx();
    }

}
