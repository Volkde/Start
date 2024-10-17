package homework_26;

public class MagicArrayGen {
    private Integer[] array;
    private int cursor;

    public MagicArrayGen() {
        array = new Integer[10];
    }

    public MagicArrayGen(Integer[] array) {
        if (array == null || array.length == 0) {
            this.array = new Integer[10];
        } else {
            this.array = new Integer[array.length * 2];
            add(array);
        }
    }

    public void add(Integer value) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    public void add(Integer... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    private void expandArray() {
        Integer[] newArray = new Integer[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]");
        }

        return result;
    }

    public int size() {
        return cursor;
    }

    public Integer get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;
    }

    public Integer remove(int index) {
        if (index >= 0 && index < cursor) {
            Integer value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        } else {
            return null;
        }
    }

    public int indexOf(Integer value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Integer value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeByValue(Integer value) {
        int index = indexOf(value);
        if (index == -1) return false;

        remove(index);
        return true;
    }
}
