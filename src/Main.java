import homework5.security.Authorization;

public class Main {
    public static void main(String[] args) {
        Authorization authorization = new Authorization();
        String login = "sky_2024";
        String password = "qwerty_";
        String wrongPassword = "qwerty_123";
        String longLogin = "sky_2024555557777777777777777777777777777777";
        System.out.println("Корректные данные: "+authorization.auth(login, password, password));
        System.out.println("Некорректные данные: "+authorization.auth(login, password, wrongPassword));
        System.out.println("Длинный логин: "+authorization.auth(longLogin, password, wrongPassword));
    }
}