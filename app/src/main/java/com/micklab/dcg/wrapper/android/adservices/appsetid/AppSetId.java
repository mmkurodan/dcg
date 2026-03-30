// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.appsetid;

public final class AppSetId {
    private final android.adservices.appsetid.AppSetId real;

    public AppSetId(android.adservices.appsetid.AppSetId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetId wrap(android.adservices.appsetid.AppSetId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetId(real);
    }

    public android.adservices.appsetid.AppSetId unwrap() {
        return real;
    }

    public AppSetId(java.lang.String arg0, int arg1) {
        this(new android.adservices.appsetid.AppSetId(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public int getScope() {
        return real.getScope();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final int SCOPE_APP = android.adservices.appsetid.AppSetId.SCOPE_APP;
    public static final int SCOPE_DEVELOPER = android.adservices.appsetid.AppSetId.SCOPE_DEVELOPER;

}
