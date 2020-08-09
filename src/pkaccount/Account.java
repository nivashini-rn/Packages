package pkaccount;

abstract public class Account {
    public int accnumber;
    public double balance;

    public Account(int accnumber, double balance) {
        this.accnumber = accnumber;
        this.balance = balance;
    }

    public Account() {
    }
}
