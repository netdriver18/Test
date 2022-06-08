package module2.homeTask4.bank;

import java.util.Objects;

public class Account<T> {
    private double sumInAccount;
    private T id;

    public Account(double sumInAccount, T id) {
        this.sumInAccount = sumInAccount;
        this.id = id;
    }

    public void setSum(double sum) {
        this.sumInAccount = sum;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account<?> account = (Account<?>) o;
        return Double.compare(account.sumInAccount, sumInAccount) == 0 && Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sumInAccount, id);
    }

    public double getSum() {
        return sumInAccount;
    }

    public T getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                '}';
    }
}
