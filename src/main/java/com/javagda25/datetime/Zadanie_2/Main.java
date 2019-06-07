package com.javagda25.datetime.Zadanie_2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate dateZa10 = date.plusDays(10);
        LocalDate datePrzed10 = date.minusDays(10);
        System.out.println(datePrzed10);
        System.out.println(dateZa10);

    }
}
