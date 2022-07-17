package module3.homeTask3_Reflection;

import java.util.Objects;

public class Animal {
    private int size;
    public String type;

    public Animal() {
    }

    public Animal(int size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return size == animal.size && Objects.equals(type, animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, type);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

}
