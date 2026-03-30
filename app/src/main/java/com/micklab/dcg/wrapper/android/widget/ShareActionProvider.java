// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ShareActionProvider {
    private final android.widget.ShareActionProvider real;

    public ShareActionProvider(android.widget.ShareActionProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ShareActionProvider wrap(android.widget.ShareActionProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ShareActionProvider(real);
    }

    public android.widget.ShareActionProvider unwrap() {
        return real;
    }

    public ShareActionProvider(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ShareActionProvider(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean hasSubMenu() {
        return real.hasSubMenu();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateActionView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateActionView());
    }

    public void onPrepareSubMenu(com.micklab.dcg.wrapper.android.view.SubMenu arg0) {
        real.onPrepareSubMenu(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnShareTargetSelectedListener(com.micklab.dcg.wrapper.android.widget.ShareActionProvider.OnShareTargetSelectedListener arg0) {
        real.setOnShareTargetSelectedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setShareHistoryFileName(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.widget.ShareActionProvider#setShareHistoryFileName(java.lang.String)");
    }

    public void setShareIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.setShareIntent(arg0 == null ? null : arg0.unwrap());
    }


    public static final class OnShareTargetSelectedListener {
        private final android.widget.ShareActionProvider.OnShareTargetSelectedListener real;

        public OnShareTargetSelectedListener(android.widget.ShareActionProvider.OnShareTargetSelectedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ShareActionProvider.OnShareTargetSelectedListener wrap(android.widget.ShareActionProvider.OnShareTargetSelectedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ShareActionProvider.OnShareTargetSelectedListener(real);
        }

        public android.widget.ShareActionProvider.OnShareTargetSelectedListener unwrap() {
            return real;
        }

        public boolean onShareTargetSelected(com.micklab.dcg.wrapper.android.widget.ShareActionProvider arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
            return real.onShareTargetSelected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
