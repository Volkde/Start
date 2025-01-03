package lesson_27;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (isEmailValid(email)) {
            this.email = email;
        }
    }


    /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */


    private boolean isEmailValid(String email) {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        //3.После последней точки есть 2 или более символов

        if(email.length() - dotIndexAfterAt <= 2) {
            return false;
        }

        //4. Алфавит, цифры, '-', '_', '.', '@'

           for(int i= 0; i< email.length(); i++) {
            char cheakCh = email.charAt(i);
            if(!Character.isLetterOrDigit(cheakCh) && cheakCh != '_' && cheakCh != '.' && cheakCh != '@'){
                return false;
            }
           }
            //5. До собаки должен быть хотя бы 1 символ
        int atIndexBeforAt = email.indexOf('@', indexAt -1);
        if (atIndexBeforAt == -1) return false;

        //6.Первый символ - должна быть буква
        if(!Character.isAlphabetic(email.charAt(0))){
            return false;
        }



        // Полезные методы класса Character
        // Возвращает true если символ буква
        Character.isAlphabetic('c');
        // Возвращает true если символ цифра
        Character.isDigit('1');
        Character.isLetter('3');
        Character.isLetterOrDigit('-');



        return true;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public boolean isPasswordCorrect(){

        boolean hasANum = false;
        boolean hasASmallChar = false;
        boolean hasABigChar = false;
        boolean hasASpesialChar = false;

        if(password.length()<8){
            return false;
        }

        for(int i= 0; i< password.length(); i++) {
            char cheakCh = password.charAt(i);
            if(Character.isDigit(cheakCh)){
                hasANum=true;
            } else if (Character.isLowerCase(cheakCh)) {
                hasASmallChar=true;
            } else if (Character.isUpperCase(cheakCh)) {
                hasASmallChar=true;
            } else if (!Character.isLetterOrDigit(cheakCh)) {
                hasASpesialChar=true;
            }

            if(hasANum && hasASmallChar && hasABigChar && hasASpesialChar){
                return true;
            }
        }
        return false;
    }
}


/*
Требование к паролю:
длина >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква
Должна быть мин 1 большая буква
Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */
