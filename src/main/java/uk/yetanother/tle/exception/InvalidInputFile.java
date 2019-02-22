package uk.yetanother.tle.exception;

/*
 * @author Ashley Baker
 */
public class InvalidInputFile extends Exception {
    private static final long serialVersionUID = -5073253000699895705L;

    public InvalidInputFile(String message, Throwable e) {
        super(message, e);
    }

    public InvalidInputFile(String message) {
        super(message);
    }
}
