package pl.kamilbak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        MotorcycleRally motoRally = new MotorcycleRally();

        while(keepGoing)
        {
        System.out.println("-------------------------------------------------------");
        System.out.println("            Zjazd Motocyklowy - MENU");
        System.out.println("");
        System.out.println("Wybierz z Opcji:");
        System.out.println("1. Wyświetl motocykle biorące udział w zjeździe");
        System.out.println("2. Dodaj motocykl do zjazdu");
        System.out.println("3. Wyświetl konkurencje jakie wybierano wcześniej");
        System.out.println("4. Wyświetl włścicieli biorących udział w zjeździe");
        System.out.println("5. Znajdź motocykliste po numerze rejestracyjnym");
        System.out.println("6. Wyjdź z aplikacji");
        System.out.println("-------------------------------------------------------");

        int userChoice = scanner.nextInt();

        switch (userChoice){
            case 1 -> motoRally.displayMotorcycle();
            case 2 -> motoRally.addMotorcycle();
            case 3 -> motoRally.displayCompetitions();
            case 4 -> motoRally.displayOwner();
            case 5 -> motoRally.displayMotodcycleByPlate();
            case 6 -> keepGoing = false;
        }

        }
    }
}
