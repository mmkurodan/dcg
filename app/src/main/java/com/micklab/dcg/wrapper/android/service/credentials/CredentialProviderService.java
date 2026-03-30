// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CredentialProviderService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CredentialProviderService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CredentialProviderService wrap(android.service.credentials.CredentialProviderService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CredentialProviderService(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.CredentialProviderService getReal() {
        return (android.service.credentials.CredentialProviderService) real;
    }

    public android.service.credentials.CredentialProviderService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.credentials.CredentialProviderService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCreate() {
        ((android.service.credentials.CredentialProviderService) real).onCreate();
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
