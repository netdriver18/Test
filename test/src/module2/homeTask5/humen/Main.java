package module2.homeTask5.humen;

import module2.homeTask5.humen.Account;
import module2.homeTask5.humen.Human;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Nike", "Petrenko", 20);

        Account account1 = new Account("https://tutut", "rerty", "44444");
        Account account2 = new Account("https://trrrr", "33333", "ewreqre");
        Account account3 = new Account("https://yyyyy", "223344", "tttttt");
        Account account4 = new Account("https://weeee", "876543", "123456");

        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);

        Map<Human, List<Account>> humanAccountMap = new HashMap<>();
        humanAccountMap.put(human1, accountList);

        System.out.println(humanAccountMap.get(human1));
        printMap(humanAccountMap);

        Human human2 = new Human("Lisa", "Marshmellow", 59);

        Account account11 = new Account("artyy", "ffggg", "eeee");
        Account account21 = new Account("wwwwww", "32423", "67 888");

        List<Account> accountList1 = new ArrayList<>();

        addListPeople(humanAccountMap, human2, null);
        // removeList(humanAccountMap, human1, account21);

    }

    private static void printMap(Map<Human, List<Account>> humanAccountMap) {
        if (humanAccountMap.isEmpty()) {
            System.out.println("Map is empty!");
        }
        for (Map.Entry<Human, List<Account>> mapEntry : humanAccountMap.entrySet()) {
            System.out.println("The person : " + mapEntry.getKey().getFirstName() + " " +
                    mapEntry.getKey().getLastName() + " has accounts :  " + mapEntry.getValue());
        }
    }

    private static void addListPeople(Map<Human, List<Account>> humanAccountMap, Human human, Account account) {
        if (!(human == null) && !(account == null) && (humanAccountMap.containsValue(account))) {
            List<Account> k = humanAccountMap.get(human);
            if (!(k == null)) {
                k.add(account);

            }

            printMap(humanAccountMap);
        } else {
            if (human == null) {
                System.out.println("Key do not may contains null !");
            } else {
                if (account == null) {
                    humanAccountMap.put(human, null);
                    printMap(humanAccountMap);
                }
            }
        }

    }

    private static void removeList(Map<Human, List<Account>> humanAccountMap, Human human, Account account) {
        if (!(human == null) && (!(account == null))) {
            List<Account> k = humanAccountMap.get(human);
            k.remove(account);
            printMap(humanAccountMap);
        } else {
            if (human == null) {
                System.out.println("Key do not may contains null !");
            } else {
                if (account == null) {
                    humanAccountMap.remove(null);
                    printMap(humanAccountMap);
                }
            }
        }
    }
}