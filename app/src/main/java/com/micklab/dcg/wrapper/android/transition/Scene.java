// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Scene {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Scene(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Scene wrap(android.transition.Scene real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Scene(real, (__DcgwBridgeToken) null);
    }

    public android.transition.Scene getReal() {
        return (android.transition.Scene) real;
    }

    public android.transition.Scene unwrap() {
        return getReal();
    }

    public Scene(com.micklab.dcg.wrapper.android.view.ViewGroup arg0) {
        this(new android.transition.Scene(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Scene(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        this(new android.transition.Scene(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public Scene(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        this(new android.transition.Scene(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void enter() {
        ((android.transition.Scene) real).enter();
    }

    public void exit() {
        ((android.transition.Scene) real).exit();
    }

    public static com.micklab.dcg.wrapper.android.transition.Scene getCurrentScene(com.micklab.dcg.wrapper.android.view.ViewGroup arg0) {
        return com.micklab.dcg.wrapper.android.transition.Scene.wrap(android.transition.Scene.getCurrentScene(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.transition.Scene getSceneForLayout(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, int arg1, com.micklab.dcg.wrapper.android.content.Context arg2) {
        return com.micklab.dcg.wrapper.android.transition.Scene.wrap(android.transition.Scene.getSceneForLayout(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup getSceneRoot() {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.wrap(((android.transition.Scene) real).getSceneRoot());
    }

    public void setEnterAction(java.lang.Runnable arg0) {
        ((android.transition.Scene) real).setEnterAction(arg0);
    }

    public void setExitAction(java.lang.Runnable arg0) {
        ((android.transition.Scene) real).setExitAction(arg0);
    }

}
