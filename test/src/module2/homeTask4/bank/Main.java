package module2.homeTask4.bank;

import module2.homeTask4.lists.Persons;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main implements UserService {
    public static void main(String[] args) {
        Account<Double> account1 = new Account<>(200.2, 123.3222222333);
        Account<String> account2 = new Account<>(3000.10, "1234567890666");
        Account<Double> account3 = new Account<>(10000.50, 12345.66666665);
        Account<Double> account4 = new Account<>(0.50, 12345.666664444);

        User user1 = new User("Bob Jonson");
        User user2 = new User("Jo Macos");
        User user3 = new User("Barbara Stow");
        User user4 = new User("Ada Bru");

        ArrayList<Account> accountArrayList = new ArrayList<>();
        ArrayList<User> userArrayList = new ArrayList<>();

        accountArrayList.add(account1);
        accountArrayList.add(account2);
        accountArrayList.add(account3);
        accountArrayList.add(account4);

        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);

        Collections.sort(userArrayList);
        UserServiceImp.printListUsers(userArrayList);
        UserServiceImp.printListAccounts(accountArrayList);

        Map<Account, User> map = new HashMap<>();

        {
            map.put(account1, user1);
            map.put(account2, user2);
            map.put(account3, user3);
            map.put(account4, user4);

            Iterator<Map.Entry<Account, User>> entries = map.entrySet().iterator();
            while (entries.hasNext()) {
                Map.Entry<Account, User> entry = entries.next();
                System.out.println("Name " + entry.getValue() + " has sum of tax: " + UserServiceImp.CalculateSumTax(entry.getKey()) + " on account" + entry.getKey());
            }
        }

    }
}
