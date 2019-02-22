package uk.yetanother.tle;

/*
 * @author Ashley Baker
 */
public final class TwoLineElementUtilities {

    private TwoLineElementUtilities() {
        // Private and unused constructor.
    }

    public static int generateLineChecksum(String line) {
        String checksumLine = line;
        checksumLine = checksumLine.replaceAll("[A-Za-z+\\. ]", "0");
        checksumLine = checksumLine.replaceAll("[-]", "1");

        int checksum = 0;
        for (char digit : checksumLine.toCharArray()) {
            checksum = checksum + Character.getNumericValue(digit);
        }
        return checksum % 10;
    }
}
