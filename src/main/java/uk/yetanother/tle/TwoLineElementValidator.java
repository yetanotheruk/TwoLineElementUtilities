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
        // If the line is null or is empty the checksum is invalid.
        if (line == null || line.isEmpty()) {
            return false;
        }

        int expectedChecksum = Character.getNumericValue(line.charAt(line.length() - 1));
        return expectedChecksum == TwoLineElementUtilities.generateLineChecksum(line.substring(0, line.length() - 1));
    }

    private static String validateLineLength(String header, String lineOne, String lineTwo) {
        String errorMessages = "";
        if (header.length() != TwoLineElementConstants.HEADER_LENGTH) {
            errorMessages += "\nThe header of the TLE Data is not the correct length, expected " + TwoLineElementConstants.HEADER_LENGTH + ".";
        }
        if (lineOne.length() != TwoLineElementConstants.LINE_LENGTH) {
            errorMessages += "\nThe first line of the TLE Data is not the correct length, expected " + TwoLineElementConstants.LINE_LENGTH + ".";
        }
        if (lineTwo.length() != TwoLineElementConstants.LINE_LENGTH) {
            errorMessages += "\nThe second line of the TLE Data is not the correct length, expected " + TwoLineElementConstants.LINE_LENGTH + ".";
        }
        return errorMessages;
    }

}
