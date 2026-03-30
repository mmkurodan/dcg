// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.appsetid;

public final class AppSetId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppSetId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetId wrap(android.adservices.appsetid.AppSetId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetId(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.appsetid.AppSetId getReal() {
        return (android.adservices.appsetid.AppSetId) real;
    }

    public android.adservices.appsetid.AppSetId unwrap() {
        return getReal();
    }

    public AppSetId(java.lang.String arg0, int arg1) {
        this(new android.adservices.appsetid.AppSetId(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.appsetid.AppSetId) real).equals(arg0);
    }

    public java.lang.String getId() {
        return ((android.adservices.appsetid.AppSetId) real).getId();
    }

    public int getScope() {
        return ((android.adservices.appsetid.AppSetId) real).getScope();
    }

    public int hashCode() {
        return ((android.adservices.appsetid.AppSetId) real).hashCode();
    }

    public static final int SCOPE_APP = android.adservices.appsetid.AppSetId.SCOPE_APP;
    public static final int SCOPE_DEVELOPER = android.adservices.appsetid.AppSetId.SCOPE_DEVELOPER;

}
