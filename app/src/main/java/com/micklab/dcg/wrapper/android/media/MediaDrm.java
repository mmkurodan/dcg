// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDrm {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaDrm(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDrm wrap(android.media.MediaDrm real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaDrm getReal() {
        return (android.media.MediaDrm) real;
    }

    public android.media.MediaDrm unwrap() {
        return getReal();
    }

    public MediaDrm(java.util.UUID arg0) throws android.media.UnsupportedSchemeException {
        this(new android.media.MediaDrm(arg0), (__DcgwBridgeToken) null);
    }

    public void clearOnEventListener() {
        ((android.media.MediaDrm) real).clearOnEventListener();
    }

    public void clearOnExpirationUpdateListener() {
        ((android.media.MediaDrm) real).clearOnExpirationUpdateListener();
    }

    public void clearOnKeyStatusChangeListener() {
        ((android.media.MediaDrm) real).clearOnKeyStatusChangeListener();
    }

    public void clearOnSessionLostStateListener() {
        ((android.media.MediaDrm) real).clearOnSessionLostStateListener();
    }

    public void close() {
        ((android.media.MediaDrm) real).close();
    }

    public void closeSession(byte[] arg0) {
        ((android.media.MediaDrm) real).closeSession(arg0);
    }

    public int getConnectedHdcpLevel() {
        return ((android.media.MediaDrm) real).getConnectedHdcpLevel();
    }

    public android.media.MediaDrm.CryptoSession getCryptoSession(byte[] arg0, java.lang.String arg1, java.lang.String arg2) {
        return ((android.media.MediaDrm) real).getCryptoSession(arg0, arg1, arg2);
    }

    public int getMaxHdcpLevel() {
        return ((android.media.MediaDrm) real).getMaxHdcpLevel();
    }

    public static int getMaxSecurityLevel() {
        return android.media.MediaDrm.getMaxSecurityLevel();
    }

    public int getMaxSessionCount() {
        return ((android.media.MediaDrm) real).getMaxSessionCount();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.media.MediaDrm) real).getMetrics());
    }

    public int getOfflineLicenseState(byte[] arg0) {
        return ((android.media.MediaDrm) real).getOfflineLicenseState(arg0);
    }

    public int getOpenSessionCount() {
        return ((android.media.MediaDrm) real).getOpenSessionCount();
    }

    public android.media.MediaDrm.PlaybackComponent getPlaybackComponent(byte[] arg0) {
        return ((android.media.MediaDrm) real).getPlaybackComponent(arg0);
    }

    public byte[] getPropertyByteArray(java.lang.String arg0) {
        return ((android.media.MediaDrm) real).getPropertyByteArray(arg0);
    }

    public java.lang.String getPropertyString(java.lang.String arg0) {
        return ((android.media.MediaDrm) real).getPropertyString(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.MediaDrm.ProvisionRequest getProvisionRequest() {
        return com.micklab.dcg.wrapper.android.media.MediaDrm.ProvisionRequest.wrap(((android.media.MediaDrm) real).getProvisionRequest());
    }

    public byte[] getSecureStop(byte[] arg0) {
        return ((android.media.MediaDrm) real).getSecureStop(arg0);
    }

    public int getSecurityLevel(byte[] arg0) {
        return ((android.media.MediaDrm) real).getSecurityLevel(arg0);
    }

    public static boolean isCryptoSchemeSupported(java.util.UUID arg0) {
        return android.media.MediaDrm.isCryptoSchemeSupported(arg0);
    }

    public static boolean isCryptoSchemeSupported(java.util.UUID arg0, java.lang.String arg1) {
        return android.media.MediaDrm.isCryptoSchemeSupported(arg0, arg1);
    }

    public static boolean isCryptoSchemeSupported(java.util.UUID arg0, java.lang.String arg1, int arg2) {
        return android.media.MediaDrm.isCryptoSchemeSupported(arg0, arg1, arg2);
    }

    public byte[] openSession() throws android.media.NotProvisionedException, android.media.ResourceBusyException {
        return ((android.media.MediaDrm) real).openSession();
    }

    public byte[] openSession(int arg0) throws android.media.NotProvisionedException, android.media.ResourceBusyException {
        return ((android.media.MediaDrm) real).openSession(arg0);
    }

    public byte[] provideKeyResponse(byte[] arg0, byte[] arg1) throws android.media.DeniedByServerException, android.media.NotProvisionedException {
        return ((android.media.MediaDrm) real).provideKeyResponse(arg0, arg1);
    }

    public void provideProvisionResponse(byte[] arg0) throws android.media.DeniedByServerException {
        ((android.media.MediaDrm) real).provideProvisionResponse(arg0);
    }

    public void release() {
        ((android.media.MediaDrm) real).release();
    }

    public void releaseAllSecureStops() {
        ((android.media.MediaDrm) real).releaseAllSecureStops();
    }

    public void releaseSecureStops(byte[] arg0) {
        ((android.media.MediaDrm) real).releaseSecureStops(arg0);
    }

    public void removeAllSecureStops() {
        ((android.media.MediaDrm) real).removeAllSecureStops();
    }

    public void removeKeys(byte[] arg0) {
        ((android.media.MediaDrm) real).removeKeys(arg0);
    }

    public void removeOfflineLicense(byte[] arg0) {
        ((android.media.MediaDrm) real).removeOfflineLicense(arg0);
    }

    public void removeSecureStop(byte[] arg0) {
        ((android.media.MediaDrm) real).removeSecureStop(arg0);
    }

    public boolean requiresSecureDecoder(java.lang.String arg0) {
        return ((android.media.MediaDrm) real).requiresSecureDecoder(arg0);
    }

    public boolean requiresSecureDecoder(java.lang.String arg0, int arg1) {
        return ((android.media.MediaDrm) real).requiresSecureDecoder(arg0, arg1);
    }

    public void restoreKeys(byte[] arg0, byte[] arg1) {
        ((android.media.MediaDrm) real).restoreKeys(arg0, arg1);
    }

    public void setOnEventListener(com.micklab.dcg.wrapper.android.media.MediaDrm.OnEventListener arg0) {
        ((android.media.MediaDrm) real).setOnEventListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnEventListener(com.micklab.dcg.wrapper.android.media.MediaDrm.OnEventListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaDrm) real).setOnEventListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnEventListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaDrm.OnEventListener arg1) {
        ((android.media.MediaDrm) real).setOnEventListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnExpirationUpdateListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaDrm.OnExpirationUpdateListener arg1) {
        ((android.media.MediaDrm) real).setOnExpirationUpdateListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnExpirationUpdateListener(com.micklab.dcg.wrapper.android.media.MediaDrm.OnExpirationUpdateListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaDrm) real).setOnExpirationUpdateListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnKeyStatusChangeListener(com.micklab.dcg.wrapper.android.media.MediaDrm.OnKeyStatusChangeListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaDrm) real).setOnKeyStatusChangeListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnKeyStatusChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaDrm.OnKeyStatusChangeListener arg1) {
        ((android.media.MediaDrm) real).setOnKeyStatusChangeListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnSessionLostStateListener(com.micklab.dcg.wrapper.android.media.MediaDrm.OnSessionLostStateListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaDrm) real).setOnSessionLostStateListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnSessionLostStateListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaDrm.OnSessionLostStateListener arg1) {
        ((android.media.MediaDrm) real).setOnSessionLostStateListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setPropertyByteArray(java.lang.String arg0, byte[] arg1) {
        ((android.media.MediaDrm) real).setPropertyByteArray(arg0, arg1);
    }

    public void setPropertyString(java.lang.String arg0, java.lang.String arg1) {
        ((android.media.MediaDrm) real).setPropertyString(arg0, arg1);
    }

    public static final int EVENT_KEY_EXPIRED = android.media.MediaDrm.EVENT_KEY_EXPIRED;
    public static final int EVENT_KEY_REQUIRED = android.media.MediaDrm.EVENT_KEY_REQUIRED;
    public static final int EVENT_PROVISION_REQUIRED = android.media.MediaDrm.EVENT_PROVISION_REQUIRED;
    public static final int EVENT_SESSION_RECLAIMED = android.media.MediaDrm.EVENT_SESSION_RECLAIMED;
    public static final int EVENT_VENDOR_DEFINED = android.media.MediaDrm.EVENT_VENDOR_DEFINED;
    public static final int HDCP_LEVEL_UNKNOWN = android.media.MediaDrm.HDCP_LEVEL_UNKNOWN;
    public static final int HDCP_NONE = android.media.MediaDrm.HDCP_NONE;
    public static final int HDCP_NO_DIGITAL_OUTPUT = android.media.MediaDrm.HDCP_NO_DIGITAL_OUTPUT;
    public static final int HDCP_V1 = android.media.MediaDrm.HDCP_V1;
    public static final int HDCP_V2 = android.media.MediaDrm.HDCP_V2;
    public static final int HDCP_V2_1 = android.media.MediaDrm.HDCP_V2_1;
    public static final int HDCP_V2_2 = android.media.MediaDrm.HDCP_V2_2;
    public static final int HDCP_V2_3 = android.media.MediaDrm.HDCP_V2_3;
    public static final int KEY_TYPE_OFFLINE = android.media.MediaDrm.KEY_TYPE_OFFLINE;
    public static final int KEY_TYPE_RELEASE = android.media.MediaDrm.KEY_TYPE_RELEASE;
    public static final int KEY_TYPE_STREAMING = android.media.MediaDrm.KEY_TYPE_STREAMING;
    public static final int OFFLINE_LICENSE_STATE_RELEASED = android.media.MediaDrm.OFFLINE_LICENSE_STATE_RELEASED;
    public static final int OFFLINE_LICENSE_STATE_UNKNOWN = android.media.MediaDrm.OFFLINE_LICENSE_STATE_UNKNOWN;
    public static final int OFFLINE_LICENSE_STATE_USABLE = android.media.MediaDrm.OFFLINE_LICENSE_STATE_USABLE;
    public static final java.lang.String PROPERTY_ALGORITHMS = android.media.MediaDrm.PROPERTY_ALGORITHMS;
    public static final java.lang.String PROPERTY_DESCRIPTION = android.media.MediaDrm.PROPERTY_DESCRIPTION;
    public static final java.lang.String PROPERTY_DEVICE_UNIQUE_ID = android.media.MediaDrm.PROPERTY_DEVICE_UNIQUE_ID;
    public static final java.lang.String PROPERTY_VENDOR = android.media.MediaDrm.PROPERTY_VENDOR;
    public static final java.lang.String PROPERTY_VERSION = android.media.MediaDrm.PROPERTY_VERSION;
    public static final int SECURITY_LEVEL_HW_SECURE_ALL = android.media.MediaDrm.SECURITY_LEVEL_HW_SECURE_ALL;
    public static final int SECURITY_LEVEL_HW_SECURE_CRYPTO = android.media.MediaDrm.SECURITY_LEVEL_HW_SECURE_CRYPTO;
    public static final int SECURITY_LEVEL_HW_SECURE_DECODE = android.media.MediaDrm.SECURITY_LEVEL_HW_SECURE_DECODE;
    public static final int SECURITY_LEVEL_SW_SECURE_CRYPTO = android.media.MediaDrm.SECURITY_LEVEL_SW_SECURE_CRYPTO;
    public static final int SECURITY_LEVEL_SW_SECURE_DECODE = android.media.MediaDrm.SECURITY_LEVEL_SW_SECURE_DECODE;
    public static final int SECURITY_LEVEL_UNKNOWN = android.media.MediaDrm.SECURITY_LEVEL_UNKNOWN;

    public static final class ErrorCodes {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ErrorCodes(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.ErrorCodes wrap(android.media.MediaDrm.ErrorCodes real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.ErrorCodes(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.ErrorCodes getReal() {
            return (android.media.MediaDrm.ErrorCodes) real;
        }

        public android.media.MediaDrm.ErrorCodes unwrap() {
            return getReal();
        }

        public static final int ERROR_CERTIFICATE_MALFORMED = android.media.MediaDrm.ErrorCodes.ERROR_CERTIFICATE_MALFORMED;
        public static final int ERROR_CERTIFICATE_MISSING = android.media.MediaDrm.ErrorCodes.ERROR_CERTIFICATE_MISSING;
        public static final int ERROR_CRYPTO_LIBRARY = android.media.MediaDrm.ErrorCodes.ERROR_CRYPTO_LIBRARY;
        public static final int ERROR_FRAME_TOO_LARGE = android.media.MediaDrm.ErrorCodes.ERROR_FRAME_TOO_LARGE;
        public static final int ERROR_GENERIC_OEM = android.media.MediaDrm.ErrorCodes.ERROR_GENERIC_OEM;
        public static final int ERROR_GENERIC_PLUGIN = android.media.MediaDrm.ErrorCodes.ERROR_GENERIC_PLUGIN;
        public static final int ERROR_INIT_DATA = android.media.MediaDrm.ErrorCodes.ERROR_INIT_DATA;
        public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = android.media.MediaDrm.ErrorCodes.ERROR_INSUFFICIENT_OUTPUT_PROTECTION;
        public static final int ERROR_INSUFFICIENT_SECURITY = android.media.MediaDrm.ErrorCodes.ERROR_INSUFFICIENT_SECURITY;
        public static final int ERROR_KEY_EXPIRED = android.media.MediaDrm.ErrorCodes.ERROR_KEY_EXPIRED;
        public static final int ERROR_KEY_NOT_LOADED = android.media.MediaDrm.ErrorCodes.ERROR_KEY_NOT_LOADED;
        public static final int ERROR_LICENSE_PARSE = android.media.MediaDrm.ErrorCodes.ERROR_LICENSE_PARSE;
        public static final int ERROR_LICENSE_POLICY = android.media.MediaDrm.ErrorCodes.ERROR_LICENSE_POLICY;
        public static final int ERROR_LICENSE_RELEASE = android.media.MediaDrm.ErrorCodes.ERROR_LICENSE_RELEASE;
        public static final int ERROR_LICENSE_REQUEST_REJECTED = android.media.MediaDrm.ErrorCodes.ERROR_LICENSE_REQUEST_REJECTED;
        public static final int ERROR_LICENSE_RESTORE = android.media.MediaDrm.ErrorCodes.ERROR_LICENSE_RESTORE;
        public static final int ERROR_LICENSE_STATE = android.media.MediaDrm.ErrorCodes.ERROR_LICENSE_STATE;
        public static final int ERROR_LOST_STATE = android.media.MediaDrm.ErrorCodes.ERROR_LOST_STATE;
        public static final int ERROR_MEDIA_FRAMEWORK = android.media.MediaDrm.ErrorCodes.ERROR_MEDIA_FRAMEWORK;
        public static final int ERROR_NO_KEY = android.media.MediaDrm.ErrorCodes.ERROR_NO_KEY;
        public static final int ERROR_PROVISIONING_CERTIFICATE = android.media.MediaDrm.ErrorCodes.ERROR_PROVISIONING_CERTIFICATE;
        public static final int ERROR_PROVISIONING_CONFIG = android.media.MediaDrm.ErrorCodes.ERROR_PROVISIONING_CONFIG;
        public static final int ERROR_PROVISIONING_PARSE = android.media.MediaDrm.ErrorCodes.ERROR_PROVISIONING_PARSE;
        public static final int ERROR_PROVISIONING_REQUEST_REJECTED = android.media.MediaDrm.ErrorCodes.ERROR_PROVISIONING_REQUEST_REJECTED;
        public static final int ERROR_PROVISIONING_RETRY = android.media.MediaDrm.ErrorCodes.ERROR_PROVISIONING_RETRY;
        public static final int ERROR_RESOURCE_BUSY = android.media.MediaDrm.ErrorCodes.ERROR_RESOURCE_BUSY;
        public static final int ERROR_RESOURCE_CONTENTION = android.media.MediaDrm.ErrorCodes.ERROR_RESOURCE_CONTENTION;
        public static final int ERROR_SECURE_STOP_RELEASE = android.media.MediaDrm.ErrorCodes.ERROR_SECURE_STOP_RELEASE;
        public static final int ERROR_SESSION_NOT_OPENED = android.media.MediaDrm.ErrorCodes.ERROR_SESSION_NOT_OPENED;
        public static final int ERROR_STORAGE_READ = android.media.MediaDrm.ErrorCodes.ERROR_STORAGE_READ;
        public static final int ERROR_STORAGE_WRITE = android.media.MediaDrm.ErrorCodes.ERROR_STORAGE_WRITE;
        public static final int ERROR_UNKNOWN = android.media.MediaDrm.ErrorCodes.ERROR_UNKNOWN;
        public static final int ERROR_UNSUPPORTED_OPERATION = android.media.MediaDrm.ErrorCodes.ERROR_UNSUPPORTED_OPERATION;
        public static final int ERROR_ZERO_SUBSAMPLES = android.media.MediaDrm.ErrorCodes.ERROR_ZERO_SUBSAMPLES;

    }
    public static final class KeyRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private KeyRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.KeyRequest wrap(android.media.MediaDrm.KeyRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.KeyRequest(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.KeyRequest getReal() {
            return (android.media.MediaDrm.KeyRequest) real;
        }

        public android.media.MediaDrm.KeyRequest unwrap() {
            return getReal();
        }

        public byte[] getData() {
            return ((android.media.MediaDrm.KeyRequest) real).getData();
        }

        public java.lang.String getDefaultUrl() {
            return ((android.media.MediaDrm.KeyRequest) real).getDefaultUrl();
        }

        public int getRequestType() {
            return ((android.media.MediaDrm.KeyRequest) real).getRequestType();
        }

        public static final int REQUEST_TYPE_INITIAL = android.media.MediaDrm.KeyRequest.REQUEST_TYPE_INITIAL;
        public static final int REQUEST_TYPE_NONE = android.media.MediaDrm.KeyRequest.REQUEST_TYPE_NONE;
        public static final int REQUEST_TYPE_RELEASE = android.media.MediaDrm.KeyRequest.REQUEST_TYPE_RELEASE;
        public static final int REQUEST_TYPE_RENEWAL = android.media.MediaDrm.KeyRequest.REQUEST_TYPE_RENEWAL;
        public static final int REQUEST_TYPE_UPDATE = android.media.MediaDrm.KeyRequest.REQUEST_TYPE_UPDATE;

    }
    public static final class KeyStatus {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private KeyStatus(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.KeyStatus wrap(android.media.MediaDrm.KeyStatus real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.KeyStatus(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.KeyStatus getReal() {
            return (android.media.MediaDrm.KeyStatus) real;
        }

        public android.media.MediaDrm.KeyStatus unwrap() {
            return getReal();
        }

        public byte[] getKeyId() {
            return ((android.media.MediaDrm.KeyStatus) real).getKeyId();
        }

        public int getStatusCode() {
            return ((android.media.MediaDrm.KeyStatus) real).getStatusCode();
        }

        public static final int STATUS_EXPIRED = android.media.MediaDrm.KeyStatus.STATUS_EXPIRED;
        public static final int STATUS_INTERNAL_ERROR = android.media.MediaDrm.KeyStatus.STATUS_INTERNAL_ERROR;
        public static final int STATUS_OUTPUT_NOT_ALLOWED = android.media.MediaDrm.KeyStatus.STATUS_OUTPUT_NOT_ALLOWED;
        public static final int STATUS_PENDING = android.media.MediaDrm.KeyStatus.STATUS_PENDING;
        public static final int STATUS_USABLE = android.media.MediaDrm.KeyStatus.STATUS_USABLE;
        public static final int STATUS_USABLE_IN_FUTURE = android.media.MediaDrm.KeyStatus.STATUS_USABLE_IN_FUTURE;

    }
    public static final class LogMessage {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LogMessage(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.LogMessage wrap(android.media.MediaDrm.LogMessage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.LogMessage(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.LogMessage getReal() {
            return (android.media.MediaDrm.LogMessage) real;
        }

        public android.media.MediaDrm.LogMessage unwrap() {
            return getReal();
        }

        public java.lang.String getMessage() {
            return ((android.media.MediaDrm.LogMessage) real).getMessage();
        }

        public int getPriority() {
            return ((android.media.MediaDrm.LogMessage) real).getPriority();
        }

        public long getTimestampMillis() {
            return ((android.media.MediaDrm.LogMessage) real).getTimestampMillis();
        }

        public java.lang.String toString() {
            return ((android.media.MediaDrm.LogMessage) real).toString();
        }

    }
    public static final class MediaDrmStateException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaDrmStateException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.MediaDrmStateException wrap(android.media.MediaDrm.MediaDrmStateException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.MediaDrmStateException(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.MediaDrmStateException getReal() {
            return (android.media.MediaDrm.MediaDrmStateException) real;
        }

        public android.media.MediaDrm.MediaDrmStateException unwrap() {
            return getReal();
        }

        public java.lang.String getDiagnosticInfo() {
            return ((android.media.MediaDrm.MediaDrmStateException) real).getDiagnosticInfo();
        }

        public int getErrorCode() {
            return ((android.media.MediaDrm.MediaDrmStateException) real).getErrorCode();
        }

        public int getErrorContext() {
            return ((android.media.MediaDrm.MediaDrmStateException) real).getErrorContext();
        }

        public int getOemError() {
            return ((android.media.MediaDrm.MediaDrmStateException) real).getOemError();
        }

        public int getVendorError() {
            return ((android.media.MediaDrm.MediaDrmStateException) real).getVendorError();
        }

        public boolean isTransient() {
            return ((android.media.MediaDrm.MediaDrmStateException) real).isTransient();
        }

    }
    public static final class MetricsConstants {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MetricsConstants(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.MetricsConstants wrap(android.media.MediaDrm.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.MetricsConstants(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.MetricsConstants getReal() {
            return (android.media.MediaDrm.MetricsConstants) real;
        }

        public android.media.MediaDrm.MetricsConstants unwrap() {
            return getReal();
        }

        public static final java.lang.String CLOSE_SESSION_ERROR_COUNT = android.media.MediaDrm.MetricsConstants.CLOSE_SESSION_ERROR_COUNT;
        public static final java.lang.String CLOSE_SESSION_ERROR_LIST = android.media.MediaDrm.MetricsConstants.CLOSE_SESSION_ERROR_LIST;
        public static final java.lang.String CLOSE_SESSION_OK_COUNT = android.media.MediaDrm.MetricsConstants.CLOSE_SESSION_OK_COUNT;
        public static final java.lang.String EVENT_KEY_EXPIRED_COUNT = android.media.MediaDrm.MetricsConstants.EVENT_KEY_EXPIRED_COUNT;
        public static final java.lang.String EVENT_KEY_NEEDED_COUNT = android.media.MediaDrm.MetricsConstants.EVENT_KEY_NEEDED_COUNT;
        public static final java.lang.String EVENT_PROVISION_REQUIRED_COUNT = android.media.MediaDrm.MetricsConstants.EVENT_PROVISION_REQUIRED_COUNT;
        public static final java.lang.String EVENT_SESSION_RECLAIMED_COUNT = android.media.MediaDrm.MetricsConstants.EVENT_SESSION_RECLAIMED_COUNT;
        public static final java.lang.String EVENT_VENDOR_DEFINED_COUNT = android.media.MediaDrm.MetricsConstants.EVENT_VENDOR_DEFINED_COUNT;
        public static final java.lang.String GET_DEVICE_UNIQUE_ID_ERROR_COUNT = android.media.MediaDrm.MetricsConstants.GET_DEVICE_UNIQUE_ID_ERROR_COUNT;
        public static final java.lang.String GET_DEVICE_UNIQUE_ID_ERROR_LIST = android.media.MediaDrm.MetricsConstants.GET_DEVICE_UNIQUE_ID_ERROR_LIST;
        public static final java.lang.String GET_DEVICE_UNIQUE_ID_OK_COUNT = android.media.MediaDrm.MetricsConstants.GET_DEVICE_UNIQUE_ID_OK_COUNT;
        public static final java.lang.String GET_KEY_REQUEST_ERROR_COUNT = android.media.MediaDrm.MetricsConstants.GET_KEY_REQUEST_ERROR_COUNT;
        public static final java.lang.String GET_KEY_REQUEST_ERROR_LIST = android.media.MediaDrm.MetricsConstants.GET_KEY_REQUEST_ERROR_LIST;
        public static final java.lang.String GET_KEY_REQUEST_OK_COUNT = android.media.MediaDrm.MetricsConstants.GET_KEY_REQUEST_OK_COUNT;
        public static final java.lang.String GET_KEY_REQUEST_OK_TIME_MICROS = android.media.MediaDrm.MetricsConstants.GET_KEY_REQUEST_OK_TIME_MICROS;
        public static final java.lang.String GET_PROVISION_REQUEST_ERROR_COUNT = android.media.MediaDrm.MetricsConstants.GET_PROVISION_REQUEST_ERROR_COUNT;
        public static final java.lang.String GET_PROVISION_REQUEST_ERROR_LIST = android.media.MediaDrm.MetricsConstants.GET_PROVISION_REQUEST_ERROR_LIST;
        public static final java.lang.String GET_PROVISION_REQUEST_OK_COUNT = android.media.MediaDrm.MetricsConstants.GET_PROVISION_REQUEST_OK_COUNT;
        public static final java.lang.String KEY_STATUS_EXPIRED_COUNT = android.media.MediaDrm.MetricsConstants.KEY_STATUS_EXPIRED_COUNT;
        public static final java.lang.String KEY_STATUS_INTERNAL_ERROR_COUNT = android.media.MediaDrm.MetricsConstants.KEY_STATUS_INTERNAL_ERROR_COUNT;
        public static final java.lang.String KEY_STATUS_OUTPUT_NOT_ALLOWED_COUNT = android.media.MediaDrm.MetricsConstants.KEY_STATUS_OUTPUT_NOT_ALLOWED_COUNT;
        public static final java.lang.String KEY_STATUS_PENDING_COUNT = android.media.MediaDrm.MetricsConstants.KEY_STATUS_PENDING_COUNT;
        public static final java.lang.String KEY_STATUS_USABLE_COUNT = android.media.MediaDrm.MetricsConstants.KEY_STATUS_USABLE_COUNT;
        public static final java.lang.String OPEN_SESSION_ERROR_COUNT = android.media.MediaDrm.MetricsConstants.OPEN_SESSION_ERROR_COUNT;
        public static final java.lang.String OPEN_SESSION_ERROR_LIST = android.media.MediaDrm.MetricsConstants.OPEN_SESSION_ERROR_LIST;
        public static final java.lang.String OPEN_SESSION_OK_COUNT = android.media.MediaDrm.MetricsConstants.OPEN_SESSION_OK_COUNT;
        public static final java.lang.String PROVIDE_KEY_RESPONSE_ERROR_COUNT = android.media.MediaDrm.MetricsConstants.PROVIDE_KEY_RESPONSE_ERROR_COUNT;
        public static final java.lang.String PROVIDE_KEY_RESPONSE_ERROR_LIST = android.media.MediaDrm.MetricsConstants.PROVIDE_KEY_RESPONSE_ERROR_LIST;
        public static final java.lang.String PROVIDE_KEY_RESPONSE_OK_COUNT = android.media.MediaDrm.MetricsConstants.PROVIDE_KEY_RESPONSE_OK_COUNT;
        public static final java.lang.String PROVIDE_KEY_RESPONSE_OK_TIME_MICROS = android.media.MediaDrm.MetricsConstants.PROVIDE_KEY_RESPONSE_OK_TIME_MICROS;
        public static final java.lang.String PROVIDE_PROVISION_RESPONSE_ERROR_COUNT = android.media.MediaDrm.MetricsConstants.PROVIDE_PROVISION_RESPONSE_ERROR_COUNT;
        public static final java.lang.String PROVIDE_PROVISION_RESPONSE_ERROR_LIST = android.media.MediaDrm.MetricsConstants.PROVIDE_PROVISION_RESPONSE_ERROR_LIST;
        public static final java.lang.String PROVIDE_PROVISION_RESPONSE_OK_COUNT = android.media.MediaDrm.MetricsConstants.PROVIDE_PROVISION_RESPONSE_OK_COUNT;
        public static final java.lang.String SESSION_END_TIMES_MS = android.media.MediaDrm.MetricsConstants.SESSION_END_TIMES_MS;
        public static final java.lang.String SESSION_START_TIMES_MS = android.media.MediaDrm.MetricsConstants.SESSION_START_TIMES_MS;

    }
    public static final class OnEventListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnEventListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.OnEventListener wrap(android.media.MediaDrm.OnEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.OnEventListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.OnEventListener getReal() {
            return (android.media.MediaDrm.OnEventListener) real;
        }

        public android.media.MediaDrm.OnEventListener unwrap() {
            return getReal();
        }

        public void onEvent(com.micklab.dcg.wrapper.android.media.MediaDrm arg0, byte[] arg1, int arg2, int arg3, byte[] arg4) {
            ((android.media.MediaDrm.OnEventListener) real).onEvent(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
        }

    }
    public static final class OnExpirationUpdateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnExpirationUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.OnExpirationUpdateListener wrap(android.media.MediaDrm.OnExpirationUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.OnExpirationUpdateListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.OnExpirationUpdateListener getReal() {
            return (android.media.MediaDrm.OnExpirationUpdateListener) real;
        }

        public android.media.MediaDrm.OnExpirationUpdateListener unwrap() {
            return getReal();
        }

        public void onExpirationUpdate(com.micklab.dcg.wrapper.android.media.MediaDrm arg0, byte[] arg1, long arg2) {
            ((android.media.MediaDrm.OnExpirationUpdateListener) real).onExpirationUpdate(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
    public static final class OnKeyStatusChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnKeyStatusChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.OnKeyStatusChangeListener wrap(android.media.MediaDrm.OnKeyStatusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.OnKeyStatusChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.OnKeyStatusChangeListener getReal() {
            return (android.media.MediaDrm.OnKeyStatusChangeListener) real;
        }

        public android.media.MediaDrm.OnKeyStatusChangeListener unwrap() {
            return getReal();
        }

    }
    public static final class OnSessionLostStateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSessionLostStateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.OnSessionLostStateListener wrap(android.media.MediaDrm.OnSessionLostStateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.OnSessionLostStateListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.OnSessionLostStateListener getReal() {
            return (android.media.MediaDrm.OnSessionLostStateListener) real;
        }

        public android.media.MediaDrm.OnSessionLostStateListener unwrap() {
            return getReal();
        }

        public void onSessionLostState(com.micklab.dcg.wrapper.android.media.MediaDrm arg0, byte[] arg1) {
            ((android.media.MediaDrm.OnSessionLostStateListener) real).onSessionLostState(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class ProvisionRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ProvisionRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.ProvisionRequest wrap(android.media.MediaDrm.ProvisionRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.ProvisionRequest(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.ProvisionRequest getReal() {
            return (android.media.MediaDrm.ProvisionRequest) real;
        }

        public android.media.MediaDrm.ProvisionRequest unwrap() {
            return getReal();
        }

        public byte[] getData() {
            return ((android.media.MediaDrm.ProvisionRequest) real).getData();
        }

        public java.lang.String getDefaultUrl() {
            return ((android.media.MediaDrm.ProvisionRequest) real).getDefaultUrl();
        }

    }
    public static final class SessionException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SessionException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaDrm.SessionException wrap(android.media.MediaDrm.SessionException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrm.SessionException(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaDrm.SessionException getReal() {
            return (android.media.MediaDrm.SessionException) real;
        }

        public android.media.MediaDrm.SessionException unwrap() {
            return getReal();
        }

        public SessionException(int arg0, java.lang.String arg1) {
            this(new android.media.MediaDrm.SessionException(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public int getErrorCode() {
            return ((android.media.MediaDrm.SessionException) real).getErrorCode();
        }

        public int getErrorContext() {
            return ((android.media.MediaDrm.SessionException) real).getErrorContext();
        }

        public int getOemError() {
            return ((android.media.MediaDrm.SessionException) real).getOemError();
        }

        public int getVendorError() {
            return ((android.media.MediaDrm.SessionException) real).getVendorError();
        }

        public boolean isTransient() {
            return ((android.media.MediaDrm.SessionException) real).isTransient();
        }

        public static final int ERROR_RESOURCE_CONTENTION = android.media.MediaDrm.SessionException.ERROR_RESOURCE_CONTENTION;
        public static final int ERROR_UNKNOWN = android.media.MediaDrm.SessionException.ERROR_UNKNOWN;

    }
}
