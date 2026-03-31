// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NfcAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NfcAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter wrap(android.nfc.NfcAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.NfcAdapter getReal() {
        return (android.nfc.NfcAdapter) real;
    }

    public android.nfc.NfcAdapter unwrap() {
        return getReal();
    }

    public boolean disable() {
        return ((android.nfc.NfcAdapter) real).disable();
    }

    public void disableForegroundDispatch(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.nfc.NfcAdapter) real).disableForegroundDispatch(arg0 == null ? null : arg0.getReal());
    }

    public void disableReaderMode(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.nfc.NfcAdapter) real).disableReaderMode(arg0 == null ? null : arg0.getReal());
    }

    public boolean enable() {
        return ((android.nfc.NfcAdapter) real).enable();
    }

    public void enableForegroundDispatch(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1, android.content.IntentFilter[] arg2, java.lang.String[][] arg3) {
        ((android.nfc.NfcAdapter) real).enableForegroundDispatch(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void enableReaderMode(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.nfc.NfcAdapter.ReaderCallback arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        ((android.nfc.NfcAdapter) real).enableReaderMode(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter getDefaultAdapter(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.nfc.NfcAdapter.wrap(android.nfc.NfcAdapter.getDefaultAdapter(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.nfc.NfcAntennaInfo getNfcAntennaInfo() {
        return com.micklab.dcg.wrapper.android.nfc.NfcAntennaInfo.wrap(((android.nfc.NfcAdapter) real).getNfcAntennaInfo());
    }

    public boolean ignore(com.micklab.dcg.wrapper.android.nfc.Tag arg0, int arg1, com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnTagRemovedListener arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        return ((android.nfc.NfcAdapter) real).ignore(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public boolean isEnabled() {
        return ((android.nfc.NfcAdapter) real).isEnabled();
    }

    public boolean isObserveModeEnabled() {
        return ((android.nfc.NfcAdapter) real).isObserveModeEnabled();
    }

    public boolean isObserveModeSupported() {
        return ((android.nfc.NfcAdapter) real).isObserveModeSupported();
    }

    public boolean isReaderOptionEnabled() {
        return ((android.nfc.NfcAdapter) real).isReaderOptionEnabled();
    }

    public boolean isReaderOptionSupported() {
        return ((android.nfc.NfcAdapter) real).isReaderOptionSupported();
    }

    public boolean isSecureNfcEnabled() {
        return ((android.nfc.NfcAdapter) real).isSecureNfcEnabled();
    }

    public boolean isSecureNfcSupported() {
        return ((android.nfc.NfcAdapter) real).isSecureNfcSupported();
    }

    public boolean isTagIntentAllowed() {
        return ((android.nfc.NfcAdapter) real).isTagIntentAllowed();
    }

    public boolean isTagIntentAppPreferenceSupported() {
        return ((android.nfc.NfcAdapter) real).isTagIntentAppPreferenceSupported();
    }

    public void resetDiscoveryTechnology(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.nfc.NfcAdapter) real).resetDiscoveryTechnology(arg0 == null ? null : arg0.getReal());
    }

    public void setDiscoveryTechnology(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1, int arg2) {
        ((android.nfc.NfcAdapter) real).setDiscoveryTechnology(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean setObserveModeEnabled(boolean arg0) {
        return ((android.nfc.NfcAdapter) real).setObserveModeEnabled(arg0);
    }

    public static final java.lang.String ACTION_ADAPTER_STATE_CHANGED = android.nfc.NfcAdapter.ACTION_ADAPTER_STATE_CHANGED;
    public static final java.lang.String ACTION_CHANGE_TAG_INTENT_PREFERENCE = android.nfc.NfcAdapter.ACTION_CHANGE_TAG_INTENT_PREFERENCE;
    public static final java.lang.String ACTION_NDEF_DISCOVERED = android.nfc.NfcAdapter.ACTION_NDEF_DISCOVERED;
    public static final java.lang.String ACTION_PREFERRED_PAYMENT_CHANGED = android.nfc.NfcAdapter.ACTION_PREFERRED_PAYMENT_CHANGED;
    public static final java.lang.String ACTION_TAG_DISCOVERED = android.nfc.NfcAdapter.ACTION_TAG_DISCOVERED;
    public static final java.lang.String ACTION_TECH_DISCOVERED = android.nfc.NfcAdapter.ACTION_TECH_DISCOVERED;
    public static final java.lang.String ACTION_TRANSACTION_DETECTED = android.nfc.NfcAdapter.ACTION_TRANSACTION_DETECTED;
    public static final java.lang.String EXTRA_ADAPTER_STATE = android.nfc.NfcAdapter.EXTRA_ADAPTER_STATE;
    public static final java.lang.String EXTRA_AID = android.nfc.NfcAdapter.EXTRA_AID;
    public static final java.lang.String EXTRA_DATA = android.nfc.NfcAdapter.EXTRA_DATA;
    public static final java.lang.String EXTRA_ID = android.nfc.NfcAdapter.EXTRA_ID;
    public static final java.lang.String EXTRA_NDEF_MESSAGES = android.nfc.NfcAdapter.EXTRA_NDEF_MESSAGES;
    public static final java.lang.String EXTRA_PREFERRED_PAYMENT_CHANGED_REASON = android.nfc.NfcAdapter.EXTRA_PREFERRED_PAYMENT_CHANGED_REASON;
    public static final java.lang.String EXTRA_READER_PRESENCE_CHECK_DELAY = android.nfc.NfcAdapter.EXTRA_READER_PRESENCE_CHECK_DELAY;
    public static final java.lang.String EXTRA_SECURE_ELEMENT_NAME = android.nfc.NfcAdapter.EXTRA_SECURE_ELEMENT_NAME;
    public static final java.lang.String EXTRA_TAG = android.nfc.NfcAdapter.EXTRA_TAG;
    public static final int FLAG_LISTEN_DISABLE = android.nfc.NfcAdapter.FLAG_LISTEN_DISABLE;
    public static final int FLAG_LISTEN_KEEP = android.nfc.NfcAdapter.FLAG_LISTEN_KEEP;
    public static final int FLAG_LISTEN_NFC_PASSIVE_A = android.nfc.NfcAdapter.FLAG_LISTEN_NFC_PASSIVE_A;
    public static final int FLAG_LISTEN_NFC_PASSIVE_B = android.nfc.NfcAdapter.FLAG_LISTEN_NFC_PASSIVE_B;
    public static final int FLAG_LISTEN_NFC_PASSIVE_F = android.nfc.NfcAdapter.FLAG_LISTEN_NFC_PASSIVE_F;
    public static final int FLAG_READER_DISABLE = android.nfc.NfcAdapter.FLAG_READER_DISABLE;
    public static final int FLAG_READER_KEEP = android.nfc.NfcAdapter.FLAG_READER_KEEP;
    public static final int FLAG_READER_NFC_A = android.nfc.NfcAdapter.FLAG_READER_NFC_A;
    public static final int FLAG_READER_NFC_B = android.nfc.NfcAdapter.FLAG_READER_NFC_B;
    public static final int FLAG_READER_NFC_BARCODE = android.nfc.NfcAdapter.FLAG_READER_NFC_BARCODE;
    public static final int FLAG_READER_NFC_F = android.nfc.NfcAdapter.FLAG_READER_NFC_F;
    public static final int FLAG_READER_NFC_V = android.nfc.NfcAdapter.FLAG_READER_NFC_V;
    public static final int FLAG_READER_NO_PLATFORM_SOUNDS = android.nfc.NfcAdapter.FLAG_READER_NO_PLATFORM_SOUNDS;
    public static final int FLAG_READER_SKIP_NDEF_CHECK = android.nfc.NfcAdapter.FLAG_READER_SKIP_NDEF_CHECK;
    public static final int PREFERRED_PAYMENT_CHANGED = android.nfc.NfcAdapter.PREFERRED_PAYMENT_CHANGED;
    public static final int PREFERRED_PAYMENT_LOADED = android.nfc.NfcAdapter.PREFERRED_PAYMENT_LOADED;
    public static final int PREFERRED_PAYMENT_UPDATED = android.nfc.NfcAdapter.PREFERRED_PAYMENT_UPDATED;
    public static final int STATE_OFF = android.nfc.NfcAdapter.STATE_OFF;
    public static final int STATE_ON = android.nfc.NfcAdapter.STATE_ON;
    public static final int STATE_TURNING_OFF = android.nfc.NfcAdapter.STATE_TURNING_OFF;
    public static final int STATE_TURNING_ON = android.nfc.NfcAdapter.STATE_TURNING_ON;

    public static final class CreateBeamUrisCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CreateBeamUrisCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.CreateBeamUrisCallback wrap(android.nfc.NfcAdapter.CreateBeamUrisCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.CreateBeamUrisCallback(real, (__DcgwBridgeToken) null);
        }

        public android.nfc.NfcAdapter.CreateBeamUrisCallback getReal() {
            return (android.nfc.NfcAdapter.CreateBeamUrisCallback) real;
        }

        public android.nfc.NfcAdapter.CreateBeamUrisCallback unwrap() {
            return getReal();
        }

        public android.net.Uri[] createBeamUris(com.micklab.dcg.wrapper.android.nfc.NfcEvent arg0) {
            return ((android.nfc.NfcAdapter.CreateBeamUrisCallback) real).createBeamUris(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class CreateNdefMessageCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CreateNdefMessageCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.CreateNdefMessageCallback wrap(android.nfc.NfcAdapter.CreateNdefMessageCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.CreateNdefMessageCallback(real, (__DcgwBridgeToken) null);
        }

        public android.nfc.NfcAdapter.CreateNdefMessageCallback getReal() {
            return (android.nfc.NfcAdapter.CreateNdefMessageCallback) real;
        }

        public android.nfc.NfcAdapter.CreateNdefMessageCallback unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.nfc.NdefMessage createNdefMessage(com.micklab.dcg.wrapper.android.nfc.NfcEvent arg0) {
            return com.micklab.dcg.wrapper.android.nfc.NdefMessage.wrap(((android.nfc.NfcAdapter.CreateNdefMessageCallback) real).createNdefMessage(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class OnNdefPushCompleteCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnNdefPushCompleteCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnNdefPushCompleteCallback wrap(android.nfc.NfcAdapter.OnNdefPushCompleteCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnNdefPushCompleteCallback(real, (__DcgwBridgeToken) null);
        }

        public android.nfc.NfcAdapter.OnNdefPushCompleteCallback getReal() {
            return (android.nfc.NfcAdapter.OnNdefPushCompleteCallback) real;
        }

        public android.nfc.NfcAdapter.OnNdefPushCompleteCallback unwrap() {
            return getReal();
        }

        public void onNdefPushComplete(com.micklab.dcg.wrapper.android.nfc.NfcEvent arg0) {
            ((android.nfc.NfcAdapter.OnNdefPushCompleteCallback) real).onNdefPushComplete(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnTagRemovedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnTagRemovedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnTagRemovedListener wrap(android.nfc.NfcAdapter.OnTagRemovedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnTagRemovedListener(real, (__DcgwBridgeToken) null);
        }

        public android.nfc.NfcAdapter.OnTagRemovedListener getReal() {
            return (android.nfc.NfcAdapter.OnTagRemovedListener) real;
        }

        public android.nfc.NfcAdapter.OnTagRemovedListener unwrap() {
            return getReal();
        }

        public void onTagRemoved() {
            ((android.nfc.NfcAdapter.OnTagRemovedListener) real).onTagRemoved();
        }

    }
    public static final class ReaderCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ReaderCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.ReaderCallback wrap(android.nfc.NfcAdapter.ReaderCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.ReaderCallback(real, (__DcgwBridgeToken) null);
        }

        public android.nfc.NfcAdapter.ReaderCallback getReal() {
            return (android.nfc.NfcAdapter.ReaderCallback) real;
        }

        public android.nfc.NfcAdapter.ReaderCallback unwrap() {
            return getReal();
        }

        public void onTagDiscovered(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
            ((android.nfc.NfcAdapter.ReaderCallback) real).onTagDiscovered(arg0 == null ? null : arg0.getReal());
        }

    }
}
