package uk.yetanother.tle;

/*
 * @author Ashley Baker
 */
public final class TwoLineElementConstants {

    private TwoLineElementConstants() {
        // Private and unused constructor.
    }

    // Line One
    public static int CLASSIFICATION_START = 7;
    public static int CLASSIFICATION_END = 8;
    public static int LAUNCH_YEAR_START = 9;
    public static int LAUNCH_YEAR_END = 11;
    public static int LAUNCH_NUMBER_START = 11;
    public static int LAUNCH_NUMBER_END = 14;
    public static int LAUNCH_ITEM_START = 14;
    public static int LAUNCH_ITEM_END = 15;
    public static int EPOCH_YEAR_START = 18;
    public static int EPOCH_YEAR_END = 20;
    public static int EPOCH_DAY_START = 20;
    public static int EPOCH_DAY_END = 32;
    public static int FIRST_TIME_DERIVATIVE_START = 33;
    public static int FIRST_TIME_DERIVATIVE_END = 42;
    public static int SECOND_TIME_DERIVATIVE_START = 44;
    public static int SECOND_TIME_DERIVATIVE_END = 52;
    public static int BSTAR_DRAG_TERM_START = 54;
    public static int BSTAR_DRAG_TERM_END = 62;
    public static int ELEMENT_SET_NUMBER_START = 65;
    public static int ELEMENT_SET_NUMBER_END = 68;

    // Line Two
    public static int INCLINATION_START = 8;
    public static int INCLINATION_END = 16;
    public static int RIGHT_ASCENSION_START = 17;
    public static int RIGHT_ASCENSION_END = 25;
    public static int ECCENTRICITY_START = 26;
    public static int ECCENTRICITY_END = 33;
    public static int ARGUMENT_OF_PERIGEE_START = 34;
    public static int ARGUMENT_OF_PERIGEE_END = 42;
    public static int MEAN_ANOMALY_START = 43;
    public static int MEAN_ANOMALY_END = 51;
    public static int MEAN_MOTION_START = 52;
    public static int MEAN_MOTION_END = 62;
    public static int REVOLUTION_NUMBER_START = 63;
    public static int REVOLUTION_NUMBER_END = 68;

    // Common
    public static int SATELLITE_NUMBER_START = 2;
    public static int SATELLITE_NUMBER_END = 7;
    public static int CHECKSUM_START = 68;
    public static int CHECKSUM_END = 69;

    public static int HEADER_LENGTH = 24;
    public static int LINE_LENGTH = 69;

}
