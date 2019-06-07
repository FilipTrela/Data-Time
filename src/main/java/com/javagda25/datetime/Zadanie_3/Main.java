package com.javagda25.datetime.Zadanie_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate1 = LocalDate.now();
        System.out.println("Witaj w aplikacji która obliczy ile czasu mineło od teraz");
        System.out.println("Podaj rok");
        int rok = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj miesiąc");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj dzien");
        int day = Integer.parseInt(scanner.nextLine());
        LocalDate localDate2 = LocalDate.of(rok,month,day);
        Period okres = Period.between(localDate1,localDate2);
        System.out.println("Minelo: " + okres.getDays() + " " + okres.getMonths() + " " + okres.getYears());

    }


}
