package homework5.exceptions;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {
        super("wrong password");
    }
}
