package pkaccount.sb;

import pkaccount.Account;
import pkbanking.pkinterface.InterestRate;
import pkbanking.pkinterface.Transaction;

public class SBAccount extends Account implements Transaction, InterestRate
{

    @Override
    public void withdraw(double amount) {
        if(balance - amount > min_balance)
        { balance -= amount;
            System.out.println("New Balance : "+balance);
        }
        else
            System.err.println("Low balance");
    }

    @Override
    public void deposit(double amount) {
        if(amount>0)
        { balance +=amount;
            System.out.println("New Balance : "+balance);
        }
        else
            System.out.println("Invalid deposit amount");
    }
    public void calc_interest()
    {
        balance += balance * sbrate;
        System.out.println("Your SB account new Balance : "+balance);
    }

    public SBAccount(int accnumber, double balance) {
        super(accnumber, balance);

    }
}
