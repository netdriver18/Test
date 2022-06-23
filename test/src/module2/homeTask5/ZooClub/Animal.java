package module2.homeTask5.ZooClub;

import java.util.Objects;

public class Animal {
    private String nameAnimal;


    @Override
    public String toString() {
        return "Animal{" +
                "nameAnimal='" + nameAnimal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nameAnimal, animal.nameAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAnimal);
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;

    }
}
