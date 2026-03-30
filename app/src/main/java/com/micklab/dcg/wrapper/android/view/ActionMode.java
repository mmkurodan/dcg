// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ActionMode {
    private final android.view.ActionMode real;

    public ActionMode(android.view.ActionMode real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ActionMode wrap(android.view.ActionMode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionMode(real);
    }

    public android.view.ActionMode unwrap() {
        return real;
    }

    public void finish() {
        real.finish();
    }

    public com.micklab.dcg.wrapper.android.view.View getCustomView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCustomView());
    }

    public com.micklab.dcg.wrapper.android.view.Menu getMenu() {
        return com.micklab.dcg.wrapper.android.view.Menu.wrap(real.getMenu());
    }

    public com.micklab.dcg.wrapper.android.view.MenuInflater getMenuInflater() {
        return com.micklab.dcg.wrapper.android.view.MenuInflater.wrap(real.getMenuInflater());
    }

    public java.lang.CharSequence getSubtitle() {
        return real.getSubtitle();
    }

    public java.lang.Object getTag() {
        return real.getTag();
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public boolean getTitleOptionalHint() {
        return real.getTitleOptionalHint();
    }

    public int getType() {
        return real.getType();
    }

    public void hide(long arg0) {
        real.hide(arg0);
    }

    public void invalidate() {
        real.invalidate();
    }

    public void invalidateContentRect() {
        real.invalidateContentRect();
    }

    public boolean isTitleOptional() {
        return real.isTitleOptional();
    }

    public void onWindowFocusChanged(boolean arg0) {
        real.onWindowFocusChanged(arg0);
    }

    public void setCustomView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setCustomView(arg0 == null ? null : arg0.unwrap());
    }

    public void setSubtitle(int arg0) {
        real.setSubtitle(arg0);
    }

    public void setSubtitle(java.lang.CharSequence arg0) {
        real.setSubtitle(arg0);
    }

    public void setTag(java.lang.Object arg0) {
        real.setTag(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        real.setTitle(arg0);
    }

    public void setTitle(int arg0) {
        real.setTitle(arg0);
    }

    public void setTitleOptionalHint(boolean arg0) {
        real.setTitleOptionalHint(arg0);
    }

    public void setType(int arg0) {
        real.setType(arg0);
    }

    public static final int DEFAULT_HIDE_DURATION = android.view.ActionMode.DEFAULT_HIDE_DURATION;
    public static final int TYPE_FLOATING = android.view.ActionMode.TYPE_FLOATING;
    public static final int TYPE_PRIMARY = android.view.ActionMode.TYPE_PRIMARY;

    public static final class Callback {
        private final android.view.ActionMode.Callback real;

        public Callback(android.view.ActionMode.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ActionMode.Callback wrap(android.view.ActionMode.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionMode.Callback(real);
        }

        public android.view.ActionMode.Callback unwrap() {
            return real;
        }

        public boolean onActionItemClicked(com.micklab.dcg.wrapper.android.view.ActionMode arg0, com.micklab.dcg.wrapper.android.view.MenuItem arg1) {
            return real.onActionItemClicked(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public boolean onCreateActionMode(com.micklab.dcg.wrapper.android.view.ActionMode arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            return real.onCreateActionMode(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onDestroyActionMode(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
            real.onDestroyActionMode(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onPrepareActionMode(com.micklab.dcg.wrapper.android.view.ActionMode arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            return real.onPrepareActionMode(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class Callback2 {
        private final android.view.ActionMode.Callback2 real;

        public Callback2(android.view.ActionMode.Callback2 real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ActionMode.Callback2 wrap(android.view.ActionMode.Callback2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionMode.Callback2(real);
        }

        public android.view.ActionMode.Callback2 unwrap() {
            return real;
        }

        public void onGetContentRect(com.micklab.dcg.wrapper.android.view.ActionMode arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
            real.onGetContentRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

    }
}
