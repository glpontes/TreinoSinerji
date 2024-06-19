package sinerji.gabriel.exception;

public class ExplosionException extends RuntimeException{
    public ExplosionException(String message) {
        super(message);
    }

    public ExplosionException() {
        super("KABOOM");
    }
}
