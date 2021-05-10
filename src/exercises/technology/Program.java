package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Computer desktop = new Computer("Windows 10");
        Laptop nitro = new Laptop("Windows 10", false);
        SmartPhone iPhone = new SmartPhone("iOS", false);

        System.out.println("Desktop ID#: " + desktop.getIdNumber());
        System.out.println("Nitro ID#: " + nitro.getIdNumber());
        System.out.println("iPhone ID#: " + iPhone.getIdNumber());

//        AbstractEntity one = new AbstractEntity();
//        AbstractEntity two = new AbstractEntity();
//        AbstractEntity three = new AbstractEntity();
//        System.out.println(one.getIdNumber());
//        System.out.println(two.getIdNumber());
//        System.out.println(three.getIdNumber());

//        System.out.println("DESKTOP");
//        System.out.println("OS: " + desktop.getOperatingSystem());
//        System.out.println("updated? " + desktop.isUpdated());
//        desktop.update();
//        System.out.println("updated? " + desktop.isUpdated());
//        System.out.println("defragmented? " + desktop.isDefragmented());
//        desktop.defrag();
//        System.out.println("defragmented? " + desktop.isDefragmented());
//        System.out.println("\n##########\n");
//        System.out.println("NITRO");
//        System.out.println("OS: " + nitro.getOperatingSystem());
//        System.out.println("updated? " + nitro.isUpdated());
//        nitro.update();
//        System.out.println("updated? " + nitro.isUpdated());
//        System.out.println("defragmented? " + nitro.isDefragmented());
//        nitro.defrag();
//        System.out.println("defragmented? " + nitro.isDefragmented());
//        System.out.println("charged? " + nitro.isCharged());
//        nitro.plugIn();
//        System.out.println("charged? " + nitro.isCharged());
    }
}
