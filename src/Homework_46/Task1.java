package Homework_46;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

//Task 1
//Получить и вывести на экран:
//текущую дату
//        текущий год, месяц и день
//        Создать дату, например Ваш день рождения и вывести на экран
//Создать две даты и проверить на равенство
//Получить и вывести на экран:
//текущее время
//текущее время + 3 часа
//Создать дату:
//которая на неделю позже сегодняшней
//которая была на год раньше сегодняшней используя метод minus
//которая на год позже сегодняшней
//tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
//
public class Task1 {

    public static void main(String[] args) {

        //Получить и вывести на экран текущую дату
        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("now: " + date);
        System.out.println("год: " + date.getYear() + "; месяц: " + date.getMonth() + "; месяц-цифра: " + date.getMonthValue());


        // Создаем дату, например Ваш день рождения
        LocalDate date1 = LocalDate.of(2002, 2 , 15); // Установить дату (год, месяц, день)
        System.out.println("date1: " + date1);


        LocalDate date2 = LocalDate.of(2012, 2 , 15); // Установить дату (год, месяц, день)
        LocalDate date3 = LocalDate.of(2021, 4 , 10); // Установить дату (год, месяц, день)

        // equals - проверяет объекты даты и/или времени на равенство
        System.out.println("date4.equals(date5): " + date2.equals(date3));

        //текущее время + 3 часа
        LocalTime time = LocalTime.now();
        System.out.println("time.plusHours(1): " + time.plusHours(1)); // добавляем 1 час к объекту времени (получаем новый объект времени)

        //которая на неделю позже сегодняшней
        System.out.println("plusWeeks: " + date.plusWeeks(1));

        //которая была на год раньше сегодняшней используя метод minus
        System.out.println("date.minusYears(1): " + date.minusYears(1));

        // минус год
        System.out.println("date.minusYears(1): " + date.plusDays(1));

        // tomorrow и yesterday и проверерка находятся ли они до или после сегодняшней
        LocalDate tomorrow = date.plusDays(1);
        LocalDate yesterday = date.minusDays(1);

        System.out.println("Завтра после сегодняшней даты? " + tomorrow.isAfter(date));
        System.out.println("Вчера до сегодняшней даты? " + yesterday.isBefore(date));

    }

}
