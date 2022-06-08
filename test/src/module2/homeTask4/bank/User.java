package module2.homeTask4.bank;

import module2.homeTask4.lists.Persons;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }

    @Override
    public int compareTo(@NotNull User o) {
        int rez = this.userName.compareTo(o.userName);
        return rez;
    }
}
