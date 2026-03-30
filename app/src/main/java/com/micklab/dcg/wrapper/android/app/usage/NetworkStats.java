// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class NetworkStats {
    private final android.app.usage.NetworkStats real;

    public NetworkStats(android.app.usage.NetworkStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.NetworkStats wrap(android.app.usage.NetworkStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.NetworkStats(real);
    }

    public android.app.usage.NetworkStats unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public boolean getNextBucket(com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket arg0) {
        return real.getNextBucket(arg0 == null ? null : arg0.unwrap());
    }

    public boolean hasNextBucket() {
        return real.hasNextBucket();
    }

    public static final class Bucket {
        private final android.app.usage.NetworkStats.Bucket real;

        public Bucket(android.app.usage.NetworkStats.Bucket real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket wrap(android.app.usage.NetworkStats.Bucket real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket(real);
        }

        public android.app.usage.NetworkStats.Bucket unwrap() {
            return real;
        }

        public Bucket() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.usage.NetworkStats$Bucket#android.app.usage.NetworkStats$Bucket()");
        }

        public int getDefaultNetworkStatus() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.usage.NetworkStats$Bucket#getDefaultNetworkStatus()");
        }

        public long getEndTimeStamp() {
            return real.getEndTimeStamp();
        }

        public int getMetered() {
            return real.getMetered();
        }

        public int getRoaming() {
            return real.getRoaming();
        }

        public long getRxBytes() {
            return real.getRxBytes();
        }

        public long getRxPackets() {
            return real.getRxPackets();
        }

        public long getStartTimeStamp() {
            return real.getStartTimeStamp();
        }

        public int getState() {
            return real.getState();
        }

        public int getTag() {
            return real.getTag();
        }

        public long getTxBytes() {
            return real.getTxBytes();
        }

        public long getTxPackets() {
            return real.getTxPackets();
        }

        public int getUid() {
            return real.getUid();
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
