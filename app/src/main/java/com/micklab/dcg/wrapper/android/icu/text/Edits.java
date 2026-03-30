// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Edits {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Edits(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Edits wrap(android.icu.text.Edits real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Edits(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.Edits getReal() {
        return (android.icu.text.Edits) real;
    }

    public android.icu.text.Edits unwrap() {
        return getReal();
    }

    public Edits() {
        this(new android.icu.text.Edits(), (__DcgwBridgeToken) null);
    }

    public void addReplace(int arg0, int arg1) {
        ((android.icu.text.Edits) real).addReplace(arg0, arg1);
    }

    public void addUnchanged(int arg0) {
        ((android.icu.text.Edits) real).addUnchanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator getCoarseChangesIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator.wrap(((android.icu.text.Edits) real).getCoarseChangesIterator());
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator getCoarseIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator.wrap(((android.icu.text.Edits) real).getCoarseIterator());
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator getFineChangesIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator.wrap(((android.icu.text.Edits) real).getFineChangesIterator());
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator getFineIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator.wrap(((android.icu.text.Edits) real).getFineIterator());
    }

    public boolean hasChanges() {
        return ((android.icu.text.Edits) real).hasChanges();
    }

    public int lengthDelta() {
        return ((android.icu.text.Edits) real).lengthDelta();
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits mergeAndAppend(com.micklab.dcg.wrapper.android.icu.text.Edits arg0, com.micklab.dcg.wrapper.android.icu.text.Edits arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.wrap(((android.icu.text.Edits) real).mergeAndAppend(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public int numberOfChanges() {
        return ((android.icu.text.Edits) real).numberOfChanges();
    }

    public void reset() {
        ((android.icu.text.Edits) real).reset();
    }

    public static final class Iterator {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Iterator(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator wrap(android.icu.text.Edits.Iterator real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.Edits.Iterator getReal() {
            return (android.icu.text.Edits.Iterator) real;
        }

        public android.icu.text.Edits.Iterator unwrap() {
            return getReal();
        }

        public int destinationIndex() {
            return ((android.icu.text.Edits.Iterator) real).destinationIndex();
        }

        public int destinationIndexFromSourceIndex(int arg0) {
            return ((android.icu.text.Edits.Iterator) real).destinationIndexFromSourceIndex(arg0);
        }

        public boolean findDestinationIndex(int arg0) {
            return ((android.icu.text.Edits.Iterator) real).findDestinationIndex(arg0);
        }

        public boolean findSourceIndex(int arg0) {
            return ((android.icu.text.Edits.Iterator) real).findSourceIndex(arg0);
        }

        public boolean hasChange() {
            return ((android.icu.text.Edits.Iterator) real).hasChange();
        }

        public int newLength() {
            return ((android.icu.text.Edits.Iterator) real).newLength();
        }

        public boolean next() {
            return ((android.icu.text.Edits.Iterator) real).next();
        }

        public int oldLength() {
            return ((android.icu.text.Edits.Iterator) real).oldLength();
        }

        public int replacementIndex() {
            return ((android.icu.text.Edits.Iterator) real).replacementIndex();
        }

        public int sourceIndex() {
            return ((android.icu.text.Edits.Iterator) real).sourceIndex();
        }

        public int sourceIndexFromDestinationIndex(int arg0) {
            return ((android.icu.text.Edits.Iterator) real).sourceIndexFromDestinationIndex(arg0);
        }

        public java.lang.String toString() {
            return ((android.icu.text.Edits.Iterator) real).toString();
        }

    }
}
