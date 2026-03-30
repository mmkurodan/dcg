// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class KeyListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.KeyListener wrap(android.text.method.KeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.KeyListener(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.KeyListener getReal() {
        return (android.text.method.KeyListener) real;
    }

    public android.text.method.KeyListener unwrap() {
        return getReal();
    }

    public void clearMetaKeyState(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2) {
        ((android.text.method.KeyListener) real).clearMetaKeyState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public int getInputType() {
        return ((android.text.method.KeyListener) real).getInputType();
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.KeyListener) real).onKeyDown(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean onKeyOther(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.text.method.KeyListener) real).onKeyOther(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyUp(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.KeyListener) real).onKeyUp(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

}
