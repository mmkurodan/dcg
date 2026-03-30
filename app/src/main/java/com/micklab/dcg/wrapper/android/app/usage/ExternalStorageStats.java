// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class ExternalStorageStats {
    private final android.app.usage.ExternalStorageStats real;

    public ExternalStorageStats(android.app.usage.ExternalStorageStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.ExternalStorageStats wrap(android.app.usage.ExternalStorageStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.ExternalStorageStats(real);
    }

    public android.app.usage.ExternalStorageStats unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getAppBytes() {
        return real.getAppBytes();
    }

    public long getAudioBytes() {
        return real.getAudioBytes();
    }

    public long getImageBytes() {
        return real.getImageBytes();
    }

    public long getTotalBytes() {
        return real.getTotalBytes();
    }

    public long getVideoBytes() {
        return real.getVideoBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
