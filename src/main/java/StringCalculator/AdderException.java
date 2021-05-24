package StringCalculator;

public class AdderException extends RuntimeException {

    public AdderException(String message) {
        super(message);
    }

    public AdderException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
