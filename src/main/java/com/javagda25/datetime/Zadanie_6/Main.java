package com.javagda25.datetime.Zadanie_6;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalTime dataStart = LocalTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę urodzenia w formacie: yyyy-MM-dd");
        String data = scanner.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataUrodzenia = LocalDate.parse(data, dateTimeFormatter);
        boolean kobieta;
        String plec;
        do {
            System.out.println("Kobieta, czy mężczyzna (k/m)");
            plec = scanner.nextLine();
            if (plec.equalsIgnoreCase("k")) {
                kobieta = true;
                break;
            } else if (plec.equalsIgnoreCase("M")) {
                kobieta = false;
                break;
            } else System.out.println("Zła płeć");
        }
        while (true);
        boolean palacz;
        String czyPali;
        do {
            System.out.println("Czy palisz papierosy? y/n");
            czyPali = scanner.nextLine();
            if (czyPali.equalsIgnoreCase("y")) {
                palacz = true;
                break;
            } else if (czyPali.equalsIgnoreCase("n")) {
                palacz = false;
                break;
            } else System.out.println("Zła odpowiedź");
        }
        while (true);
        boolean stres;
        String czyZestres;
        do {
            System.out.println("Czy żyjesz w stresie? y/n");
            czyZestres = scanner.nextLine();
            if (czyZestres.equalsIgnoreCase("y")) {
                stres = true;
                break;
            } else if (czyZestres.equalsIgnoreCase("n")) {
                stres = false;
                break;
            } else System.out.println("Zła odpowiedź");
        } while (true);
        Random random = new Random();
        int wiekDomyslny = random.nextInt(460) + 740;
        if (stres) {
            int losowaLiczba = random.nextInt(100);
            if (losowaLiczba < 10) {
                wiekDomyslny = 720;
            }
        }
        if (palacz) {
            wiekDomyslny -= random.nextInt(63)+50;
        }
        if (!kobieta) {
            wiekDomyslny -= random.nextInt(100)+20;
        }
        LocalDate dataSmierci = dataUrodzenia.plusMonths(wiekDomyslny);
        System.out.println("Czas twojej śmierci" + dataSmierci);
        LocalTime dataKoniec = LocalTime.now();
        Duration duration = Duration.between(dataStart,dataKoniec);
        System.out.println("Na sprawdzeniu czasu swojej smierci zużyłeś "+duration.getSeconds()+" sekund!");
    }
}