// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentManagerNonConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FragmentManagerNonConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentManagerNonConfig wrap(android.app.FragmentManagerNonConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentManagerNonConfig(real, (__DcgwBridgeToken) null);
    }

    public android.app.FragmentManagerNonConfig getReal() {
        return (android.app.FragmentManagerNonConfig) real;
    }

    public android.app.FragmentManagerNonConfig unwrap() {
        return getReal();
    }

}
