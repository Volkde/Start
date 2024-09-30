package lesson_10;

import java.util.Random;

public class forLoopExampel {
    //блок   инициализации, блок проверок - условие входа, блок изменений
    public static void main(String[] args) {

        int  j = 0;
        while (j <= 10) {
            System.out.println(j + ", ");
            j++;

        }

        System.out.println("End for loop" + j);
        for (int i = 0; i <= 10;  i++) {
            System.out.println(i + ", ");
        }

        System.out.println("End for loop");

        int i1 =  5;
        for (i1 = 0; i1  <=  10; i1++) {
            System.out.println(i1 + ",  ");

        }
        Random random =  new Random();
        int[]  ints = new  int[random.nextInt(11) + 5];
        System.out.println("long massive  " + ints.length);

        System.out.println("[");

        for (int i = 0; i < ints.length; i++) {
            ints[i]  = random.nextInt(101) -  50; // (0..100) - -> 50 ->  (-50..50)
            System.out.print(ints[i] + (i < ints.length -  1 ? ", " : "] \n"));

        }

        for  (int i =  1;  i < 7; i++) {

            if (i == 5) continue; // continue - переход к следуюбщий итерации цикла
            //Мы перейдем в блоок изменения переменных, потом в блок  проверки условия
            //В текущий итерации  после continue  все операторы в теле  цикла будут пропущены

            System.out.println(i + ", ");
        }

        for (int i = 1; i < 7; i++) {

            if (i == 3) break;  //  заканчивает текущую итерацию цикла и весь цикл
            //Все последующие итерации выполнены не будут
            System.out.print(i + "; ");

        }

        System.out.println("\n End loop with break");

            int y  =  1;
            while (y  < 7) {
                if  (y == 3) {
                    ;
                    y++;
                    continue;
                }
            }
        System.out.println(y + ",  ");
        System.out.println("\n End loop with continue");


    }




}
