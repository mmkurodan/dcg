// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class TargetUser {
    private final android.app.admin.TargetUser real;

    public TargetUser(android.app.admin.TargetUser real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.TargetUser wrap(android.app.admin.TargetUser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.TargetUser(real);
    }

    public android.app.admin.TargetUser unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final com.micklab.dcg.wrapper.android.app.admin.TargetUser GLOBAL = com.micklab.dcg.wrapper.android.app.admin.TargetUser.wrap(android.app.admin.TargetUser.GLOBAL);
    public static final com.micklab.dcg.wrapper.android.app.admin.TargetUser LOCAL_USER = com.micklab.dcg.wrapper.android.app.admin.TargetUser.wrap(android.app.admin.TargetUser.LOCAL_USER);
    public static final com.micklab.dcg.wrapper.android.app.admin.TargetUser PARENT_USER = com.micklab.dcg.wrapper.android.app.admin.TargetUser.wrap(android.app.admin.TargetUser.PARENT_USER);
    public static final com.micklab.dcg.wrapper.android.app.admin.TargetUser UNKNOWN_USER = com.micklab.dcg.wrapper.android.app.admin.TargetUser.wrap(android.app.admin.TargetUser.UNKNOWN_USER);

}
