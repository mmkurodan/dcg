// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class UpdateAppearance {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UpdateAppearance(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.UpdateAppearance wrap(android.text.style.UpdateAppearance real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.UpdateAppearance(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.UpdateAppearance getReal() {
        return (android.text.style.UpdateAppearance) real;
    }

    public android.text.style.UpdateAppearance unwrap() {
        return getReal();
    }

}
