// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class TextKeyListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.TextKeyListener wrap(android.text.method.TextKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.TextKeyListener(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.TextKeyListener getReal() {
        return (android.text.method.TextKeyListener) real;
    }

    public android.text.method.TextKeyListener unwrap() {
        return getReal();
    }

    public TextKeyListener(com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg0, boolean arg1) {
        this(new android.text.method.TextKeyListener(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public static void clear(com.micklab.dcg.wrapper.android.text.Editable arg0) {
        android.text.method.TextKeyListener.clear(arg0 == null ? null : arg0.getReal());
    }

    public int getInputType() {
        return ((android.text.method.TextKeyListener) real).getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.TextKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.TextKeyListener.wrap(android.text.method.TextKeyListener.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.method.TextKeyListener getInstance(boolean arg0, com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg1) {
        return com.micklab.dcg.wrapper.android.text.method.TextKeyListener.wrap(android.text.method.TextKeyListener.getInstance(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.TextKeyListener) real).onKeyDown(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean onKeyOther(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.text.method.TextKeyListener) real).onKeyOther(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyUp(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.TextKeyListener) real).onKeyUp(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onSpanAdded(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        ((android.text.method.TextKeyListener) real).onSpanAdded(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onSpanChanged(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3, int arg4, int arg5) {
        ((android.text.method.TextKeyListener) real).onSpanChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5);
    }

    public void onSpanRemoved(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        ((android.text.method.TextKeyListener) real).onSpanRemoved(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void release() {
        ((android.text.method.TextKeyListener) real).release();
    }

    public static boolean shouldCap(com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg0, java.lang.CharSequence arg1, int arg2) {
        return android.text.method.TextKeyListener.shouldCap(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public static final class Capitalize {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Capitalize(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize wrap(android.text.method.TextKeyListener.Capitalize real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize(real, (__DcgwBridgeToken) null);
        }

        public android.text.method.TextKeyListener.Capitalize getReal() {
            return (android.text.method.TextKeyListener.Capitalize) real;
        }

        public android.text.method.TextKeyListener.Capitalize unwrap() {
            return getReal();
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
