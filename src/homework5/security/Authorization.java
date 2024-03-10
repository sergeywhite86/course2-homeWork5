package homework5.security;

import homework5.exceptions.WrongLoginException;
import homework5.exceptions.WrongPasswordException;

public class Authorization {
    public void auth(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {
        validation(login, password, confirmPassword);
        System.out.println("Все данные корректы,поздравляю!");
    }

    private void validation(String login, String password, String confirmPassword) {
        if (login.length() >= 20 || !login.matches("\\w+")) throw new WrongLoginException();
        if (password.length() > 20 || !password.matches("\\w+") || !password.equals(confirmPassword))
            throw new WrongPasswordException();
    }

}


