package uk.yetanother.tle.model;

/*
 * @author Ashley Baker
 */
public class TwoLineElementFileImpl implements TwoLineElementFile {

    private String header;
    private String lineOne;
    private String lineTwo;

    private String satelliteName;
    private int satelliteNumber;
    private String SatelliteClassification;
    private String internationalDesignatorLaunchYear;
    private String internationalDesignatorLaunchNumber;
    private String internationalDesignatorLaunchItem;
    private String epochYear;
    private float epochDay;
    private float firstTimeDerivative;
    private float secondTimeDerivative;
    private float bstarDragTerm;
    private int elementSetNumber;
    private int lineOneChecksum;
    private float inclination;
    private float rightAscension;
    private float eccentricity;
    private float argumentOfPerigee;
    private float meanAnomaly;
    private float meanMotion;
    private int revolutionNumber;
    private int lineTwoChecksum;

    public TwoLineElementFileImpl(String header, String lineOne, String lineTwo) {
        this.header = header;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
    }

    public float getArgumentOfPerigee() {
        return argumentOfPerigee;
    }

    public float getBstarDragTerm() {
        return bstarDragTerm;
    }

    public float getEccentricity() {
        return eccentricity;
    }

    public int getElementSetNumber() {
        return elementSetNumber;
    }

    public float getEpochDay() {
        return epochDay;
    }

    public String getEpochYear() {
        return epochYear;
    }

    public float getFirstTimeDerivative() {
        return firstTimeDerivative;
    }

    public String getHeader() {
        return header;
    }

    public float getInclination() {
        return inclination;
    }

    public String getInternationalDesignatorLaunchItem() {
        return internationalDesignatorLaunchItem;
    }

    public String getInternationalDesignatorLaunchNumber() {
        return internationalDesignatorLaunchNumber;
    }

    public String getInternationalDesignatorLaunchYear() {
        return internationalDesignatorLaunchYear;
    }

    public String getLineOne() {
        return lineOne;
    }

    public int getLineOneChecksum() {
        return lineOneChecksum;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public int getLineTwoChecksum() {
        return lineTwoChecksum;
    }

    public float getMeanAnomaly() {
        return meanAnomaly;
    }

    public float getMeanMotion() {
        return meanMotion;
    }

    public int getRevolutionNumber() {
        return revolutionNumber;
    }

    public float getRightAscension() {
        return rightAscension;
    }

    public String getSatelliteClassification() {
        return SatelliteClassification;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public int getSatelliteNumber() {
        return satelliteNumber;
    }

    public float getSecondTimeDerivative() {
        return secondTimeDerivative;
    }

    public void setArgumentOfPerigee(float argumentOfPerige) {
        this.argumentOfPerigee = argumentOfPerige;
    }

    public void setBstarDragTerm(float bstarDragTerm) {
        this.bstarDragTerm = bstarDragTerm;
    }

    public void setEccentricity(float eccentricity) {
        this.eccentricity = eccentricity;
    }

    public void setElementSetNumber(int elementSetNumber) {
        this.elementSetNumber = elementSetNumber;
    }

    public void setEpochDay(float epochDay) {
        this.epochDay = epochDay;
    }

    public void setEpochYear(String epochYear) {
        this.epochYear = epochYear;
    }

    public void setFirstTimeDerivative(float firstTimeDerivative) {
        this.firstTimeDerivative = firstTimeDerivative;
    }

    public void setInclination(float inclination) {
        this.inclination = inclination;
    }

    public void setInternationalDesignatorLaunchItem(String internationalDesignatorLaunchItem) {
        this.internationalDesignatorLaunchItem = internationalDesignatorLaunchItem;
    }

    public void setInternationalDesignatorLaunchNumber(String internationalDesignatorLaunchNumber) {
        this.internationalDesignatorLaunchNumber = internationalDesignatorLaunchNumber;
    }

    public void setInternationalDesignatorLaunchYear(String internationalDesignatorLaunchYear) {
        this.internationalDesignatorLaunchYear = internationalDesignatorLaunchYear;
    }

    public void setLineOneChecksum(int lineOneChecksum) {
        this.lineOneChecksum = lineOneChecksum;
    }

    public void setLineTwoChecksum(int lineTwoChecksum) {
        this.lineTwoChecksum = lineTwoChecksum;
    }

    public void setMeanAnomaly(float meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    public void setMeanMotion(float meanMotion) {
        this.meanMotion = meanMotion;
    }

    public void setRevolutionNumber(int revolutionNumber) {
        this.revolutionNumber = revolutionNumber;
    }

    public void setRightAscension(float rightAscension) {
        this.rightAscension = rightAscension;
    }

    public void setSatelliteClassification(String satelliteClassification) {
        SatelliteClassification = satelliteClassification;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public void setSatelliteNumber(int satelliteNumber) {
        this.satelliteNumber = satelliteNumber;
    }

    public void setSecondTimeDerivative(float secondTimeDerivative) {
        this.secondTimeDerivative = secondTimeDerivative;
    }

    @Override
    public String toString() {
        return header + "\n" + lineOne + "\n" + lineTwo;
    }
}
