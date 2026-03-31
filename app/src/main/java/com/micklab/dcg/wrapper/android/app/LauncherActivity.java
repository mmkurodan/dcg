// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class LauncherActivity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LauncherActivity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.LauncherActivity wrap(android.app.LauncherActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.LauncherActivity(real, (__DcgwBridgeToken) null);
    }

    public android.app.LauncherActivity getReal() {
        return (android.app.LauncherActivity) real;
    }

    public android.app.LauncherActivity unwrap() {
        return getReal();
    }

    public void setTitle(int arg0) {
        ((android.app.LauncherActivity) real).setTitle(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        ((android.app.LauncherActivity) real).setTitle(arg0);
    }

    public static final class ListItem {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ListItem(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.LauncherActivity.ListItem wrap(android.app.LauncherActivity.ListItem real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.LauncherActivity.ListItem(real, (__DcgwBridgeToken) null);
        }

        public android.app.LauncherActivity.ListItem getReal() {
            return (android.app.LauncherActivity.ListItem) real;
        }

        public android.app.LauncherActivity.ListItem unwrap() {
            return getReal();
        }

        public ListItem() {
            this(new android.app.LauncherActivity.ListItem(), (__DcgwBridgeToken) null);
        }


    }
}
