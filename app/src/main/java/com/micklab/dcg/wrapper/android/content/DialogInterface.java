// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class DialogInterface {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DialogInterface(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.DialogInterface wrap(android.content.DialogInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface(real, (__DcgwBridgeToken) null);
    }

    public android.content.DialogInterface getReal() {
        return (android.content.DialogInterface) real;
    }

    public android.content.DialogInterface unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.content.DialogInterface) real).cancel();
    }

    public void dismiss() {
        ((android.content.DialogInterface) real).dismiss();
    }

    public static final int BUTTON1 = android.content.DialogInterface.BUTTON1;
    public static final int BUTTON2 = android.content.DialogInterface.BUTTON2;
    public static final int BUTTON3 = android.content.DialogInterface.BUTTON3;
    public static final int BUTTON_NEGATIVE = android.content.DialogInterface.BUTTON_NEGATIVE;
    public static final int BUTTON_NEUTRAL = android.content.DialogInterface.BUTTON_NEUTRAL;
    public static final int BUTTON_POSITIVE = android.content.DialogInterface.BUTTON_POSITIVE;

    public static final class OnCancelListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCancelListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener wrap(android.content.DialogInterface.OnCancelListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.DialogInterface.OnCancelListener getReal() {
            return (android.content.DialogInterface.OnCancelListener) real;
        }

        public android.content.DialogInterface.OnCancelListener unwrap() {
            return getReal();
        }

        public void onCancel(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
            ((android.content.DialogInterface.OnCancelListener) real).onCancel(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener wrap(android.content.DialogInterface.OnClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.DialogInterface.OnClickListener getReal() {
            return (android.content.DialogInterface.OnClickListener) real;
        }

        public android.content.DialogInterface.OnClickListener unwrap() {
            return getReal();
        }

        public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1) {
            ((android.content.DialogInterface.OnClickListener) real).onClick(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class OnDismissListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDismissListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnDismissListener wrap(android.content.DialogInterface.OnDismissListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnDismissListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.DialogInterface.OnDismissListener getReal() {
            return (android.content.DialogInterface.OnDismissListener) real;
        }

        public android.content.DialogInterface.OnDismissListener unwrap() {
            return getReal();
        }

        public void onDismiss(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
            ((android.content.DialogInterface.OnDismissListener) real).onDismiss(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnKeyListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnKeyListener wrap(android.content.DialogInterface.OnKeyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnKeyListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.DialogInterface.OnKeyListener getReal() {
            return (android.content.DialogInterface.OnKeyListener) real;
        }

        public android.content.DialogInterface.OnKeyListener unwrap() {
            return getReal();
        }

        public boolean onKey(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return ((android.content.DialogInterface.OnKeyListener) real).onKey(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

    }
    public static final class OnMultiChoiceClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnMultiChoiceClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener wrap(android.content.DialogInterface.OnMultiChoiceClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.DialogInterface.OnMultiChoiceClickListener getReal() {
            return (android.content.DialogInterface.OnMultiChoiceClickListener) real;
        }

        public android.content.DialogInterface.OnMultiChoiceClickListener unwrap() {
            return getReal();
        }

        public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1, boolean arg2) {
            ((android.content.DialogInterface.OnMultiChoiceClickListener) real).onClick(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
    public static final class OnShowListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnShowListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnShowListener wrap(android.content.DialogInterface.OnShowListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnShowListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.DialogInterface.OnShowListener getReal() {
            return (android.content.DialogInterface.OnShowListener) real;
        }

        public android.content.DialogInterface.OnShowListener unwrap() {
            return getReal();
        }

        public void onShow(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
            ((android.content.DialogInterface.OnShowListener) real).onShow(arg0 == null ? null : arg0.getReal());
        }

    }
}
