package sinerji.gabriel.exception;

public class ExitException extends RuntimeException {

    public ExitException(String message){
        super(message);
    }

    public ExitException() {
        super("Saindo . . .");
    }
}
