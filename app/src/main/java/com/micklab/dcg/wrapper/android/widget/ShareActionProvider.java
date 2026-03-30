// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ShareActionProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ShareActionProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ShareActionProvider wrap(android.widget.ShareActionProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ShareActionProvider(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ShareActionProvider getReal() {
        return (android.widget.ShareActionProvider) real;
    }

    public android.widget.ShareActionProvider unwrap() {
        return getReal();
    }

    public ShareActionProvider(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ShareActionProvider(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean hasSubMenu() {
        return ((android.widget.ShareActionProvider) real).hasSubMenu();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateActionView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ShareActionProvider) real).onCreateActionView());
    }

    public void onPrepareSubMenu(com.micklab.dcg.wrapper.android.view.SubMenu arg0) {
        ((android.widget.ShareActionProvider) real).onPrepareSubMenu(arg0 == null ? null : arg0.getReal());
    }

    public void setOnShareTargetSelectedListener(com.micklab.dcg.wrapper.android.widget.ShareActionProvider.OnShareTargetSelectedListener arg0) {
        ((android.widget.ShareActionProvider) real).setOnShareTargetSelectedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setShareHistoryFileName(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.widget.ShareActionProvider#setShareHistoryFileName(java.lang.String)");
    }

    public void setShareIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.widget.ShareActionProvider) real).setShareIntent(arg0 == null ? null : arg0.getReal());
    }


    public static final class OnShareTargetSelectedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnShareTargetSelectedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ShareActionProvider.OnShareTargetSelectedListener wrap(android.widget.ShareActionProvider.OnShareTargetSelectedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ShareActionProvider.OnShareTargetSelectedListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ShareActionProvider.OnShareTargetSelectedListener getReal() {
            return (android.widget.ShareActionProvider.OnShareTargetSelectedListener) real;
        }

        public android.widget.ShareActionProvider.OnShareTargetSelectedListener unwrap() {
            return getReal();
        }

        public boolean onShareTargetSelected(com.micklab.dcg.wrapper.android.widget.ShareActionProvider arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
            return ((android.widget.ShareActionProvider.OnShareTargetSelectedListener) real).onShareTargetSelected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
