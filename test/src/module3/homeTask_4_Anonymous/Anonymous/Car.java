package module3.homeTask_4_Anonymous.Anonymous;

public class Car {
    private final String typeEngene;

    public Car(String type) {
        this.typeEngene = type;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Car : "+ typeEngene;
    }

    public String getTypeEngene() {
        return typeEngene;
    }
}
