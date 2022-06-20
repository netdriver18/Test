package module2.homeTask5.humen;

import java.util.Objects;

public class Account {
   private String address;
    private String pass;
    private String login;

    public Account(String address, String pass, String login) {
        this.address = address;
        this.pass = pass;
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return address.equals(account.address) && pass.equals(account.pass) && login.equals(account.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, pass, login);
    }

    @Override
    public String toString() {
        return "Account{" +
                "address='" + address + '\'' +
                ", pass='" + pass + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAddress() {
        return address;
    }

    public String getPass() {
        return pass;
    }

    public String getLogin() {
        return login;
    }
}
