package lesson_26.methods;

public class Util {

    public static <T> String printArray(T[] array) {
        if(array == null || array.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append((i < array.length - 1) ? ", " : "] ");
        }

        return sb.toString();
    }


    public static <T> void swap (T[] array, int idx1, int idx2) {

        T temp = array[idx1];
        array[idx1] =array[idx2];
        array[idx2] = temp;
    }


}
