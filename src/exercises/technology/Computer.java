package exercises.technology;

public class Computer extends AbstractEntity{

    private String operatingSystem;
    private boolean updated = false;
    private boolean defragmented = false;

    public Computer (String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Computer() {

    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isUpdated() {
        return updated;
    }

    public void setUpdated(boolean updated) {
        this.updated = updated;
    }

    public boolean isDefragmented() {
        return defragmented;
    }

    public void setDefragmented(boolean defragmented) {
        this.defragmented = defragmented;
    }

    public void update() {
        updated = true;
    }

    public void defrag() {
        defragmented = true;
    }
}
