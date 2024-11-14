package Homework_46;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {


        List<LocalDate> dates = List.of(
                LocalDate.of(2002, 1, 1),
                LocalDate.of(2012, 5, 20),
                LocalDate.of(2023, 3, 15)
        );

        long daysBetween = getDaysBetweenEarliestAndLatest(dates);
        System.out.println("Кол-во дней между самой ранней и самой поздней датами: " + daysBetween);
    }

    public static long getDaysBetweenEarliestAndLatest(List<LocalDate> dates) {

        LocalDate earliest = dates.stream().min(LocalDate::compareTo).orElseThrow();
        LocalDate latest = dates.stream().max(LocalDate::compareTo).orElseThrow();
        return ChronoUnit.DAYS.between(earliest, latest);

    }
}

