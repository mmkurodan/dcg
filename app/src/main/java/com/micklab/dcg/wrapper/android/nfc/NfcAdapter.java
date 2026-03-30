// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NfcAdapter {
    private final android.nfc.NfcAdapter real;

    public NfcAdapter(android.nfc.NfcAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter wrap(android.nfc.NfcAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter(real);
    }

    public android.nfc.NfcAdapter unwrap() {
        return real;
    }

    public void disableForegroundDispatch(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.disableForegroundDispatch(arg0 == null ? null : arg0.unwrap());
    }

    public void disableReaderMode(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.disableReaderMode(arg0 == null ? null : arg0.unwrap());
    }

    public void enableForegroundDispatch(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1, android.content.IntentFilter[] arg2, java.lang.String[][] arg3) {
        real.enableForegroundDispatch(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public void enableReaderMode(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.nfc.NfcAdapter.ReaderCallback arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        real.enableReaderMode(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter getDefaultAdapter(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.nfc.NfcAdapter.wrap(android.nfc.NfcAdapter.getDefaultAdapter(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.nfc.NfcAntennaInfo getNfcAntennaInfo() {
        return com.micklab.dcg.wrapper.android.nfc.NfcAntennaInfo.wrap(real.getNfcAntennaInfo());
    }

    public boolean ignore(com.micklab.dcg.wrapper.android.nfc.Tag arg0, int arg1, com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnTagRemovedListener arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        return real.ignore(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isObserveModeEnabled() {
        return real.isObserveModeEnabled();
    }

    public boolean isObserveModeSupported() {
        return real.isObserveModeSupported();
    }

    public boolean isReaderOptionEnabled() {
        return real.isReaderOptionEnabled();
    }

    public boolean isReaderOptionSupported() {
        return real.isReaderOptionSupported();
    }

    public boolean isSecureNfcEnabled() {
        return real.isSecureNfcEnabled();
    }

    public boolean isSecureNfcSupported() {
        return real.isSecureNfcSupported();
    }

    public void resetDiscoveryTechnology(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.resetDiscoveryTechnology(arg0 == null ? null : arg0.unwrap());
    }

    public void setDiscoveryTechnology(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1, int arg2) {
        real.setDiscoveryTechnology(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean setObserveModeEnabled(boolean arg0) {
        return real.setObserveModeEnabled(arg0);
    }

    public static final java.lang.String ACTION_ADAPTER_STATE_CHANGED = android.nfc.NfcAdapter.ACTION_ADAPTER_STATE_CHANGED;
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
        private final android.nfc.NfcAdapter.CreateBeamUrisCallback real;

        public CreateBeamUrisCallback(android.nfc.NfcAdapter.CreateBeamUrisCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.CreateBeamUrisCallback wrap(android.nfc.NfcAdapter.CreateBeamUrisCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.CreateBeamUrisCallback(real);
        }

        public android.nfc.NfcAdapter.CreateBeamUrisCallback unwrap() {
            return real;
        }

        public android.net.Uri[] createBeamUris(com.micklab.dcg.wrapper.android.nfc.NfcEvent arg0) {
            return real.createBeamUris(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class CreateNdefMessageCallback {
        private final android.nfc.NfcAdapter.CreateNdefMessageCallback real;

        public CreateNdefMessageCallback(android.nfc.NfcAdapter.CreateNdefMessageCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.CreateNdefMessageCallback wrap(android.nfc.NfcAdapter.CreateNdefMessageCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.CreateNdefMessageCallback(real);
        }

        public android.nfc.NfcAdapter.CreateNdefMessageCallback unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.nfc.NdefMessage createNdefMessage(com.micklab.dcg.wrapper.android.nfc.NfcEvent arg0) {
            return com.micklab.dcg.wrapper.android.nfc.NdefMessage.wrap(real.createNdefMessage(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class OnNdefPushCompleteCallback {
        private final android.nfc.NfcAdapter.OnNdefPushCompleteCallback real;

        public OnNdefPushCompleteCallback(android.nfc.NfcAdapter.OnNdefPushCompleteCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnNdefPushCompleteCallback wrap(android.nfc.NfcAdapter.OnNdefPushCompleteCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnNdefPushCompleteCallback(real);
        }

        public android.nfc.NfcAdapter.OnNdefPushCompleteCallback unwrap() {
            return real;
        }

        public void onNdefPushComplete(com.micklab.dcg.wrapper.android.nfc.NfcEvent arg0) {
            real.onNdefPushComplete(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnTagRemovedListener {
        private final android.nfc.NfcAdapter.OnTagRemovedListener real;

        public OnTagRemovedListener(android.nfc.NfcAdapter.OnTagRemovedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnTagRemovedListener wrap(android.nfc.NfcAdapter.OnTagRemovedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.OnTagRemovedListener(real);
        }

        public android.nfc.NfcAdapter.OnTagRemovedListener unwrap() {
            return real;
        }

        public void onTagRemoved() {
            real.onTagRemoved();
        }

    }
    public static final class ReaderCallback {
        private final android.nfc.NfcAdapter.ReaderCallback real;

        public ReaderCallback(android.nfc.NfcAdapter.ReaderCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.NfcAdapter.ReaderCallback wrap(android.nfc.NfcAdapter.ReaderCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAdapter.ReaderCallback(real);
        }

        public android.nfc.NfcAdapter.ReaderCallback unwrap() {
            return real;
        }

        public void onTagDiscovered(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
            real.onTagDiscovered(arg0 == null ? null : arg0.unwrap());
        }

    }
}
