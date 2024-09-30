package homework03;

public class HomeWork03 {

    public static void main(String[] args) {

        int year = 38; // Объявление и инициализация переменной типа int с возрастом

        double milkPrice = 1.11; // Объявление и инициализация переменной типа double с ценой молока

        String myName = "Ilya"; // Объявление и инициализация переменной типа String с именем

        System.out.println("My Age: " + year + "Milk Price :" + milkPrice + "My Name: " + myName );

        int var1 = 0; //Обявляю переменные типа int
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;

        int varResult = (var1 + var2 + var3 + var4 ) / 4; //Объявляю переменную для записи сложения и вычитания
        int varResult2 = (var1 + var2 + var3 + var4 ) % 4;
        System.out.println("Задание 2. Результат сложения и деления: " + varResult + " " + "Отбросила: " + varResult2);

        double itemPrice1 = 1000; //Объявляю стоимость товара
        double itemPrice2 = 500; //Объявляю стоимость товара 2
        double sum = itemPrice1 + itemPrice2; //Объявляю переменную с суммой сложения цены товаров

        double sale = 0.1; // Обяъвляю и указываю размер скидки
        double sum_sale = sum * (1 - sale); // Обяъвляю и считаю размер цены со скидкой

        System.out.println("Сумма покупки со скидкой составляет " + sum_sale + " Euro"); // вывожу в командную строку сумму и рахмер скидки
        System.out.println("Размер скидки составляет " + (sale * 100) + " процентов");





        int monday = 24;
        int tuesday = 22;
        int wednesday = 19;
        int thursday = 18;
        int friday = 17;
        int saturday = 16;
        int sunday = 20;


        int sum1 = monday + tuesday + wednesday + thursday + friday + saturday + sunday; //Задаю переменную и суммирую температуру

        int days = 7; //Задаю переменную и количестов дней в неделю

        // Шаг 4: Вычисляем среднюю температуру, делим сумму на количество дней.
        double averageTemperature = (double) sum1 / days;

        // Шаг 5: Показываем результат на экране.
        System.out.println("Средняя температура за неделю: " + averageTemperature);


    }
}
