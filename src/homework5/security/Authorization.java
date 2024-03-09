package homework5.security;

import homework5.exceptions.WrongLoginException;
import homework5.exceptions.WrongPasswordException;

public class Authorization {
    public boolean auth(String login, String password, String confirmPassword) {
        try {
            loginValidation(login);
            passwordValidation(password);
            passwordValidationEquals(password, confirmPassword);
        } catch (WrongLoginException ex) {
            System.out.println(ex.getMessage());
            return false;
        } catch (WrongPasswordException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return login.matches("\\w+") && password.matches("\\w+");
    }

    private void loginValidation(String login) {
        if (login.length() >= 20) throw new WrongLoginException();
    }

    private void passwordValidation(String password) {
        if (password.length() > 20) throw new WrongPasswordException();
    }

    private void passwordValidationEquals(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) throw new WrongPasswordException();
    }
}
