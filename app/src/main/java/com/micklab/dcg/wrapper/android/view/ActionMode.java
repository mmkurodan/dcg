// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ActionMode {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActionMode(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ActionMode wrap(android.view.ActionMode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionMode(real, (__DcgwBridgeToken) null);
    }

    public android.view.ActionMode getReal() {
        return (android.view.ActionMode) real;
    }

    public android.view.ActionMode unwrap() {
        return getReal();
    }

    public void finish() {
        ((android.view.ActionMode) real).finish();
    }

    public com.micklab.dcg.wrapper.android.view.View getCustomView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ActionMode) real).getCustomView());
    }

    public com.micklab.dcg.wrapper.android.view.Menu getMenu() {
        return com.micklab.dcg.wrapper.android.view.Menu.wrap(((android.view.ActionMode) real).getMenu());
    }

    public com.micklab.dcg.wrapper.android.view.MenuInflater getMenuInflater() {
        return com.micklab.dcg.wrapper.android.view.MenuInflater.wrap(((android.view.ActionMode) real).getMenuInflater());
    }

    public java.lang.CharSequence getSubtitle() {
        return ((android.view.ActionMode) real).getSubtitle();
    }

    public java.lang.Object getTag() {
        return ((android.view.ActionMode) real).getTag();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.view.ActionMode) real).getTitle();
    }

    public boolean getTitleOptionalHint() {
        return ((android.view.ActionMode) real).getTitleOptionalHint();
    }

    public int getType() {
        return ((android.view.ActionMode) real).getType();
    }

    public void hide(long arg0) {
        ((android.view.ActionMode) real).hide(arg0);
    }

    public void invalidate() {
        ((android.view.ActionMode) real).invalidate();
    }

    public void invalidateContentRect() {
        ((android.view.ActionMode) real).invalidateContentRect();
    }

    public boolean isTitleOptional() {
        return ((android.view.ActionMode) real).isTitleOptional();
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.view.ActionMode) real).onWindowFocusChanged(arg0);
    }

    public void setCustomView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ActionMode) real).setCustomView(arg0 == null ? null : arg0.getReal());
    }

    public void setSubtitle(int arg0) {
        ((android.view.ActionMode) real).setSubtitle(arg0);
    }

    public void setSubtitle(java.lang.CharSequence arg0) {
        ((android.view.ActionMode) real).setSubtitle(arg0);
    }

    public void setTag(java.lang.Object arg0) {
        ((android.view.ActionMode) real).setTag(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        ((android.view.ActionMode) real).setTitle(arg0);
    }

    public void setTitle(int arg0) {
        ((android.view.ActionMode) real).setTitle(arg0);
    }

    public void setTitleOptionalHint(boolean arg0) {
        ((android.view.ActionMode) real).setTitleOptionalHint(arg0);
    }

    public void setType(int arg0) {
        ((android.view.ActionMode) real).setType(arg0);
    }

    public static final int DEFAULT_HIDE_DURATION = android.view.ActionMode.DEFAULT_HIDE_DURATION;
    public static final int TYPE_FLOATING = android.view.ActionMode.TYPE_FLOATING;
    public static final int TYPE_PRIMARY = android.view.ActionMode.TYPE_PRIMARY;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ActionMode.Callback wrap(android.view.ActionMode.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionMode.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.view.ActionMode.Callback getReal() {
            return (android.view.ActionMode.Callback) real;
        }

        public android.view.ActionMode.Callback unwrap() {
            return getReal();
        }

        public boolean onActionItemClicked(com.micklab.dcg.wrapper.android.view.ActionMode arg0, com.micklab.dcg.wrapper.android.view.MenuItem arg1) {
            return ((android.view.ActionMode.Callback) real).onActionItemClicked(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public boolean onCreateActionMode(com.micklab.dcg.wrapper.android.view.ActionMode arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            return ((android.view.ActionMode.Callback) real).onCreateActionMode(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onDestroyActionMode(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
            ((android.view.ActionMode.Callback) real).onDestroyActionMode(arg0 == null ? null : arg0.getReal());
        }

        public boolean onPrepareActionMode(com.micklab.dcg.wrapper.android.view.ActionMode arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            return ((android.view.ActionMode.Callback) real).onPrepareActionMode(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class Callback2 {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback2(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ActionMode.Callback2 wrap(android.view.ActionMode.Callback2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ActionMode.Callback2(real, (__DcgwBridgeToken) null);
        }

        public android.view.ActionMode.Callback2 getReal() {
            return (android.view.ActionMode.Callback2) real;
        }

        public android.view.ActionMode.Callback2 unwrap() {
            return getReal();
        }

        public void onGetContentRect(com.micklab.dcg.wrapper.android.view.ActionMode arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
            ((android.view.ActionMode.Callback2) real).onGetContentRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

    }
}
