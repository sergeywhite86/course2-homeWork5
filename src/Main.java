import homework5.exceptions.WrongLoginException;
import homework5.exceptions.WrongPasswordException;
import homework5.security.Authorization;

public class Main {
    public static void main(String[] args) {
        Authorization authorization = new Authorization();
        String login = "sky_2024";
        String wrongLogin = "sky_2024*";
        String password = "qwerty_";
        String wrongPassword = "qwerty_123";
        String longLogin = "sky_2024555557777777777777777777777777777777";
        String longPassword = "sky_2024555557777777777777777777777777777777";

        try {
            System.out.println("Выброс и обработка исключения при неправильном логине");
            authorization.auth(wrongLogin, password, password);
        } catch (WrongLoginException | WrongPasswordException e1) {
            System.out.println(e1.getMessage());
        }
        try {
            System.out.println("Выброс и обработка исключения при несовпадении паролей");
            authorization.auth(login, password, wrongPassword);
        } catch (WrongLoginException | WrongPasswordException e1) {
            System.out.println(e1.getMessage());
        }
        try {
            System.out.println("Выброс и обработка исключения при длинном логине");
            authorization.auth(longLogin, password, wrongPassword);
        } catch (WrongLoginException | WrongPasswordException e1) {
            System.out.println(e1.getMessage());
        }
        try {
            System.out.println("Выброс и обработка исключения при длинном пароле");
            authorization.auth(login, longPassword, longPassword);
        } catch (WrongLoginException | WrongPasswordException e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println("Отработка,когда все данные корректны");
        authorization.auth(login,password,password);
    }
}
