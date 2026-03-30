// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Scene {
    private final android.transition.Scene real;

    public Scene(android.transition.Scene real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Scene wrap(android.transition.Scene real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Scene(real);
    }

    public android.transition.Scene unwrap() {
        return real;
    }

    public Scene(com.micklab.dcg.wrapper.android.view.ViewGroup arg0) {
        this(new android.transition.Scene(arg0 == null ? null : arg0.unwrap()));
    }

    public Scene(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        this(new android.transition.Scene(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public Scene(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        this(new android.transition.Scene(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void enter() {
        real.enter();
    }

    public void exit() {
        real.exit();
    }

    public static com.micklab.dcg.wrapper.android.transition.Scene getCurrentScene(com.micklab.dcg.wrapper.android.view.ViewGroup arg0) {
        return com.micklab.dcg.wrapper.android.transition.Scene.wrap(android.transition.Scene.getCurrentScene(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.transition.Scene getSceneForLayout(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, int arg1, com.micklab.dcg.wrapper.android.content.Context arg2) {
        return com.micklab.dcg.wrapper.android.transition.Scene.wrap(android.transition.Scene.getSceneForLayout(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup getSceneRoot() {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.wrap(real.getSceneRoot());
    }

    public void setEnterAction(java.lang.Runnable arg0) {
        real.setEnterAction(arg0);
    }

    public void setExitAction(java.lang.Runnable arg0) {
        real.setExitAction(arg0);
    }

}
