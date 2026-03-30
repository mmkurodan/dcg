// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ClipboardManager {
    private final android.content.ClipboardManager real;

    public ClipboardManager(android.content.ClipboardManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ClipboardManager wrap(android.content.ClipboardManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipboardManager(real);
    }

    public android.content.ClipboardManager unwrap() {
        return real;
    }

    public void addPrimaryClipChangedListener(com.micklab.dcg.wrapper.android.content.ClipboardManager.OnPrimaryClipChangedListener arg0) {
        real.addPrimaryClipChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void clearPrimaryClip() {
        real.clearPrimaryClip();
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getPrimaryClip() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(real.getPrimaryClip());
    }

    public com.micklab.dcg.wrapper.android.content.ClipDescription getPrimaryClipDescription() {
        return com.micklab.dcg.wrapper.android.content.ClipDescription.wrap(real.getPrimaryClipDescription());
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public boolean hasPrimaryClip() {
        return real.hasPrimaryClip();
    }

    public boolean hasText() {
        return real.hasText();
    }

    public void removePrimaryClipChangedListener(com.micklab.dcg.wrapper.android.content.ClipboardManager.OnPrimaryClipChangedListener arg0) {
        real.removePrimaryClipChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPrimaryClip(com.micklab.dcg.wrapper.android.content.ClipData arg0) {
        real.setPrimaryClip(arg0 == null ? null : arg0.unwrap());
    }

    public void setText(java.lang.CharSequence arg0) {
        real.setText(arg0);
    }

    public static final class OnPrimaryClipChangedListener {
        private final android.content.ClipboardManager.OnPrimaryClipChangedListener real;

        public OnPrimaryClipChangedListener(android.content.ClipboardManager.OnPrimaryClipChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ClipboardManager.OnPrimaryClipChangedListener wrap(android.content.ClipboardManager.OnPrimaryClipChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ClipboardManager.OnPrimaryClipChangedListener(real);
        }

        public android.content.ClipboardManager.OnPrimaryClipChangedListener unwrap() {
            return real;
        }

        public void onPrimaryClipChanged() {
            real.onPrimaryClipChanged();
        }

    }
}
