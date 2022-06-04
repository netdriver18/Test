package module2.homeTask4.bank;

public class DebitAccount extends Account {
    private String id;

    public DebitAccount(double sumInAccount, Object id, String id1) {
        super(sumInAccount, id);
        this.id = id1;
    }
}
