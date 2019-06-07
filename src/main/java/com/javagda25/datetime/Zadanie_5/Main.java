package com.javagda25.datetime.Zadanie_5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aplikacaj która oblicza ile mineło od kiedy sie urodziłeś");
        System.out.println("Podaj date (yyyy-MM-dd HH:mm):");
        String data = scanner.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        try {
            LocalDateTime localDateTime1 = LocalDateTime.parse(data, dateTimeFormatter);
            LocalDateTime localDateTime2 = LocalDateTime.now();
            Period period = Period.between(localDateTime1.toLocalDate(), localDateTime2.toLocalDate());
            Duration duration = Duration.between(localDateTime1, localDateTime2);
            System.out.println("Wiek w latach: "+period.getYears());
            System.out.println("Wiek w sekundach: "+duration.getSeconds());
        } catch (DateTimeParseException dtpe) {
            System.out.println("Zły format daty");
        }
    }
}
