package module2.homeTask6.Person;

import java.util.Date;
import java.util.Objects;

public class Person {
    private int age;
    private Date timeStamp;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", timeStamp=" + timeStamp +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(timeStamp, person.timeStamp) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, timeStamp, name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getName() {
        return name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
