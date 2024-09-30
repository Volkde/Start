package lesson_06;

import java.util.Random;

public class booleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1  = false;

        int x = 10;
        int y = 5;

        boolean b1 = x ==y; //сравнение "=="
        System.out.println( x + "==" + y +  "-> " + b1);

        //не равенство "!="

        b1 = x !=  y;  // 10 != 5 ->  true
        System.out.println( x + "!=" + y +  "-> " + b1);

        //Больше ">"  X большечем Y

        b1 =  x >  y;  //  10 > 5  -> true
        System.out.println( x + ">" + y +  "-> " + b1);

        y = 10;
        b1 = x > y; // 10  больше 10 -> false
        System.out.println( x + ">" + y +  "-> " + b1);


        //Больше  или рпавно ">="
        b1 = x  >= y; // Больше  или равно 10 -> true
        System.out.println();
        System.out.println( x + ">=" + y +  "-> " + b1);

        x = 7;
        // Меньше "<"

        b1 = x  < y; //7  меньше, чем 10
        System.out.println( x + "<" + y +  "-> " + b1);

        //Меньше или равно "<"
        b1 =  x <= y; // 7 меньше или равно 10 -> true
        System.out.println( x + "<=" + y +  "-> " + b1);

        String str = "Java is the best";
        boolean contains =str.contains("Java");
        System.out.println("str.contains(\"Java\")" + contains );

        // Логическое  НЕ (отрицание) "!"
        // Меняет  лоргическое знание булеан на противопорложение
        boolean b2;
        b2 = !false; //Получим значние true
        System.out.println( "!false " + b2);

        b2 = !(4 ==5); // !false -> true

        b2 =  !(4 == 5);
        System.out.println(" !(4 ==5)" + b2);

        //Составные  сранвения - два условия &
        //логическое И  используется когда нужно что  были истинные
        //Если хотя  бы в одной части будет false -> в результате будет false
        b2 = true & true;
        System.out.println("true & true" + b2);

        b2 = (2 <  5)  & (11 ==10); // true &  false -> false
        System.out.println("(2 <  5)  & (11 ==10) ->"   + b2);

        //  Логическое ИЛИ "|"
        //  Когда достаточно, хотя бы ОДНО условие было Истинно

        boolean b4 = true | false;
        System.out.println("true | false  " +  b4);
        System.out.println("true | false  " +  (false | false));

        //Введите или четное число или число, которое делится на 5 без остатка.
        // четное  число - число, которое делится  без остатка на 2.

        //Генерация случаного  числа

        Random random =  new Random();

        //В диапозоне от 0  до  X
        int rand = random.nextInt(100); // (0...x-1) ->  (0..99) включительно

        System.out.println("rand: " + rand);
        boolean isEven  = rand % 2 ==  0;

        System.out.println("isEven:" + isEven);

        boolean isGoodNumber =  (rand % 2 ==0)  | (rand % 5 ==0);
        System.out.println("isGoodNumber:  "   + isGoodNumber);

        //Логическое иключающее  или (XOR)  "^"
        //Возвращает true если 2 части выражения разные

        boolean b5  = true ^ false;
        System.out.println("true ^ false: " + b5);

        System.out.println("============================ \n");

        //Логическое скоращенное И "&&"
        //Выдает true только если обе части выраденеия равны true

        boolean b6 = true  && false;
        System.out.println("true  && false  " +  b6);

        b6 = (2 > 5) && (11 == 11);
        System.out.println("(2 > 5) && (11 == 11)  :" + b6);

        //Логическое сокращенное ИЛИ "||'
        //Выдает true если хотя бы одна  часть выраждения равна true
        int a = 10;
        int b = 0;
        boolean b8 = true || (a  / b > 2);
        System.out.println("b8 :"  + b8);

        System.out.println("  ======== Приоритет логичесикх операций");



    }
}
