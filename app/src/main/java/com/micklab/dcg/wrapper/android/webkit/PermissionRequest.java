// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class PermissionRequest {
    private final android.webkit.PermissionRequest real;

    public PermissionRequest(android.webkit.PermissionRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.PermissionRequest wrap(android.webkit.PermissionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.PermissionRequest(real);
    }

    public android.webkit.PermissionRequest unwrap() {
        return real;
    }

    public void deny() {
        real.deny();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getOrigin() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getOrigin());
    }

    public java.lang.String[] getResources() {
        return real.getResources();
    }

    public void grant(java.lang.String[] arg0) {
        real.grant(arg0);
    }

    public static final java.lang.String RESOURCE_AUDIO_CAPTURE = android.webkit.PermissionRequest.RESOURCE_AUDIO_CAPTURE;
    public static final java.lang.String RESOURCE_MIDI_SYSEX = android.webkit.PermissionRequest.RESOURCE_MIDI_SYSEX;
    public static final java.lang.String RESOURCE_PROTECTED_MEDIA_ID = android.webkit.PermissionRequest.RESOURCE_PROTECTED_MEDIA_ID;
    public static final java.lang.String RESOURCE_VIDEO_CAPTURE = android.webkit.PermissionRequest.RESOURCE_VIDEO_CAPTURE;

}
