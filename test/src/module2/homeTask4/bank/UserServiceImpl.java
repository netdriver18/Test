package module2.homeTask4.bank;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService<Account,User> {

    private Map<Account, User> accounts = new HashMap<>();

    public void addAccount(Account account, User user){
        accounts.put(account,user);
    }
    public static <User> void printListUsers(List<User> list) {
        System.out.println(list);

    }

    public static <Account> void printListAccounts(List<Account> list1) {
        System.out.println(list1);

    }

    public static double CalculateSumTax(@NotNull Account<Account> account) {

        return account.getSum() * 0.05;

    }


}