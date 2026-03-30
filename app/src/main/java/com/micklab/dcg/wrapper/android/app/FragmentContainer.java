// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentContainer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FragmentContainer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentContainer wrap(android.app.FragmentContainer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentContainer(real, (__DcgwBridgeToken) null);
    }

    public android.app.FragmentContainer getReal() {
        return (android.app.FragmentContainer) real;
    }

    public android.app.FragmentContainer unwrap() {
        return getReal();
    }

    public boolean onHasView() {
        return ((android.app.FragmentContainer) real).onHasView();
    }

}
