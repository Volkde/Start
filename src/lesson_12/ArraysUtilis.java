package lesson_12;

public class ArraysUtilis {

    public static void main(String[] args) {

    }

    public static  int linearSearch(int[] array, int  searchValue)  {
        for (int i = 0;  i < array.length;  i++)  {
            if (array[i]  == searchValue) {
                return 1;
            }
        }
        return -1;
    }


    public static int minIndex(int[] array)  {
        int min = array[0];
        int minIndex = 0;
        for  (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min =  array[i];
                minIndex = i;
            }

        }
        return minIndex;
    }


    public static int minIndex(int[] array, int startIndex)  {
        int min = array[startIndex];
        int minIndex = startIndex;
        for  (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min =  array[i];
                minIndex = i;
            }

        }
        return minIndex;
    }

        public  static  void  sortSelection(int[]  array) {

        for (int i = 0; i < array.length; i++) {

            int localMin = minIndex(array,  i);

            int temp = array[i];
            array[i]  = array[localMin];
            array[localMin] = temp;
            }
        }

        //Бинарный поиск  значения в массиве

    public static int binarySearch(int[]  array, int searchValue) {
        int startIndex = 0; //0
        int endIndex = array.length - 1; //12
        int middleIndex;

        int counter = 0;

        // Проверка, что  часть массива  можно  разделить по полам

        while (startIndex <= endIndex) { // 1. 0 <=  12

            counter++;
            //вычеслить средний индекс
            middleIndex = startIndex +  (endIndex - startIndex) / 2;

            if  (array[middleIndex]  == searchValue) {
                System.out.println("Найдена за " + counter  +  " шагов");
                return middleIndex;
            }


            //Если значения не равны - определеям какую половину массива мы отбросили
            if (array[middleIndex] > searchValue) {
                endIndex  = middleIndex -  1;
            } else  {
                startIndex = middleIndex +1;
            }

        }
        // Если цикл while законечен ( не  осталось частей массива, которые  можно поделить по полам)
        // значит искомое значение в массиве отсуствует

        System.out.println("Значение не найдено! Шагов сделано :"  + counter);
        return  -1;

    }

}











