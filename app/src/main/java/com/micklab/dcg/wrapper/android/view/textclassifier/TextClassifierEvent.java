// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassifierEvent {
    private final android.view.textclassifier.TextClassifierEvent real;

    public TextClassifierEvent(android.view.textclassifier.TextClassifierEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent wrap(android.view.textclassifier.TextClassifierEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent(real);
    }

    public android.view.textclassifier.TextClassifierEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int[] getActionIndices() {
        return real.getActionIndices();
    }

    public java.lang.String[] getEntityTypes() {
        return real.getEntityTypes();
    }

    public int getEventCategory() {
        return real.getEventCategory();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext getEventContext() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.wrap(real.getEventContext());
    }

    public int getEventIndex() {
        return real.getEventIndex();
    }

    public int getEventType() {
        return real.getEventType();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.getLocale());
    }

    public java.lang.String getModelName() {
        return real.getModelName();
    }

    public java.lang.String getResultId() {
        return real.getResultId();
    }

    public float[] getScores() {
        return real.getScores();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int CATEGORY_CONVERSATION_ACTIONS = android.view.textclassifier.TextClassifierEvent.CATEGORY_CONVERSATION_ACTIONS;
    public static final int CATEGORY_LANGUAGE_DETECTION = android.view.textclassifier.TextClassifierEvent.CATEGORY_LANGUAGE_DETECTION;
    public static final int CATEGORY_LINKIFY = android.view.textclassifier.TextClassifierEvent.CATEGORY_LINKIFY;
    public static final int CATEGORY_SELECTION = android.view.textclassifier.TextClassifierEvent.CATEGORY_SELECTION;
    public static final int TYPE_ACTIONS_GENERATED = android.view.textclassifier.TextClassifierEvent.TYPE_ACTIONS_GENERATED;
    public static final int TYPE_ACTIONS_SHOWN = android.view.textclassifier.TextClassifierEvent.TYPE_ACTIONS_SHOWN;
    public static final int TYPE_AUTO_SELECTION = android.view.textclassifier.TextClassifierEvent.TYPE_AUTO_SELECTION;
    public static final int TYPE_COPY_ACTION = android.view.textclassifier.TextClassifierEvent.TYPE_COPY_ACTION;
    public static final int TYPE_CUT_ACTION = android.view.textclassifier.TextClassifierEvent.TYPE_CUT_ACTION;
    public static final int TYPE_LINKS_GENERATED = android.view.textclassifier.TextClassifierEvent.TYPE_LINKS_GENERATED;
    public static final int TYPE_LINK_CLICKED = android.view.textclassifier.TextClassifierEvent.TYPE_LINK_CLICKED;
    public static final int TYPE_MANUAL_REPLY = android.view.textclassifier.TextClassifierEvent.TYPE_MANUAL_REPLY;
    public static final int TYPE_OTHER_ACTION = android.view.textclassifier.TextClassifierEvent.TYPE_OTHER_ACTION;
    public static final int TYPE_OVERTYPE = android.view.textclassifier.TextClassifierEvent.TYPE_OVERTYPE;
    public static final int TYPE_PASTE_ACTION = android.view.textclassifier.TextClassifierEvent.TYPE_PASTE_ACTION;
    public static final int TYPE_SELECTION_DESTROYED = android.view.textclassifier.TextClassifierEvent.TYPE_SELECTION_DESTROYED;
    public static final int TYPE_SELECTION_DRAG = android.view.textclassifier.TextClassifierEvent.TYPE_SELECTION_DRAG;
    public static final int TYPE_SELECTION_MODIFIED = android.view.textclassifier.TextClassifierEvent.TYPE_SELECTION_MODIFIED;
    public static final int TYPE_SELECTION_RESET = android.view.textclassifier.TextClassifierEvent.TYPE_SELECTION_RESET;
    public static final int TYPE_SELECTION_STARTED = android.view.textclassifier.TextClassifierEvent.TYPE_SELECTION_STARTED;
    public static final int TYPE_SELECT_ALL = android.view.textclassifier.TextClassifierEvent.TYPE_SELECT_ALL;
    public static final int TYPE_SHARE_ACTION = android.view.textclassifier.TextClassifierEvent.TYPE_SHARE_ACTION;
    public static final int TYPE_SMART_ACTION = android.view.textclassifier.TextClassifierEvent.TYPE_SMART_ACTION;
    public static final int TYPE_SMART_SELECTION_MULTI = android.view.textclassifier.TextClassifierEvent.TYPE_SMART_SELECTION_MULTI;
    public static final int TYPE_SMART_SELECTION_SINGLE = android.view.textclassifier.TextClassifierEvent.TYPE_SMART_SELECTION_SINGLE;

    public static final class Builder {
        private final android.view.textclassifier.TextClassifierEvent.Builder real;

        public Builder(android.view.textclassifier.TextClassifierEvent.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.Builder wrap(android.view.textclassifier.TextClassifierEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.Builder(real);
        }

        public android.view.textclassifier.TextClassifierEvent.Builder unwrap() {
            return real;
        }

    }
    public static final class ConversationActionsEvent {
        private final android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent real;

        public ConversationActionsEvent(android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent wrap(android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent(real);
        }

        public android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent unwrap() {
            return real;
        }


        public static final class Builder {
            private final android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.Builder real;

            public Builder(android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.Builder wrap(android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.Builder(real);
            }

            public android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.Builder unwrap() {
                return real;
            }

            public Builder(int arg0) {
                this(new android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.wrap(real.build());
            }

        }
    }
    public static final class LanguageDetectionEvent {
        private final android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent real;

        public LanguageDetectionEvent(android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent wrap(android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent(real);
        }

        public android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent unwrap() {
            return real;
        }


        public static final class Builder {
            private final android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.Builder real;

            public Builder(android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.Builder wrap(android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.Builder(real);
            }

            public android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.Builder unwrap() {
                return real;
            }

            public Builder(int arg0) {
                this(new android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.wrap(real.build());
            }

        }
    }
    public static final class TextLinkifyEvent {
        private final android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent real;

        public TextLinkifyEvent(android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent wrap(android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent(real);
        }

        public android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent unwrap() {
            return real;
        }


        public static final class Builder {
            private final android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.Builder real;

            public Builder(android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.Builder wrap(android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.Builder(real);
            }

            public android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.Builder unwrap() {
                return real;
            }

            public Builder(int arg0) {
                this(new android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.wrap(real.build());
            }

        }
    }
    public static final class TextSelectionEvent {
        private final android.view.textclassifier.TextClassifierEvent.TextSelectionEvent real;

        public TextSelectionEvent(android.view.textclassifier.TextClassifierEvent.TextSelectionEvent real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent wrap(android.view.textclassifier.TextClassifierEvent.TextSelectionEvent real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent(real);
        }

        public android.view.textclassifier.TextClassifierEvent.TextSelectionEvent unwrap() {
            return real;
        }

        public int getRelativeSuggestedWordEndIndex() {
            return real.getRelativeSuggestedWordEndIndex();
        }

        public int getRelativeSuggestedWordStartIndex() {
            return real.getRelativeSuggestedWordStartIndex();
        }

        public int getRelativeWordEndIndex() {
            return real.getRelativeWordEndIndex();
        }

        public int getRelativeWordStartIndex() {
            return real.getRelativeWordStartIndex();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder real;

            public Builder(android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder wrap(android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder(real);
            }

            public android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder unwrap() {
                return real;
            }

            public Builder(int arg0) {
                this(new android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder setRelativeSuggestedWordEndIndex(int arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder.wrap(real.setRelativeSuggestedWordEndIndex(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder setRelativeSuggestedWordStartIndex(int arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder.wrap(real.setRelativeSuggestedWordStartIndex(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder setRelativeWordEndIndex(int arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder.wrap(real.setRelativeWordEndIndex(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder setRelativeWordStartIndex(int arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder.wrap(real.setRelativeWordStartIndex(arg0));
            }

        }
    }
}
