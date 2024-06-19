package sinerji.gabriel.exception;

public class InvalidValueException extends RuntimeException{
    public InvalidValueException(String message) {
        super(message);
    }

    public InvalidValueException() {
        super("Valor inválido!");
    }
}
