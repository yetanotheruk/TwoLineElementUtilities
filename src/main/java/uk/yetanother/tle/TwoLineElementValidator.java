package uk.yetanother.tle;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Ashley Baker
 */
public final class TwoLineElementValidator {

    private static Logger LOGGER = Logger.getLogger(TwoLineElementValidator.class.getName());

    private TwoLineElementValidator() {
        // Private and unused constructor.
    }

    public static boolean isDataValid(String header, String lineOne, String lineTwo) {
        String errorMessages = validateLineLength(header, lineOne, lineTwo);
        errorMessages += isLineChecksumValid(lineOne) ? "" : "\nChecksum of line one is invalid.";
        errorMessages += isLineChecksumValid(lineTwo) ? "" : "\nChecksum of line two is invalid.";

        if (!errorMessages.isEmpty()) {
            LOGGER.log(Level.SEVERE, "TLE Data is invalid and cannot be parsed. " + errorMessages);
            return false;
        }
        return true;
    }

    public static boolean isLineChecksumValid(String line) {
        int expectedChecksum = Character.getNumericValue(line.charAt(line.length() - 1));
        return expectedChecksum == TwoLineElementUtilities.generateLineChecksum(line.substring(0, line.length() - 1));
    }

    private static String validateLineLength(String header, String lineOne, String lineTwo) {
        String errorMessages = "";
        if (header.length() != TwoLineElementConstants.HEADER_LENGTH) {
            errorMessages += "\nThe header of the TLE Data is not the correct length, expected " + TwoLineElementConstants.HEADER_LENGTH + ".";
        } else if (lineOne.length() != TwoLineElementConstants.LINE_LENGTH) {
            errorMessages += "\nThe first line of the TLE Data is not the correct length, expected " + TwoLineElementConstants.LINE_LENGTH + ".";
        } else if (lineTwo.length() != TwoLineElementConstants.LINE_LENGTH) {
            errorMessages += "\nThe second line of the TLE Data is not the correct length, expected " + TwoLineElementConstants.LINE_LENGTH + ".";
        }
        return errorMessages;
    }

}
