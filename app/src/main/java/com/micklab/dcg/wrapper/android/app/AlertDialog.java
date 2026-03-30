// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AlertDialog {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AlertDialog(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AlertDialog wrap(android.app.AlertDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AlertDialog(real, (__DcgwBridgeToken) null);
    }

    public android.app.AlertDialog getReal() {
        return (android.app.AlertDialog) real;
    }

    public android.app.AlertDialog unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.widget.Button getButton(int arg0) {
        return com.micklab.dcg.wrapper.android.widget.Button.wrap(((android.app.AlertDialog) real).getButton(arg0));
    }

    public com.micklab.dcg.wrapper.android.widget.ListView getListView() {
        return com.micklab.dcg.wrapper.android.widget.ListView.wrap(((android.app.AlertDialog) real).getListView());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.AlertDialog) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.AlertDialog) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Message arg1) {
        ((android.app.AlertDialog) real).setButton(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
        ((android.app.AlertDialog) real).setButton(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setButton(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
        ((android.app.AlertDialog) real).setButton(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setButton(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.os.Message arg2) {
        ((android.app.AlertDialog) real).setButton(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setButton2(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
        ((android.app.AlertDialog) real).setButton2(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setButton2(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Message arg1) {
        ((android.app.AlertDialog) real).setButton2(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setButton3(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
        ((android.app.AlertDialog) real).setButton3(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setButton3(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Message arg1) {
        ((android.app.AlertDialog) real).setButton3(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setCustomTitle(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.AlertDialog) real).setCustomTitle(arg0 == null ? null : arg0.getReal());
    }

    public void setIcon(int arg0) {
        ((android.app.AlertDialog) real).setIcon(arg0);
    }

    public void setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.app.AlertDialog) real).setIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setIconAttribute(int arg0) {
        ((android.app.AlertDialog) real).setIconAttribute(arg0);
    }

    public void setInverseBackgroundForced(boolean arg0) {
        ((android.app.AlertDialog) real).setInverseBackgroundForced(arg0);
    }

    public void setMessage(java.lang.CharSequence arg0) {
        ((android.app.AlertDialog) real).setMessage(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        ((android.app.AlertDialog) real).setTitle(arg0);
    }

    public void setView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.AlertDialog) real).setView(arg0 == null ? null : arg0.getReal());
    }

    public void setView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.app.AlertDialog) real).setView(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public static final int THEME_DEVICE_DEFAULT_DARK = android.app.AlertDialog.THEME_DEVICE_DEFAULT_DARK;
    public static final int THEME_DEVICE_DEFAULT_LIGHT = android.app.AlertDialog.THEME_DEVICE_DEFAULT_LIGHT;
    public static final int THEME_HOLO_DARK = android.app.AlertDialog.THEME_HOLO_DARK;
    public static final int THEME_HOLO_LIGHT = android.app.AlertDialog.THEME_HOLO_LIGHT;
    public static final int THEME_TRADITIONAL = android.app.AlertDialog.THEME_TRADITIONAL;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.AlertDialog.Builder wrap(android.app.AlertDialog.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.AlertDialog.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.AlertDialog.Builder getReal() {
            return (android.app.AlertDialog.Builder) real;
        }

        public android.app.AlertDialog.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.app.AlertDialog.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
            this(new android.app.AlertDialog.Builder(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog create() {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.wrap(((android.app.AlertDialog.Builder) real).create());
        }

        public com.micklab.dcg.wrapper.android.content.Context getContext() {
            return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.app.AlertDialog.Builder) real).getContext());
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setAdapter(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setCancelable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setCancelable(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setCursor(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setCustomTitle(com.micklab.dcg.wrapper.android.view.View arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setCustomTitle(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setIcon(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setIconAttribute(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setIconAttribute(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setInverseBackgroundForced(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setInverseBackgroundForced(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setItems(java.lang.CharSequence[] arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setItems(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setItems(int arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setItems(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMessage(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setMessage(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMessage(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setMessage(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMultiChoiceItems(int arg0, boolean[] arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setMultiChoiceItems(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMultiChoiceItems(java.lang.CharSequence[] arg0, boolean[] arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setMultiChoiceItems(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMultiChoiceItems(com.micklab.dcg.wrapper.android.database.Cursor arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener arg3) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setMultiChoiceItems(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setNegativeButton(int arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setNegativeButton(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setNegativeButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setNegativeButton(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setNeutralButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setNeutralButton(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setNeutralButton(int arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setNeutralButton(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setOnCancelListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setOnCancelListener(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setOnDismissListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnDismissListener arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setOnDismissListener(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setOnItemSelectedListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setOnItemSelectedListener(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setOnKeyListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnKeyListener arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setOnKeyListener(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setPositiveButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setPositiveButton(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setPositiveButton(int arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setPositiveButton(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setSingleChoiceItems(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0, int arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setSingleChoiceItems(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setSingleChoiceItems(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setSingleChoiceItems(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setSingleChoiceItems(java.lang.CharSequence[] arg0, int arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setSingleChoiceItems(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setSingleChoiceItems(com.micklab.dcg.wrapper.android.database.Cursor arg0, int arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg3) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setSingleChoiceItems(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setTitle(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setView(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setView(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setView(com.micklab.dcg.wrapper.android.view.View arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(((android.app.AlertDialog.Builder) real).setView(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog show() {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.wrap(((android.app.AlertDialog.Builder) real).show());
        }

    }
}
