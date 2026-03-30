// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.appsetid;

public final class AppSetIdManager {
    private final android.adservices.appsetid.AppSetIdManager real;

    public AppSetIdManager(android.adservices.appsetid.AppSetIdManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetIdManager wrap(android.adservices.appsetid.AppSetIdManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetIdManager(real);
    }

    public android.adservices.appsetid.AppSetIdManager unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetIdManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.appsetid.AppSetIdManager.wrap(android.adservices.appsetid.AppSetIdManager.get(arg0 == null ? null : arg0.unwrap()));
    }

}
