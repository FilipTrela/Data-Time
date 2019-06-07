package com.javagda25.datetime.Zadanie_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj Komende");
        Scanner scanner = new Scanner(System.in);
        String komenda = scanner.nextLine();
        String[] coRobic = komenda.split("\\s+");
        if (coRobic[0].equalsIgnoreCase("nowy")) {
            Customer customer = new Customer(Integer.parseInt(coRobic[2]), Boolean.parseBoolean(coRobic[3]), coRobic[1]);
        }
    }
}
