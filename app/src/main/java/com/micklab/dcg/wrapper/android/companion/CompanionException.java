// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class CompanionException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CompanionException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.CompanionException wrap(android.companion.CompanionException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.CompanionException(real, (__DcgwBridgeToken) null);
    }

    public android.companion.CompanionException getReal() {
        return (android.companion.CompanionException) real;
    }

    public android.companion.CompanionException unwrap() {
        return getReal();
    }

}
