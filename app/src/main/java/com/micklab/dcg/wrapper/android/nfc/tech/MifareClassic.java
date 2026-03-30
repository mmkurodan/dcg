// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class MifareClassic {
    private final android.nfc.tech.MifareClassic real;

    public MifareClassic(android.nfc.tech.MifareClassic real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.MifareClassic wrap(android.nfc.tech.MifareClassic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.MifareClassic(real);
    }

    public android.nfc.tech.MifareClassic unwrap() {
        return real;
    }

    public boolean authenticateSectorWithKeyA(int arg0, byte[] arg1) throws java.io.IOException {
        return real.authenticateSectorWithKeyA(arg0, arg1);
    }

    public boolean authenticateSectorWithKeyB(int arg0, byte[] arg1) throws java.io.IOException {
        return real.authenticateSectorWithKeyB(arg0, arg1);
    }

    public int blockToSector(int arg0) {
        return real.blockToSector(arg0);
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public void decrement(int arg0, int arg1) throws java.io.IOException {
        real.decrement(arg0, arg1);
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.MifareClassic get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.MifareClassic.wrap(android.nfc.tech.MifareClassic.get(arg0 == null ? null : arg0.unwrap()));
    }

    public int getBlockCount() {
        return real.getBlockCount();
    }

    public int getBlockCountInSector(int arg0) {
        return real.getBlockCountInSector(arg0);
    }

    public int getMaxTransceiveLength() {
        return real.getMaxTransceiveLength();
    }

    public int getSectorCount() {
        return real.getSectorCount();
    }

    public int getSize() {
        return real.getSize();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(real.getTag());
    }

    public int getTimeout() {
        return real.getTimeout();
    }

    public int getType() {
        return real.getType();
    }

    public void increment(int arg0, int arg1) throws java.io.IOException {
        real.increment(arg0, arg1);
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public byte[] readBlock(int arg0) throws java.io.IOException {
        return real.readBlock(arg0);
    }

    public void restore(int arg0) throws java.io.IOException {
        real.restore(arg0);
    }

    public int sectorToBlock(int arg0) {
        return real.sectorToBlock(arg0);
    }

    public void setTimeout(int arg0) {
        real.setTimeout(arg0);
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return real.transceive(arg0);
    }

    public void transfer(int arg0) throws java.io.IOException {
        real.transfer(arg0);
    }

    public void writeBlock(int arg0, byte[] arg1) throws java.io.IOException {
        real.writeBlock(arg0, arg1);
    }

    public static final int BLOCK_SIZE = android.nfc.tech.MifareClassic.BLOCK_SIZE;
    public static final byte[] KEY_DEFAULT = android.nfc.tech.MifareClassic.KEY_DEFAULT;
    public static final byte[] KEY_MIFARE_APPLICATION_DIRECTORY = android.nfc.tech.MifareClassic.KEY_MIFARE_APPLICATION_DIRECTORY;
    public static final byte[] KEY_NFC_FORUM = android.nfc.tech.MifareClassic.KEY_NFC_FORUM;
    public static final int SIZE_1K = android.nfc.tech.MifareClassic.SIZE_1K;
    public static final int SIZE_2K = android.nfc.tech.MifareClassic.SIZE_2K;
    public static final int SIZE_4K = android.nfc.tech.MifareClassic.SIZE_4K;
    public static final int SIZE_MINI = android.nfc.tech.MifareClassic.SIZE_MINI;
    public static final int TYPE_CLASSIC = android.nfc.tech.MifareClassic.TYPE_CLASSIC;
    public static final int TYPE_PLUS = android.nfc.tech.MifareClassic.TYPE_PLUS;
    public static final int TYPE_PRO = android.nfc.tech.MifareClassic.TYPE_PRO;
    public static final int TYPE_UNKNOWN = android.nfc.tech.MifareClassic.TYPE_UNKNOWN;

}
