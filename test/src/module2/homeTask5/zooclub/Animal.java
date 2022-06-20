package module2.homeTask5.zooclub;

import java.util.Objects;

public class Animal {
    private String nameAnimal;
    private int ageAnimal;

    @Override
    public String toString() {
        return "Animal{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", ageAnimal=" + ageAnimal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return ageAnimal == animal.ageAnimal && Objects.equals(nameAnimal, animal.nameAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAnimal, ageAnimal);
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;

    }
}
