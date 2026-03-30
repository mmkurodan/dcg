// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CredentialProviderService {
    private final android.service.credentials.CredentialProviderService real;

    public CredentialProviderService(android.service.credentials.CredentialProviderService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CredentialProviderService wrap(android.service.credentials.CredentialProviderService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CredentialProviderService(real);
    }

    public android.service.credentials.CredentialProviderService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCreate() {
        real.onCreate();
    }

    public static final java.lang.String EXTRA_BEGIN_GET_CREDENTIAL_REQUEST = android.service.credentials.CredentialProviderService.EXTRA_BEGIN_GET_CREDENTIAL_REQUEST;
    public static final java.lang.String EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE = android.service.credentials.CredentialProviderService.EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE;
    public static final java.lang.String EXTRA_CREATE_CREDENTIAL_EXCEPTION = android.service.credentials.CredentialProviderService.EXTRA_CREATE_CREDENTIAL_EXCEPTION;
    public static final java.lang.String EXTRA_CREATE_CREDENTIAL_REQUEST = android.service.credentials.CredentialProviderService.EXTRA_CREATE_CREDENTIAL_REQUEST;
    public static final java.lang.String EXTRA_CREATE_CREDENTIAL_RESPONSE = android.service.credentials.CredentialProviderService.EXTRA_CREATE_CREDENTIAL_RESPONSE;
    public static final java.lang.String EXTRA_GET_CREDENTIAL_EXCEPTION = android.service.credentials.CredentialProviderService.EXTRA_GET_CREDENTIAL_EXCEPTION;
    public static final java.lang.String EXTRA_GET_CREDENTIAL_REQUEST = android.service.credentials.CredentialProviderService.EXTRA_GET_CREDENTIAL_REQUEST;
    public static final java.lang.String EXTRA_GET_CREDENTIAL_RESPONSE = android.service.credentials.CredentialProviderService.EXTRA_GET_CREDENTIAL_RESPONSE;
    public static final java.lang.String SERVICE_INTERFACE = android.service.credentials.CredentialProviderService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.credentials.CredentialProviderService.SERVICE_META_DATA;

}
