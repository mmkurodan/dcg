// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class DialogInterface {
    private final android.content.DialogInterface real;

    public DialogInterface(android.content.DialogInterface real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.DialogInterface wrap(android.content.DialogInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface(real);
    }

    public android.content.DialogInterface unwrap() {
        return real;
    }

    public void cancel() {
        real.cancel();
    }

    public void dismiss() {
        real.dismiss();
    }

    public static final int BUTTON1 = android.content.DialogInterface.BUTTON1;
    public static final int BUTTON2 = android.content.DialogInterface.BUTTON2;
    public static final int BUTTON3 = android.content.DialogInterface.BUTTON3;
    public static final int BUTTON_NEGATIVE = android.content.DialogInterface.BUTTON_NEGATIVE;
    public static final int BUTTON_NEUTRAL = android.content.DialogInterface.BUTTON_NEUTRAL;
    public static final int BUTTON_POSITIVE = android.content.DialogInterface.BUTTON_POSITIVE;

    public static final class OnCancelListener {
        private final android.content.DialogInterface.OnCancelListener real;

        public OnCancelListener(android.content.DialogInterface.OnCancelListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener wrap(android.content.DialogInterface.OnCancelListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener(real);
        }

        public android.content.DialogInterface.OnCancelListener unwrap() {
            return real;
        }

        public void onCancel(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
            real.onCancel(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnClickListener {
        private final android.content.DialogInterface.OnClickListener real;

        public OnClickListener(android.content.DialogInterface.OnClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener wrap(android.content.DialogInterface.OnClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener(real);
        }

        public android.content.DialogInterface.OnClickListener unwrap() {
            return real;
        }

        public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1) {
            real.onClick(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class OnDismissListener {
        private final android.content.DialogInterface.OnDismissListener real;

        public OnDismissListener(android.content.DialogInterface.OnDismissListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnDismissListener wrap(android.content.DialogInterface.OnDismissListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnDismissListener(real);
        }

        public android.content.DialogInterface.OnDismissListener unwrap() {
            return real;
        }

        public void onDismiss(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
            real.onDismiss(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnKeyListener {
        private final android.content.DialogInterface.OnKeyListener real;

        public OnKeyListener(android.content.DialogInterface.OnKeyListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnKeyListener wrap(android.content.DialogInterface.OnKeyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnKeyListener(real);
        }

        public android.content.DialogInterface.OnKeyListener unwrap() {
            return real;
        }

        public boolean onKey(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return real.onKey(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

    }
    public static final class OnMultiChoiceClickListener {
        private final android.content.DialogInterface.OnMultiChoiceClickListener real;

        public OnMultiChoiceClickListener(android.content.DialogInterface.OnMultiChoiceClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener wrap(android.content.DialogInterface.OnMultiChoiceClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener(real);
        }

        public android.content.DialogInterface.OnMultiChoiceClickListener unwrap() {
            return real;
        }

        public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1, boolean arg2) {
            real.onClick(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
    public static final class OnShowListener {
        private final android.content.DialogInterface.OnShowListener real;

        public OnShowListener(android.content.DialogInterface.OnShowListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.DialogInterface.OnShowListener wrap(android.content.DialogInterface.OnShowListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.DialogInterface.OnShowListener(real);
        }

        public android.content.DialogInterface.OnShowListener unwrap() {
            return real;
        }

        public void onShow(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
            real.onShow(arg0 == null ? null : arg0.unwrap());
        }

    }
}
