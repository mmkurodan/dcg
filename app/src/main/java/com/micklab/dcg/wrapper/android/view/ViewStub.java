// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewStub {
    private final android.view.ViewStub real;

    public ViewStub(android.view.ViewStub real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewStub wrap(android.view.ViewStub real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStub(real);
    }

    public android.view.ViewStub unwrap() {
        return real;
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.unwrap()));
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ViewStub(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.view.ViewStub(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public int getInflatedId() {
        return real.getInflatedId();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.getLayoutInflater());
    }

    public int getLayoutResource() {
        return real.getLayoutResource();
    }

    public com.micklab.dcg.wrapper.android.view.View inflate() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.inflate());
    }

    public void setInflatedId(int arg0) {
        real.setInflatedId(arg0);
    }

    public void setLayoutInflater(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0) {
        real.setLayoutInflater(arg0 == null ? null : arg0.unwrap());
    }

    public void setLayoutResource(int arg0) {
        real.setLayoutResource(arg0);
    }

    public void setOnInflateListener(com.micklab.dcg.wrapper.android.view.ViewStub.OnInflateListener arg0) {
        real.setOnInflateListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setVisibility(int arg0) {
        real.setVisibility(arg0);
    }

    public static final class OnInflateListener {
        private final android.view.ViewStub.OnInflateListener real;

        public OnInflateListener(android.view.ViewStub.OnInflateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewStub.OnInflateListener wrap(android.view.ViewStub.OnInflateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStub.OnInflateListener(real);
        }

        public android.view.ViewStub.OnInflateListener unwrap() {
            return real;
        }

        public void onInflate(com.micklab.dcg.wrapper.android.view.ViewStub arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
            real.onInflate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
