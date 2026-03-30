// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class BroadcastOptions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BroadcastOptions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.BroadcastOptions wrap(android.app.BroadcastOptions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.BroadcastOptions(real, (__DcgwBridgeToken) null);
    }

    public android.app.BroadcastOptions getReal() {
        return (android.app.BroadcastOptions) real;
    }

    public android.app.BroadcastOptions unwrap() {
        return getReal();
    }

    public void clearDeferralPolicy() {
        ((android.app.BroadcastOptions) real).clearDeferralPolicy();
    }

    public void clearDeliveryGroupMatchingKey() {
        ((android.app.BroadcastOptions) real).clearDeliveryGroupMatchingKey();
    }

    public void clearDeliveryGroupPolicy() {
        ((android.app.BroadcastOptions) real).clearDeliveryGroupPolicy();
    }

    public static com.micklab.dcg.wrapper.android.app.BroadcastOptions fromBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(android.app.BroadcastOptions.fromBundle(arg0 == null ? null : arg0.getReal()));
    }

    public int getDeferralPolicy() {
        return ((android.app.BroadcastOptions) real).getDeferralPolicy();
    }

    public java.lang.String getDeliveryGroupMatchingKey() {
        return ((android.app.BroadcastOptions) real).getDeliveryGroupMatchingKey();
    }

    public int getDeliveryGroupPolicy() {
        return ((android.app.BroadcastOptions) real).getDeliveryGroupPolicy();
    }

    public boolean isShareIdentityEnabled() {
        return ((android.app.BroadcastOptions) real).isShareIdentityEnabled();
    }

    public static com.micklab.dcg.wrapper.android.app.BroadcastOptions makeBasic() {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(android.app.BroadcastOptions.makeBasic());
    }

    public com.micklab.dcg.wrapper.android.app.BroadcastOptions setDeferralPolicy(int arg0) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(((android.app.BroadcastOptions) real).setDeferralPolicy(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.BroadcastOptions setDeliveryGroupMatchingKey(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(((android.app.BroadcastOptions) real).setDeliveryGroupMatchingKey(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.BroadcastOptions setDeliveryGroupPolicy(int arg0) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(((android.app.BroadcastOptions) real).setDeliveryGroupPolicy(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.BroadcastOptions setShareIdentityEnabled(boolean arg0) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(((android.app.BroadcastOptions) real).setShareIdentityEnabled(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle toBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.BroadcastOptions) real).toBundle());
    }

    public static final int DEFERRAL_POLICY_DEFAULT = android.app.BroadcastOptions.DEFERRAL_POLICY_DEFAULT;
    public static final int DEFERRAL_POLICY_NONE = android.app.BroadcastOptions.DEFERRAL_POLICY_NONE;
    public static final int DEFERRAL_POLICY_UNTIL_ACTIVE = android.app.BroadcastOptions.DEFERRAL_POLICY_UNTIL_ACTIVE;
    public static final int DELIVERY_GROUP_POLICY_ALL = android.app.BroadcastOptions.DELIVERY_GROUP_POLICY_ALL;
    public static final int DELIVERY_GROUP_POLICY_MOST_RECENT = android.app.BroadcastOptions.DELIVERY_GROUP_POLICY_MOST_RECENT;

}
