// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceControl {
    private final android.view.SurfaceControl real;

    public SurfaceControl(android.view.SurfaceControl real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceControl wrap(android.view.SurfaceControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl(real);
    }

    public android.view.SurfaceControl unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean isValid() {
        return real.isValid();
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        real.readFromParcel(arg0 == null ? null : arg0.unwrap());
    }

    public void release() {
        real.release();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int BUFFER_TRANSFORM_IDENTITY = android.view.SurfaceControl.BUFFER_TRANSFORM_IDENTITY;
    public static final int BUFFER_TRANSFORM_MIRROR_HORIZONTAL = android.view.SurfaceControl.BUFFER_TRANSFORM_MIRROR_HORIZONTAL;
    public static final int BUFFER_TRANSFORM_MIRROR_VERTICAL = android.view.SurfaceControl.BUFFER_TRANSFORM_MIRROR_VERTICAL;
    public static final int BUFFER_TRANSFORM_ROTATE_180 = android.view.SurfaceControl.BUFFER_TRANSFORM_ROTATE_180;
    public static final int BUFFER_TRANSFORM_ROTATE_270 = android.view.SurfaceControl.BUFFER_TRANSFORM_ROTATE_270;
    public static final int BUFFER_TRANSFORM_ROTATE_90 = android.view.SurfaceControl.BUFFER_TRANSFORM_ROTATE_90;

    public static final class Builder {
        private final android.view.SurfaceControl.Builder real;

        public Builder(android.view.SurfaceControl.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder wrap(android.view.SurfaceControl.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder(real);
        }

        public android.view.SurfaceControl.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.SurfaceControl.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl build() {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setBufferSize(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(real.setBufferSize(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(real.setFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setHidden(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(real.setHidden(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(real.setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setOpaque(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(real.setOpaque(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder setParent(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Builder.wrap(real.setParent(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class Transaction {
        private final android.view.SurfaceControl.Transaction real;

        public Transaction(android.view.SurfaceControl.Transaction real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction wrap(android.view.SurfaceControl.Transaction real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction(real);
        }

        public android.view.SurfaceControl.Transaction unwrap() {
            return real;
        }

        public Transaction() {
            this(new android.view.SurfaceControl.Transaction());
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction addTransactionCommittedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionCommittedListener arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.addTransactionCommittedListener(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public void apply() {
            real.apply();
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction clearFrameRate(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.clearFrameRate(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction clearTrustedPresentationCallback(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.clearTrustedPresentationCallback(arg0 == null ? null : arg0.unwrap()));
        }

        public void close() {
            real.close();
        }

        public int describeContents() {
            return real.describeContents();
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction merge(com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.merge(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction reparent(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.view.SurfaceControl arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.reparent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setAlpha(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setAlpha(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setBuffer(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setBuffer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setBuffer(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg1, com.micklab.dcg.wrapper.android.hardware.SyncFence arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setBuffer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setBufferSize(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, int arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setBufferSize(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setBufferTransform(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setBufferTransform(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setCrop(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setCrop(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setDamageRegion(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setDamageRegion(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setDataSpace(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setDataSpace(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setDesiredHdrHeadroom(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setDesiredHdrHeadroom(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setDesiredPresentTimeNanos(long arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setDesiredPresentTimeNanos(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setExtendedRangeBrightness(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setExtendedRangeBrightness(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setFrameRate(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setFrameRate(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setFrameRate(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, int arg2, int arg3) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setFrameRate(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setFrameTimeline(long arg0) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setFrameTimeline(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setGeometry(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, int arg3) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setGeometry(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setLayer(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setLayer(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setOpaque(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setOpaque(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setPosition(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setPosition(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setScale(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, float arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setScale(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction setVisibility(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.setVisibility(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class TransactionCommittedListener {
        private final android.view.SurfaceControl.TransactionCommittedListener real;

        public TransactionCommittedListener(android.view.SurfaceControl.TransactionCommittedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionCommittedListener wrap(android.view.SurfaceControl.TransactionCommittedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionCommittedListener(real);
        }

        public android.view.SurfaceControl.TransactionCommittedListener unwrap() {
            return real;
        }

        public void onTransactionCommitted() {
            real.onTransactionCommitted();
        }

    }
    public static final class TransactionStats {
        private final android.view.SurfaceControl.TransactionStats real;

        public TransactionStats(android.view.SurfaceControl.TransactionStats real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionStats wrap(android.view.SurfaceControl.TransactionStats real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.TransactionStats(real);
        }

        public android.view.SurfaceControl.TransactionStats unwrap() {
            return real;
        }

        public long getLatchTimeNanos() {
            return real.getLatchTimeNanos();
        }

        public com.micklab.dcg.wrapper.android.hardware.SyncFence getPresentFence() {
            return com.micklab.dcg.wrapper.android.hardware.SyncFence.wrap(real.getPresentFence());
        }

    }
    public static final class TrustedPresentationThresholds {
        private final android.view.SurfaceControl.TrustedPresentationThresholds real;

        public TrustedPresentationThresholds(android.view.SurfaceControl.TrustedPresentationThresholds real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControl.TrustedPresentationThresholds wrap(android.view.SurfaceControl.TrustedPresentationThresholds real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControl.TrustedPresentationThresholds(real);
        }

        public android.view.SurfaceControl.TrustedPresentationThresholds unwrap() {
            return real;
        }

        public TrustedPresentationThresholds(float arg0, float arg1, int arg2) {
            this(new android.view.SurfaceControl.TrustedPresentationThresholds(arg0, arg1, arg2));
        }

    }
}
