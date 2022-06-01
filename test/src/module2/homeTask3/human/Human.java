package module2.homeTask3.human;

import org.jetbrains.annotations.NotNull;

public class Human {
    private int age;
    private String email, name;

    public void setEmail(@NotNull String email) throws IncorrectEmailException {

        if (!email.contains("@")) {
            throw new IncorrectEmailException("Email is incorrect!");
        } else this.email = email;

}


    public void setAge(int age) throws UnderAgeException {
        if (age<18) {
            throw new UnderAgeException("Age less than 18!");
        } else this.age = age;
    }
}


