// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AlertDialog {
    private final android.app.AlertDialog real;

    public AlertDialog(android.app.AlertDialog real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AlertDialog wrap(android.app.AlertDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AlertDialog(real);
    }

    public android.app.AlertDialog unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.widget.Button getButton(int arg0) {
        return com.micklab.dcg.wrapper.android.widget.Button.wrap(real.getButton(arg0));
    }

    public com.micklab.dcg.wrapper.android.widget.ListView getListView() {
        return com.micklab.dcg.wrapper.android.widget.ListView.wrap(real.getListView());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Message arg1) {
        real.setButton(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
        real.setButton(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setButton(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
        real.setButton(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setButton(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.os.Message arg2) {
        real.setButton(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setButton2(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
        real.setButton2(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setButton2(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Message arg1) {
        real.setButton2(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setButton3(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
        real.setButton3(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setButton3(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Message arg1) {
        real.setButton3(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setCustomTitle(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setCustomTitle(arg0 == null ? null : arg0.unwrap());
    }

    public void setIcon(int arg0) {
        real.setIcon(arg0);
    }

    public void setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setIconAttribute(int arg0) {
        real.setIconAttribute(arg0);
    }

    public void setInverseBackgroundForced(boolean arg0) {
        real.setInverseBackgroundForced(arg0);
    }

    public void setMessage(java.lang.CharSequence arg0) {
        real.setMessage(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        real.setTitle(arg0);
    }

    public void setView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setView(arg0 == null ? null : arg0.unwrap());
    }

    public void setView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        real.setView(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public static final int THEME_DEVICE_DEFAULT_DARK = android.app.AlertDialog.THEME_DEVICE_DEFAULT_DARK;
    public static final int THEME_DEVICE_DEFAULT_LIGHT = android.app.AlertDialog.THEME_DEVICE_DEFAULT_LIGHT;
    public static final int THEME_HOLO_DARK = android.app.AlertDialog.THEME_HOLO_DARK;
    public static final int THEME_HOLO_LIGHT = android.app.AlertDialog.THEME_HOLO_LIGHT;
    public static final int THEME_TRADITIONAL = android.app.AlertDialog.THEME_TRADITIONAL;

    public static final class Builder {
        private final android.app.AlertDialog.Builder real;

        public Builder(android.app.AlertDialog.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.AlertDialog.Builder wrap(android.app.AlertDialog.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.AlertDialog.Builder(real);
        }

        public android.app.AlertDialog.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.app.AlertDialog.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
            this(new android.app.AlertDialog.Builder(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog create() {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.wrap(real.create());
        }

        public com.micklab.dcg.wrapper.android.content.Context getContext() {
            return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setAdapter(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setCancelable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setCancelable(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setCursor(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setCustomTitle(com.micklab.dcg.wrapper.android.view.View arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setCustomTitle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setIcon(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setIconAttribute(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setIconAttribute(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setInverseBackgroundForced(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setInverseBackgroundForced(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setItems(java.lang.CharSequence[] arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setItems(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setItems(int arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setItems(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMessage(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setMessage(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMessage(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setMessage(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMultiChoiceItems(int arg0, boolean[] arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setMultiChoiceItems(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMultiChoiceItems(java.lang.CharSequence[] arg0, boolean[] arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setMultiChoiceItems(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setMultiChoiceItems(com.micklab.dcg.wrapper.android.database.Cursor arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.DialogInterface.OnMultiChoiceClickListener arg3) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setMultiChoiceItems(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setNegativeButton(int arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setNegativeButton(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setNegativeButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setNegativeButton(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setNeutralButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setNeutralButton(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setNeutralButton(int arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setNeutralButton(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setOnCancelListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setOnCancelListener(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setOnDismissListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnDismissListener arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setOnDismissListener(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setOnItemSelectedListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setOnItemSelectedListener(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setOnKeyListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnKeyListener arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setOnKeyListener(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setPositiveButton(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setPositiveButton(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setPositiveButton(int arg0, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg1) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setPositiveButton(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setSingleChoiceItems(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0, int arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setSingleChoiceItems(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setSingleChoiceItems(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setSingleChoiceItems(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setSingleChoiceItems(java.lang.CharSequence[] arg0, int arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setSingleChoiceItems(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setSingleChoiceItems(com.micklab.dcg.wrapper.android.database.Cursor arg0, int arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg3) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setSingleChoiceItems(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setTitle(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setView(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setView(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog.Builder setView(com.micklab.dcg.wrapper.android.view.View arg0) {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.Builder.wrap(real.setView(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AlertDialog show() {
            return com.micklab.dcg.wrapper.android.app.AlertDialog.wrap(real.show());
        }

    }
}
