// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi;

public final class ScanResult {
    private final android.net.wifi.ScanResult real;

    public ScanResult(android.net.wifi.ScanResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.ScanResult wrap(android.net.wifi.ScanResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.ScanResult(real);
    }

    public android.net.wifi.ScanResult unwrap() {
        return real;
    }

    public ScanResult() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#android.net.wifi.ScanResult()");
    }

    public ScanResult(com.micklab.dcg.wrapper.android.net.wifi.ScanResult arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#android.net.wifi.ScanResult(android.net.wifi.ScanResult)");
    }

    public static int convertChannelToFrequencyMhzIfSupported(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#convertChannelToFrequencyMhzIfSupported(int,int)");
    }

    public static int convertFrequencyMhzToChannelIfSupported(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#convertFrequencyMhzToChannelIfSupported(int)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#describeContents()");
    }

    public com.micklab.dcg.wrapper.android.net.MacAddress getApMldMacAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#getApMldMacAddress()");
    }

    public int getApMloLinkId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#getApMloLinkId()");
    }

    public int[] getSecurityTypes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#getSecurityTypes()");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.WifiSsid getWifiSsid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#getWifiSsid()");
    }

    public int getWifiStandard() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#getWifiStandard()");
    }

    public boolean is80211azNtbResponder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#is80211azNtbResponder()");
    }

    public boolean is80211mcResponder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#is80211mcResponder()");
    }

    public boolean isPasspointNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#isPasspointNetwork()");
    }

    public boolean isTwtResponder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#isTwtResponder()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult#writeToParcel(android.os.Parcel,int)");
    }


    public static final class InformationElement {
        private final android.net.wifi.ScanResult.InformationElement real;

        public InformationElement(android.net.wifi.ScanResult.InformationElement real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.ScanResult.InformationElement wrap(android.net.wifi.ScanResult.InformationElement real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.ScanResult.InformationElement(real);
        }

        public android.net.wifi.ScanResult.InformationElement unwrap() {
            return real;
        }

        public InformationElement(com.micklab.dcg.wrapper.android.net.wifi.ScanResult.InformationElement arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult$InformationElement#android.net.wifi.ScanResult$InformationElement(android.net.wifi.ScanResult$InformationElement)");
        }

        public InformationElement(int arg0, int arg1, byte[] arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult$InformationElement#android.net.wifi.ScanResult$InformationElement(int,int,[B)");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult$InformationElement#describeContents()");
        }

        public boolean equals(java.lang.Object arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult$InformationElement#equals(java.lang.Object)");
        }

        public java.nio.ByteBuffer getBytes() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult$InformationElement#getBytes()");
        }

        public int getId() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult$InformationElement#getId()");
        }

        public int getIdExt() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult$InformationElement#getIdExt()");
        }

        public int hashCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult$InformationElement#hashCode()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.ScanResult$InformationElement#writeToParcel(android.os.Parcel,int)");
        }


    }
}
