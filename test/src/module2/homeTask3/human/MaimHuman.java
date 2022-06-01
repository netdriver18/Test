package module2.homeTask3.human;

import java.util.Scanner;

public class MaimHuman {

    public static void main(String[] args) throws IncorrectEmailException, UnderAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input email :");
        String email = sc.nextLine();
        Human human = new Human();

        try {
            human.setEmail(email);
        } catch (IncorrectEmailException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Input the age :");
        int age = sc.nextInt();

        try {
            human.setAge(age);
        } catch (UnderAgeException exception) {
            System.err.println(exception.getMessage());;
        }

    }


}


