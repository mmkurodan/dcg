// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TableRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TableRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TableRequest wrap(android.media.tv.TableRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TableRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TableRequest getReal() {
        return (android.media.tv.TableRequest) real;
    }

    public android.media.tv.TableRequest unwrap() {
        return getReal();
    }

    public TableRequest(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.media.tv.TableRequest(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.TableRequest) real).describeContents();
    }

    public int getTableId() {
        return ((android.media.tv.TableRequest) real).getTableId();
    }

    public int getTableName() {
        return ((android.media.tv.TableRequest) real).getTableName();
    }

    public int getVersion() {
        return ((android.media.tv.TableRequest) real).getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.TableRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TABLE_NAME_BAT = android.media.tv.TableRequest.TABLE_NAME_BAT;
    public static final int TABLE_NAME_CAT = android.media.tv.TableRequest.TABLE_NAME_CAT;
    public static final int TABLE_NAME_EIT = android.media.tv.TableRequest.TABLE_NAME_EIT;
    public static final int TABLE_NAME_NIT = android.media.tv.TableRequest.TABLE_NAME_NIT;
    public static final int TABLE_NAME_PAT = android.media.tv.TableRequest.TABLE_NAME_PAT;
    public static final int TABLE_NAME_PMT = android.media.tv.TableRequest.TABLE_NAME_PMT;
    public static final int TABLE_NAME_SDT = android.media.tv.TableRequest.TABLE_NAME_SDT;
    public static final int TABLE_NAME_SIT = android.media.tv.TableRequest.TABLE_NAME_SIT;
    public static final int TABLE_NAME_TDT = android.media.tv.TableRequest.TABLE_NAME_TDT;
    public static final int TABLE_NAME_TOT = android.media.tv.TableRequest.TABLE_NAME_TOT;

}
