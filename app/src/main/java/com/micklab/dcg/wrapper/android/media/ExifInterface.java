// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ExifInterface {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExifInterface(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ExifInterface wrap(android.media.ExifInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ExifInterface(real, (__DcgwBridgeToken) null);
    }

    public android.media.ExifInterface getReal() {
        return (android.media.ExifInterface) real;
    }

    public android.media.ExifInterface unwrap() {
        return getReal();
    }

    public ExifInterface(java.io.InputStream arg0) throws java.io.IOException {
        this(new android.media.ExifInterface(arg0), (__DcgwBridgeToken) null);
    }

    public ExifInterface(java.io.FileDescriptor arg0) throws java.io.IOException {
        this(new android.media.ExifInterface(arg0), (__DcgwBridgeToken) null);
    }

    public ExifInterface(java.lang.String arg0) throws java.io.IOException {
        this(new android.media.ExifInterface(arg0), (__DcgwBridgeToken) null);
    }

    public ExifInterface(java.io.File arg0) throws java.io.IOException {
        this(new android.media.ExifInterface(arg0), (__DcgwBridgeToken) null);
    }

    public ExifInterface(java.io.InputStream arg0, int arg1) throws java.io.IOException {
        this(new android.media.ExifInterface(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public double getAltitude(double arg0) {
        return ((android.media.ExifInterface) real).getAltitude(arg0);
    }

    public java.lang.String getAttribute(java.lang.String arg0) {
        return ((android.media.ExifInterface) real).getAttribute(arg0);
    }

    public byte[] getAttributeBytes(java.lang.String arg0) {
        return ((android.media.ExifInterface) real).getAttributeBytes(arg0);
    }

    public double getAttributeDouble(java.lang.String arg0, double arg1) {
        return ((android.media.ExifInterface) real).getAttributeDouble(arg0, arg1);
    }

    public int getAttributeInt(java.lang.String arg0, int arg1) {
        return ((android.media.ExifInterface) real).getAttributeInt(arg0, arg1);
    }

    public long[] getAttributeRange(java.lang.String arg0) {
        return ((android.media.ExifInterface) real).getAttributeRange(arg0);
    }

    public long getDateTime() {
        return ((android.media.ExifInterface) real).getDateTime();
    }

    public long getDateTimeDigitized() {
        return ((android.media.ExifInterface) real).getDateTimeDigitized();
    }

    public long getDateTimeOriginal() {
        return ((android.media.ExifInterface) real).getDateTimeOriginal();
    }

    public long getGpsDateTime() {
        return ((android.media.ExifInterface) real).getGpsDateTime();
    }

    public boolean getLatLong(float[] arg0) {
        return ((android.media.ExifInterface) real).getLatLong(arg0);
    }

    public byte[] getThumbnail() {
        return ((android.media.ExifInterface) real).getThumbnail();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getThumbnailBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.media.ExifInterface) real).getThumbnailBitmap());
    }

    public byte[] getThumbnailBytes() {
        return ((android.media.ExifInterface) real).getThumbnailBytes();
    }

    public long[] getThumbnailRange() {
        return ((android.media.ExifInterface) real).getThumbnailRange();
    }

    public boolean hasAttribute(java.lang.String arg0) {
        return ((android.media.ExifInterface) real).hasAttribute(arg0);
    }

    public boolean hasThumbnail() {
        return ((android.media.ExifInterface) real).hasThumbnail();
    }

    public static boolean isSupportedMimeType(java.lang.String arg0) {
        return android.media.ExifInterface.isSupportedMimeType(arg0);
    }

    public boolean isThumbnailCompressed() {
        return ((android.media.ExifInterface) real).isThumbnailCompressed();
    }

    public void saveAttributes() throws java.io.IOException {
        ((android.media.ExifInterface) real).saveAttributes();
    }

    public void setAttribute(java.lang.String arg0, java.lang.String arg1) {
        ((android.media.ExifInterface) real).setAttribute(arg0, arg1);
    }

    public static final int ORIENTATION_FLIP_HORIZONTAL = android.media.ExifInterface.ORIENTATION_FLIP_HORIZONTAL;
    public static final int ORIENTATION_FLIP_VERTICAL = android.media.ExifInterface.ORIENTATION_FLIP_VERTICAL;
    public static final int ORIENTATION_NORMAL = android.media.ExifInterface.ORIENTATION_NORMAL;
    public static final int ORIENTATION_ROTATE_180 = android.media.ExifInterface.ORIENTATION_ROTATE_180;
    public static final int ORIENTATION_ROTATE_270 = android.media.ExifInterface.ORIENTATION_ROTATE_270;
    public static final int ORIENTATION_ROTATE_90 = android.media.ExifInterface.ORIENTATION_ROTATE_90;
    public static final int ORIENTATION_TRANSPOSE = android.media.ExifInterface.ORIENTATION_TRANSPOSE;
    public static final int ORIENTATION_TRANSVERSE = android.media.ExifInterface.ORIENTATION_TRANSVERSE;
    public static final int ORIENTATION_UNDEFINED = android.media.ExifInterface.ORIENTATION_UNDEFINED;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = android.media.ExifInterface.STREAM_TYPE_EXIF_DATA_ONLY;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = android.media.ExifInterface.STREAM_TYPE_FULL_IMAGE_DATA;
    public static final java.lang.String TAG_APERTURE = android.media.ExifInterface.TAG_APERTURE;
    public static final java.lang.String TAG_APERTURE_VALUE = android.media.ExifInterface.TAG_APERTURE_VALUE;
    public static final java.lang.String TAG_ARTIST = android.media.ExifInterface.TAG_ARTIST;
    public static final java.lang.String TAG_BITS_PER_SAMPLE = android.media.ExifInterface.TAG_BITS_PER_SAMPLE;
    public static final java.lang.String TAG_BRIGHTNESS_VALUE = android.media.ExifInterface.TAG_BRIGHTNESS_VALUE;
    public static final java.lang.String TAG_CFA_PATTERN = android.media.ExifInterface.TAG_CFA_PATTERN;
    public static final java.lang.String TAG_COLOR_SPACE = android.media.ExifInterface.TAG_COLOR_SPACE;
    public static final java.lang.String TAG_COMPONENTS_CONFIGURATION = android.media.ExifInterface.TAG_COMPONENTS_CONFIGURATION;
    public static final java.lang.String TAG_COMPRESSED_BITS_PER_PIXEL = android.media.ExifInterface.TAG_COMPRESSED_BITS_PER_PIXEL;
    public static final java.lang.String TAG_COMPRESSION = android.media.ExifInterface.TAG_COMPRESSION;
    public static final java.lang.String TAG_CONTRAST = android.media.ExifInterface.TAG_CONTRAST;
    public static final java.lang.String TAG_COPYRIGHT = android.media.ExifInterface.TAG_COPYRIGHT;
    public static final java.lang.String TAG_CUSTOM_RENDERED = android.media.ExifInterface.TAG_CUSTOM_RENDERED;
    public static final java.lang.String TAG_DATETIME = android.media.ExifInterface.TAG_DATETIME;
    public static final java.lang.String TAG_DATETIME_DIGITIZED = android.media.ExifInterface.TAG_DATETIME_DIGITIZED;
    public static final java.lang.String TAG_DATETIME_ORIGINAL = android.media.ExifInterface.TAG_DATETIME_ORIGINAL;
    public static final java.lang.String TAG_DEFAULT_CROP_SIZE = android.media.ExifInterface.TAG_DEFAULT_CROP_SIZE;
    public static final java.lang.String TAG_DEVICE_SETTING_DESCRIPTION = android.media.ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION;
    public static final java.lang.String TAG_DIGITAL_ZOOM_RATIO = android.media.ExifInterface.TAG_DIGITAL_ZOOM_RATIO;
    public static final java.lang.String TAG_DNG_VERSION = android.media.ExifInterface.TAG_DNG_VERSION;
    public static final java.lang.String TAG_EXIF_VERSION = android.media.ExifInterface.TAG_EXIF_VERSION;
    public static final java.lang.String TAG_EXPOSURE_BIAS_VALUE = android.media.ExifInterface.TAG_EXPOSURE_BIAS_VALUE;
    public static final java.lang.String TAG_EXPOSURE_INDEX = android.media.ExifInterface.TAG_EXPOSURE_INDEX;
    public static final java.lang.String TAG_EXPOSURE_MODE = android.media.ExifInterface.TAG_EXPOSURE_MODE;
    public static final java.lang.String TAG_EXPOSURE_PROGRAM = android.media.ExifInterface.TAG_EXPOSURE_PROGRAM;
    public static final java.lang.String TAG_EXPOSURE_TIME = android.media.ExifInterface.TAG_EXPOSURE_TIME;
    public static final java.lang.String TAG_FLASH = android.media.ExifInterface.TAG_FLASH;
    public static final java.lang.String TAG_FLASHPIX_VERSION = android.media.ExifInterface.TAG_FLASHPIX_VERSION;
    public static final java.lang.String TAG_FLASH_ENERGY = android.media.ExifInterface.TAG_FLASH_ENERGY;
    public static final java.lang.String TAG_FOCAL_LENGTH = android.media.ExifInterface.TAG_FOCAL_LENGTH;
    public static final java.lang.String TAG_FOCAL_LENGTH_IN_35MM_FILM = android.media.ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM;
    public static final java.lang.String TAG_FOCAL_PLANE_RESOLUTION_UNIT = android.media.ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT;
    public static final java.lang.String TAG_FOCAL_PLANE_X_RESOLUTION = android.media.ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION;
    public static final java.lang.String TAG_FOCAL_PLANE_Y_RESOLUTION = android.media.ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION;
    public static final java.lang.String TAG_F_NUMBER = android.media.ExifInterface.TAG_F_NUMBER;
    public static final java.lang.String TAG_GAIN_CONTROL = android.media.ExifInterface.TAG_GAIN_CONTROL;
    public static final java.lang.String TAG_GPS_ALTITUDE = android.media.ExifInterface.TAG_GPS_ALTITUDE;
    public static final java.lang.String TAG_GPS_ALTITUDE_REF = android.media.ExifInterface.TAG_GPS_ALTITUDE_REF;
    public static final java.lang.String TAG_GPS_AREA_INFORMATION = android.media.ExifInterface.TAG_GPS_AREA_INFORMATION;
    public static final java.lang.String TAG_GPS_DATESTAMP = android.media.ExifInterface.TAG_GPS_DATESTAMP;
    public static final java.lang.String TAG_GPS_DEST_BEARING = android.media.ExifInterface.TAG_GPS_DEST_BEARING;
    public static final java.lang.String TAG_GPS_DEST_BEARING_REF = android.media.ExifInterface.TAG_GPS_DEST_BEARING_REF;
    public static final java.lang.String TAG_GPS_DEST_DISTANCE = android.media.ExifInterface.TAG_GPS_DEST_DISTANCE;
    public static final java.lang.String TAG_GPS_DEST_DISTANCE_REF = android.media.ExifInterface.TAG_GPS_DEST_DISTANCE_REF;
    public static final java.lang.String TAG_GPS_DEST_LATITUDE = android.media.ExifInterface.TAG_GPS_DEST_LATITUDE;
    public static final java.lang.String TAG_GPS_DEST_LATITUDE_REF = android.media.ExifInterface.TAG_GPS_DEST_LATITUDE_REF;
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE = android.media.ExifInterface.TAG_GPS_DEST_LONGITUDE;
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE_REF = android.media.ExifInterface.TAG_GPS_DEST_LONGITUDE_REF;
    public static final java.lang.String TAG_GPS_DIFFERENTIAL = android.media.ExifInterface.TAG_GPS_DIFFERENTIAL;
    public static final java.lang.String TAG_GPS_DOP = android.media.ExifInterface.TAG_GPS_DOP;
    public static final java.lang.String TAG_GPS_IMG_DIRECTION = android.media.ExifInterface.TAG_GPS_IMG_DIRECTION;
    public static final java.lang.String TAG_GPS_IMG_DIRECTION_REF = android.media.ExifInterface.TAG_GPS_IMG_DIRECTION_REF;
    public static final java.lang.String TAG_GPS_LATITUDE = android.media.ExifInterface.TAG_GPS_LATITUDE;
    public static final java.lang.String TAG_GPS_LATITUDE_REF = android.media.ExifInterface.TAG_GPS_LATITUDE_REF;
    public static final java.lang.String TAG_GPS_LONGITUDE = android.media.ExifInterface.TAG_GPS_LONGITUDE;
    public static final java.lang.String TAG_GPS_LONGITUDE_REF = android.media.ExifInterface.TAG_GPS_LONGITUDE_REF;
    public static final java.lang.String TAG_GPS_MAP_DATUM = android.media.ExifInterface.TAG_GPS_MAP_DATUM;
    public static final java.lang.String TAG_GPS_MEASURE_MODE = android.media.ExifInterface.TAG_GPS_MEASURE_MODE;
    public static final java.lang.String TAG_GPS_PROCESSING_METHOD = android.media.ExifInterface.TAG_GPS_PROCESSING_METHOD;
    public static final java.lang.String TAG_GPS_SATELLITES = android.media.ExifInterface.TAG_GPS_SATELLITES;
    public static final java.lang.String TAG_GPS_SPEED = android.media.ExifInterface.TAG_GPS_SPEED;
    public static final java.lang.String TAG_GPS_SPEED_REF = android.media.ExifInterface.TAG_GPS_SPEED_REF;
    public static final java.lang.String TAG_GPS_STATUS = android.media.ExifInterface.TAG_GPS_STATUS;
    public static final java.lang.String TAG_GPS_TIMESTAMP = android.media.ExifInterface.TAG_GPS_TIMESTAMP;
    public static final java.lang.String TAG_GPS_TRACK = android.media.ExifInterface.TAG_GPS_TRACK;
    public static final java.lang.String TAG_GPS_TRACK_REF = android.media.ExifInterface.TAG_GPS_TRACK_REF;
    public static final java.lang.String TAG_GPS_VERSION_ID = android.media.ExifInterface.TAG_GPS_VERSION_ID;
    public static final java.lang.String TAG_IMAGE_DESCRIPTION = android.media.ExifInterface.TAG_IMAGE_DESCRIPTION;
    public static final java.lang.String TAG_IMAGE_LENGTH = android.media.ExifInterface.TAG_IMAGE_LENGTH;
    public static final java.lang.String TAG_IMAGE_UNIQUE_ID = android.media.ExifInterface.TAG_IMAGE_UNIQUE_ID;
    public static final java.lang.String TAG_IMAGE_WIDTH = android.media.ExifInterface.TAG_IMAGE_WIDTH;
    public static final java.lang.String TAG_INTEROPERABILITY_INDEX = android.media.ExifInterface.TAG_INTEROPERABILITY_INDEX;
    public static final java.lang.String TAG_ISO = android.media.ExifInterface.TAG_ISO;
    public static final java.lang.String TAG_ISO_SPEED_RATINGS = android.media.ExifInterface.TAG_ISO_SPEED_RATINGS;
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT = android.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT;
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = android.media.ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH;
    public static final java.lang.String TAG_LIGHT_SOURCE = android.media.ExifInterface.TAG_LIGHT_SOURCE;
    public static final java.lang.String TAG_MAKE = android.media.ExifInterface.TAG_MAKE;
    public static final java.lang.String TAG_MAKER_NOTE = android.media.ExifInterface.TAG_MAKER_NOTE;
    public static final java.lang.String TAG_MAX_APERTURE_VALUE = android.media.ExifInterface.TAG_MAX_APERTURE_VALUE;
    public static final java.lang.String TAG_METERING_MODE = android.media.ExifInterface.TAG_METERING_MODE;
    public static final java.lang.String TAG_MODEL = android.media.ExifInterface.TAG_MODEL;
    public static final java.lang.String TAG_OECF = android.media.ExifInterface.TAG_OECF;
    public static final java.lang.String TAG_OFFSET_TIME = android.media.ExifInterface.TAG_OFFSET_TIME;
    public static final java.lang.String TAG_OFFSET_TIME_DIGITIZED = android.media.ExifInterface.TAG_OFFSET_TIME_DIGITIZED;
    public static final java.lang.String TAG_OFFSET_TIME_ORIGINAL = android.media.ExifInterface.TAG_OFFSET_TIME_ORIGINAL;
    public static final java.lang.String TAG_ORF_ASPECT_FRAME = android.media.ExifInterface.TAG_ORF_ASPECT_FRAME;
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_LENGTH = android.media.ExifInterface.TAG_ORF_PREVIEW_IMAGE_LENGTH;
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_START = android.media.ExifInterface.TAG_ORF_PREVIEW_IMAGE_START;
    public static final java.lang.String TAG_ORF_THUMBNAIL_IMAGE = android.media.ExifInterface.TAG_ORF_THUMBNAIL_IMAGE;
    public static final java.lang.String TAG_ORIENTATION = android.media.ExifInterface.TAG_ORIENTATION;
    public static final java.lang.String TAG_PHOTOMETRIC_INTERPRETATION = android.media.ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION;
    public static final java.lang.String TAG_PIXEL_X_DIMENSION = android.media.ExifInterface.TAG_PIXEL_X_DIMENSION;
    public static final java.lang.String TAG_PIXEL_Y_DIMENSION = android.media.ExifInterface.TAG_PIXEL_Y_DIMENSION;
    public static final java.lang.String TAG_PLANAR_CONFIGURATION = android.media.ExifInterface.TAG_PLANAR_CONFIGURATION;
    public static final java.lang.String TAG_PRIMARY_CHROMATICITIES = android.media.ExifInterface.TAG_PRIMARY_CHROMATICITIES;
    public static final java.lang.String TAG_REFERENCE_BLACK_WHITE = android.media.ExifInterface.TAG_REFERENCE_BLACK_WHITE;
    public static final java.lang.String TAG_RESOLUTION_UNIT = android.media.ExifInterface.TAG_RESOLUTION_UNIT;
    public static final java.lang.String TAG_ROWS_PER_STRIP = android.media.ExifInterface.TAG_ROWS_PER_STRIP;
    public static final java.lang.String TAG_RW2_ISO = android.media.ExifInterface.TAG_RW2_ISO;
    public static final java.lang.String TAG_RW2_JPG_FROM_RAW = android.media.ExifInterface.TAG_RW2_JPG_FROM_RAW;
    public static final java.lang.String TAG_RW2_SENSOR_BOTTOM_BORDER = android.media.ExifInterface.TAG_RW2_SENSOR_BOTTOM_BORDER;
    public static final java.lang.String TAG_RW2_SENSOR_LEFT_BORDER = android.media.ExifInterface.TAG_RW2_SENSOR_LEFT_BORDER;
    public static final java.lang.String TAG_RW2_SENSOR_RIGHT_BORDER = android.media.ExifInterface.TAG_RW2_SENSOR_RIGHT_BORDER;
    public static final java.lang.String TAG_RW2_SENSOR_TOP_BORDER = android.media.ExifInterface.TAG_RW2_SENSOR_TOP_BORDER;
    public static final java.lang.String TAG_SAMPLES_PER_PIXEL = android.media.ExifInterface.TAG_SAMPLES_PER_PIXEL;
    public static final java.lang.String TAG_SATURATION = android.media.ExifInterface.TAG_SATURATION;
    public static final java.lang.String TAG_SCENE_CAPTURE_TYPE = android.media.ExifInterface.TAG_SCENE_CAPTURE_TYPE;
    public static final java.lang.String TAG_SCENE_TYPE = android.media.ExifInterface.TAG_SCENE_TYPE;
    public static final java.lang.String TAG_SENSING_METHOD = android.media.ExifInterface.TAG_SENSING_METHOD;
    public static final java.lang.String TAG_SHARPNESS = android.media.ExifInterface.TAG_SHARPNESS;
    public static final java.lang.String TAG_SHUTTER_SPEED_VALUE = android.media.ExifInterface.TAG_SHUTTER_SPEED_VALUE;
    public static final java.lang.String TAG_SOFTWARE = android.media.ExifInterface.TAG_SOFTWARE;
    public static final java.lang.String TAG_SPATIAL_FREQUENCY_RESPONSE = android.media.ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE;
    public static final java.lang.String TAG_SPECTRAL_SENSITIVITY = android.media.ExifInterface.TAG_SPECTRAL_SENSITIVITY;
    public static final java.lang.String TAG_STRIP_BYTE_COUNTS = android.media.ExifInterface.TAG_STRIP_BYTE_COUNTS;
    public static final java.lang.String TAG_STRIP_OFFSETS = android.media.ExifInterface.TAG_STRIP_OFFSETS;
    public static final java.lang.String TAG_SUBJECT_AREA = android.media.ExifInterface.TAG_SUBJECT_AREA;
    public static final java.lang.String TAG_SUBJECT_DISTANCE = android.media.ExifInterface.TAG_SUBJECT_DISTANCE;
    public static final java.lang.String TAG_SUBJECT_DISTANCE_RANGE = android.media.ExifInterface.TAG_SUBJECT_DISTANCE_RANGE;
    public static final java.lang.String TAG_SUBJECT_LOCATION = android.media.ExifInterface.TAG_SUBJECT_LOCATION;
    public static final java.lang.String TAG_SUBSEC_TIME = android.media.ExifInterface.TAG_SUBSEC_TIME;
    public static final java.lang.String TAG_SUBSEC_TIME_DIG = android.media.ExifInterface.TAG_SUBSEC_TIME_DIG;
    public static final java.lang.String TAG_SUBSEC_TIME_DIGITIZED = android.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED;
    public static final java.lang.String TAG_SUBSEC_TIME_ORIG = android.media.ExifInterface.TAG_SUBSEC_TIME_ORIG;
    public static final java.lang.String TAG_SUBSEC_TIME_ORIGINAL = android.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL;
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_LENGTH = android.media.ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH;
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_WIDTH = android.media.ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH;
    public static final java.lang.String TAG_THUMBNAIL_ORIENTATION = android.media.ExifInterface.TAG_THUMBNAIL_ORIENTATION;
    public static final java.lang.String TAG_TRANSFER_FUNCTION = android.media.ExifInterface.TAG_TRANSFER_FUNCTION;
    public static final java.lang.String TAG_USER_COMMENT = android.media.ExifInterface.TAG_USER_COMMENT;
    public static final java.lang.String TAG_WHITE_BALANCE = android.media.ExifInterface.TAG_WHITE_BALANCE;
    public static final java.lang.String TAG_WHITE_POINT = android.media.ExifInterface.TAG_WHITE_POINT;
    public static final java.lang.String TAG_XMP = android.media.ExifInterface.TAG_XMP;
    public static final java.lang.String TAG_X_RESOLUTION = android.media.ExifInterface.TAG_X_RESOLUTION;
    public static final java.lang.String TAG_Y_CB_CR_COEFFICIENTS = android.media.ExifInterface.TAG_Y_CB_CR_COEFFICIENTS;
    public static final java.lang.String TAG_Y_CB_CR_POSITIONING = android.media.ExifInterface.TAG_Y_CB_CR_POSITIONING;
    public static final java.lang.String TAG_Y_CB_CR_SUB_SAMPLING = android.media.ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING;
    public static final java.lang.String TAG_Y_RESOLUTION = android.media.ExifInterface.TAG_Y_RESOLUTION;
    public static final int WHITEBALANCE_AUTO = android.media.ExifInterface.WHITEBALANCE_AUTO;
    public static final int WHITEBALANCE_MANUAL = android.media.ExifInterface.WHITEBALANCE_MANUAL;

}
