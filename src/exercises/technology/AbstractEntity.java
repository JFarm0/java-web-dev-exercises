package exercises.technology;

public abstract class AbstractEntity {
    private static int nextIdNumber = 1;
    private int idNumber;

    public AbstractEntity() {
        this.idNumber = nextIdNumber;
        nextIdNumber++;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
