// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class NetworkInfo {
    private final android.net.NetworkInfo real;

    public NetworkInfo(android.net.NetworkInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.NetworkInfo wrap(android.net.NetworkInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.NetworkInfo(real);
    }

    public android.net.NetworkInfo unwrap() {
        return real;
    }

    public NetworkInfo(int arg0, int arg1, java.lang.String arg2, java.lang.String arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#android.net.NetworkInfo(int,int,java.lang.String,java.lang.String)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#describeContents()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkInfo.DetailedState getDetailedState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#getDetailedState()");
    }

    public java.lang.String getExtraInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#getExtraInfo()");
    }

    public java.lang.String getReason() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#getReason()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkInfo.State getState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#getState()");
    }

    public int getSubtype() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#getSubtype()");
    }

    public java.lang.String getSubtypeName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#getSubtypeName()");
    }

    public int getType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#getType()");
    }

    public java.lang.String getTypeName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#getTypeName()");
    }

    public boolean isAvailable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#isAvailable()");
    }

    public boolean isConnected() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#isConnected()");
    }

    public boolean isConnectedOrConnecting() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#isConnectedOrConnecting()");
    }

    public boolean isFailover() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#isFailover()");
    }

    public boolean isRoaming() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#isRoaming()");
    }

    public void setDetailedState(com.micklab.dcg.wrapper.android.net.NetworkInfo.DetailedState arg0, java.lang.String arg1, java.lang.String arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#setDetailedState(android.net.NetworkInfo$DetailedState,java.lang.String,java.lang.String)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo#writeToParcel(android.os.Parcel,int)");
    }


    public static final class DetailedState {
        private final android.net.NetworkInfo.DetailedState real;

        public DetailedState(android.net.NetworkInfo.DetailedState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.NetworkInfo.DetailedState wrap(android.net.NetworkInfo.DetailedState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.NetworkInfo.DetailedState(real);
        }

        public android.net.NetworkInfo.DetailedState unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.NetworkInfo.DetailedState valueOf(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo$DetailedState#valueOf(java.lang.String)");
        }

        public static android.net.NetworkInfo.DetailedState[] values() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo$DetailedState#values()");
        }


    }
    public static final class State {
        private final android.net.NetworkInfo.State real;

        public State(android.net.NetworkInfo.State real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.NetworkInfo.State wrap(android.net.NetworkInfo.State real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.NetworkInfo.State(real);
        }

        public android.net.NetworkInfo.State unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.NetworkInfo.State valueOf(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo$State#valueOf(java.lang.String)");
        }

        public static android.net.NetworkInfo.State[] values() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkInfo$State#values()");
        }


    }
}
