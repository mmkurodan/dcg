// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CarrierConfigManager {
    private final android.telephony.CarrierConfigManager real;

    public CarrierConfigManager(android.telephony.CarrierConfigManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager wrap(android.telephony.CarrierConfigManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager(real);
    }

    public android.telephony.CarrierConfigManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getConfig() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager#getConfig()");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getConfig(java.lang.String... arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager#getConfig([Ljava.lang.String;)");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getConfigByComponentForSubId(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager#getConfigByComponentForSubId(java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getConfigForSubId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager#getConfigForSubId(int)");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getConfigForSubId(int arg0, java.lang.String... arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager#getConfigForSubId(int,[Ljava.lang.String;)");
    }

    public static boolean isConfigForIdentifiedCarrier(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager#isConfigForIdentifiedCarrier(android.os.PersistableBundle)");
    }

    public void notifyConfigChangedForSubId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager#notifyConfigChangedForSubId(int)");
    }

    public void registerCarrierConfigChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.CarrierConfigChangeListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager#registerCarrierConfigChangeListener(java.util.concurrent.Executor,android.telephony.CarrierConfigManager$CarrierConfigChangeListener)");
    }

    public void unregisterCarrierConfigChangeListener(com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.CarrierConfigChangeListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager#unregisterCarrierConfigChangeListener(android.telephony.CarrierConfigManager$CarrierConfigChangeListener)");
    }


    public static final class Apn {
        private final android.telephony.CarrierConfigManager.Apn real;

        public Apn(android.telephony.CarrierConfigManager.Apn real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Apn wrap(android.telephony.CarrierConfigManager.Apn real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Apn(real);
        }

        public android.telephony.CarrierConfigManager.Apn unwrap() {
            return real;
        }


    }
    public static final class Bsf {
        private final android.telephony.CarrierConfigManager.Bsf real;

        public Bsf(android.telephony.CarrierConfigManager.Bsf real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Bsf wrap(android.telephony.CarrierConfigManager.Bsf real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Bsf(real);
        }

        public android.telephony.CarrierConfigManager.Bsf unwrap() {
            return real;
        }


    }
    public static final class CarrierConfigChangeListener {
        private final android.telephony.CarrierConfigManager.CarrierConfigChangeListener real;

        public CarrierConfigChangeListener(android.telephony.CarrierConfigManager.CarrierConfigChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.CarrierConfigChangeListener wrap(android.telephony.CarrierConfigManager.CarrierConfigChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.CarrierConfigChangeListener(real);
        }

        public android.telephony.CarrierConfigManager.CarrierConfigChangeListener unwrap() {
            return real;
        }

        public void onCarrierConfigChanged(int arg0, int arg1, int arg2, int arg3) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CarrierConfigManager$CarrierConfigChangeListener#onCarrierConfigChanged(int,int,int,int)");
        }

    }
    public static final class Gps {
        private final android.telephony.CarrierConfigManager.Gps real;

        public Gps(android.telephony.CarrierConfigManager.Gps real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Gps wrap(android.telephony.CarrierConfigManager.Gps real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Gps(real);
        }

        public android.telephony.CarrierConfigManager.Gps unwrap() {
            return real;
        }


    }
    public static final class Ims {
        private final android.telephony.CarrierConfigManager.Ims real;

        public Ims(android.telephony.CarrierConfigManager.Ims real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Ims wrap(android.telephony.CarrierConfigManager.Ims real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Ims(real);
        }

        public android.telephony.CarrierConfigManager.Ims unwrap() {
            return real;
        }


    }
    public static final class ImsEmergency {
        private final android.telephony.CarrierConfigManager.ImsEmergency real;

        public ImsEmergency(android.telephony.CarrierConfigManager.ImsEmergency real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsEmergency wrap(android.telephony.CarrierConfigManager.ImsEmergency real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsEmergency(real);
        }

        public android.telephony.CarrierConfigManager.ImsEmergency unwrap() {
            return real;
        }


    }
    public static final class ImsRtt {
        private final android.telephony.CarrierConfigManager.ImsRtt real;

        public ImsRtt(android.telephony.CarrierConfigManager.ImsRtt real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsRtt wrap(android.telephony.CarrierConfigManager.ImsRtt real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsRtt(real);
        }

        public android.telephony.CarrierConfigManager.ImsRtt unwrap() {
            return real;
        }


    }
    public static final class ImsServiceEntitlement {
        private final android.telephony.CarrierConfigManager.ImsServiceEntitlement real;

        public ImsServiceEntitlement(android.telephony.CarrierConfigManager.ImsServiceEntitlement real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsServiceEntitlement wrap(android.telephony.CarrierConfigManager.ImsServiceEntitlement real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsServiceEntitlement(real);
        }

        public android.telephony.CarrierConfigManager.ImsServiceEntitlement unwrap() {
            return real;
        }


    }
    public static final class ImsSms {
        private final android.telephony.CarrierConfigManager.ImsSms real;

        public ImsSms(android.telephony.CarrierConfigManager.ImsSms real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsSms wrap(android.telephony.CarrierConfigManager.ImsSms real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsSms(real);
        }

        public android.telephony.CarrierConfigManager.ImsSms unwrap() {
            return real;
        }


    }
    public static final class ImsSs {
        private final android.telephony.CarrierConfigManager.ImsSs real;

        public ImsSs(android.telephony.CarrierConfigManager.ImsSs real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsSs wrap(android.telephony.CarrierConfigManager.ImsSs real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsSs(real);
        }

        public android.telephony.CarrierConfigManager.ImsSs unwrap() {
            return real;
        }


    }
    public static final class ImsVoice {
        private final android.telephony.CarrierConfigManager.ImsVoice real;

        public ImsVoice(android.telephony.CarrierConfigManager.ImsVoice real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsVoice wrap(android.telephony.CarrierConfigManager.ImsVoice real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsVoice(real);
        }

        public android.telephony.CarrierConfigManager.ImsVoice unwrap() {
            return real;
        }


    }
    public static final class ImsVt {
        private final android.telephony.CarrierConfigManager.ImsVt real;

        public ImsVt(android.telephony.CarrierConfigManager.ImsVt real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsVt wrap(android.telephony.CarrierConfigManager.ImsVt real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsVt(real);
        }

        public android.telephony.CarrierConfigManager.ImsVt unwrap() {
            return real;
        }


    }
    public static final class ImsWfc {
        private final android.telephony.CarrierConfigManager.ImsWfc real;

        public ImsWfc(android.telephony.CarrierConfigManager.ImsWfc real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsWfc wrap(android.telephony.CarrierConfigManager.ImsWfc real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.ImsWfc(real);
        }

        public android.telephony.CarrierConfigManager.ImsWfc unwrap() {
            return real;
        }


    }
    public static final class Iwlan {
        private final android.telephony.CarrierConfigManager.Iwlan real;

        public Iwlan(android.telephony.CarrierConfigManager.Iwlan real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Iwlan wrap(android.telephony.CarrierConfigManager.Iwlan real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CarrierConfigManager.Iwlan(real);
        }

        public android.telephony.CarrierConfigManager.Iwlan unwrap() {
            return real;
        }


    }
}
