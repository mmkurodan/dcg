// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyChain {
    private final android.security.KeyChain real;

    public KeyChain(android.security.KeyChain real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyChain wrap(android.security.KeyChain real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyChain(real);
    }

    public android.security.KeyChain unwrap() {
        return real;
    }

    public KeyChain() {
        this(new android.security.KeyChain());
    }

    public static void choosePrivateKeyAlias(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.security.KeyChainAliasCallback arg1, java.lang.String[] arg2, java.security.Principal[] arg3, com.micklab.dcg.wrapper.android.net.Uri arg4, java.lang.String arg5) {
        android.security.KeyChain.choosePrivateKeyAlias(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public static void choosePrivateKeyAlias(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.security.KeyChainAliasCallback arg1, java.lang.String[] arg2, java.security.Principal[] arg3, java.lang.String arg4, int arg5, java.lang.String arg6) {
        android.security.KeyChain.choosePrivateKeyAlias(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5, arg6);
    }

    public static com.micklab.dcg.wrapper.android.content.Intent createInstallIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.security.KeyChain.createInstallIntent());
    }

    public static com.micklab.dcg.wrapper.android.content.Intent createManageCredentialsIntent(com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.security.KeyChain.createManageCredentialsIntent(arg0 == null ? null : arg0.unwrap()));
    }

    public static java.security.cert.X509Certificate[] getCertificateChain(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) throws java.lang.InterruptedException, android.security.KeyChainException {
        return android.security.KeyChain.getCertificateChain(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy getCredentialManagementAppPolicy(com.micklab.dcg.wrapper.android.content.Context arg0) throws java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.security.AppUriAuthenticationPolicy.wrap(android.security.KeyChain.getCredentialManagementAppPolicy(arg0 == null ? null : arg0.unwrap()));
    }

    public static java.security.PrivateKey getPrivateKey(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) throws java.lang.InterruptedException, android.security.KeyChainException {
        return android.security.KeyChain.getPrivateKey(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static boolean isBoundKeyAlgorithm(java.lang.String arg0) {
        return android.security.KeyChain.isBoundKeyAlgorithm(arg0);
    }

    public static boolean isCredentialManagementApp(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.security.KeyChain.isCredentialManagementApp(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean isKeyAlgorithmSupported(java.lang.String arg0) {
        return android.security.KeyChain.isKeyAlgorithmSupported(arg0);
    }

    public static boolean removeCredentialManagementApp(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.security.KeyChain.removeCredentialManagementApp(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_KEYCHAIN_CHANGED = android.security.KeyChain.ACTION_KEYCHAIN_CHANGED;
    public static final java.lang.String ACTION_KEY_ACCESS_CHANGED = android.security.KeyChain.ACTION_KEY_ACCESS_CHANGED;
    public static final java.lang.String ACTION_STORAGE_CHANGED = android.security.KeyChain.ACTION_STORAGE_CHANGED;
    public static final java.lang.String ACTION_TRUST_STORE_CHANGED = android.security.KeyChain.ACTION_TRUST_STORE_CHANGED;
    public static final java.lang.String EXTRA_CERTIFICATE = android.security.KeyChain.EXTRA_CERTIFICATE;
    public static final java.lang.String EXTRA_KEY_ACCESSIBLE = android.security.KeyChain.EXTRA_KEY_ACCESSIBLE;
    public static final java.lang.String EXTRA_KEY_ALIAS = android.security.KeyChain.EXTRA_KEY_ALIAS;
    public static final java.lang.String EXTRA_NAME = android.security.KeyChain.EXTRA_NAME;
    public static final java.lang.String EXTRA_PKCS12 = android.security.KeyChain.EXTRA_PKCS12;
    public static final java.lang.String KEY_ALIAS_SELECTION_DENIED = android.security.KeyChain.KEY_ALIAS_SELECTION_DENIED;

}
