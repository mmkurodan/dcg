// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Xml {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Xml(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Xml wrap(android.util.Xml real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Xml(real, (__DcgwBridgeToken) null);
    }

    public android.util.Xml getReal() {
        return (android.util.Xml) real;
    }

    public android.util.Xml unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.util.AttributeSet asAttributeSet(org.xmlpull.v1.XmlPullParser arg0) {
        return com.micklab.dcg.wrapper.android.util.AttributeSet.wrap(android.util.Xml.asAttributeSet(arg0));
    }

    public static com.micklab.dcg.wrapper.android.util.Xml.Encoding findEncodingByName(java.lang.String arg0) throws java.io.UnsupportedEncodingException {
        return com.micklab.dcg.wrapper.android.util.Xml.Encoding.wrap(android.util.Xml.findEncodingByName(arg0));
    }

    public static org.xmlpull.v1.XmlPullParser newPullParser() {
        return android.util.Xml.newPullParser();
    }

    public static org.xmlpull.v1.XmlSerializer newSerializer() {
        return android.util.Xml.newSerializer();
    }

    public static void parse(java.io.Reader arg0, org.xml.sax.ContentHandler arg1) throws java.io.IOException, org.xml.sax.SAXException {
        android.util.Xml.parse(arg0, arg1);
    }

    public static void parse(java.lang.String arg0, org.xml.sax.ContentHandler arg1) throws org.xml.sax.SAXException {
        android.util.Xml.parse(arg0, arg1);
    }

    public static void parse(java.io.InputStream arg0, com.micklab.dcg.wrapper.android.util.Xml.Encoding arg1, org.xml.sax.ContentHandler arg2) throws java.io.IOException, org.xml.sax.SAXException {
        android.util.Xml.parse(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static final java.lang.String FEATURE_RELAXED = android.util.Xml.FEATURE_RELAXED;

    public static final class Encoding {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Encoding(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.util.Xml.Encoding wrap(android.util.Xml.Encoding real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.util.Xml.Encoding(real, (__DcgwBridgeToken) null);
        }

        public android.util.Xml.Encoding getReal() {
            return (android.util.Xml.Encoding) real;
        }

        public android.util.Xml.Encoding unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.util.Xml.Encoding valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.util.Xml.Encoding.wrap(android.util.Xml.Encoding.valueOf(arg0));
        }

        public static android.util.Xml.Encoding[] values() {
            return android.util.Xml.Encoding.values();
        }

        public static final com.micklab.dcg.wrapper.android.util.Xml.Encoding ISO_8859_1 = com.micklab.dcg.wrapper.android.util.Xml.Encoding.wrap(android.util.Xml.Encoding.ISO_8859_1);
        public static final com.micklab.dcg.wrapper.android.util.Xml.Encoding US_ASCII = com.micklab.dcg.wrapper.android.util.Xml.Encoding.wrap(android.util.Xml.Encoding.US_ASCII);
        public static final com.micklab.dcg.wrapper.android.util.Xml.Encoding UTF_16 = com.micklab.dcg.wrapper.android.util.Xml.Encoding.wrap(android.util.Xml.Encoding.UTF_16);
        public static final com.micklab.dcg.wrapper.android.util.Xml.Encoding UTF_8 = com.micklab.dcg.wrapper.android.util.Xml.Encoding.wrap(android.util.Xml.Encoding.UTF_8);

    }
}
