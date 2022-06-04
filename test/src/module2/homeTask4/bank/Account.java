package module2.homeTask4.bank;

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
