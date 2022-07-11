package module3.homeTask2_RegEx;

import module2.homeTask4.lists.Persons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        AllUsersTextBeginningA();
        ValidateMail();
        ChangeString();

    }

    private static void ValidateMail() {
        ArrayList<String> stringsMas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();

        Pattern pattern = Pattern.compile("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        Matcher matcher = pattern.matcher(userText);
        while (matcher.find()) {
            stringsMas.add(matcher.group());
        }
        System.out.println(stringsMas);
    }

    private static void AllUsersTextBeginningA() {
        ArrayList<String> stringsMas = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader((new File("D:\\backup\\Java\\2\\123.txt"))));
            scanner.useDelimiter("\\W");
            while (scanner.hasNextLine()) {
                String userText = scanner.nextLine();
                Pattern pattern = Pattern.compile("^a");
                Matcher matcher = pattern.matcher(userText);
                while (matcher.find()) {
                    stringsMas.add(userText);
                }
            }
            System.out.println(stringsMas);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }
    }

    private static void ChangeString() {
        String str = "I love Java more than my friend. Java is so beautiful.";
        String strC = str.replaceFirst("Java", "C#");
        String newStr = str.replaceAll("Java", "C#");
        System.out.println(str);
        System.out.println(strC);
        System.out.println(newStr);
    }
}



