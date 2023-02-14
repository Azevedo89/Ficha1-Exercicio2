/**
 * In this program I create one class with the name Account and this class will receive two privates, like id and balance.
 */

public class Account {
    private int id;
    private double balance;


    /**
     *
     * @param id
     * @param balance
     */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

}
