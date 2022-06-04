package module2.homeTask4.bank;

public class CreditAccount extends Account {
    private int id;

    public CreditAccount(double sumInAccount, Object id, int id1) {
        super(sumInAccount, id);
        this.id = id1;
    }
}
