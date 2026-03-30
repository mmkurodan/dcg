// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentContainer {
    private final android.app.FragmentContainer real;

    public FragmentContainer(android.app.FragmentContainer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentContainer wrap(android.app.FragmentContainer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentContainer(real);
    }

    public android.app.FragmentContainer unwrap() {
        return real;
    }

    public boolean onHasView() {
        return real.onHasView();
    }

}
