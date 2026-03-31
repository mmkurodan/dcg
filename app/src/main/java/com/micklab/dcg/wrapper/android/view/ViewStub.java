// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewStub {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewStub(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewStub wrap(android.view.ViewStub real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStub(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewStub getReal() {
        return (android.view.ViewStub) real;
    }

    public android.view.ViewStub unwrap() {
        return getReal();
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.view.ViewStub) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getInflatedId() {
        return ((android.view.ViewStub) real).getInflatedId();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.view.ViewStub) real).getLayoutInflater());
    }

    public int getLayoutResource() {
        return ((android.view.ViewStub) real).getLayoutResource();
    }

    public com.micklab.dcg.wrapper.android.view.View inflate() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ViewStub) real).inflate());
    }

    public void setInflatedId(int arg0) {
        ((android.view.ViewStub) real).setInflatedId(arg0);
    }

    public void setLayoutInflater(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0) {
        ((android.view.ViewStub) real).setLayoutInflater(arg0 == null ? null : arg0.getReal());
    }

    public void setLayoutResource(int arg0) {
        ((android.view.ViewStub) real).setLayoutResource(arg0);
    }

    public void setOnInflateListener(com.micklab.dcg.wrapper.android.view.ViewStub.OnInflateListener arg0) {
        ((android.view.ViewStub) real).setOnInflateListener(arg0 == null ? null : arg0.getReal());
    }

    public void setVisibility(int arg0) {
        ((android.view.ViewStub) real).setVisibility(arg0);
    }

    public static final class OnInflateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnInflateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewStub.OnInflateListener wrap(android.view.ViewStub.OnInflateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStub.OnInflateListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewStub.OnInflateListener getReal() {
            return (android.view.ViewStub.OnInflateListener) real;
        }

        public android.view.ViewStub.OnInflateListener unwrap() {
            return getReal();
        }

        public void onInflate(com.micklab.dcg.wrapper.android.view.ViewStub arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
            ((android.view.ViewStub.OnInflateListener) real).onInflate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
