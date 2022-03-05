package pl.kamilbak;

import java.util.*;

public class MotorcycleRally {
    private List<Motorcycle> motorcycleList = new ArrayList<>(); // Lista zawierajaca matocykle
    private Set<String> ownerSet = new HashSet<>(); // Zbior zawierajacy wlasciceli ( zbior, bo nie ma powtorzen)
    private Set<String> competitions = new HashSet<>(); // Zbiór zawierający wszystkie konkurencje
    private Map<String,Motorcycle> plateToMomotorcycle = new HashMap<>(); // Mapa do wyseitlania informacji o motycklu(wartosc) na podstawei tablic rejestracyjnych (klucz)

    Scanner scanner = new Scanner(System.in);

    public void addMotorcycle()
    {
        //Pobranie danych dodawanego motocykla
        System.out.println("Podaj imie i nazwisko motocyklisty");
        String ownerName = scanner.nextLine();

        System.out.println("Podaj model motocykla");
        String motoModel = scanner.nextLine();

        System.out.println("Podaj numer rejestracyjny motocykla");
        String plate = scanner.nextLine();

        System.out.println("Podaj konkurencje w jakiej chcesz wystawić motocykl");
        String competition = scanner.nextLine();

        System.out.println("Masz wiecej niz jeden motocykl? (Tak/Nie)");
        String hasMoreMotorcyclesString = scanner.nextLine();

        boolean hasMoreMotorcycles;
        if (hasMoreMotorcyclesString.equals("Tak"))
        {
            hasMoreMotorcycles = true;
        }
        else
        {
            hasMoreMotorcycles = false;
        }

        //utworzenie obiektu motocykl z pobranymi wartosciami
        Motorcycle motorcycle1 = new Motorcycle(ownerName, motoModel, plate,competition, hasMoreMotorcycles);

        //dodanie informacji do listy, zbioru i mapy
        motorcycleList.add(motorcycle1); // motocykle
        ownerSet.add(ownerName); // wlasciciele
        competitions.add(competition); //konkurencje
        plateToMomotorcycle.put(plate,motorcycle1); // numer rejestracyjny i obiekt motocykl

    }

    public void displayMotorcycle()
    {
        System.out.println("");
        for (Motorcycle moto: motorcycleList) {
            moto.displayMotorcycleInformations();
        }
        System.out.println("");
    }

    public void displayCompetitions()
    {
        for (String comp: competitions) {
            System.out.println("");
            System.out.println(comp);
        }
    }

    public void displayOwner()
    {
        for (String own: ownerSet) {
            System.out.println("");
            System.out.println(own);
        }
    }

    public void displayMotodcycleByPlate()
    {
        System.out.println("Podaj numer rejestracyjny");
        String plateNumber = scanner.nextLine(); //Pobranie numeru rejestracyjnego
        Motorcycle moto = plateToMomotorcycle.get(plateNumber); // użycie mapy do zwrócenia obiektu typu Motorcycle, po podaniu klucza (nr rejestracyjnego)
        System.out.println("");
        moto.displayMotorcycleInformations();


    }

}
