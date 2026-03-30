// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class TextKeyListener {
    private final android.text.method.TextKeyListener real;

    public TextKeyListener(android.text.method.TextKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.TextKeyListener wrap(android.text.method.TextKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.TextKeyListener(real);
    }

    public android.text.method.TextKeyListener unwrap() {
        return real;
    }

    public TextKeyListener(com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg0, boolean arg1) {
        this(new android.text.method.TextKeyListener(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static void clear(com.micklab.dcg.wrapper.android.text.Editable arg0) {
        android.text.method.TextKeyListener.clear(arg0 == null ? null : arg0.unwrap());
    }

    public int getInputType() {
        return real.getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.TextKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.TextKeyListener.wrap(android.text.method.TextKeyListener.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.method.TextKeyListener getInstance(boolean arg0, com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg1) {
        return com.micklab.dcg.wrapper.android.text.method.TextKeyListener.wrap(android.text.method.TextKeyListener.getInstance(arg0, arg1 == null ? null : arg1.unwrap()));
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

    public void onSpanAdded(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        real.onSpanAdded(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void onSpanChanged(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3, int arg4, int arg5) {
        real.onSpanChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5);
    }

    public void onSpanRemoved(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        real.onSpanRemoved(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void release() {
        real.release();
    }

    public static boolean shouldCap(com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg0, java.lang.CharSequence arg1, int arg2) {
        return android.text.method.TextKeyListener.shouldCap(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static final class Capitalize {
        private final android.text.method.TextKeyListener.Capitalize real;

        public Capitalize(android.text.method.TextKeyListener.Capitalize real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize wrap(android.text.method.TextKeyListener.Capitalize real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize(real);
        }

        public android.text.method.TextKeyListener.Capitalize unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize.wrap(android.text.method.TextKeyListener.Capitalize.valueOf(arg0));
        }

        public static android.text.method.TextKeyListener.Capitalize[] values() {
            return android.text.method.TextKeyListener.Capitalize.values();
        }

        public static final com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize CHARACTERS = com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize.wrap(android.text.method.TextKeyListener.Capitalize.CHARACTERS);
        public static final com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize NONE = com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize.wrap(android.text.method.TextKeyListener.Capitalize.NONE);
        public static final com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize SENTENCES = com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize.wrap(android.text.method.TextKeyListener.Capitalize.SENTENCES);
        public static final com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize WORDS = com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize.wrap(android.text.method.TextKeyListener.Capitalize.WORDS);

    }
}
