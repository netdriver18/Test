package module2.homeTask2.car;

public class Car {
    private String type;
    private String enginesType;

    public Car(String type, String enginesType) {
        this.type = type;
        this.enginesType = enginesType;
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return "Car{" +
                "type " + type + '\'' +
                ", enginesType " + enginesType +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getEnginesType() {
        return enginesType;
    }

    public void setType() {
        this.type = type;
    }

    public void setEnginesType(String enginesType) {
        this.enginesType = enginesType;
    }

    public void setNewType() {
        this.type = "Universal";

    }

    public void setTypeEnines() {
        this.enginesType = "Petrol";
    }

    public void newEngine() {
        this.enginesType = "Diesel";

    }

}
