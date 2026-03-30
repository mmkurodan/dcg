// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class BaseKeyListener {
    private final android.text.method.BaseKeyListener real;

    public BaseKeyListener(android.text.method.BaseKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.BaseKeyListener wrap(android.text.method.BaseKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.BaseKeyListener(real);
    }

    public android.text.method.BaseKeyListener unwrap() {
        return real;
    }

    public boolean backspace(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.backspace(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean forwardDelete(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.forwardDelete(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.onKeyDown(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean onKeyOther(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return real.onKeyOther(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

}
