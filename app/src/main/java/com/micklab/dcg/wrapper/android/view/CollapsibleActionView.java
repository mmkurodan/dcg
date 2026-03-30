// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class CollapsibleActionView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CollapsibleActionView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.CollapsibleActionView wrap(android.view.CollapsibleActionView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.CollapsibleActionView(real, (__DcgwBridgeToken) null);
    }

    public android.view.CollapsibleActionView getReal() {
        return (android.view.CollapsibleActionView) real;
    }

    public android.view.CollapsibleActionView unwrap() {
        return getReal();
    }

    public void onActionViewCollapsed() {
        ((android.view.CollapsibleActionView) real).onActionViewCollapsed();
    }

    public void onActionViewExpanded() {
        ((android.view.CollapsibleActionView) real).onActionViewExpanded();
    }

}
