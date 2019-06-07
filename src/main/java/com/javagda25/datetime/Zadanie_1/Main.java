package com.javagda25.datetime.Zadanie_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String komenda;
        do {
            System.out.println("What You need?\nDate.\nTime.\nDateTime.\n");
            komenda = scanner.nextLine();
            if (komenda.equalsIgnoreCase("Date")) {
                System.out.println("Obecna data to "+data.getYear()+"-"+data.getMonth()+"-"+data.getDayOfYear());
            }else if(komenda.equalsIgnoreCase("Time")){
                System.out.println("Obecny czas to "+data.getHour()+"-"+data.getMinute());
            }else if(komenda.equalsIgnoreCase("DateTime")){
              String wynik = dateTimeFormatter.format(data);
                System.out.println(wynik);
            }else System.err.println("Zła komenda!");
            System.out.println();


        } while (!komenda.equalsIgnoreCase("quit"));
    }
}
