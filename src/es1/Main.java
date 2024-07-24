package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la base del primo rettangolo");
        double b1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci l'altezza del primo rettangolo");
        double h1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Inserisci la base del secondo rettangolo");
        double b2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci l'altezza del secondo rettangolo");
        double h2 = Double.parseDouble(scanner.nextLine());

        rettangolo rett1 = new rettangolo(b1, h1);
        rettangolo rett2 = new rettangolo(b2, h2);

        System.out.println("Primo rettangolo:");
        rettangolo.stampaRettangolo(rett1);
        System.out.println("Secondo: rettangolo:");
        rettangolo.stampaRettangolo(rett2);

        rettangolo.stampaDueRettangoli(rett1, rett2);
    }
}
