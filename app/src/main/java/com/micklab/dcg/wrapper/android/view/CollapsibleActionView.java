// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class CollapsibleActionView {
    private final android.view.CollapsibleActionView real;

    public CollapsibleActionView(android.view.CollapsibleActionView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.CollapsibleActionView wrap(android.view.CollapsibleActionView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.CollapsibleActionView(real);
    }

    public android.view.CollapsibleActionView unwrap() {
        return real;
    }

    public void onActionViewCollapsed() {
        real.onActionViewCollapsed();
    }

    public void onActionViewExpanded() {
        real.onActionViewExpanded();
    }

}
