// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class AlphabeticIndex {
    private final android.icu.text.AlphabeticIndex real;

    public AlphabeticIndex(android.icu.text.AlphabeticIndex real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex wrap(android.icu.text.AlphabeticIndex real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex(real);
    }

    public android.icu.text.AlphabeticIndex unwrap() {
        return real;
    }

    public AlphabeticIndex(com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator arg0) {
        this(new android.icu.text.AlphabeticIndex(arg0 == null ? null : arg0.unwrap()));
    }

    public AlphabeticIndex(java.util.Locale arg0) {
        this(new android.icu.text.AlphabeticIndex(arg0));
    }

    public AlphabeticIndex(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.AlphabeticIndex(arg0 == null ? null : arg0.unwrap()));
    }

    public int getBucketCount() {
        return real.getBucketCount();
    }

    public int getBucketIndex(java.lang.CharSequence arg0) {
        return real.getBucketIndex(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator getCollator() {
        return com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator.wrap(real.getCollator());
    }

    public java.lang.String getInflowLabel() {
        return real.getInflowLabel();
    }

    public int getMaxLabelCount() {
        return real.getMaxLabelCount();
    }

    public java.lang.String getOverflowLabel() {
        return real.getOverflowLabel();
    }

    public int getRecordCount() {
        return real.getRecordCount();
    }

    public java.lang.String getUnderflowLabel() {
        return real.getUnderflowLabel();
    }

    public static final class Bucket {
        private final android.icu.text.AlphabeticIndex.Bucket real;

        public Bucket(android.icu.text.AlphabeticIndex.Bucket real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket wrap(android.icu.text.AlphabeticIndex.Bucket real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket(real);
        }

        public android.icu.text.AlphabeticIndex.Bucket unwrap() {
            return real;
        }

        public java.lang.String getLabel() {
            return real.getLabel();
        }

        public com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType getLabelType() {
            return com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType.wrap(real.getLabelType());
        }

        public int size() {
            return real.size();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public static final class LabelType {
            private final android.icu.text.AlphabeticIndex.Bucket.LabelType real;

            public LabelType(android.icu.text.AlphabeticIndex.Bucket.LabelType real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType wrap(android.icu.text.AlphabeticIndex.Bucket.LabelType real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Bucket.LabelType(real);
            }

            public android.icu.text.AlphabeticIndex.Bucket.LabelType unwrap() {
                return real;
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
        private final android.icu.text.AlphabeticIndex.ImmutableIndex real;

        public ImmutableIndex(android.icu.text.AlphabeticIndex.ImmutableIndex real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.ImmutableIndex wrap(android.icu.text.AlphabeticIndex.ImmutableIndex real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.ImmutableIndex(real);
        }

        public android.icu.text.AlphabeticIndex.ImmutableIndex unwrap() {
            return real;
        }

        public int getBucketCount() {
            return real.getBucketCount();
        }

        public int getBucketIndex(java.lang.CharSequence arg0) {
            return real.getBucketIndex(arg0);
        }

    }
    public static final class Record {
        private final android.icu.text.AlphabeticIndex.Record real;

        public Record(android.icu.text.AlphabeticIndex.Record real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Record wrap(android.icu.text.AlphabeticIndex.Record real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.AlphabeticIndex.Record(real);
        }

        public android.icu.text.AlphabeticIndex.Record unwrap() {
            return real;
        }

        public java.lang.Object getData() {
            return real.getData();
        }

        public java.lang.CharSequence getName() {
            return real.getName();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
