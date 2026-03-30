// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RemoteViews {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteViews(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RemoteViews wrap(android.widget.RemoteViews real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews(real, (__DcgwBridgeToken) null);
    }

    public android.widget.RemoteViews getReal() {
        return (android.widget.RemoteViews) real;
    }

    public android.widget.RemoteViews unwrap() {
        return getReal();
    }

    public RemoteViews(java.util.Map arg0) {
        this(new android.widget.RemoteViews(arg0), (__DcgwBridgeToken) null);
    }

    public RemoteViews(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
        this(new android.widget.RemoteViews(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RemoteViews(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.widget.RemoteViews(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RemoteViews(com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions arg0) {
        this(new android.widget.RemoteViews(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RemoteViews(java.lang.String arg0, int arg1) {
        this(new android.widget.RemoteViews(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public RemoteViews(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
        this(new android.widget.RemoteViews(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public RemoteViews(java.lang.String arg0, int arg1, int arg2) {
        this(new android.widget.RemoteViews(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public void addStableView(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1, int arg2) {
        ((android.widget.RemoteViews) real).addStableView(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void addView(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
        ((android.widget.RemoteViews) real).addView(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.View apply(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.RemoteViews) real).apply(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.widget.RemoteViews clone() {
        return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(((android.widget.RemoteViews) real).clone());
    }

    public int describeContents() {
        return ((android.widget.RemoteViews) real).describeContents();
    }

    public int getLayoutId() {
        return ((android.widget.RemoteViews) real).getLayoutId();
    }

    public java.lang.String getPackage() {
        return ((android.widget.RemoteViews) real).getPackage();
    }

    public int getViewId() {
        return ((android.widget.RemoteViews) real).getViewId();
    }

    public void reapply(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.widget.RemoteViews) real).reapply(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void removeAllViews(int arg0) {
        ((android.widget.RemoteViews) real).removeAllViews(arg0);
    }

    public void setAccessibilityTraversalAfter(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setAccessibilityTraversalAfter(arg0, arg1);
    }

    public void setAccessibilityTraversalBefore(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setAccessibilityTraversalBefore(arg0, arg1);
    }

    public void setBitmap(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap arg2) {
        ((android.widget.RemoteViews) real).setBitmap(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setBlendMode(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.BlendMode arg2) {
        ((android.widget.RemoteViews) real).setBlendMode(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setBoolean(int arg0, java.lang.String arg1, boolean arg2) {
        ((android.widget.RemoteViews) real).setBoolean(arg0, arg1, arg2);
    }

    public void setBundle(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.widget.RemoteViews) real).setBundle(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setByte(int arg0, java.lang.String arg1, byte arg2) {
        ((android.widget.RemoteViews) real).setByte(arg0, arg1, arg2);
    }

    public void setChar(int arg0, java.lang.String arg1, char arg2) {
        ((android.widget.RemoteViews) real).setChar(arg0, arg1, arg2);
    }

    public void setCharSequence(int arg0, java.lang.String arg1, java.lang.CharSequence arg2) {
        ((android.widget.RemoteViews) real).setCharSequence(arg0, arg1, arg2);
    }

    public void setCharSequence(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setCharSequence(arg0, arg1, arg2);
    }

    public void setCharSequenceAttr(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setCharSequenceAttr(arg0, arg1, arg2);
    }

    public void setChronometer(int arg0, long arg1, java.lang.String arg2, boolean arg3) {
        ((android.widget.RemoteViews) real).setChronometer(arg0, arg1, arg2, arg3);
    }

    public void setChronometerCountDown(int arg0, boolean arg1) {
        ((android.widget.RemoteViews) real).setChronometerCountDown(arg0, arg1);
    }

    public void setColor(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setColor(arg0, arg1, arg2);
    }

    public void setColorAttr(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setColorAttr(arg0, arg1, arg2);
    }

    public void setColorInt(int arg0, java.lang.String arg1, int arg2, int arg3) {
        ((android.widget.RemoteViews) real).setColorInt(arg0, arg1, arg2, arg3);
    }

    public void setColorStateList(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg2) {
        ((android.widget.RemoteViews) real).setColorStateList(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setColorStateList(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setColorStateList(arg0, arg1, arg2);
    }

    public void setColorStateList(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg2, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg3) {
        ((android.widget.RemoteViews) real).setColorStateList(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void setColorStateListAttr(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setColorStateListAttr(arg0, arg1, arg2);
    }

    public void setCompoundButtonChecked(int arg0, boolean arg1) {
        ((android.widget.RemoteViews) real).setCompoundButtonChecked(arg0, arg1);
    }

    public void setContentDescription(int arg0, java.lang.CharSequence arg1) {
        ((android.widget.RemoteViews) real).setContentDescription(arg0, arg1);
    }

    public void setDisplayedChild(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setDisplayedChild(arg0, arg1);
    }

    public void setDouble(int arg0, java.lang.String arg1, double arg2) {
        ((android.widget.RemoteViews) real).setDouble(arg0, arg1, arg2);
    }

    public void setEmptyView(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setEmptyView(arg0, arg1);
    }

    public void setFloat(int arg0, java.lang.String arg1, float arg2) {
        ((android.widget.RemoteViews) real).setFloat(arg0, arg1, arg2);
    }

    public void setFloatDimen(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setFloatDimen(arg0, arg1, arg2);
    }

    public void setFloatDimen(int arg0, java.lang.String arg1, float arg2, int arg3) {
        ((android.widget.RemoteViews) real).setFloatDimen(arg0, arg1, arg2, arg3);
    }

    public void setFloatDimenAttr(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setFloatDimenAttr(arg0, arg1, arg2);
    }

    public void setIcon(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg2) {
        ((android.widget.RemoteViews) real).setIcon(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setIcon(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg3) {
        ((android.widget.RemoteViews) real).setIcon(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void setImageViewBitmap(int arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        ((android.widget.RemoteViews) real).setImageViewBitmap(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setImageViewIcon(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg1) {
        ((android.widget.RemoteViews) real).setImageViewIcon(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setImageViewResource(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setImageViewResource(arg0, arg1);
    }

    public void setImageViewUri(int arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.widget.RemoteViews) real).setImageViewUri(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setInt(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setInt(arg0, arg1, arg2);
    }

    public void setIntDimen(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setIntDimen(arg0, arg1, arg2);
    }

    public void setIntDimen(int arg0, java.lang.String arg1, float arg2, int arg3) {
        ((android.widget.RemoteViews) real).setIntDimen(arg0, arg1, arg2, arg3);
    }

    public void setIntDimenAttr(int arg0, java.lang.String arg1, int arg2) {
        ((android.widget.RemoteViews) real).setIntDimenAttr(arg0, arg1, arg2);
    }

    public void setIntent(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        ((android.widget.RemoteViews) real).setIntent(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setLabelFor(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setLabelFor(arg0, arg1);
    }

    public void setLightBackgroundLayoutId(int arg0) {
        ((android.widget.RemoteViews) real).setLightBackgroundLayoutId(arg0);
    }

    public void setLong(int arg0, java.lang.String arg1, long arg2) {
        ((android.widget.RemoteViews) real).setLong(arg0, arg1, arg2);
    }

    public void setOnCheckedChangeResponse(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse arg1) {
        ((android.widget.RemoteViews) real).setOnCheckedChangeResponse(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnClickFillInIntent(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.widget.RemoteViews) real).setOnClickFillInIntent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnClickPendingIntent(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        ((android.widget.RemoteViews) real).setOnClickPendingIntent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnClickResponse(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse arg1) {
        ((android.widget.RemoteViews) real).setOnClickResponse(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnStylusHandwritingPendingIntent(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        ((android.widget.RemoteViews) real).setOnStylusHandwritingPendingIntent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setPendingIntentTemplate(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        ((android.widget.RemoteViews) real).setPendingIntentTemplate(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setProgressBar(int arg0, int arg1, int arg2, boolean arg3) {
        ((android.widget.RemoteViews) real).setProgressBar(arg0, arg1, arg2, arg3);
    }

    public void setRadioGroupChecked(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setRadioGroupChecked(arg0, arg1);
    }

    public void setRelativeScrollPosition(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setRelativeScrollPosition(arg0, arg1);
    }

    public void setRemoteAdapter(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems arg1) {
        ((android.widget.RemoteViews) real).setRemoteAdapter(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setRemoteAdapter(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.widget.RemoteViews) real).setRemoteAdapter(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setRemoteAdapter(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        ((android.widget.RemoteViews) real).setRemoteAdapter(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setScrollPosition(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setScrollPosition(arg0, arg1);
    }

    public void setShort(int arg0, java.lang.String arg1, short arg2) {
        ((android.widget.RemoteViews) real).setShort(arg0, arg1, arg2);
    }

    public void setString(int arg0, java.lang.String arg1, java.lang.String arg2) {
        ((android.widget.RemoteViews) real).setString(arg0, arg1, arg2);
    }

    public void setTextColor(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setTextColor(arg0, arg1);
    }

    public void setTextViewCompoundDrawables(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.widget.RemoteViews) real).setTextViewCompoundDrawables(arg0, arg1, arg2, arg3, arg4);
    }

    public void setTextViewCompoundDrawablesRelative(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.widget.RemoteViews) real).setTextViewCompoundDrawablesRelative(arg0, arg1, arg2, arg3, arg4);
    }

    public void setTextViewText(int arg0, java.lang.CharSequence arg1) {
        ((android.widget.RemoteViews) real).setTextViewText(arg0, arg1);
    }

    public void setTextViewTextSize(int arg0, int arg1, float arg2) {
        ((android.widget.RemoteViews) real).setTextViewTextSize(arg0, arg1, arg2);
    }

    public void setUri(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        ((android.widget.RemoteViews) real).setUri(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setViewLayoutHeight(int arg0, float arg1, int arg2) {
        ((android.widget.RemoteViews) real).setViewLayoutHeight(arg0, arg1, arg2);
    }

    public void setViewLayoutHeightAttr(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setViewLayoutHeightAttr(arg0, arg1);
    }

    public void setViewLayoutHeightDimen(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setViewLayoutHeightDimen(arg0, arg1);
    }

    public void setViewLayoutMargin(int arg0, int arg1, float arg2, int arg3) {
        ((android.widget.RemoteViews) real).setViewLayoutMargin(arg0, arg1, arg2, arg3);
    }

    public void setViewLayoutMarginAttr(int arg0, int arg1, int arg2) {
        ((android.widget.RemoteViews) real).setViewLayoutMarginAttr(arg0, arg1, arg2);
    }

    public void setViewLayoutMarginDimen(int arg0, int arg1, int arg2) {
        ((android.widget.RemoteViews) real).setViewLayoutMarginDimen(arg0, arg1, arg2);
    }

    public void setViewLayoutWidth(int arg0, float arg1, int arg2) {
        ((android.widget.RemoteViews) real).setViewLayoutWidth(arg0, arg1, arg2);
    }

    public void setViewLayoutWidthAttr(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setViewLayoutWidthAttr(arg0, arg1);
    }

    public void setViewLayoutWidthDimen(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setViewLayoutWidthDimen(arg0, arg1);
    }

    public void setViewOutlinePreferredRadius(int arg0, float arg1, int arg2) {
        ((android.widget.RemoteViews) real).setViewOutlinePreferredRadius(arg0, arg1, arg2);
    }

    public void setViewOutlinePreferredRadiusAttr(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setViewOutlinePreferredRadiusAttr(arg0, arg1);
    }

    public void setViewOutlinePreferredRadiusDimen(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setViewOutlinePreferredRadiusDimen(arg0, arg1);
    }

    public void setViewPadding(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.widget.RemoteViews) real).setViewPadding(arg0, arg1, arg2, arg3, arg4);
    }

    public void setViewVisibility(int arg0, int arg1) {
        ((android.widget.RemoteViews) real).setViewVisibility(arg0, arg1);
    }

    public void showNext(int arg0) {
        ((android.widget.RemoteViews) real).showNext(arg0);
    }

    public void showPrevious(int arg0) {
        ((android.widget.RemoteViews) real).showPrevious(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.widget.RemoteViews) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String EXTRA_CHECKED = android.widget.RemoteViews.EXTRA_CHECKED;
    public static final java.lang.String EXTRA_SHARED_ELEMENT_BOUNDS = android.widget.RemoteViews.EXTRA_SHARED_ELEMENT_BOUNDS;
    public static final int MARGIN_BOTTOM = android.widget.RemoteViews.MARGIN_BOTTOM;
    public static final int MARGIN_END = android.widget.RemoteViews.MARGIN_END;
    public static final int MARGIN_LEFT = android.widget.RemoteViews.MARGIN_LEFT;
    public static final int MARGIN_RIGHT = android.widget.RemoteViews.MARGIN_RIGHT;
    public static final int MARGIN_START = android.widget.RemoteViews.MARGIN_START;
    public static final int MARGIN_TOP = android.widget.RemoteViews.MARGIN_TOP;

    public static final class ActionException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ActionException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.ActionException wrap(android.widget.RemoteViews.ActionException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.ActionException(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RemoteViews.ActionException getReal() {
            return (android.widget.RemoteViews.ActionException) real;
        }

        public android.widget.RemoteViews.ActionException unwrap() {
            return getReal();
        }

        public ActionException(java.lang.Exception arg0) {
            this(new android.widget.RemoteViews.ActionException(arg0), (__DcgwBridgeToken) null);
        }

        public ActionException(java.lang.String arg0) {
            this(new android.widget.RemoteViews.ActionException(arg0), (__DcgwBridgeToken) null);
        }

    }
    public static final class DrawInstructions {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DrawInstructions(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions wrap(android.widget.RemoteViews.DrawInstructions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RemoteViews.DrawInstructions getReal() {
            return (android.widget.RemoteViews.DrawInstructions) real;
        }

        public android.widget.RemoteViews.DrawInstructions unwrap() {
            return getReal();
        }

        public static long getSupportedVersion() {
            return android.widget.RemoteViews.DrawInstructions.getSupportedVersion();
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions.Builder wrap(android.widget.RemoteViews.DrawInstructions.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.widget.RemoteViews.DrawInstructions.Builder getReal() {
                return (android.widget.RemoteViews.DrawInstructions.Builder) real;
            }

            public android.widget.RemoteViews.DrawInstructions.Builder unwrap() {
                return getReal();
            }

            public Builder(java.util.List arg0) {
                this(new android.widget.RemoteViews.DrawInstructions.Builder(arg0), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions build() {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions.wrap(((android.widget.RemoteViews.DrawInstructions.Builder) real).build());
            }

        }
    }
    public static final class RemoteCollectionItems {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RemoteCollectionItems(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems wrap(android.widget.RemoteViews.RemoteCollectionItems real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RemoteViews.RemoteCollectionItems getReal() {
            return (android.widget.RemoteViews.RemoteCollectionItems) real;
        }

        public android.widget.RemoteViews.RemoteCollectionItems unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.widget.RemoteViews.RemoteCollectionItems) real).describeContents();
        }

        public int getItemCount() {
            return ((android.widget.RemoteViews.RemoteCollectionItems) real).getItemCount();
        }

        public long getItemId(int arg0) {
            return ((android.widget.RemoteViews.RemoteCollectionItems) real).getItemId(arg0);
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews getItemView(int arg0) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(((android.widget.RemoteViews.RemoteCollectionItems) real).getItemView(arg0));
        }

        public int getViewTypeCount() {
            return ((android.widget.RemoteViews.RemoteCollectionItems) real).getViewTypeCount();
        }

        public boolean hasStableIds() {
            return ((android.widget.RemoteViews.RemoteCollectionItems) real).hasStableIds();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.widget.RemoteViews.RemoteCollectionItems) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder wrap(android.widget.RemoteViews.RemoteCollectionItems.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.widget.RemoteViews.RemoteCollectionItems.Builder getReal() {
                return (android.widget.RemoteViews.RemoteCollectionItems.Builder) real;
            }

            public android.widget.RemoteViews.RemoteCollectionItems.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.widget.RemoteViews.RemoteCollectionItems.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder addItem(long arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder.wrap(((android.widget.RemoteViews.RemoteCollectionItems.Builder) real).addItem(arg0, arg1 == null ? null : arg1.getReal()));
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems build() {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.wrap(((android.widget.RemoteViews.RemoteCollectionItems.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder setHasStableIds(boolean arg0) {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder.wrap(((android.widget.RemoteViews.RemoteCollectionItems.Builder) real).setHasStableIds(arg0));
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder setViewTypeCount(int arg0) {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder.wrap(((android.widget.RemoteViews.RemoteCollectionItems.Builder) real).setViewTypeCount(arg0));
            }

        }
    }
    public static final class RemoteResponse {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RemoteResponse(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse wrap(android.widget.RemoteViews.RemoteResponse real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RemoteViews.RemoteResponse getReal() {
            return (android.widget.RemoteViews.RemoteResponse) real;
        }

        public android.widget.RemoteViews.RemoteResponse unwrap() {
            return getReal();
        }

        public RemoteResponse() {
            this(new android.widget.RemoteViews.RemoteResponse(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse addSharedElement(int arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse.wrap(((android.widget.RemoteViews.RemoteResponse) real).addSharedElement(arg0, arg1));
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse fromFillInIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse.wrap(android.widget.RemoteViews.RemoteResponse.fromFillInIntent(arg0 == null ? null : arg0.getReal()));
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse fromPendingIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse.wrap(android.widget.RemoteViews.RemoteResponse.fromPendingIntent(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class RemoteView {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RemoteView(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteView wrap(android.widget.RemoteViews.RemoteView real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteView(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RemoteViews.RemoteView getReal() {
            return (android.widget.RemoteViews.RemoteView) real;
        }

        public android.widget.RemoteViews.RemoteView unwrap() {
            return getReal();
        }

    }
    public static final class RemoteViewOutlineProvider {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RemoteViewOutlineProvider(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteViewOutlineProvider wrap(android.widget.RemoteViews.RemoteViewOutlineProvider real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteViewOutlineProvider(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RemoteViews.RemoteViewOutlineProvider getReal() {
            return (android.widget.RemoteViews.RemoteViewOutlineProvider) real;
        }

        public android.widget.RemoteViews.RemoteViewOutlineProvider unwrap() {
            return getReal();
        }

        public RemoteViewOutlineProvider(float arg0) {
            this(new android.widget.RemoteViews.RemoteViewOutlineProvider(arg0), (__DcgwBridgeToken) null);
        }

        public void getOutline(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Outline arg1) {
            ((android.widget.RemoteViews.RemoteViewOutlineProvider) real).getOutline(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public float getRadius() {
            return ((android.widget.RemoteViews.RemoteViewOutlineProvider) real).getRadius();
        }

    }
}
