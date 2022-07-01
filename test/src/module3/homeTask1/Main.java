package module3.homeTask1;


import module2.homeTask5.humen.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Enum enumS = new Enum();
        Scanner scanner = new Scanner(System.in);
        boolean ExitFlag = false;
        while (!ExitFlag) {
            System.out.println("1 - Check if there is such a month");
            System.out.println("2 - Display all months with the same season");
            System.out.println("3 - Display all months that have the same number of days");
            System.out.println("4 - Display all months with fewer days");
            System.out.println("5 - Display all months with more days on the screen");
            System.out.println("6 - Bring the next season to the screen");
            System.out.println("7 - Display the previous season");
            System.out.println("8 - Display all months with an even number of days");
            System.out.println("9 - Display all months with an odd number of days");
            System.out.println("10 - Display whether the month entered from the console has an even number of days");
            System.out.println("11 - Exit");
            String flag = scanner.next();
            if (flag.equals("1")) {
                System.out.println("Input the month: ");
                String monthInput = scanner.next();
                boolean isMonth;
                try {
                    for (Enum.MonthOfYear monthOfYear : Enum.MonthOfYear.values()) {
                        if (monthOfYear == Enum.MonthOfYear.valueOf(monthInput)) {
                            System.out.println("There is such a month!");
                            isMonth = true;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("There is not such a month!");
                }
            } else if (flag.equals("2")) {
                System.out.println("Input the seasons: ");
                String seasonsString = scanner.next();
                for (Enum.MonthOfYear monthOfYear : Enum.MonthOfYear.values()) {
                    if (monthOfYear.getSeasons().equals(seasonsString)) {
                        System.out.println(monthOfYear);
                    }
                }
            } else if (flag.equals("3")) {
                System.out.println("Input the number of days: ");
                Integer numberOfDay = scanner.nextInt();
                for (Enum.MonthOfYear monthOfYear : Enum.MonthOfYear.values()) {
                    if (monthOfYear.getDay() == numberOfDay) {
                        System.out.println(monthOfYear);
                    }
                }
            } else if (flag.equals("4")) {
                System.out.println("Input the number of days: ");
                Integer numberOfDay = scanner.nextInt();
                for (Enum.MonthOfYear monthOfYear : Enum.MonthOfYear.values()) {
                    if (monthOfYear.getDay() < numberOfDay) {
                        System.out.println(monthOfYear);
                    }
                }
            } else if (flag.equals("5")) {
                System.out.println("Input the number of days: ");
                Integer numberOfDay = scanner.nextInt();
                for (Enum.MonthOfYear monthOfYear : Enum.MonthOfYear.values()) {
                    if (monthOfYear.getDay() > numberOfDay) {
                        System.out.println(monthOfYear);
                    }
                }
            } else if (flag.equals("6")) {
                System.out.println("Input the seasons: ");
                String inputSeasons = scanner.next();
                Enum.Seasons[] enumSeasons = Enum.Seasons.values();
                int index = 0;
                for (Enum.Seasons elemSeasons : enumSeasons) {
                    if (elemSeasons.name().equals(inputSeasons)) {
                        index = elemSeasons.ordinal();
                        break;
                    }
                }
                System.out.println(enumSeasons[index + 1]);
            } else if (flag.equals("7")) {
                System.out.println("Input the seasons: ");
                String inputSeasons = scanner.next();
                ;
                Enum.Seasons[] enumSeasons = Enum.Seasons.values();
                int index = 0;
                for (Enum.Seasons elemSeasons : enumSeasons) {
                    if (elemSeasons.name().equals(inputSeasons)) {
                        index = elemSeasons.ordinal();
                        break;
                    }
                }
                if (index == 0) {
                    System.out.println(enumSeasons[3]);
                } else {
                    System.out.println(enumSeasons[index - 1]);
                }
            } else if (flag.equals("8")) {
                for (Enum.MonthOfYear monthOfYear : Enum.MonthOfYear.values()) {
                    if (monthOfYear.getDay() % 2 == 0) {
                        System.out.println(monthOfYear);
                    }
                }
            } else if (flag.equals("9")) {
                for (Enum.MonthOfYear monthOfYear : Enum.MonthOfYear.values()) {
                    if (!(monthOfYear.getDay() % 2 == 0)) {
                        System.out.println(monthOfYear);
                    }
                }
            } else if (flag.equals("10")) {
                System.out.println("Input the month: ");
                String monthInput = scanner.next();
                for (Enum.MonthOfYear monthOfYear : Enum.MonthOfYear.values()) {
                    if (monthOfYear.name().equals(monthInput)) {
                        if (monthOfYear.getDay() % 2 == 0) {
                            System.out.println("The number of days is even");
                        } else {
                            System.out.println("The number of days is not even");
                        }
                    }
                }
            } else if (flag.equals("11")) {
                ExitFlag = true;
            }
        }
    }
}
