// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceControl {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SurfaceControl(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceControl wrap(android.view.SurfaceControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl(real, (__DcgwBridgeToken) null);
    }

    public android.view.SurfaceControl getReal() {
        return (android.view.SurfaceControl) real;
    }

    public android.view.SurfaceControl unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.SurfaceControl) real).describeContents();
    }

    public boolean isValid() {
        return ((android.view.SurfaceControl) real).isValid();
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        ((android.view.SurfaceControl) real).readFromParcel(arg0 == null ? null : arg0.getReal());
    }

    public void release() {
        ((android.view.SurfaceControl) real).release();
    }

    public java.lang.String toString() {
        return ((android.view.SurfaceControl) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.SurfaceControl) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int BUFFER_TRANSFORM_IDENTITY = android.view.SurfaceControl.BUFFER_TRANSFORM_IDENTITY;
    public static final int BUFFER_TRANSFORM_MIRROR_HORIZONTAL = android.view.SurfaceControl.BUFFER_TRANSFORM_MIRROR_HORIZONTAL;
    public static final int BUFFER_TRANSFORM_MIRROR_VERTICAL = android.view.SurfaceControl.BUFFER_TRANSFORM_MIRROR_VERTICAL;
    public static final int BUFFER_TRANSFORM_ROTATE_180 = android.view.SurfaceControl.BUFFER_TRANSFORM_ROTATE_180;
    public static final int BUFFER_TRANSFORM_ROTATE_270 = android.view.SurfaceControl.BUFFER_TRANSFORM_ROTATE_270;
    public static final int BUFFER_TRANSFORM_ROTATE_90 = android.view.SurfaceControl.BUFFER_TRANSFORM_ROTATE_90;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder wrap(android.view.SurfaceControl.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.SurfaceControl.Builder getReal() {
            return (android.view.SurfaceControl.Builder) real;
        }

        public android.view.SurfaceControl.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.SurfaceControl.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl build() {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.wrap(((android.view.SurfaceControl.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setBufferSize(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(((android.view.SurfaceControl.Builder) real).setBufferSize(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(((android.view.SurfaceControl.Builder) real).setFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setHidden(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(((android.view.SurfaceControl.Builder) real).setHidden(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(((android.view.SurfaceControl.Builder) real).setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setOpaque(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(((android.view.SurfaceControl.Builder) real).setOpaque(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setParent(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(((android.view.SurfaceControl.Builder) real).setParent(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class Transaction {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Transaction(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction wrap(android.view.SurfaceControl.Transaction real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction(real, (__DcgwBridgeToken) null);
        }

        public android.view.SurfaceControl.Transaction getReal() {
            return (android.view.SurfaceControl.Transaction) real;
        }

        public android.view.SurfaceControl.Transaction unwrap() {
            return getReal();
        }

        public Transaction() {
            this(new android.view.SurfaceControl.Transaction(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction addTransactionCommittedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionCommittedListener arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).addTransactionCommittedListener(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public void apply() {
            ((android.view.SurfaceControl.Transaction) real).apply();
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction clearFrameRate(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).clearFrameRate(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction clearTrustedPresentationCallback(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).clearTrustedPresentationCallback(arg0 == null ? null : arg0.getReal()));
        }

        public void close() {
            ((android.view.SurfaceControl.Transaction) real).close();
        }

        public int describeContents() {
            return ((android.view.SurfaceControl.Transaction) real).describeContents();
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction merge(com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).merge(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction reparent(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.view.SurfaceControl arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).reparent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setAlpha(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setAlpha(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setBuffer(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setBuffer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setBuffer(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg1, com.micklab.dcg.wrapper.android.hardware.SyncFence arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setBuffer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setBufferSize(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, int arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setBufferSize(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setBufferTransform(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setBufferTransform(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setCrop(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setCrop(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setDamageRegion(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setDamageRegion(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setDataSpace(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setDataSpace(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setDesiredHdrHeadroom(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setDesiredHdrHeadroom(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setDesiredPresentTimeNanos(long arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setDesiredPresentTimeNanos(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setExtendedRangeBrightness(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setExtendedRangeBrightness(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setFrameRate(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setFrameRate(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setFrameRate(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, int arg2, int arg3) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setFrameRate(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setFrameTimeline(long arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setFrameTimeline(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setGeometry(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, int arg3) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setGeometry(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setLayer(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setLayer(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setOpaque(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setOpaque(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setPosition(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setPosition(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setScale(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setScale(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setVisibility(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.SurfaceControl.Transaction) real).setVisibility(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.SurfaceControl.Transaction) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class TransactionCommittedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TransactionCommittedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionCommittedListener wrap(android.view.SurfaceControl.TransactionCommittedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionCommittedListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.SurfaceControl.TransactionCommittedListener getReal() {
            return (android.view.SurfaceControl.TransactionCommittedListener) real;
        }

        public android.view.SurfaceControl.TransactionCommittedListener unwrap() {
            return getReal();
        }

        public void onTransactionCommitted() {
            ((android.view.SurfaceControl.TransactionCommittedListener) real).onTransactionCommitted();
        }

    }
    public static final class TransactionStats {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TransactionStats(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionStats wrap(android.view.SurfaceControl.TransactionStats real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionStats(real, (__DcgwBridgeToken) null);
        }

        public android.view.SurfaceControl.TransactionStats getReal() {
            return (android.view.SurfaceControl.TransactionStats) real;
        }

        public android.view.SurfaceControl.TransactionStats unwrap() {
            return getReal();
        }

        public long getLatchTimeNanos() {
            return ((android.view.SurfaceControl.TransactionStats) real).getLatchTimeNanos();
        }

        public com.micklab.dcg.wrapper.android.hardware.SyncFence getPresentFence() {
            return com.micklab.dcg.wrapper.android.hardware.SyncFence.wrap(((android.view.SurfaceControl.TransactionStats) real).getPresentFence());
        }

    }
    public static final class TrustedPresentationThresholds {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TrustedPresentationThresholds(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.TrustedPresentationThresholds wrap(android.view.SurfaceControl.TrustedPresentationThresholds real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.TrustedPresentationThresholds(real, (__DcgwBridgeToken) null);
        }

        public android.view.SurfaceControl.TrustedPresentationThresholds getReal() {
            return (android.view.SurfaceControl.TrustedPresentationThresholds) real;
        }

        public android.view.SurfaceControl.TrustedPresentationThresholds unwrap() {
            return getReal();
        }

        public TrustedPresentationThresholds(float arg0, float arg1, int arg2) {
            this(new android.view.SurfaceControl.TrustedPresentationThresholds(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

    }
}
