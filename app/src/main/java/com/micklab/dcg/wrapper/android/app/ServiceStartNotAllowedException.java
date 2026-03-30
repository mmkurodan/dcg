// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ServiceStartNotAllowedException {
    private final android.app.ServiceStartNotAllowedException real;

    public ServiceStartNotAllowedException(android.app.ServiceStartNotAllowedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ServiceStartNotAllowedException wrap(android.app.ServiceStartNotAllowedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ServiceStartNotAllowedException(real);
    }

    public android.app.ServiceStartNotAllowedException unwrap() {
        return real;
    }

    public java.lang.Throwable getCause() {
        return real.getCause();
    }

}
