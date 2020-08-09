package pkaccount.fd;

import pkaccount.Account;
import pkbanking.pkinterface.InterestRate;

public class FDAccount extends Account  implements InterestRate  {
    int period;

    public FDAccount(int accnumber,int period,double balance) {
        super(accnumber, balance);
        this.period = period;
    }
    public double calc_interest()
    {
        return (balance * fdrate * period);
    }
    public void close()
    {
        balance += calc_interest();
        System.out.println("New Balance after closing: "+balance);
    }
}
