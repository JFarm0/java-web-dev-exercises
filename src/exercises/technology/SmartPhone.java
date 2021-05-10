package exercises.technology;

public class SmartPhone extends Computer {

    private boolean hasCase = false;

    public SmartPhone(String operatingSystem, boolean hasCase) {
        super(operatingSystem);
        this.hasCase = hasCase;
    }

    public boolean isHasCase() {
        return hasCase;
    }

    public void setHasCase(boolean hasCase) {
        this.hasCase = hasCase;
    }

    public void addCase() {
        hasCase = true;
    }
}
