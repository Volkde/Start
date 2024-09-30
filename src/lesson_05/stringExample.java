package lesson_05;

public class stringExample {
    public static void main(String[] args) {
        String string =  "Java"; //Объявлеям переменную

        System.out.println(string);

        int lenght = string.length(); //Получаем количество  символов в строке

        System.out.println(lenght);

        System.out.println(string.toUpperCase()); //Перевол  в верхний регистр

        String stringUpper  = string.toUpperCase();

        System.out.println(stringUpper);
        System.out.println(string);

        // toLowerCase() переводит все символы в нижний регистр

        stringUpper =  stringUpper.toLowerCase();
        System.out.println("StringUpper :" + stringUpper);

        System.out.println(" ========= \n");

        String str1 = "one";
        String str2  = " ";
        String str3 = "hello";

        //Различные варианты конкатенации - склеивания и объединения строк

        String concatStr = str1 + str2 +  str3;
        System.out.println("concatStr : " +  concatStr);

        //Конткатенация и  мат. операция сложения
        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println("concatStr2 " + concatStr2);

        //цепочка методов
        String concatStr3 = str1.concat(str2).concat(str3).concat( "!!!");
        System.out.println("concatStr3  :" + concatStr3);

        // Конкатенация 3
        // "One" , "hello", "java" -> "One hello  java"

        String concatStr4 = str1 + "" + str3 + " " + "java";

        System.out.println("concatStr4" + concatStr4);
        concatStr4 = String.join(" ---", str1, str3,  "java");
        System.out.println("concatStr4 :" + concatStr4);

        String digits  = "0123456789qwerty";
        System.out.println("digits.length(): " + digits.length());

        char firstChar = digits.charAt(0);
        System.out.println(firstChar);

        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println(lastChar);

        //Выделение подстроки

        String subString = digits.substring(2);
        System.out.println("subString " + subString);

        String subString2 =  digits.substring(2,7); // Взять символы со 2 (вклюбчительно)  по 7 (не включительно).[2:7)
        System.out.println("subString2 " + subString2);




    }
}
