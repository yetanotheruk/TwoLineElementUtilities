package uk.yetanother.tle.model;

/*
 * @author Ashley Baker
 */
public interface TwoLineElementFile {

    // TLE Header
    public String getSatelliteName();

    public String getHeader();

    // TLE Line 1
    public int getSatelliteNumber();

    public String getSatelliteClassification();

    public String getInternationalDesignatorLaunchYear();

    public String getInternationalDesignatorLaunchNumber();

    public String getInternationalDesignatorLaunchItem();

    public String getEpochYear();

    public float getEpochDay();

    public float getFirstTimeDerivative();

    public float getSecondTimeDerivative();

    public float getBstarDragTerm();

    public int getElementSetNumber();

    public int getLineOneChecksum();

    public String getLineOne();

    // TLE Line 2
    public float getInclination();

    public float getRightAscension();

    public float getEccentricity();

    public float getArgumentOfPerigee();

    public float getMeanAnomaly();

    public float getMeanMotion();

    public int getRevolutionNumber();

    public int getLineTwoChecksum();

    public String getLineTwo();
}
