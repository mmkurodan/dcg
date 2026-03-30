// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Presentation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Presentation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Presentation wrap(android.app.Presentation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Presentation(real, (__DcgwBridgeToken) null);
    }

    public android.app.Presentation getReal() {
        return (android.app.Presentation) real;
    }

    public android.app.Presentation unwrap() {
        return getReal();
    }

    public Presentation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.Display arg1) {
        this(new android.app.Presentation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public Presentation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.Display arg1, int arg2) {
        this(new android.app.Presentation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(((android.app.Presentation) real).getDisplay());
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(((android.app.Presentation) real).getResources());
    }

    public void onDisplayChanged() {
        ((android.app.Presentation) real).onDisplayChanged();
    }

    public void onDisplayRemoved() {
        ((android.app.Presentation) real).onDisplayRemoved();
    }

    public void show() {
        ((android.app.Presentation) real).show();
    }

}
