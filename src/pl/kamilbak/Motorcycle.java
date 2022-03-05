package pl.kamilbak;

public class Motorcycle {
    private String ownerName;
    private String motoModel;
    private String plate;
    private String competition;
    private boolean hasMoreMotorcycles;

    public String getOwnerName() {
        return ownerName;
    }

    public String getMotoModel() {
        return motoModel;
    }

    public Motorcycle(String ownerName, String motoModel, String plate, String competition, boolean hasMoreMotorcycles)
    {
        this.ownerName = ownerName;
        this.motoModel = motoModel;
        this.plate = plate;
        this.competition = competition;
        this.hasMoreMotorcycles = hasMoreMotorcycles;
    }

    public void displayMotorcycleInformations()
    {
        System.out.println("Imię i nazwisko właściciela: " + ownerName);
        System.out.println("Model motocykla: "+ motoModel);
        System.out.println("Numer rejestracyjny: " +plate);
        System.out.println("Konkurencja: " + competition);
        String hasMMotoString = hasMoreMotorcycles?"Tak" : "Nie"; //Jeżeli zmienna bool = true to do zmiennej String przypisze sie "Tak, w przeciwnym razie "Nie"
        System.out.println("Właściciel ma więcej niż jeden motocykl?: " + hasMMotoString);
        System.out.println(" ");

    }




}
