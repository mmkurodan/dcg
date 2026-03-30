// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyProperties {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyProperties(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyProperties wrap(android.security.keystore.KeyProperties real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyProperties(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.KeyProperties getReal() {
        return (android.security.keystore.KeyProperties) real;
    }

    public android.security.keystore.KeyProperties unwrap() {
        return getReal();
    }

    public static final int AUTH_BIOMETRIC_STRONG = android.security.keystore.KeyProperties.AUTH_BIOMETRIC_STRONG;
    public static final int AUTH_DEVICE_CREDENTIAL = android.security.keystore.KeyProperties.AUTH_DEVICE_CREDENTIAL;
    public static final java.lang.String BLOCK_MODE_CBC = android.security.keystore.KeyProperties.BLOCK_MODE_CBC;
    public static final java.lang.String BLOCK_MODE_CTR = android.security.keystore.KeyProperties.BLOCK_MODE_CTR;
    public static final java.lang.String BLOCK_MODE_ECB = android.security.keystore.KeyProperties.BLOCK_MODE_ECB;
    public static final java.lang.String BLOCK_MODE_GCM = android.security.keystore.KeyProperties.BLOCK_MODE_GCM;
    public static final java.lang.String DIGEST_MD5 = android.security.keystore.KeyProperties.DIGEST_MD5;
    public static final java.lang.String DIGEST_NONE = android.security.keystore.KeyProperties.DIGEST_NONE;
    public static final java.lang.String DIGEST_SHA1 = android.security.keystore.KeyProperties.DIGEST_SHA1;
    public static final java.lang.String DIGEST_SHA224 = android.security.keystore.KeyProperties.DIGEST_SHA224;
    public static final java.lang.String DIGEST_SHA256 = android.security.keystore.KeyProperties.DIGEST_SHA256;
    public static final java.lang.String DIGEST_SHA384 = android.security.keystore.KeyProperties.DIGEST_SHA384;
    public static final java.lang.String DIGEST_SHA512 = android.security.keystore.KeyProperties.DIGEST_SHA512;
    public static final java.lang.String ENCRYPTION_PADDING_NONE = android.security.keystore.KeyProperties.ENCRYPTION_PADDING_NONE;
    public static final java.lang.String ENCRYPTION_PADDING_PKCS7 = android.security.keystore.KeyProperties.ENCRYPTION_PADDING_PKCS7;
    public static final java.lang.String ENCRYPTION_PADDING_RSA_OAEP = android.security.keystore.KeyProperties.ENCRYPTION_PADDING_RSA_OAEP;
    public static final java.lang.String ENCRYPTION_PADDING_RSA_PKCS1 = android.security.keystore.KeyProperties.ENCRYPTION_PADDING_RSA_PKCS1;
    public static final java.lang.String KEY_ALGORITHM_3DES = android.security.keystore.KeyProperties.KEY_ALGORITHM_3DES;
    public static final java.lang.String KEY_ALGORITHM_AES = android.security.keystore.KeyProperties.KEY_ALGORITHM_AES;
    public static final java.lang.String KEY_ALGORITHM_EC = android.security.keystore.KeyProperties.KEY_ALGORITHM_EC;
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA1 = android.security.keystore.KeyProperties.KEY_ALGORITHM_HMAC_SHA1;
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA224 = android.security.keystore.KeyProperties.KEY_ALGORITHM_HMAC_SHA224;
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA256 = android.security.keystore.KeyProperties.KEY_ALGORITHM_HMAC_SHA256;
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA384 = android.security.keystore.KeyProperties.KEY_ALGORITHM_HMAC_SHA384;
    public static final java.lang.String KEY_ALGORITHM_HMAC_SHA512 = android.security.keystore.KeyProperties.KEY_ALGORITHM_HMAC_SHA512;
    public static final java.lang.String KEY_ALGORITHM_RSA = android.security.keystore.KeyProperties.KEY_ALGORITHM_RSA;
    public static final int ORIGIN_GENERATED = android.security.keystore.KeyProperties.ORIGIN_GENERATED;
    public static final int ORIGIN_IMPORTED = android.security.keystore.KeyProperties.ORIGIN_IMPORTED;
    public static final int ORIGIN_SECURELY_IMPORTED = android.security.keystore.KeyProperties.ORIGIN_SECURELY_IMPORTED;
    public static final int ORIGIN_UNKNOWN = android.security.keystore.KeyProperties.ORIGIN_UNKNOWN;
    public static final int PURPOSE_AGREE_KEY = android.security.keystore.KeyProperties.PURPOSE_AGREE_KEY;
    public static final int PURPOSE_ATTEST_KEY = android.security.keystore.KeyProperties.PURPOSE_ATTEST_KEY;
    public static final int PURPOSE_DECRYPT = android.security.keystore.KeyProperties.PURPOSE_DECRYPT;
    public static final int PURPOSE_ENCRYPT = android.security.keystore.KeyProperties.PURPOSE_ENCRYPT;
    public static final int PURPOSE_SIGN = android.security.keystore.KeyProperties.PURPOSE_SIGN;
    public static final int PURPOSE_VERIFY = android.security.keystore.KeyProperties.PURPOSE_VERIFY;
    public static final int PURPOSE_WRAP_KEY = android.security.keystore.KeyProperties.PURPOSE_WRAP_KEY;
    public static final int SECURITY_LEVEL_SOFTWARE = android.security.keystore.KeyProperties.SECURITY_LEVEL_SOFTWARE;
    public static final int SECURITY_LEVEL_STRONGBOX = android.security.keystore.KeyProperties.SECURITY_LEVEL_STRONGBOX;
    public static final int SECURITY_LEVEL_TRUSTED_ENVIRONMENT = android.security.keystore.KeyProperties.SECURITY_LEVEL_TRUSTED_ENVIRONMENT;
    public static final int SECURITY_LEVEL_UNKNOWN = android.security.keystore.KeyProperties.SECURITY_LEVEL_UNKNOWN;
    public static final int SECURITY_LEVEL_UNKNOWN_SECURE = android.security.keystore.KeyProperties.SECURITY_LEVEL_UNKNOWN_SECURE;
    public static final java.lang.String SIGNATURE_PADDING_RSA_PKCS1 = android.security.keystore.KeyProperties.SIGNATURE_PADDING_RSA_PKCS1;
    public static final java.lang.String SIGNATURE_PADDING_RSA_PSS = android.security.keystore.KeyProperties.SIGNATURE_PADDING_RSA_PSS;
    public static final int UNRESTRICTED_USAGE_COUNT = android.security.keystore.KeyProperties.UNRESTRICTED_USAGE_COUNT;

}
