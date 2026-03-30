// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ClipboardManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ClipboardManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ClipboardManager wrap(android.content.ClipboardManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipboardManager(real, (__DcgwBridgeToken) null);
    }

    public android.content.ClipboardManager getReal() {
        return (android.content.ClipboardManager) real;
    }

    public android.content.ClipboardManager unwrap() {
        return getReal();
    }

    public void addPrimaryClipChangedListener(com.micklab.dcg.wrapper.android.content.ClipboardManager.OnPrimaryClipChangedListener arg0) {
        ((android.content.ClipboardManager) real).addPrimaryClipChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void clearPrimaryClip() {
        ((android.content.ClipboardManager) real).clearPrimaryClip();
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getPrimaryClip() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(((android.content.ClipboardManager) real).getPrimaryClip());
    }

    public com.micklab.dcg.wrapper.android.content.ClipDescription getPrimaryClipDescription() {
        return com.micklab.dcg.wrapper.android.content.ClipDescription.wrap(((android.content.ClipboardManager) real).getPrimaryClipDescription());
    }

    public java.lang.CharSequence getText() {
        return ((android.content.ClipboardManager) real).getText();
    }

    public boolean hasPrimaryClip() {
        return ((android.content.ClipboardManager) real).hasPrimaryClip();
    }

    public boolean hasText() {
        return ((android.content.ClipboardManager) real).hasText();
    }

    public void removePrimaryClipChangedListener(com.micklab.dcg.wrapper.android.content.ClipboardManager.OnPrimaryClipChangedListener arg0) {
        ((android.content.ClipboardManager) real).removePrimaryClipChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPrimaryClip(com.micklab.dcg.wrapper.android.content.ClipData arg0) {
        ((android.content.ClipboardManager) real).setPrimaryClip(arg0 == null ? null : arg0.getReal());
    }

    public void setText(java.lang.CharSequence arg0) {
        ((android.content.ClipboardManager) real).setText(arg0);
    }

    public static final class OnPrimaryClipChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnPrimaryClipChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ClipboardManager.OnPrimaryClipChangedListener wrap(android.content.ClipboardManager.OnPrimaryClipChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipboardManager.OnPrimaryClipChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.ClipboardManager.OnPrimaryClipChangedListener getReal() {
            return (android.content.ClipboardManager.OnPrimaryClipChangedListener) real;
        }

        public android.content.ClipboardManager.OnPrimaryClipChangedListener unwrap() {
            return getReal();
        }

        public void onPrimaryClipChanged() {
            ((android.content.ClipboardManager.OnPrimaryClipChangedListener) real).onPrimaryClipChanged();
        }

    }
}
