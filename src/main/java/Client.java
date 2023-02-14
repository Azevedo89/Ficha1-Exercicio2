import java.util.ArrayList;

public class Client {
    private String name;
    private static int age;
    private double debt;
    private int numberChildren;
    private final ArrayList<Account> bankAccounts = new ArrayList<>();

    public Client(String name, int age, double debt, int numberChildren) {
        this.name = name;
        this.age = age;
        this.debt = debt;
        this.numberChildren = numberChildren;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumberChildren() {
        return numberChildren;
    }

    public double getDebt() {
        return debt;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }
    public boolean addAccount(Account... accounts){
        for(Account account : accounts) {
            if (!bankAccounts.contains(account)) {
                bankAccounts.add(account);
            } else {
                throw new ArrayStoreException("This client is...");
            }
        }
        return true;
    }
    public ArrayList<Account> getBankAccounts(){
        return bankAccounts;
    }
}
