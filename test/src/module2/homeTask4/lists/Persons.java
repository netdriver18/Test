package module2.homeTask4.lists;


import java.util.Comparator;

public class Persons implements Comparable<Persons> {
    private Integer age;
    private String name;

    public Persons(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo(Persons persons) {
        int rez = this.name.compareTo(persons.name);
        if (rez == 0) {
            rez = this.age.compareTo(persons.age);
        }
        return rez;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

