// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class LauncherActivity {
    private final android.app.LauncherActivity real;

    public LauncherActivity(android.app.LauncherActivity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.LauncherActivity wrap(android.app.LauncherActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.LauncherActivity(real);
    }

    public android.app.LauncherActivity unwrap() {
        return real;
    }

    public void setTitle(java.lang.CharSequence arg0) {
        real.setTitle(arg0);
    }

    public void setTitle(int arg0) {
        real.setTitle(arg0);
    }

    public static final class ListItem {
        private final android.app.LauncherActivity.ListItem real;

        public ListItem(android.app.LauncherActivity.ListItem real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.LauncherActivity.ListItem wrap(android.app.LauncherActivity.ListItem real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.LauncherActivity.ListItem(real);
        }

        public android.app.LauncherActivity.ListItem unwrap() {
            return real;
        }

        public ListItem() {
            this(new android.app.LauncherActivity.ListItem());
        }


    }
}
