package com.javagda25.datetime.Zadanie_4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aplikacaj która oblicza okres miedzy dwoma datami");
        System.out.println("Podaj date 1(yyyy-MM-dd):");
        String data1 = scanner.nextLine();
        System.out.println("Podaj date 2(yyyy-MM-dd):");
        String data2 = scanner.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate localDate1 = LocalDate.parse(data1, dateTimeFormatter);
            LocalDate localDate2 = LocalDate.parse(data2, dateTimeFormatter);
            Period period = Period.between(localDate1, localDate2);
            System.out.println("Minelo: " + period.getDays() + " " + period.getMonths() + " " + period.getYears());
        } catch (DateTimeParseException dtpe) {
            System.out.println("Zły format daty");
        }


    }
}
