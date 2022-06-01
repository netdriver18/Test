package module2.homeTask2.car;

public class Wheel {
    private int size;
    private String type;

    public Wheel(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return "wheel{" +
                "size " + size + '\'' +
                ", type " + type +
                '}';
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    public void setType() {
        this.type = type;
    }

    public void newSizeWheel(int factor) {
        size *= factor;

    }
}

