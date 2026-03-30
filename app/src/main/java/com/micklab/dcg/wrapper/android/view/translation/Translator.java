// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class Translator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Translator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.Translator wrap(android.view.translation.Translator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.Translator(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.Translator getReal() {
        return (android.view.translation.Translator) real;
    }

    public android.view.translation.Translator unwrap() {
        return getReal();
    }

    public void destroy() {
        ((android.view.translation.Translator) real).destroy();
    }

    public boolean isDestroyed() {
        return ((android.view.translation.Translator) real).isDestroyed();
    }

}
