// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class MenuInflater {
    private final android.view.MenuInflater real;

    public MenuInflater(android.view.MenuInflater real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.MenuInflater wrap(android.view.MenuInflater real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.MenuInflater(real);
    }

    public android.view.MenuInflater unwrap() {
        return real;
    }

    public MenuInflater(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.MenuInflater(arg0 == null ? null : arg0.unwrap()));
    }

    public void inflate(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        real.inflate(arg0, arg1 == null ? null : arg1.unwrap());
    }

}
