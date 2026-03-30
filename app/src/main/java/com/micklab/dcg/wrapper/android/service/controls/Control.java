// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls;

public final class Control {
    private final android.service.controls.Control real;

    public Control(android.service.controls.Control real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.Control wrap(android.service.controls.Control real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.Control(real);
    }

    public android.service.controls.Control unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getAppIntent() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getAppIntent());
    }

    public java.lang.String getControlId() {
        return real.getControlId();
    }

    public com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate getControlTemplate() {
        return com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate.wrap(real.getControlTemplate());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getCustomColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getCustomColor());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getCustomIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getCustomIcon());
    }

    public int getDeviceType() {
        return real.getDeviceType();
    }

    public int getStatus() {
        return real.getStatus();
    }

    public java.lang.CharSequence getStatusText() {
        return real.getStatusText();
    }

    public java.lang.CharSequence getStructure() {
        return real.getStructure();
    }

    public java.lang.CharSequence getSubtitle() {
        return real.getSubtitle();
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public java.lang.CharSequence getZone() {
        return real.getZone();
    }

    public boolean isAuthRequired() {
        return real.isAuthRequired();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STATUS_DISABLED = android.service.controls.Control.STATUS_DISABLED;
    public static final int STATUS_ERROR = android.service.controls.Control.STATUS_ERROR;
    public static final int STATUS_NOT_FOUND = android.service.controls.Control.STATUS_NOT_FOUND;
    public static final int STATUS_OK = android.service.controls.Control.STATUS_OK;
    public static final int STATUS_UNKNOWN = android.service.controls.Control.STATUS_UNKNOWN;

    public static final class StatefulBuilder {
        private final android.service.controls.Control.StatefulBuilder real;

        public StatefulBuilder(android.service.controls.Control.StatefulBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder wrap(android.service.controls.Control.StatefulBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder(real);
        }

        public android.service.controls.Control.StatefulBuilder unwrap() {
            return real;
        }

        public StatefulBuilder(com.micklab.dcg.wrapper.android.service.controls.Control arg0) {
            this(new android.service.controls.Control.StatefulBuilder(arg0 == null ? null : arg0.unwrap()));
        }

        public StatefulBuilder(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
            this(new android.service.controls.Control.StatefulBuilder(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control build() {
            return com.micklab.dcg.wrapper.android.service.controls.Control.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setAppIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setAppIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setAuthRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setAuthRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setControlId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setControlId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setControlTemplate(com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setControlTemplate(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setCustomColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setCustomColor(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setCustomIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setCustomIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setDeviceType(int arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setDeviceType(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setStatus(int arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setStatus(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setStatusText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setStatusText(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setStructure(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setStructure(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setSubtitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setZone(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(real.setZone(arg0));
        }

    }
    public static final class StatelessBuilder {
        private final android.service.controls.Control.StatelessBuilder real;

        public StatelessBuilder(android.service.controls.Control.StatelessBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder wrap(android.service.controls.Control.StatelessBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder(real);
        }

        public android.service.controls.Control.StatelessBuilder unwrap() {
            return real;
        }

        public StatelessBuilder(com.micklab.dcg.wrapper.android.service.controls.Control arg0) {
            this(new android.service.controls.Control.StatelessBuilder(arg0 == null ? null : arg0.unwrap()));
        }

        public StatelessBuilder(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
            this(new android.service.controls.Control.StatelessBuilder(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control build() {
            return com.micklab.dcg.wrapper.android.service.controls.Control.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setAppIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(real.setAppIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setControlId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(real.setControlId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setCustomColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(real.setCustomColor(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setCustomIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(real.setCustomIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setDeviceType(int arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(real.setDeviceType(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setStructure(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(real.setStructure(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setSubtitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(real.setSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(real.setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setZone(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(real.setZone(arg0));
        }

    }
}
