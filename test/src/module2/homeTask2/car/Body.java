package module2.homeTask2.car;

public class Body {
    private int size;
    private String typeBody;

    public Body(int size, String typeBody) {
        this.size = size;
        this.typeBody = typeBody;
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return "Body{" +
                "typeBody " + typeBody + '\'' +
                ", size " + size +
                '}';
    }

    public String getTypeBody() {
        return typeBody;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }
}
