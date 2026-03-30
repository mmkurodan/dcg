// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Edits {
    private final android.icu.text.Edits real;

    public Edits(android.icu.text.Edits real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Edits wrap(android.icu.text.Edits real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Edits(real);
    }

    public android.icu.text.Edits unwrap() {
        return real;
    }

    public Edits() {
        this(new android.icu.text.Edits());
    }

    public void addReplace(int arg0, int arg1) {
        real.addReplace(arg0, arg1);
    }

    public void addUnchanged(int arg0) {
        real.addUnchanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator getCoarseChangesIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator.wrap(real.getCoarseChangesIterator());
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator getCoarseIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator.wrap(real.getCoarseIterator());
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator getFineChangesIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator.wrap(real.getFineChangesIterator());
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator getFineIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator.wrap(real.getFineIterator());
    }

    public boolean hasChanges() {
        return real.hasChanges();
    }

    public int lengthDelta() {
        return real.lengthDelta();
    }

    public com.micklab.dcg.wrapper.android.icu.text.Edits mergeAndAppend(com.micklab.dcg.wrapper.android.icu.text.Edits arg0, com.micklab.dcg.wrapper.android.icu.text.Edits arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.Edits.wrap(real.mergeAndAppend(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int numberOfChanges() {
        return real.numberOfChanges();
    }

    public void reset() {
        real.reset();
    }

    public static final class Iterator {
        private final android.icu.text.Edits.Iterator real;

        public Iterator(android.icu.text.Edits.Iterator real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator wrap(android.icu.text.Edits.Iterator real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Edits.Iterator(real);
        }

        public android.icu.text.Edits.Iterator unwrap() {
            return real;
        }

        public int destinationIndex() {
            return real.destinationIndex();
        }

        public int destinationIndexFromSourceIndex(int arg0) {
            return real.destinationIndexFromSourceIndex(arg0);
        }

        public boolean findDestinationIndex(int arg0) {
            return real.findDestinationIndex(arg0);
        }

        public boolean findSourceIndex(int arg0) {
            return real.findSourceIndex(arg0);
        }

        public boolean hasChange() {
            return real.hasChange();
        }

        public int newLength() {
            return real.newLength();
        }

        public boolean next() {
            return real.next();
        }

        public int oldLength() {
            return real.oldLength();
        }

        public int replacementIndex() {
            return real.replacementIndex();
        }

        public int sourceIndex() {
            return real.sourceIndex();
        }

        public int sourceIndexFromDestinationIndex(int arg0) {
            return real.sourceIndexFromDestinationIndex(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
