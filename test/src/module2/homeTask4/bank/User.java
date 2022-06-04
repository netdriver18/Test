package module2.homeTask4.bank;

import module2.homeTask4.lists.Persons;
import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User>{
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }


    @Override
    public int compareTo(@NotNull User o) {
        int rez = this.userName.compareTo(o.userName);
        return rez;
    }
}
