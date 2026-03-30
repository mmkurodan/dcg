// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.fonts;

public final class SystemFonts {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SystemFonts(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.fonts.SystemFonts wrap(android.graphics.fonts.SystemFonts real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.SystemFonts(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.fonts.SystemFonts getReal() {
        return (android.graphics.fonts.SystemFonts) real;
    }

    public android.graphics.fonts.SystemFonts unwrap() {
        return getReal();
    }

}
