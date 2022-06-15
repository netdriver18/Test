package module2.homeTask7.Stream2;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects ;

public class People  {
    private String name;
    private Integer age;
    private String sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name) && Objects.equals(sex, people.sex);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}
