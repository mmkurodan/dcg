// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class AlphabeticIndex {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AlphabeticIndex(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex wrap(android.icu.text.AlphabeticIndex real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.AlphabeticIndex getReal() {
        return (android.icu.text.AlphabeticIndex) real;
    }

    public android.icu.text.AlphabeticIndex unwrap() {
        return getReal();
    }

    public AlphabeticIndex(java.util.Locale arg0) {
        this(new android.icu.text.AlphabeticIndex(arg0), (__DcgwBridgeToken) null);
    }

    public AlphabeticIndex(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.AlphabeticIndex(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AlphabeticIndex(com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator arg0) {
        this(new android.icu.text.AlphabeticIndex(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int getBucketCount() {
        return ((android.icu.text.AlphabeticIndex) real).getBucketCount();
    }

    public int getBucketIndex(java.lang.CharSequence arg0) {
        return ((android.icu.text.AlphabeticIndex) real).getBucketIndex(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator getCollator() {
        return com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator.wrap(((android.icu.text.AlphabeticIndex) real).getCollator());
    }

    public java.lang.String getInflowLabel() {
        return ((android.icu.text.AlphabeticIndex) real).getInflowLabel();
    }

    public int getMaxLabelCount() {
        return ((android.icu.text.AlphabeticIndex) real).getMaxLabelCount();
    }

    public java.lang.String getOverflowLabel() {
        return ((android.icu.text.AlphabeticIndex) real).getOverflowLabel();
    }

    public int getRecordCount() {
        return ((android.icu.text.AlphabeticIndex) real).getRecordCount();
    }

    public java.lang.String getUnderflowLabel() {
        return ((android.icu.text.AlphabeticIndex) real).getUnderflowLabel();
    }

    public static final class Bucket {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Bucket(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket wrap(android.icu.text.AlphabeticIndex.Bucket real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.AlphabeticIndex.Bucket getReal() {
            return (android.icu.text.AlphabeticIndex.Bucket) real;
        }

        public android.icu.text.AlphabeticIndex.Bucket unwrap() {
            return getReal();
        }

        public java.lang.String getLabel() {
            return ((android.icu.text.AlphabeticIndex.Bucket) real).getLabel();
        }

        public com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType getLabelType() {
            return com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType.wrap(((android.icu.text.AlphabeticIndex.Bucket) real).getLabelType());
        }

        public int size() {
            return ((android.icu.text.AlphabeticIndex.Bucket) real).size();
        }

        public java.lang.String toString() {
            return ((android.icu.text.AlphabeticIndex.Bucket) real).toString();
        }

        public static final class LabelType {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private LabelType(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType wrap(android.icu.text.AlphabeticIndex.Bucket.LabelType real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType(real, (__DcgwBridgeToken) null);
            }

            public android.icu.text.AlphabeticIndex.Bucket.LabelType getReal() {
                return (android.icu.text.AlphabeticIndex.Bucket.LabelType) real;
            }

            public android.icu.text.AlphabeticIndex.Bucket.LabelType unwrap() {
                return getReal();
            }

            public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType valueOf(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType.wrap(android.icu.text.AlphabeticIndex.Bucket.LabelType.valueOf(arg0));
            }

            public static android.icu.text.AlphabeticIndex.Bucket.LabelType[] values() {
                return android.icu.text.AlphabeticIndex.Bucket.LabelType.values();
            }

            public static final com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType INFLOW = com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType.wrap(android.icu.text.AlphabeticIndex.Bucket.LabelType.INFLOW);
            public static final com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType NORMAL = com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType.wrap(android.icu.text.AlphabeticIndex.Bucket.LabelType.NORMAL);
            public static final com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType OVERFLOW = com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType.wrap(android.icu.text.AlphabeticIndex.Bucket.LabelType.OVERFLOW);
            public static final com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType UNDERFLOW = com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType.wrap(android.icu.text.AlphabeticIndex.Bucket.LabelType.UNDERFLOW);

        }
    }
    public static final class ImmutableIndex {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ImmutableIndex(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.ImmutableIndex wrap(android.icu.text.AlphabeticIndex.ImmutableIndex real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.ImmutableIndex(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.AlphabeticIndex.ImmutableIndex getReal() {
            return (android.icu.text.AlphabeticIndex.ImmutableIndex) real;
        }

        public android.icu.text.AlphabeticIndex.ImmutableIndex unwrap() {
            return getReal();
        }

        public int getBucketCount() {
            return ((android.icu.text.AlphabeticIndex.ImmutableIndex) real).getBucketCount();
        }

        public int getBucketIndex(java.lang.CharSequence arg0) {
            return ((android.icu.text.AlphabeticIndex.ImmutableIndex) real).getBucketIndex(arg0);
        }

    }
    public static final class Record {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Record(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Record wrap(android.icu.text.AlphabeticIndex.Record real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Record(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.AlphabeticIndex.Record getReal() {
            return (android.icu.text.AlphabeticIndex.Record) real;
        }

        public android.icu.text.AlphabeticIndex.Record unwrap() {
            return getReal();
        }

        public java.lang.Object getData() {
            return ((android.icu.text.AlphabeticIndex.Record) real).getData();
        }

        public java.lang.CharSequence getName() {
            return ((android.icu.text.AlphabeticIndex.Record) real).getName();
        }

        public java.lang.String toString() {
            return ((android.icu.text.AlphabeticIndex.Record) real).toString();
        }

    }
}
