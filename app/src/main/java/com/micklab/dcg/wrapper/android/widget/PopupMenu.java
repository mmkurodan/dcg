// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class PopupMenu {
    private final android.widget.PopupMenu real;

    public PopupMenu(android.widget.PopupMenu real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.PopupMenu wrap(android.widget.PopupMenu real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupMenu(real);
    }

    public android.widget.PopupMenu unwrap() {
        return real;
    }

    public PopupMenu(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        this(new android.widget.PopupMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public PopupMenu(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        this(new android.widget.PopupMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public PopupMenu(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, int arg3, int arg4) {
        this(new android.widget.PopupMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public void dismiss() {
        real.dismiss();
    }

    public com.micklab.dcg.wrapper.android.view.View.OnTouchListener getDragToOpenListener() {
        return com.micklab.dcg.wrapper.android.view.View.OnTouchListener.wrap(real.getDragToOpenListener());
    }

    public int getGravity() {
        return real.getGravity();
    }

    public com.micklab.dcg.wrapper.android.view.Menu getMenu() {
        return com.micklab.dcg.wrapper.android.view.Menu.wrap(real.getMenu());
    }

    public com.micklab.dcg.wrapper.android.view.MenuInflater getMenuInflater() {
        return com.micklab.dcg.wrapper.android.view.MenuInflater.wrap(real.getMenuInflater());
    }

    public void inflate(int arg0) {
        real.inflate(arg0);
    }

    public void setForceShowIcon(boolean arg0) {
        real.setForceShowIcon(arg0);
    }

    public void setGravity(int arg0) {
        real.setGravity(arg0);
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.widget.PopupMenu.OnDismissListener arg0) {
        real.setOnDismissListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnMenuItemClickListener(com.micklab.dcg.wrapper.android.widget.PopupMenu.OnMenuItemClickListener arg0) {
        real.setOnMenuItemClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void show() {
        real.show();
    }

    public static final class OnDismissListener {
        private final android.widget.PopupMenu.OnDismissListener real;

        public OnDismissListener(android.widget.PopupMenu.OnDismissListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.PopupMenu.OnDismissListener wrap(android.widget.PopupMenu.OnDismissListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupMenu.OnDismissListener(real);
        }

        public android.widget.PopupMenu.OnDismissListener unwrap() {
            return real;
        }

        public void onDismiss(com.micklab.dcg.wrapper.android.widget.PopupMenu arg0) {
            real.onDismiss(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnMenuItemClickListener {
        private final android.widget.PopupMenu.OnMenuItemClickListener real;

        public OnMenuItemClickListener(android.widget.PopupMenu.OnMenuItemClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.PopupMenu.OnMenuItemClickListener wrap(android.widget.PopupMenu.OnMenuItemClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupMenu.OnMenuItemClickListener(real);
        }

        public android.widget.PopupMenu.OnMenuItemClickListener unwrap() {
            return real;
        }

        public boolean onMenuItemClick(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
            return real.onMenuItemClick(arg0 == null ? null : arg0.unwrap());
        }

    }
}
