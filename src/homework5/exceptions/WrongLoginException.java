package homework5.exceptions;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException() {
        super("wrong login");
    }
}
