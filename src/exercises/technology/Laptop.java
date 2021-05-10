package exercises.technology;

public class Laptop extends Computer {

    private boolean charged = false;

    public Laptop(String operatingSystem, boolean charged) {
        super(operatingSystem);
        this.charged = charged;
    }

    public void plugIn() {
        charged = true;
    }

    public boolean isCharged() {
        return charged;
    }

    public void setCharged(boolean charged) {
        this.charged = charged;
    }
}
