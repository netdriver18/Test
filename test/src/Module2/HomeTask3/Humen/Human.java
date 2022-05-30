package Module2.HomeTask3.Humen;

public class Human {
    private int age;
    private String email, name;

    public void setEmail(String email) throws IncorrectEmailException {

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


