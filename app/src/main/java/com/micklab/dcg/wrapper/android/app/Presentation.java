// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Presentation {
    private final android.app.Presentation real;

    public Presentation(android.app.Presentation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Presentation wrap(android.app.Presentation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Presentation(real);
    }

    public android.app.Presentation unwrap() {
        return real;
    }

    public Presentation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.Display arg1) {
        this(new android.app.Presentation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public Presentation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.Display arg1, int arg2) {
        this(new android.app.Presentation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(real.getDisplay());
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(real.getResources());
    }

    public void onDisplayChanged() {
        real.onDisplayChanged();
    }

    public void onDisplayRemoved() {
        real.onDisplayRemoved();
    }

    public void show() {
        real.show();
    }

}
