package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Computer desktop = new Computer("Windows 10");
        Laptop nitro = new Laptop("Windows 10", false);
        SmartPhone iPhone = new SmartPhone("iOS", false);

        System.out.println("Desktop ID#: " + desktop.getIdNumber());
        System.out.println("Nitro ID#: " + nitro.getIdNumber());
        System.out.println("iPhone ID#: " + iPhone.getIdNumber());
    }
}
