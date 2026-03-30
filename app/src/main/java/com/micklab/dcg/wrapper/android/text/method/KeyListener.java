// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class KeyListener {
    private final android.text.method.KeyListener real;

    public KeyListener(android.text.method.KeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.KeyListener wrap(android.text.method.KeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.KeyListener(real);
    }

    public android.text.method.KeyListener unwrap() {
        return real;
    }

    public void clearMetaKeyState(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2) {
        real.clearMetaKeyState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public int getInputType() {
        return real.getInputType();
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.onKeyDown(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean onKeyOther(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return real.onKeyOther(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyUp(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.onKeyUp(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

}
