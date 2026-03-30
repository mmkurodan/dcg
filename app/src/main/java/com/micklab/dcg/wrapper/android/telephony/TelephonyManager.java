// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class TelephonyManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TelephonyManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.TelephonyManager wrap(android.telephony.TelephonyManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.TelephonyManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.TelephonyManager getReal() {
        return (android.telephony.TelephonyManager) real;
    }

    public android.telephony.TelephonyManager unwrap() {
        return getReal();
    }

    public boolean canChangeDtmfToneLength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#canChangeDtmfToneLength()");
    }

    public void clearSignalStrengthUpdateRequest(com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#clearSignalStrengthUpdateRequest(android.telephony.SignalStrengthUpdateRequest)");
    }

    public com.micklab.dcg.wrapper.android.telephony.TelephonyManager createForPhoneAccountHandle(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#createForPhoneAccountHandle(android.telecom.PhoneAccountHandle)");
    }

    public com.micklab.dcg.wrapper.android.telephony.TelephonyManager createForSubscriptionId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#createForSubscriptionId(int)");
    }

    public boolean doesSwitchMultiSimConfigTriggerReboot() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#doesSwitchMultiSimConfigTriggerReboot()");
    }

    public int getActiveModemCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getActiveModemCount()");
    }

    public long getAllowedNetworkTypesForReason(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getAllowedNetworkTypesForReason(int)");
    }

    public int getCallComposerStatus() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getCallComposerStatus()");
    }

    public int getCallState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getCallState()");
    }

    public int getCallStateForSubscription() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getCallStateForSubscription()");
    }

    public int getCardIdForDefaultEuicc() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getCardIdForDefaultEuicc()");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getCarrierConfig() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getCarrierConfig()");
    }

    public int getCarrierIdFromSimMccMnc() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getCarrierIdFromSimMccMnc()");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellLocation getCellLocation() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getCellLocation()");
    }

    public int getDataActivity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getDataActivity()");
    }

    public int getDataNetworkType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getDataNetworkType()");
    }

    public int getDataState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getDataState()");
    }

    public java.lang.String getDeviceId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getDeviceId()");
    }

    public java.lang.String getDeviceId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getDeviceId(int)");
    }

    public java.lang.String getDeviceSoftwareVersion() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getDeviceSoftwareVersion()");
    }

    public java.lang.String[] getForbiddenPlmns() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getForbiddenPlmns()");
    }

    public java.lang.String getGroupIdLevel1() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getGroupIdLevel1()");
    }

    public java.lang.String getIccAuthentication(int arg0, int arg1, java.lang.String arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getIccAuthentication(int,int,java.lang.String)");
    }

    public java.lang.String getImei() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getImei()");
    }

    public java.lang.String getImei(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getImei(int)");
    }

    public java.lang.String getLine1Number() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getLine1Number()");
    }

    public java.lang.String getManualNetworkSelectionPlmn() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getManualNetworkSelectionPlmn()");
    }

    public java.lang.String getManufacturerCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getManufacturerCode()");
    }

    public java.lang.String getManufacturerCode(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getManufacturerCode(int)");
    }

    public static long getMaximumCallComposerPictureSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getMaximumCallComposerPictureSize()");
    }

    public java.lang.String getMeid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getMeid()");
    }

    public java.lang.String getMeid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getMeid(int)");
    }

    public java.lang.String getMmsUAProfUrl() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getMmsUAProfUrl()");
    }

    public java.lang.String getMmsUserAgent() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getMmsUserAgent()");
    }

    public java.lang.String getNai() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getNai()");
    }

    public java.lang.String getNetworkCountryIso() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getNetworkCountryIso()");
    }

    public java.lang.String getNetworkCountryIso(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getNetworkCountryIso(int)");
    }

    public java.lang.String getNetworkOperator() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getNetworkOperator()");
    }

    public java.lang.String getNetworkOperatorName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getNetworkOperatorName()");
    }

    public int getNetworkSelectionMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getNetworkSelectionMode()");
    }

    public java.lang.String getNetworkSpecifier() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getNetworkSpecifier()");
    }

    public int getNetworkType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getNetworkType()");
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getPhoneAccountHandle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getPhoneAccountHandle()");
    }

    public int getPhoneCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getPhoneCount()");
    }

    public int getPhoneType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getPhoneType()");
    }

    public int getPreferredOpportunisticDataSubscription() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getPreferredOpportunisticDataSubscription()");
    }

    public java.lang.String getPrimaryImei() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getPrimaryImei()");
    }

    public com.micklab.dcg.wrapper.android.telephony.ServiceState getServiceState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getServiceState()");
    }

    public com.micklab.dcg.wrapper.android.telephony.ServiceState getServiceState(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getServiceState(int)");
    }

    public com.micklab.dcg.wrapper.android.telephony.SignalStrength getSignalStrength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSignalStrength()");
    }

    public int getSimCarrierId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimCarrierId()");
    }

    public java.lang.CharSequence getSimCarrierIdName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimCarrierIdName()");
    }

    public java.lang.String getSimCountryIso() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimCountryIso()");
    }

    public java.lang.String getSimOperator() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimOperator()");
    }

    public java.lang.String getSimOperatorName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimOperatorName()");
    }

    public java.lang.String getSimSerialNumber() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimSerialNumber()");
    }

    public int getSimSpecificCarrierId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimSpecificCarrierId()");
    }

    public java.lang.CharSequence getSimSpecificCarrierIdName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimSpecificCarrierIdName()");
    }

    public int getSimState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimState()");
    }

    public int getSimState(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSimState(int)");
    }

    public java.lang.String getSubscriberId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSubscriberId()");
    }

    public int getSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSubscriptionId()");
    }

    public int getSubscriptionId(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSubscriptionId(android.telecom.PhoneAccountHandle)");
    }

    public int getSupportedModemCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSupportedModemCount()");
    }

    public long getSupportedRadioAccessFamily() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getSupportedRadioAccessFamily()");
    }

    public java.lang.String getTypeAllocationCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getTypeAllocationCode()");
    }

    public java.lang.String getTypeAllocationCode(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getTypeAllocationCode(int)");
    }

    public java.lang.String getVisualVoicemailPackageName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getVisualVoicemailPackageName()");
    }

    public java.lang.String getVoiceMailAlphaTag() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getVoiceMailAlphaTag()");
    }

    public java.lang.String getVoiceMailNumber() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getVoiceMailNumber()");
    }

    public int getVoiceNetworkType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getVoiceNetworkType()");
    }

    public com.micklab.dcg.wrapper.android.net.Uri getVoicemailRingtoneUri(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle)");
    }

    public boolean hasCarrierPrivileges() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#hasCarrierPrivileges()");
    }

    public boolean hasIccCard() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#hasIccCard()");
    }

    public boolean iccCloseLogicalChannel(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#iccCloseLogicalChannel(int)");
    }

    public byte[] iccExchangeSimIO(int arg0, int arg1, int arg2, int arg3, int arg4, java.lang.String arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#iccExchangeSimIO(int,int,int,int,int,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#iccOpenLogicalChannel(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#iccOpenLogicalChannel(java.lang.String,int)");
    }

    public java.lang.String iccTransmitApduBasicChannel(int arg0, int arg1, int arg2, int arg3, int arg4, java.lang.String arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#iccTransmitApduBasicChannel(int,int,int,int,int,java.lang.String)");
    }

    public java.lang.String iccTransmitApduLogicalChannel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, java.lang.String arg6) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#iccTransmitApduLogicalChannel(int,int,int,int,int,int,java.lang.String)");
    }

    public boolean isConcurrentVoiceAndDataSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isConcurrentVoiceAndDataSupported()");
    }

    public boolean isDataCapable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isDataCapable()");
    }

    public boolean isDataConnectionAllowed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isDataConnectionAllowed()");
    }

    public boolean isDataEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isDataEnabled()");
    }

    public boolean isDataEnabledForReason(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isDataEnabledForReason(int)");
    }

    public boolean isDataRoamingEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isDataRoamingEnabled()");
    }

    public boolean isDeviceSmsCapable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isDeviceSmsCapable()");
    }

    public boolean isDeviceVoiceCapable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isDeviceVoiceCapable()");
    }

    public boolean isEmergencyNumber(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isEmergencyNumber(java.lang.String)");
    }

    public boolean isHearingAidCompatibilitySupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isHearingAidCompatibilitySupported()");
    }

    public boolean isManualNetworkSelectionAllowed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isManualNetworkSelectionAllowed()");
    }

    public boolean isModemEnabledForSlot(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isModemEnabledForSlot(int)");
    }

    public int isMultiSimSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isMultiSimSupported()");
    }

    public boolean isNetworkRoaming() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isNetworkRoaming()");
    }

    public boolean isPremiumCapabilityAvailableForPurchase(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isPremiumCapabilityAvailableForPurchase(int)");
    }

    public boolean isRadioInterfaceCapabilitySupported(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isRadioInterfaceCapabilitySupported(java.lang.String)");
    }

    public boolean isRttSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isRttSupported()");
    }

    public boolean isSmsCapable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isSmsCapable()");
    }

    public boolean isTtyModeSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isTtyModeSupported()");
    }

    public boolean isVoiceCapable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isVoiceCapable()");
    }

    public boolean isVoicemailVibrationEnabled(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle)");
    }

    public boolean isWorldPhone() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#isWorldPhone()");
    }

    public void listen(com.micklab.dcg.wrapper.android.telephony.PhoneStateListener arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#listen(android.telephony.PhoneStateListener,int)");
    }

    public void rebootModem() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#rebootModem()");
    }

    public void registerTelephonyCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.TelephonyCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#registerTelephonyCallback(java.util.concurrent.Executor,android.telephony.TelephonyCallback)");
    }

    public void registerTelephonyCallback(int arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.telephony.TelephonyCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#registerTelephonyCallback(int,java.util.concurrent.Executor,android.telephony.TelephonyCallback)");
    }

    public void requestCellInfoUpdate(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.TelephonyManager.CellInfoCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#requestCellInfoUpdate(java.util.concurrent.Executor,android.telephony.TelephonyManager$CellInfoCallback)");
    }

    public com.micklab.dcg.wrapper.android.telephony.NetworkScan requestNetworkScan(com.micklab.dcg.wrapper.android.telephony.NetworkScanRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager.NetworkScanCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#requestNetworkScan(android.telephony.NetworkScanRequest,java.util.concurrent.Executor,android.telephony.TelephonyScanManager$NetworkScanCallback)");
    }

    public com.micklab.dcg.wrapper.android.telephony.NetworkScan requestNetworkScan(int arg0, com.micklab.dcg.wrapper.android.telephony.NetworkScanRequest arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager.NetworkScanCallback arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#requestNetworkScan(int,android.telephony.NetworkScanRequest,java.util.concurrent.Executor,android.telephony.TelephonyScanManager$NetworkScanCallback)");
    }

    public void sendDialerSpecialCode(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#sendDialerSpecialCode(java.lang.String)");
    }

    public java.lang.String sendEnvelopeWithStatus(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#sendEnvelopeWithStatus(java.lang.String)");
    }

    public void sendUssdRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.telephony.TelephonyManager.UssdResponseCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#sendUssdRequest(java.lang.String,android.telephony.TelephonyManager$UssdResponseCallback,android.os.Handler)");
    }

    public void sendVisualVoicemailSms(java.lang.String arg0, int arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#sendVisualVoicemailSms(java.lang.String,int,java.lang.String,android.app.PendingIntent)");
    }

    public void setAllowedNetworkTypesForReason(int arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setAllowedNetworkTypesForReason(int,long)");
    }

    public void setCallComposerStatus(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setCallComposerStatus(int)");
    }

    public void setDataEnabled(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setDataEnabled(boolean)");
    }

    public void setDataEnabledForReason(int arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setDataEnabledForReason(int,boolean)");
    }

    public boolean setLine1NumberForDisplay(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setLine1NumberForDisplay(java.lang.String,java.lang.String)");
    }

    public void setNetworkSelectionModeAutomatic() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setNetworkSelectionModeAutomatic()");
    }

    public boolean setNetworkSelectionModeManual(java.lang.String arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setNetworkSelectionModeManual(java.lang.String,boolean)");
    }

    public boolean setNetworkSelectionModeManual(java.lang.String arg0, boolean arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setNetworkSelectionModeManual(java.lang.String,boolean,int)");
    }

    public boolean setOperatorBrandOverride(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setOperatorBrandOverride(java.lang.String)");
    }

    public boolean setPreferredNetworkTypeToGlobal() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setPreferredNetworkTypeToGlobal()");
    }

    public void setSignalStrengthUpdateRequest(com.micklab.dcg.wrapper.android.telephony.SignalStrengthUpdateRequest arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setSignalStrengthUpdateRequest(android.telephony.SignalStrengthUpdateRequest)");
    }

    public void setVisualVoicemailSmsFilterSettings(com.micklab.dcg.wrapper.android.telephony.VisualVoicemailSmsFilterSettings arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setVisualVoicemailSmsFilterSettings(android.telephony.VisualVoicemailSmsFilterSettings)");
    }

    public boolean setVoiceMailNumber(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setVoiceMailNumber(java.lang.String,java.lang.String)");
    }

    public void setVoicemailRingtoneUri(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setVoicemailRingtoneUri(android.telecom.PhoneAccountHandle,android.net.Uri)");
    }

    public void setVoicemailVibrationEnabled(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#setVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle,boolean)");
    }

    public void switchMultiSimConfig(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#switchMultiSimConfig(int)");
    }

    public void unregisterTelephonyCallback(com.micklab.dcg.wrapper.android.telephony.TelephonyCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager#unregisterTelephonyCallback(android.telephony.TelephonyCallback)");
    }


    public static final class CallComposerException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CallComposerException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.TelephonyManager.CallComposerException wrap(android.telephony.TelephonyManager.CallComposerException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.TelephonyManager.CallComposerException(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.TelephonyManager.CallComposerException getReal() {
            return (android.telephony.TelephonyManager.CallComposerException) real;
        }

        public android.telephony.TelephonyManager.CallComposerException unwrap() {
            return getReal();
        }

        public CallComposerException(int arg0, java.io.IOException arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager$CallComposerException#android.telephony.TelephonyManager$CallComposerException(int,java.io.IOException)");
        }

        public int getErrorCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager$CallComposerException#getErrorCode()");
        }

        public java.io.IOException getIOException() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager$CallComposerException#getIOException()");
        }


    }
    public static final class CellInfoCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CellInfoCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.TelephonyManager.CellInfoCallback wrap(android.telephony.TelephonyManager.CellInfoCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.TelephonyManager.CellInfoCallback(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.TelephonyManager.CellInfoCallback getReal() {
            return (android.telephony.TelephonyManager.CellInfoCallback) real;
        }

        public android.telephony.TelephonyManager.CellInfoCallback unwrap() {
            return getReal();
        }

        public void onError(int arg0, java.lang.Throwable arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager$CellInfoCallback#onError(int,java.lang.Throwable)");
        }


    }
    public static final class NetworkSlicingException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NetworkSlicingException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.TelephonyManager.NetworkSlicingException wrap(android.telephony.TelephonyManager.NetworkSlicingException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.TelephonyManager.NetworkSlicingException(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.TelephonyManager.NetworkSlicingException getReal() {
            return (android.telephony.TelephonyManager.NetworkSlicingException) real;
        }

        public android.telephony.TelephonyManager.NetworkSlicingException unwrap() {
            return getReal();
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager$NetworkSlicingException#toString()");
        }

    }
    public static final class UssdResponseCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private UssdResponseCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.TelephonyManager.UssdResponseCallback wrap(android.telephony.TelephonyManager.UssdResponseCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.TelephonyManager.UssdResponseCallback(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.TelephonyManager.UssdResponseCallback getReal() {
            return (android.telephony.TelephonyManager.UssdResponseCallback) real;
        }

        public android.telephony.TelephonyManager.UssdResponseCallback unwrap() {
            return getReal();
        }

        public void onReceiveUssdResponse(com.micklab.dcg.wrapper.android.telephony.TelephonyManager arg0, java.lang.String arg1, java.lang.CharSequence arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager$UssdResponseCallback#onReceiveUssdResponse(android.telephony.TelephonyManager,java.lang.String,java.lang.CharSequence)");
        }

        public void onReceiveUssdResponseFailed(com.micklab.dcg.wrapper.android.telephony.TelephonyManager arg0, java.lang.String arg1, int arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyManager$UssdResponseCallback#onReceiveUssdResponseFailed(android.telephony.TelephonyManager,java.lang.String,int)");
        }

    }
}
