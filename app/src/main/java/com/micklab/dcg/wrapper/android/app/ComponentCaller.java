// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ComponentCaller {
    private final android.app.ComponentCaller real;

    public ComponentCaller(android.app.ComponentCaller real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ComponentCaller wrap(android.app.ComponentCaller real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ComponentCaller(real);
    }

    public android.app.ComponentCaller unwrap() {
        return real;
    }

    public int checkContentUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return real.checkContentUriPermission(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getPackage() {
        return real.getPackage();
    }

    public int getUid() {
        return real.getUid();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
