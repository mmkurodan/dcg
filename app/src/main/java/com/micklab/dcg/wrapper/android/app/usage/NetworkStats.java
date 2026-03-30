// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class NetworkStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.NetworkStats wrap(android.app.usage.NetworkStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.NetworkStats(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.NetworkStats getReal() {
        return (android.app.usage.NetworkStats) real;
    }

    public android.app.usage.NetworkStats unwrap() {
        return getReal();
    }

    public void close() {
        ((android.app.usage.NetworkStats) real).close();
    }

    public boolean getNextBucket(com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket arg0) {
        return ((android.app.usage.NetworkStats) real).getNextBucket(arg0 == null ? null : arg0.getReal());
    }

    public boolean hasNextBucket() {
        return ((android.app.usage.NetworkStats) real).hasNextBucket();
    }

    public static final class Bucket {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Bucket(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket wrap(android.app.usage.NetworkStats.Bucket real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket(real, (__DcgwBridgeToken) null);
        }

        public android.app.usage.NetworkStats.Bucket getReal() {
            return (android.app.usage.NetworkStats.Bucket) real;
        }

        public android.app.usage.NetworkStats.Bucket unwrap() {
            return getReal();
        }

        public Bucket() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.usage.NetworkStats$Bucket#android.app.usage.NetworkStats$Bucket()");
        }

        public int getDefaultNetworkStatus() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.usage.NetworkStats$Bucket#getDefaultNetworkStatus()");
        }

        public long getEndTimeStamp() {
            return ((android.app.usage.NetworkStats.Bucket) real).getEndTimeStamp();
        }

        public int getMetered() {
            return ((android.app.usage.NetworkStats.Bucket) real).getMetered();
        }

        public int getRoaming() {
            return ((android.app.usage.NetworkStats.Bucket) real).getRoaming();
        }

        public long getRxBytes() {
            return ((android.app.usage.NetworkStats.Bucket) real).getRxBytes();
        }

        public long getRxPackets() {
            return ((android.app.usage.NetworkStats.Bucket) real).getRxPackets();
        }

        public long getStartTimeStamp() {
            return ((android.app.usage.NetworkStats.Bucket) real).getStartTimeStamp();
        }

        public int getState() {
            return ((android.app.usage.NetworkStats.Bucket) real).getState();
        }

        public int getTag() {
            return ((android.app.usage.NetworkStats.Bucket) real).getTag();
        }

        public long getTxBytes() {
            return ((android.app.usage.NetworkStats.Bucket) real).getTxBytes();
        }

        public long getTxPackets() {
            return ((android.app.usage.NetworkStats.Bucket) real).getTxPackets();
        }

        public int getUid() {
            return ((android.app.usage.NetworkStats.Bucket) real).getUid();
        }

        public static final int METERED_ALL = android.app.usage.NetworkStats.Bucket.METERED_ALL;
        public static final int METERED_NO = android.app.usage.NetworkStats.Bucket.METERED_NO;
        public static final int METERED_YES = android.app.usage.NetworkStats.Bucket.METERED_YES;
        public static final int ROAMING_ALL = android.app.usage.NetworkStats.Bucket.ROAMING_ALL;
        public static final int ROAMING_NO = android.app.usage.NetworkStats.Bucket.ROAMING_NO;
        public static final int ROAMING_YES = android.app.usage.NetworkStats.Bucket.ROAMING_YES;
        public static final int STATE_ALL = android.app.usage.NetworkStats.Bucket.STATE_ALL;
        public static final int STATE_DEFAULT = android.app.usage.NetworkStats.Bucket.STATE_DEFAULT;
        public static final int STATE_FOREGROUND = android.app.usage.NetworkStats.Bucket.STATE_FOREGROUND;
        public static final int TAG_NONE = android.app.usage.NetworkStats.Bucket.TAG_NONE;
        public static final int UID_ALL = android.app.usage.NetworkStats.Bucket.UID_ALL;
        public static final int UID_REMOVED = android.app.usage.NetworkStats.Bucket.UID_REMOVED;
        public static final int UID_TETHERING = android.app.usage.NetworkStats.Bucket.UID_TETHERING;

    }
}
