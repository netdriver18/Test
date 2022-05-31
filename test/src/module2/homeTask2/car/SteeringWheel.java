package module2.homeTask2.car;

public class SteeringWheel {
    private int takeaway;
    private String form;

    public SteeringWheel(int takeaway, String form) {
        this.takeaway = takeaway;
        this.form = form;
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return "steering wheel{" +
                "takeaway " + takeaway + '\'' +
                ", form " + form +
                '}';
    }

    public int getTakeaway() {
        return takeaway;
    }

    public String getForm() {
        return form;
    }

    public void setTakeaway() {
        this.form = form;
    }

    public void setForm() {
        this.takeaway = takeaway;
    }
}
