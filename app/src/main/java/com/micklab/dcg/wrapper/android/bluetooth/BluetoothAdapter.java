// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter wrap(android.bluetooth.BluetoothAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothAdapter getReal() {
        return (android.bluetooth.BluetoothAdapter) real;
    }

    public android.bluetooth.BluetoothAdapter unwrap() {
        return getReal();
    }

    public boolean cancelDiscovery() {
        return ((android.bluetooth.BluetoothAdapter) real).cancelDiscovery();
    }

    public static boolean checkBluetoothAddress(java.lang.String arg0) {
        return android.bluetooth.BluetoothAdapter.checkBluetoothAddress(arg0);
    }

    public void closeProfileProxy(int arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothProfile arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothAdapter#closeProfileProxy(int,android.bluetooth.BluetoothProfile)");
    }

    public boolean disable() {
        return ((android.bluetooth.BluetoothAdapter) real).disable();
    }

    public boolean enable() {
        return ((android.bluetooth.BluetoothAdapter) real).enable();
    }

    public java.lang.String getAddress() {
        return ((android.bluetooth.BluetoothAdapter) real).getAddress();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeAdvertiser getBluetoothLeAdvertiser() {
        return com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeAdvertiser.wrap(((android.bluetooth.BluetoothAdapter) real).getBluetoothLeAdvertiser());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeScanner getBluetoothLeScanner() {
        return com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeScanner.wrap(((android.bluetooth.BluetoothAdapter) real).getBluetoothLeScanner());
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter getDefaultAdapter() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.wrap(android.bluetooth.BluetoothAdapter.getDefaultAdapter());
    }

    public java.time.Duration getDiscoverableTimeout() {
        return ((android.bluetooth.BluetoothAdapter) real).getDiscoverableTimeout();
    }

    public int getLeMaximumAdvertisingDataLength() {
        return ((android.bluetooth.BluetoothAdapter) real).getLeMaximumAdvertisingDataLength();
    }

    public int getMaxConnectedAudioDevices() {
        return ((android.bluetooth.BluetoothAdapter) real).getMaxConnectedAudioDevices();
    }

    public java.lang.String getName() {
        return ((android.bluetooth.BluetoothAdapter) real).getName();
    }

    public int getProfileConnectionState(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothAdapter#getProfileConnectionState(int)");
    }

    public boolean getProfileProxy(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothProfile.ServiceListener arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothAdapter#getProfileProxy(android.content.Context,android.bluetooth.BluetoothProfile$ServiceListener,int)");
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getRemoteDevice(byte[] arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(((android.bluetooth.BluetoothAdapter) real).getRemoteDevice(arg0));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getRemoteDevice(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(((android.bluetooth.BluetoothAdapter) real).getRemoteDevice(arg0));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getRemoteLeDevice(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(((android.bluetooth.BluetoothAdapter) real).getRemoteLeDevice(arg0, arg1));
    }

    public int getScanMode() {
        return ((android.bluetooth.BluetoothAdapter) real).getScanMode();
    }

    public int getState() {
        return ((android.bluetooth.BluetoothAdapter) real).getState();
    }

    public boolean isDiscovering() {
        return ((android.bluetooth.BluetoothAdapter) real).isDiscovering();
    }

    public boolean isEnabled() {
        return ((android.bluetooth.BluetoothAdapter) real).isEnabled();
    }

    public boolean isLe2MPhySupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isLe2MPhySupported();
    }

    public int isLeAudioBroadcastAssistantSupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isLeAudioBroadcastAssistantSupported();
    }

    public int isLeAudioBroadcastSourceSupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isLeAudioBroadcastSourceSupported();
    }

    public int isLeAudioSupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isLeAudioSupported();
    }

    public boolean isLeCodedPhySupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isLeCodedPhySupported();
    }

    public boolean isLeExtendedAdvertisingSupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isLeExtendedAdvertisingSupported();
    }

    public boolean isLePeriodicAdvertisingSupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isLePeriodicAdvertisingSupported();
    }

    public boolean isMultipleAdvertisementSupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isMultipleAdvertisementSupported();
    }

    public boolean isOffloadedFilteringSupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isOffloadedFilteringSupported();
    }

    public boolean isOffloadedScanBatchingSupported() {
        return ((android.bluetooth.BluetoothAdapter) real).isOffloadedScanBatchingSupported();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket listenUsingInsecureL2capChannel() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket.wrap(((android.bluetooth.BluetoothAdapter) real).listenUsingInsecureL2capChannel());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(java.lang.String arg0, java.util.UUID arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket.wrap(((android.bluetooth.BluetoothAdapter) real).listenUsingInsecureRfcommWithServiceRecord(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket listenUsingL2capChannel() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket.wrap(((android.bluetooth.BluetoothAdapter) real).listenUsingL2capChannel());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket listenUsingRfcommWithServiceRecord(java.lang.String arg0, java.util.UUID arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket.wrap(((android.bluetooth.BluetoothAdapter) real).listenUsingRfcommWithServiceRecord(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket listenUsingSocketSettings(com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothAdapter#listenUsingSocketSettings(android.bluetooth.BluetoothSocketSettings)");
    }

    public boolean setName(java.lang.String arg0) {
        return ((android.bluetooth.BluetoothAdapter) real).setName(arg0);
    }

    public boolean startDiscovery() {
        return ((android.bluetooth.BluetoothAdapter) real).startDiscovery();
    }

    public boolean startLeScan(com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback arg0) {
        return ((android.bluetooth.BluetoothAdapter) real).startLeScan(arg0 == null ? null : arg0.getReal());
    }

    public boolean startLeScan(java.util.UUID[] arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback arg1) {
        return ((android.bluetooth.BluetoothAdapter) real).startLeScan(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void stopLeScan(com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback arg0) {
        ((android.bluetooth.BluetoothAdapter) real).stopLeScan(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothAdapter.ACTION_CONNECTION_STATE_CHANGED;
    public static final java.lang.String ACTION_DISCOVERY_FINISHED = android.bluetooth.BluetoothAdapter.ACTION_DISCOVERY_FINISHED;
    public static final java.lang.String ACTION_DISCOVERY_STARTED = android.bluetooth.BluetoothAdapter.ACTION_DISCOVERY_STARTED;
    public static final java.lang.String ACTION_LOCAL_NAME_CHANGED = android.bluetooth.BluetoothAdapter.ACTION_LOCAL_NAME_CHANGED;
    public static final java.lang.String ACTION_REQUEST_DISCOVERABLE = android.bluetooth.BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE;
    public static final java.lang.String ACTION_REQUEST_ENABLE = android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE;
    public static final java.lang.String ACTION_SCAN_MODE_CHANGED = android.bluetooth.BluetoothAdapter.ACTION_SCAN_MODE_CHANGED;
    public static final java.lang.String ACTION_STATE_CHANGED = android.bluetooth.BluetoothAdapter.ACTION_STATE_CHANGED;
    public static final int ERROR = android.bluetooth.BluetoothAdapter.ERROR;
    public static final java.lang.String EXTRA_CONNECTION_STATE = android.bluetooth.BluetoothAdapter.EXTRA_CONNECTION_STATE;
    public static final java.lang.String EXTRA_DISCOVERABLE_DURATION = android.bluetooth.BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION;
    public static final java.lang.String EXTRA_LOCAL_NAME = android.bluetooth.BluetoothAdapter.EXTRA_LOCAL_NAME;
    public static final java.lang.String EXTRA_PREVIOUS_CONNECTION_STATE = android.bluetooth.BluetoothAdapter.EXTRA_PREVIOUS_CONNECTION_STATE;
    public static final java.lang.String EXTRA_PREVIOUS_SCAN_MODE = android.bluetooth.BluetoothAdapter.EXTRA_PREVIOUS_SCAN_MODE;
    public static final java.lang.String EXTRA_PREVIOUS_STATE = android.bluetooth.BluetoothAdapter.EXTRA_PREVIOUS_STATE;
    public static final java.lang.String EXTRA_SCAN_MODE = android.bluetooth.BluetoothAdapter.EXTRA_SCAN_MODE;
    public static final java.lang.String EXTRA_STATE = android.bluetooth.BluetoothAdapter.EXTRA_STATE;
    public static final int SCAN_MODE_CONNECTABLE = android.bluetooth.BluetoothAdapter.SCAN_MODE_CONNECTABLE;
    public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = android.bluetooth.BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE;
    public static final int SCAN_MODE_NONE = android.bluetooth.BluetoothAdapter.SCAN_MODE_NONE;
    public static final int STATE_CONNECTED = android.bluetooth.BluetoothAdapter.STATE_CONNECTED;
    public static final int STATE_CONNECTING = android.bluetooth.BluetoothAdapter.STATE_CONNECTING;
    public static final int STATE_DISCONNECTED = android.bluetooth.BluetoothAdapter.STATE_DISCONNECTED;
    public static final int STATE_DISCONNECTING = android.bluetooth.BluetoothAdapter.STATE_DISCONNECTING;
    public static final int STATE_OFF = android.bluetooth.BluetoothAdapter.STATE_OFF;
    public static final int STATE_ON = android.bluetooth.BluetoothAdapter.STATE_ON;
    public static final int STATE_TURNING_OFF = android.bluetooth.BluetoothAdapter.STATE_TURNING_OFF;
    public static final int STATE_TURNING_ON = android.bluetooth.BluetoothAdapter.STATE_TURNING_ON;

    public static final class LeScanCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LeScanCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback wrap(android.bluetooth.BluetoothAdapter.LeScanCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.BluetoothAdapter.LeScanCallback getReal() {
            return (android.bluetooth.BluetoothAdapter.LeScanCallback) real;
        }

        public android.bluetooth.BluetoothAdapter.LeScanCallback unwrap() {
            return getReal();
        }

        public void onLeScan(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, byte[] arg2) {
            ((android.bluetooth.BluetoothAdapter.LeScanCallback) real).onLeScan(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
