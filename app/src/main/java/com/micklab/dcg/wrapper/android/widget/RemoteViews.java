// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RemoteViews {
    private final android.widget.RemoteViews real;

    public RemoteViews(android.widget.RemoteViews real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RemoteViews wrap(android.widget.RemoteViews real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews(real);
    }

    public android.widget.RemoteViews unwrap() {
        return real;
    }

    public RemoteViews(java.util.Map arg0) {
        this(new android.widget.RemoteViews(arg0));
    }

    public RemoteViews(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
        this(new android.widget.RemoteViews(arg0 == null ? null : arg0.unwrap()));
    }

    public RemoteViews(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.widget.RemoteViews(arg0 == null ? null : arg0.unwrap()));
    }

    public RemoteViews(com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions arg0) {
        this(new android.widget.RemoteViews(arg0 == null ? null : arg0.unwrap()));
    }

    public RemoteViews(java.lang.String arg0, int arg1) {
        this(new android.widget.RemoteViews(arg0, arg1));
    }

    public RemoteViews(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
        this(new android.widget.RemoteViews(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public RemoteViews(java.lang.String arg0, int arg1, int arg2) {
        this(new android.widget.RemoteViews(arg0, arg1, arg2));
    }

    public void addStableView(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1, int arg2) {
        real.addStableView(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void addView(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
        real.addView(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.View apply(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.apply(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.widget.RemoteViews clone() {
        return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.clone());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getLayoutId() {
        return real.getLayoutId();
    }

    public java.lang.String getPackage() {
        return real.getPackage();
    }

    public int getViewId() {
        return real.getViewId();
    }

    public void reapply(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.reapply(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void removeAllViews(int arg0) {
        real.removeAllViews(arg0);
    }

    public void setAccessibilityTraversalAfter(int arg0, int arg1) {
        real.setAccessibilityTraversalAfter(arg0, arg1);
    }

    public void setAccessibilityTraversalBefore(int arg0, int arg1) {
        real.setAccessibilityTraversalBefore(arg0, arg1);
    }

    public void setBitmap(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap arg2) {
        real.setBitmap(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setBlendMode(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.BlendMode arg2) {
        real.setBlendMode(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setBoolean(int arg0, java.lang.String arg1, boolean arg2) {
        real.setBoolean(arg0, arg1, arg2);
    }

    public void setBundle(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.setBundle(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setByte(int arg0, java.lang.String arg1, byte arg2) {
        real.setByte(arg0, arg1, arg2);
    }

    public void setChar(int arg0, java.lang.String arg1, char arg2) {
        real.setChar(arg0, arg1, arg2);
    }

    public void setCharSequence(int arg0, java.lang.String arg1, java.lang.CharSequence arg2) {
        real.setCharSequence(arg0, arg1, arg2);
    }

    public void setCharSequence(int arg0, java.lang.String arg1, int arg2) {
        real.setCharSequence(arg0, arg1, arg2);
    }

    public void setCharSequenceAttr(int arg0, java.lang.String arg1, int arg2) {
        real.setCharSequenceAttr(arg0, arg1, arg2);
    }

    public void setChronometer(int arg0, long arg1, java.lang.String arg2, boolean arg3) {
        real.setChronometer(arg0, arg1, arg2, arg3);
    }

    public void setChronometerCountDown(int arg0, boolean arg1) {
        real.setChronometerCountDown(arg0, arg1);
    }

    public void setColor(int arg0, java.lang.String arg1, int arg2) {
        real.setColor(arg0, arg1, arg2);
    }

    public void setColorAttr(int arg0, java.lang.String arg1, int arg2) {
        real.setColorAttr(arg0, arg1, arg2);
    }

    public void setColorInt(int arg0, java.lang.String arg1, int arg2, int arg3) {
        real.setColorInt(arg0, arg1, arg2, arg3);
    }

    public void setColorStateList(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg2) {
        real.setColorStateList(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setColorStateList(int arg0, java.lang.String arg1, int arg2) {
        real.setColorStateList(arg0, arg1, arg2);
    }

    public void setColorStateList(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg2, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg3) {
        real.setColorStateList(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void setColorStateListAttr(int arg0, java.lang.String arg1, int arg2) {
        real.setColorStateListAttr(arg0, arg1, arg2);
    }

    public void setCompoundButtonChecked(int arg0, boolean arg1) {
        real.setCompoundButtonChecked(arg0, arg1);
    }

    public void setContentDescription(int arg0, java.lang.CharSequence arg1) {
        real.setContentDescription(arg0, arg1);
    }

    public void setDisplayedChild(int arg0, int arg1) {
        real.setDisplayedChild(arg0, arg1);
    }

    public void setDouble(int arg0, java.lang.String arg1, double arg2) {
        real.setDouble(arg0, arg1, arg2);
    }

    public void setEmptyView(int arg0, int arg1) {
        real.setEmptyView(arg0, arg1);
    }

    public void setFloat(int arg0, java.lang.String arg1, float arg2) {
        real.setFloat(arg0, arg1, arg2);
    }

    public void setFloatDimen(int arg0, java.lang.String arg1, int arg2) {
        real.setFloatDimen(arg0, arg1, arg2);
    }

    public void setFloatDimen(int arg0, java.lang.String arg1, float arg2, int arg3) {
        real.setFloatDimen(arg0, arg1, arg2, arg3);
    }

    public void setFloatDimenAttr(int arg0, java.lang.String arg1, int arg2) {
        real.setFloatDimenAttr(arg0, arg1, arg2);
    }

    public void setIcon(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg2) {
        real.setIcon(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setIcon(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg3) {
        real.setIcon(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void setImageViewBitmap(int arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        real.setImageViewBitmap(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setImageViewIcon(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg1) {
        real.setImageViewIcon(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setImageViewResource(int arg0, int arg1) {
        real.setImageViewResource(arg0, arg1);
    }

    public void setImageViewUri(int arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        real.setImageViewUri(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setInt(int arg0, java.lang.String arg1, int arg2) {
        real.setInt(arg0, arg1, arg2);
    }

    public void setIntDimen(int arg0, java.lang.String arg1, int arg2) {
        real.setIntDimen(arg0, arg1, arg2);
    }

    public void setIntDimen(int arg0, java.lang.String arg1, float arg2, int arg3) {
        real.setIntDimen(arg0, arg1, arg2, arg3);
    }

    public void setIntDimenAttr(int arg0, java.lang.String arg1, int arg2) {
        real.setIntDimenAttr(arg0, arg1, arg2);
    }

    public void setIntent(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        real.setIntent(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setLabelFor(int arg0, int arg1) {
        real.setLabelFor(arg0, arg1);
    }

    public void setLightBackgroundLayoutId(int arg0) {
        real.setLightBackgroundLayoutId(arg0);
    }

    public void setLong(int arg0, java.lang.String arg1, long arg2) {
        real.setLong(arg0, arg1, arg2);
    }

    public void setOnCheckedChangeResponse(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse arg1) {
        real.setOnCheckedChangeResponse(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setOnClickFillInIntent(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.setOnClickFillInIntent(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setOnClickPendingIntent(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        real.setOnClickPendingIntent(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setOnClickResponse(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse arg1) {
        real.setOnClickResponse(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setOnStylusHandwritingPendingIntent(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        real.setOnStylusHandwritingPendingIntent(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setPendingIntentTemplate(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        real.setPendingIntentTemplate(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setProgressBar(int arg0, int arg1, int arg2, boolean arg3) {
        real.setProgressBar(arg0, arg1, arg2, arg3);
    }

    public void setRadioGroupChecked(int arg0, int arg1) {
        real.setRadioGroupChecked(arg0, arg1);
    }

    public void setRelativeScrollPosition(int arg0, int arg1) {
        real.setRelativeScrollPosition(arg0, arg1);
    }

    public void setRemoteAdapter(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems arg1) {
        real.setRemoteAdapter(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setRemoteAdapter(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.setRemoteAdapter(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setRemoteAdapter(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        real.setRemoteAdapter(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setScrollPosition(int arg0, int arg1) {
        real.setScrollPosition(arg0, arg1);
    }

    public void setShort(int arg0, java.lang.String arg1, short arg2) {
        real.setShort(arg0, arg1, arg2);
    }

    public void setString(int arg0, java.lang.String arg1, java.lang.String arg2) {
        real.setString(arg0, arg1, arg2);
    }

    public void setTextColor(int arg0, int arg1) {
        real.setTextColor(arg0, arg1);
    }

    public void setTextViewCompoundDrawables(int arg0, int arg1, int arg2, int arg3, int arg4) {
        real.setTextViewCompoundDrawables(arg0, arg1, arg2, arg3, arg4);
    }

    public void setTextViewCompoundDrawablesRelative(int arg0, int arg1, int arg2, int arg3, int arg4) {
        real.setTextViewCompoundDrawablesRelative(arg0, arg1, arg2, arg3, arg4);
    }

    public void setTextViewText(int arg0, java.lang.CharSequence arg1) {
        real.setTextViewText(arg0, arg1);
    }

    public void setTextViewTextSize(int arg0, int arg1, float arg2) {
        real.setTextViewTextSize(arg0, arg1, arg2);
    }

    public void setUri(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        real.setUri(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setViewLayoutHeight(int arg0, float arg1, int arg2) {
        real.setViewLayoutHeight(arg0, arg1, arg2);
    }

    public void setViewLayoutHeightAttr(int arg0, int arg1) {
        real.setViewLayoutHeightAttr(arg0, arg1);
    }

    public void setViewLayoutHeightDimen(int arg0, int arg1) {
        real.setViewLayoutHeightDimen(arg0, arg1);
    }

    public void setViewLayoutMargin(int arg0, int arg1, float arg2, int arg3) {
        real.setViewLayoutMargin(arg0, arg1, arg2, arg3);
    }

    public void setViewLayoutMarginAttr(int arg0, int arg1, int arg2) {
        real.setViewLayoutMarginAttr(arg0, arg1, arg2);
    }

    public void setViewLayoutMarginDimen(int arg0, int arg1, int arg2) {
        real.setViewLayoutMarginDimen(arg0, arg1, arg2);
    }

    public void setViewLayoutWidth(int arg0, float arg1, int arg2) {
        real.setViewLayoutWidth(arg0, arg1, arg2);
    }

    public void setViewLayoutWidthAttr(int arg0, int arg1) {
        real.setViewLayoutWidthAttr(arg0, arg1);
    }

    public void setViewLayoutWidthDimen(int arg0, int arg1) {
        real.setViewLayoutWidthDimen(arg0, arg1);
    }

    public void setViewOutlinePreferredRadius(int arg0, float arg1, int arg2) {
        real.setViewOutlinePreferredRadius(arg0, arg1, arg2);
    }

    public void setViewOutlinePreferredRadiusAttr(int arg0, int arg1) {
        real.setViewOutlinePreferredRadiusAttr(arg0, arg1);
    }

    public void setViewOutlinePreferredRadiusDimen(int arg0, int arg1) {
        real.setViewOutlinePreferredRadiusDimen(arg0, arg1);
    }

    public void setViewPadding(int arg0, int arg1, int arg2, int arg3, int arg4) {
        real.setViewPadding(arg0, arg1, arg2, arg3, arg4);
    }

    public void setViewVisibility(int arg0, int arg1) {
        real.setViewVisibility(arg0, arg1);
    }

    public void showNext(int arg0) {
        real.showNext(arg0);
    }

    public void showPrevious(int arg0) {
        real.showPrevious(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
        private final android.widget.RemoteViews.ActionException real;

        public ActionException(android.widget.RemoteViews.ActionException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.ActionException wrap(android.widget.RemoteViews.ActionException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.ActionException(real);
        }

        public android.widget.RemoteViews.ActionException unwrap() {
            return real;
        }

        public ActionException(java.lang.Exception arg0) {
            this(new android.widget.RemoteViews.ActionException(arg0));
        }

        public ActionException(java.lang.String arg0) {
            this(new android.widget.RemoteViews.ActionException(arg0));
        }

    }
    public static final class DrawInstructions {
        private final android.widget.RemoteViews.DrawInstructions real;

        public DrawInstructions(android.widget.RemoteViews.DrawInstructions real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions wrap(android.widget.RemoteViews.DrawInstructions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions(real);
        }

        public android.widget.RemoteViews.DrawInstructions unwrap() {
            return real;
        }

        public static long getSupportedVersion() {
            return android.widget.RemoteViews.DrawInstructions.getSupportedVersion();
        }

        public static final class Builder {
            private final android.widget.RemoteViews.DrawInstructions.Builder real;

            public Builder(android.widget.RemoteViews.DrawInstructions.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions.Builder wrap(android.widget.RemoteViews.DrawInstructions.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions.Builder(real);
            }

            public android.widget.RemoteViews.DrawInstructions.Builder unwrap() {
                return real;
            }

            public Builder(java.util.List arg0) {
                this(new android.widget.RemoteViews.DrawInstructions.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions build() {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.DrawInstructions.wrap(real.build());
            }

        }
    }
    public static final class RemoteCollectionItems {
        private final android.widget.RemoteViews.RemoteCollectionItems real;

        public RemoteCollectionItems(android.widget.RemoteViews.RemoteCollectionItems real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems wrap(android.widget.RemoteViews.RemoteCollectionItems real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems(real);
        }

        public android.widget.RemoteViews.RemoteCollectionItems unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public int getItemCount() {
            return real.getItemCount();
        }

        public long getItemId(int arg0) {
            return real.getItemId(arg0);
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews getItemView(int arg0) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.getItemView(arg0));
        }

        public int getViewTypeCount() {
            return real.getViewTypeCount();
        }

        public boolean hasStableIds() {
            return real.hasStableIds();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.widget.RemoteViews.RemoteCollectionItems.Builder real;

            public Builder(android.widget.RemoteViews.RemoteCollectionItems.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder wrap(android.widget.RemoteViews.RemoteCollectionItems.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder(real);
            }

            public android.widget.RemoteViews.RemoteCollectionItems.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.widget.RemoteViews.RemoteCollectionItems.Builder());
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder addItem(long arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder.wrap(real.addItem(arg0, arg1 == null ? null : arg1.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems build() {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder setHasStableIds(boolean arg0) {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder.wrap(real.setHasStableIds(arg0));
            }

            public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder setViewTypeCount(int arg0) {
                return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteCollectionItems.Builder.wrap(real.setViewTypeCount(arg0));
            }

        }
    }
    public static final class RemoteResponse {
        private final android.widget.RemoteViews.RemoteResponse real;

        public RemoteResponse(android.widget.RemoteViews.RemoteResponse real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse wrap(android.widget.RemoteViews.RemoteResponse real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse(real);
        }

        public android.widget.RemoteViews.RemoteResponse unwrap() {
            return real;
        }

        public RemoteResponse() {
            this(new android.widget.RemoteViews.RemoteResponse());
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse addSharedElement(int arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse.wrap(real.addSharedElement(arg0, arg1));
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse fromFillInIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse.wrap(android.widget.RemoteViews.RemoteResponse.fromFillInIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse fromPendingIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteResponse.wrap(android.widget.RemoteViews.RemoteResponse.fromPendingIntent(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class RemoteView {
        private final android.widget.RemoteViews.RemoteView real;

        public RemoteView(android.widget.RemoteViews.RemoteView real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteView wrap(android.widget.RemoteViews.RemoteView real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteView(real);
        }

        public android.widget.RemoteViews.RemoteView unwrap() {
            return real;
        }

    }
    public static final class RemoteViewOutlineProvider {
        private final android.widget.RemoteViews.RemoteViewOutlineProvider real;

        public RemoteViewOutlineProvider(android.widget.RemoteViews.RemoteViewOutlineProvider real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteViewOutlineProvider wrap(android.widget.RemoteViews.RemoteViewOutlineProvider real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViews.RemoteViewOutlineProvider(real);
        }

        public android.widget.RemoteViews.RemoteViewOutlineProvider unwrap() {
            return real;
        }

        public RemoteViewOutlineProvider(float arg0) {
            this(new android.widget.RemoteViews.RemoteViewOutlineProvider(arg0));
        }

        public void getOutline(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Outline arg1) {
            real.getOutline(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public float getRadius() {
            return real.getRadius();
        }

    }
}
