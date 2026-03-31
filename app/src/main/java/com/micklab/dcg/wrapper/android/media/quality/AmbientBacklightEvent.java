// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.quality;

public final class AmbientBacklightEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AmbientBacklightEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightEvent wrap(android.media.quality.AmbientBacklightEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightEvent(real, (__DcgwBridgeToken) null);
    }

    public android.media.quality.AmbientBacklightEvent getReal() {
        return (android.media.quality.AmbientBacklightEvent) real;
    }

    public android.media.quality.AmbientBacklightEvent unwrap() {
        return getReal();
    }

    public AmbientBacklightEvent(int arg0, com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightMetadata arg1) {
        this(new android.media.quality.AmbientBacklightEvent(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.quality.AmbientBacklightEvent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.quality.AmbientBacklightEvent) real).equals(arg0);
    }

    public int getEventType() {
        return ((android.media.quality.AmbientBacklightEvent) real).getEventType();
    }

    public com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightMetadata getMetadata() {
        return com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightMetadata.wrap(((android.media.quality.AmbientBacklightEvent) real).getMetadata());
    }

    public int hashCode() {
        return ((android.media.quality.AmbientBacklightEvent) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.quality.AmbientBacklightEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.quality.AmbientBacklightEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int AMBIENT_BACKLIGHT_EVENT_DISABLED = android.media.quality.AmbientBacklightEvent.AMBIENT_BACKLIGHT_EVENT_DISABLED;
    public static final int AMBIENT_BACKLIGHT_EVENT_ENABLED = android.media.quality.AmbientBacklightEvent.AMBIENT_BACKLIGHT_EVENT_ENABLED;
    public static final int AMBIENT_BACKLIGHT_EVENT_INTERRUPTED = android.media.quality.AmbientBacklightEvent.AMBIENT_BACKLIGHT_EVENT_INTERRUPTED;
    public static final int AMBIENT_BACKLIGHT_EVENT_METADATA_AVAILABLE = android.media.quality.AmbientBacklightEvent.AMBIENT_BACKLIGHT_EVENT_METADATA_AVAILABLE;

}
