// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothAdapter {
    private final android.bluetooth.BluetoothAdapter real;

    public BluetoothAdapter(android.bluetooth.BluetoothAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter wrap(android.bluetooth.BluetoothAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter(real);
    }

    public android.bluetooth.BluetoothAdapter unwrap() {
        return real;
    }

    public boolean cancelDiscovery() {
        return real.cancelDiscovery();
    }

    public static boolean checkBluetoothAddress(java.lang.String arg0) {
        return android.bluetooth.BluetoothAdapter.checkBluetoothAddress(arg0);
    }

    public void closeProfileProxy(int arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothProfile arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothAdapter#closeProfileProxy(int,android.bluetooth.BluetoothProfile)");
    }

    public boolean disable() {
        return real.disable();
    }

    public boolean enable() {
        return real.enable();
    }

    public java.lang.String getAddress() {
        return real.getAddress();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeAdvertiser getBluetoothLeAdvertiser() {
        return com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeAdvertiser.wrap(real.getBluetoothLeAdvertiser());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeScanner getBluetoothLeScanner() {
        return com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeScanner.wrap(real.getBluetoothLeScanner());
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter getDefaultAdapter() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.wrap(android.bluetooth.BluetoothAdapter.getDefaultAdapter());
    }

    public java.time.Duration getDiscoverableTimeout() {
        return real.getDiscoverableTimeout();
    }

    public int getLeMaximumAdvertisingDataLength() {
        return real.getLeMaximumAdvertisingDataLength();
    }

    public int getMaxConnectedAudioDevices() {
        return real.getMaxConnectedAudioDevices();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getProfileConnectionState(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothAdapter#getProfileConnectionState(int)");
    }

    public boolean getProfileProxy(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothProfile.ServiceListener arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothAdapter#getProfileProxy(android.content.Context,android.bluetooth.BluetoothProfile$ServiceListener,int)");
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getRemoteDevice(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(real.getRemoteDevice(arg0));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getRemoteDevice(byte[] arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(real.getRemoteDevice(arg0));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getRemoteLeDevice(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(real.getRemoteLeDevice(arg0, arg1));
    }

    public int getScanMode() {
        return real.getScanMode();
    }

    public int getState() {
        return real.getState();
    }

    public boolean isDiscovering() {
        return real.isDiscovering();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isLe2MPhySupported() {
        return real.isLe2MPhySupported();
    }

    public int isLeAudioBroadcastAssistantSupported() {
        return real.isLeAudioBroadcastAssistantSupported();
    }

    public int isLeAudioBroadcastSourceSupported() {
        return real.isLeAudioBroadcastSourceSupported();
    }

    public int isLeAudioSupported() {
        return real.isLeAudioSupported();
    }

    public boolean isLeCodedPhySupported() {
        return real.isLeCodedPhySupported();
    }

    public boolean isLeExtendedAdvertisingSupported() {
        return real.isLeExtendedAdvertisingSupported();
    }

    public boolean isLePeriodicAdvertisingSupported() {
        return real.isLePeriodicAdvertisingSupported();
    }

    public boolean isMultipleAdvertisementSupported() {
        return real.isMultipleAdvertisementSupported();
    }

    public boolean isOffloadedFilteringSupported() {
        return real.isOffloadedFilteringSupported();
    }

    public boolean isOffloadedScanBatchingSupported() {
        return real.isOffloadedScanBatchingSupported();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket listenUsingInsecureL2capChannel() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket.wrap(real.listenUsingInsecureL2capChannel());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(java.lang.String arg0, java.util.UUID arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket.wrap(real.listenUsingInsecureRfcommWithServiceRecord(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket listenUsingL2capChannel() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket.wrap(real.listenUsingL2capChannel());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket listenUsingRfcommWithServiceRecord(java.lang.String arg0, java.util.UUID arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket.wrap(real.listenUsingRfcommWithServiceRecord(arg0, arg1));
    }

    public boolean setName(java.lang.String arg0) {
        return real.setName(arg0);
    }

    public boolean startDiscovery() {
        return real.startDiscovery();
    }

    public boolean startLeScan(com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback arg0) {
        return real.startLeScan(arg0 == null ? null : arg0.unwrap());
    }

    public boolean startLeScan(java.util.UUID[] arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback arg1) {
        return real.startLeScan(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void stopLeScan(com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback arg0) {
        real.stopLeScan(arg0 == null ? null : arg0.unwrap());
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
        private final android.bluetooth.BluetoothAdapter.LeScanCallback real;

        public LeScanCallback(android.bluetooth.BluetoothAdapter.LeScanCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback wrap(android.bluetooth.BluetoothAdapter.LeScanCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.LeScanCallback(real);
        }

        public android.bluetooth.BluetoothAdapter.LeScanCallback unwrap() {
            return real;
        }

        public void onLeScan(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, byte[] arg2) {
            real.onLeScan(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
