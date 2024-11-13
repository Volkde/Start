package lesson_45.validator;

public class PasswordValidator {

    public static void isPasswordValid(String password) throws PasswordValidateException {

        // 1. Проверка минимальной длины (мин. 10 символов)
        if (password.length() < 10) {
            throw new PasswordValidateException("Password слишком короткий. Мин. 10 символов");
        }

        // 2. Проверка наличия хотя бы одной цифры

        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {

            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {

            throw new PasswordValidateException("Password должен содержать хотя бы одну цифру");
        }

        // 3. Проверка наличия хотя бы одной буквы
        boolean hasLetter = false;
        for (char ch : password.toCharArray()) {

            if (Character.isLetter(ch)) {
                hasLetter = true;
                break;
            }
        }
        if (!hasLetter) {

            throw new PasswordValidateException("Password должен содержать хотя бы одну букву");
        }

        // 4. Проверка наличия спец. символа
        String specialChars = "!@#$%_/";
        boolean hasSpecialChar = false;
        for (char ch : password.toCharArray()) {
            if (specialChars.indexOf(ch) != -1) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {

            throw new PasswordValidateException("Password должен содержать хотя бы один специальный символ из набора: !@#$%");
        }


    }
}
