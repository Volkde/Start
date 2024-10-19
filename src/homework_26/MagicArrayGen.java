package homework_26;

public class MagicArrayGen {
    private Integer[] array; // Массив, который хранит элементы типа Integer
    private int cursor; // Указывает на текущую позицию для добавления элемента

    // Конструктор по умолчанию создает массив на 10 элементов
    public MagicArrayGen() {
        array = new Integer[10];
    }

    // Конструктор, который принимает массив и удваивает его размер
    public MagicArrayGen(Integer[] array) {
        if (array == null || array.length == 0) {
            this.array = new Integer[10]; // Если массив пустой или null, создается новый массив на 10 элементов
        } else {
            this.array = new Integer[array.length * 2]; // Удваиваем размер переданного массива
            add(array); // Добавляем элементы переданного массива
        }
    }

    // Метод добавления одного элемента в массив
    public void add(Integer value) {
        // Если массив заполнен, его нужно расширить
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor] = value; // Добавляем элемент в массив
        cursor++; // Увеличиваем указатель курсора
    }

    // Метод добавления нескольких элементов
    public void add(Integer... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]); // Для каждого элемента вызываем метод add
        }
    }

    // Метод для расширения массива, когда он заполнен
    private void expandArray() {
        Integer[] newArray = new Integer[array.length * 2]; // Создаем новый массив, в два раза больше
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Копируем элементы из старого массива в новый
        }
        array = newArray; // Меняем ссылку на новый массив
    }

    // Возвращает строковое представление массива
    public String toString() {
        if (cursor == 0) return "[]"; // Если массив пустой, возвращаем пустые скобки

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); // Собираем строку с элементами массива
        }

        return result; // Возвращаем строку с элементами массива
    }

    // Возвращает количество элементов в массиве
    public int size() {
        return cursor;
    }

    // Возвращает элемент по индексу
    public Integer get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index]; // Возвращаем элемент, если индекс корректный
        }
        return null; // Возвращаем null, если индекс некорректный
    }

    // Удаляет элемент по индексу и возвращает удаленное значение
    public Integer remove(int index) {
        if (index >= 0 && index < cursor) {
            Integer value = array[index]; // Сохраняем значение удаляемого элемента
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1]; // Сдвигаем элементы влево
            }
            cursor--; // Уменьшаем курсор, так как количество элементов уменьшилось
            return value; // Возвращаем удаленное значение
        } else {
            return null; // Возвращаем null, если индекс некорректный
        }
    }

    // Возвращает индекс первого вхождения значения в массиве
    public int indexOf(Integer value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) { // Ищем элемент в массиве
                return i; // Возвращаем индекс первого вхождения
            }
        }
        return -1; // Возвращаем -1, если элемент не найден
    }

    // Возвращает индекс последнего вхождения значения в массиве
    public int lastIndexOf(Integer value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) { // Ищем элемент с конца массива
                return i; // Возвращаем индекс последнего вхождения
            }
        }
        return -1; // Возвращаем -1, если элемент не найден
    }

    // Удаляет элемент по значению
    public boolean removeByValue(Integer value) {
        int index = indexOf(value); // Находим индекс элемента
        if (index == -1) return false; // Если элемент не найден, возвращаем false

        remove(index); // Удаляем элемент по индексу
        return true; // Возвращаем true после успешного удаления
    }
}
